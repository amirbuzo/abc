ABC is a functional programming language build for reasearch purpose.
The project is also on sourceforge.net.
The grammar of the language is:

grammar ABC;
options {
    output=AST;
    ASTLabelType=CommonTree;
}


tokens {
	CLASS 	=	'klasa';
	IF	=	'nese';
	ELSE	= 	'tjeter';
	WHILE	=	'ndersa';
	THIS	=	'ky';
	UNARY_NOT =	'!';
	SYSOUT  =	'Sistem.printo';
	TRUE	=	'vertete';
	FALSE	=	'fals';
	LT	=	'<';
	BT	=	'>';
	LOGIC_AND =	'&&';
	LOGIC_OR =      '||';
	PLUS	=	'+';
	MINUS	=	'-';
	MULT	=	'*';

	// imaginary token to specially mark the main class in the AST
	MAIN_CLASS; 
	// imarginary token to mark the main method in the AST
	MAIN_METHOD;
	// a parameter declaration
	PARAM;
	// parameter declaration list (used by method declarations)
	PARAM_LIST;
	// a variable or field list
	VAR_LIST;
	// a variable declaration
	VAR_DECL;
	// a variable or field reference (i.e., the child does not define but uses a variable/field)
	VAR_REF;
	// a type reference
	TYPE_REF;
	// for general array type support; in ABC, the only child is always 'int'
	ARRAY_TYPE;
	// a list of method declarations
	METHOD_LIST;
	// a method declaration
	METHOD_DECL;
	// the method body, i.e., a VAR_LIST followed by a STMNT_LIST
	METHOD_BODY;
	// the return statement follows (exactly one per method!)
	RETURN;
	// a list of statements
	STMNT_LIST;
	// an variable/field assignment '='
	ASSIGN;
	// an assignment to an array
	ARRAY_ASSIGN;
	// .length
	ARRAYLENGTH_REFERENCE;
	// reading a value from an array
	ARRAY_READ;
	// creating an array
	INTARRAY_NEW;
	// a common 'new' expression
	NEW;
	// a method call
	METHOD_CALL;
	// a pair (identifier, EXPR_LIST) for supporting chained method calls: this.x().x().x() ...
	SUFFIX_PART;
	// the file; root node
	FILE;
	// an expression list
	EXPR_LIST;
	// a constant definition follows (true, false, or an integer value)
	CONST;
}





goal	:	mainClass (classDeclaration)* -> ^(FILE mainClass classDeclaration*);

mainClass 
	:	CLASS identifier '{' 'publike' 'statike' 'asgje' 'kryesore' '(' 'Tekst'
		'[' ']' identifier ')' '{' statement '}' '}'
		-> ^(MAIN_CLASS identifier ^(MAIN_METHOD ^(PARAM_LIST /*^(PARAM ^(ARRAY_TYPE 'String') identifier)*/) statement))
	;
	
classDeclaration
	:	CLASS identifier '{'
		varDeclarationList methodDeclarationList '}'
		-> ^(CLASS identifier varDeclarationList methodDeclarationList)
		;
		
varDeclarationList
	:	varDeclaration* -> ^(VAR_LIST varDeclaration*)
	;

varDeclaration
	:	type identifier ';' -> ^(VAR_DECL ^(TYPE_REF type) identifier)
	;
	
methodDeclarationList
	:	methodDeclaration* -> ^(METHOD_LIST methodDeclaration*)
	;

methodDeclaration
	:	'publike' type identifier '(' (param (',' param )*)? ')'
		'{' varDeclarationList (statement)* ('kthe' expression ';')? '}'
		-> ^(METHOD_DECL ^(TYPE_REF type) identifier ^(PARAM_LIST param*) ^(METHOD_BODY varDeclarationList ^(STMNT_LIST statement* ^(RETURN expression)?)))
	;
	
param	:	type identifier -> ^(PARAM ^(TYPE_REF type) identifier)
	;
	
type 	:	identifier
	|	'numer' '[' ']' -> ^(ARRAY_TYPE 'numer')
	|	'numer'
	|	'bul'
	|	'Tekst'
	|	'asgje'
	;

expression
	:	orExpr
		
	;
	
arrayLengthReference
	:	'.' 'gjatesi'
	;
	
expressionList
	:	(expression (',' expression)*)? -> ^(EXPR_LIST expression*)
	;
	
statement
	:	'{' statement* '}' -> ^(STMNT_LIST statement*)
	|	IF^ '('! expression ')'! statement ELSE! statement
	|	WHILE^ '('! expression ')'! statement
	|	SYSOUT^ '('! expression ')'! ';'!
	|	(THIS|identifier) methodInvocation';'->^(METHOD_CALL THIS? ^(VAR_REF identifier)? ^(SUFFIX_PART methodInvocation)+)
	//|	(THIS|identifier)'.'identifier'(' (param (',' param )*)? ')'';'->^(METHOD_CALL ^(THIS) SUFFIX_PART) 
	|	identifier '=' expression ';' -> ^(ASSIGN ^(VAR_REF identifier) expression)
	|	identifier '[' expression ']' '=' expression ';' -> ^(ARRAY_ASSIGN ^(VAR_REF identifier) expression expression)
	;
	

orExpr 	:	andExpr ( LOGIC_OR^ andExpr)*
	;
	
andExpr :	compareExpr ( LOGIC_AND^ compareExpr )*
	;
	
compareExpr 
	:	additiveExpr ( (BT^|LT^) additiveExpr )?
	;
	
	
additiveExpr
	:	multExpr ( (PLUS^|MINUS^) multExpr)*
	;
	
multExpr:	unaryExpr ( MULT^ unaryExpr )*
	;
	
unaryExpr
	:	(UNARY_NOT^)? primaryExpression
	;
	
primaryExpression
	:	primaryExpressionPrefix 
		(
		    ('[' indexExpr=expression ']' -> ^(ARRAY_READ primaryExpressionPrefix $indexExpr))
		  | (arrayLengthReference -> ^(ARRAYLENGTH_REFERENCE primaryExpressionPrefix))
		  | methodInvocation+	  -> ^(METHOD_CALL primaryExpressionPrefix ^(SUFFIX_PART methodInvocation)+)
		  | -> primaryExpressionPrefix
		)
		;

methodInvocation
	:	'.'! identifier '('! expressionList ')'!
	;	

	
primaryExpressionPrefix
	:	INTEGER -> ^(CONST INTEGER)
	|	STRING -> ^(CONST STRING)
	|	TRUE  -> ^(CONST TRUE)
	|	FALSE -> ^(CONST FALSE)
	|	THIS
	|	'('! expression ')'!
	|	'iri' 'numer' '[' expression ']' -> ^(INTARRAY_NEW expression)
	|	'iri' identifier '(' ')' -> ^(NEW identifier)
	|	identifier -> ^(VAR_REF identifier)
	
	;
	

identifier 
	:	IDENTIFIER
	;

// Lexer rules follow

INTEGER	:	'0'
	|	'1'..'9' ('0'..'9')*
	;

STRING   : '"'IDENTIFIER*'"';


IDENTIFIER
	:	Letter (Letter|DigitUS)*
	;
	
fragment
Letter	:	'a'..'z'
	|	'A'..'Z'
	;

	
fragment
DigitUS
	:	'0'..'9'
	|	'_'
	;

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;
	
LINE_COMMENT 
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
    
ABC programming language provide a series of basic features as Syntax Check and Type Check.
Source files are saved as .abc text/file.
The encrypted bytecode is saved on .tjc files.
The plain text bytecode is save on .txt file for a clearing understand of bytecode instructions.


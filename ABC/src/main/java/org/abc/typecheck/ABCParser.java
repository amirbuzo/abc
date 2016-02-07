// $ANTLR 3.5.1 C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g 2015-09-28 22:35:14
package org.abc.typecheck;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.RewriteEarlyExitException;
import org.antlr.runtime.tree.RewriteRuleSubtreeStream;
import org.antlr.runtime.tree.RewriteRuleTokenStream;
import org.antlr.runtime.tree.TreeAdaptor;

@SuppressWarnings("all")
public class ABCParser extends Parser {
    public static final String[] tokenNames = new String[] { "<invalid>",
            "<EOR>", "<DOWN>", "<UP>", "ARRAYLENGTH_REFERENCE", "ARRAY_ASSIGN",
            "ARRAY_READ", "ARRAY_TYPE", "ASSIGN", "BT", "CLASS", "CONST",
            "DigitUS", "ELSE", "EXPR_LIST", "FALSE", "FILE", "IDENTIFIER",
            "IF", "INTARRAY_NEW", "INTEGER", "LINE_COMMENT", "LOGIC_AND",
            "LOGIC_OR", "LT", "Letter", "MAIN_CLASS", "MAIN_METHOD",
            "METHOD_BODY", "METHOD_CALL", "METHOD_DECL", "METHOD_LIST",
            "MINUS", "MULT", "NEW", "PARAM", "PARAM_LIST", "PLUS", "RETURN",
            "STMNT_LIST", "STRING", "SUFFIX_PART", "SYSOUT", "THIS", "TRUE",
            "TYPE_REF", "UNARY_NOT", "VAR_DECL", "VAR_LIST", "VAR_REF",
            "WHILE", "WS", "'('", "')'", "','", "'.'", "';'", "'='", "'Tekst'",
            "'['", "']'", "'asgje'", "'bul'", "'gjatesi'", "'iri'",
            "'kryesore'", "'kthe'", "'numer'", "'publike'", "'statike'", "'{'",
            "'}'" };

    public static final int EOF = -1;

    public static final int T__52 = 52;

    public static final int T__53 = 53;

    public static final int T__54 = 54;

    public static final int T__55 = 55;

    public static final int T__56 = 56;

    public static final int T__57 = 57;

    public static final int T__58 = 58;

    public static final int T__59 = 59;

    public static final int T__60 = 60;

    public static final int T__61 = 61;

    public static final int T__62 = 62;

    public static final int T__63 = 63;

    public static final int T__64 = 64;

    public static final int T__65 = 65;

    public static final int T__66 = 66;

    public static final int T__67 = 67;

    public static final int T__68 = 68;

    public static final int T__69 = 69;

    public static final int T__70 = 70;

    public static final int T__71 = 71;

    public static final int ARRAYLENGTH_REFERENCE = 4;

    public static final int ARRAY_ASSIGN = 5;

    public static final int ARRAY_READ = 6;

    public static final int ARRAY_TYPE = 7;

    public static final int ASSIGN = 8;

    public static final int BT = 9;

    public static final int CLASS = 10;

    public static final int CONST = 11;

    public static final int DigitUS = 12;

    public static final int ELSE = 13;

    public static final int EXPR_LIST = 14;

    public static final int FALSE = 15;

    public static final int FILE = 16;

    public static final int IDENTIFIER = 17;

    public static final int IF = 18;

    public static final int INTARRAY_NEW = 19;

    public static final int INTEGER = 20;

    public static final int LINE_COMMENT = 21;

    public static final int LOGIC_AND = 22;

    public static final int LOGIC_OR = 23;

    public static final int LT = 24;

    public static final int Letter = 25;

    public static final int MAIN_CLASS = 26;

    public static final int MAIN_METHOD = 27;

    public static final int METHOD_BODY = 28;

    public static final int METHOD_CALL = 29;

    public static final int METHOD_DECL = 30;

    public static final int METHOD_LIST = 31;

    public static final int MINUS = 32;

    public static final int MULT = 33;

    public static final int NEW = 34;

    public static final int PARAM = 35;

    public static final int PARAM_LIST = 36;

    public static final int PLUS = 37;

    public static final int RETURN = 38;

    public static final int STMNT_LIST = 39;

    public static final int STRING = 40;

    public static final int SUFFIX_PART = 41;

    public static final int SYSOUT = 42;

    public static final int THIS = 43;

    public static final int TRUE = 44;

    public static final int TYPE_REF = 45;

    public static final int UNARY_NOT = 46;

    public static final int VAR_DECL = 47;

    public static final int VAR_LIST = 48;

    public static final int VAR_REF = 49;

    public static final int WHILE = 50;

    public static final int WS = 51;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators

    public ABCParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }

    public ABCParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }

    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    @Override
    public String[] getTokenNames() {
        return ABCParser.tokenNames;
    }

    @Override
    public String getGrammarFileName() {
        return "C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g";
    }

    public static class goal_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "goal"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:82:1: goal : mainClass ( classDeclaration
    // )* -> ^( FILE mainClass ( classDeclaration )* ) ;
    public final ABCParser.goal_return goal() throws RecognitionException {
        ABCParser.goal_return retval = new ABCParser.goal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ParserRuleReturnScope mainClass1 = null;
        ParserRuleReturnScope classDeclaration2 = null;

        RewriteRuleSubtreeStream stream_mainClass = new RewriteRuleSubtreeStream(
                adaptor, "rule mainClass");
        RewriteRuleSubtreeStream stream_classDeclaration = new RewriteRuleSubtreeStream(
                adaptor, "rule classDeclaration");

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:82:6: ( mainClass (
            // classDeclaration )* -> ^( FILE mainClass ( classDeclaration )* )
            // )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:82:8: mainClass (
            // classDeclaration )*
            {
                pushFollow(FOLLOW_mainClass_in_goal330);
                mainClass1 = mainClass();
                state._fsp--;

                stream_mainClass.add(mainClass1.getTree());
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:82:18: (
                // classDeclaration )*
                loop1: while (true) {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);
                    if ((LA1_0 == CLASS)) {
                        alt1 = 1;
                    }

                    switch (alt1) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:82:19: classDeclaration
                    {
                        pushFollow(FOLLOW_classDeclaration_in_goal333);
                        classDeclaration2 = classDeclaration();
                        state._fsp--;

                        stream_classDeclaration.add(classDeclaration2.getTree());
                    }
                        break;

                    default:
                        break loop1;
                    }
                }

                // AST REWRITE
                // elements: mainClass, classDeclaration
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 82:38: -> ^( FILE mainClass ( classDeclaration )* )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:82:41: ^( FILE mainClass (
                    // classDeclaration )* )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(FILE, "FILE"),
                                root_1);
                        adaptor.addChild(root_1, stream_mainClass.nextTree());
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:82:58: (
                        // classDeclaration )*
                        while (stream_classDeclaration.hasNext()) {
                            adaptor.addChild(root_1,
                                    stream_classDeclaration.nextTree());
                        }
                        stream_classDeclaration.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "goal"

    public static class mainClass_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "mainClass"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:84:1: mainClass : CLASS identifier '{'
    // 'publike' 'statike' 'asgje' 'kryesore' '(' 'Tekst' '[' ']' identifier ')'
    // '{' statement '}' '}' -> ^( MAIN_CLASS identifier ^( MAIN_METHOD ^(
    // PARAM_LIST ) statement ) ) ;
    public final ABCParser.mainClass_return mainClass()
            throws RecognitionException {
        ABCParser.mainClass_return retval = new ABCParser.mainClass_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CLASS3 = null;
        Token char_literal5 = null;
        Token string_literal6 = null;
        Token string_literal7 = null;
        Token string_literal8 = null;
        Token string_literal9 = null;
        Token char_literal10 = null;
        Token string_literal11 = null;
        Token char_literal12 = null;
        Token char_literal13 = null;
        Token char_literal15 = null;
        Token char_literal16 = null;
        Token char_literal18 = null;
        Token char_literal19 = null;
        ParserRuleReturnScope identifier4 = null;
        ParserRuleReturnScope identifier14 = null;
        ParserRuleReturnScope statement17 = null;

        CommonTree CLASS3_tree = null;
        CommonTree char_literal5_tree = null;
        CommonTree string_literal6_tree = null;
        CommonTree string_literal7_tree = null;
        CommonTree string_literal8_tree = null;
        CommonTree string_literal9_tree = null;
        CommonTree char_literal10_tree = null;
        CommonTree string_literal11_tree = null;
        CommonTree char_literal12_tree = null;
        CommonTree char_literal13_tree = null;
        CommonTree char_literal15_tree = null;
        CommonTree char_literal16_tree = null;
        CommonTree char_literal18_tree = null;
        CommonTree char_literal19_tree = null;
        RewriteRuleTokenStream stream_68 = new RewriteRuleTokenStream(adaptor,
                "token 68");
        RewriteRuleTokenStream stream_58 = new RewriteRuleTokenStream(adaptor,
                "token 58");
        RewriteRuleTokenStream stream_69 = new RewriteRuleTokenStream(adaptor,
                "token 69");
        RewriteRuleTokenStream stream_59 = new RewriteRuleTokenStream(adaptor,
                "token 59");
        RewriteRuleTokenStream stream_70 = new RewriteRuleTokenStream(adaptor,
                "token 70");
        RewriteRuleTokenStream stream_60 = new RewriteRuleTokenStream(adaptor,
                "token 60");
        RewriteRuleTokenStream stream_71 = new RewriteRuleTokenStream(adaptor,
                "token 71");
        RewriteRuleTokenStream stream_61 = new RewriteRuleTokenStream(adaptor,
                "token 61");
        RewriteRuleTokenStream stream_CLASS = new RewriteRuleTokenStream(
                adaptor, "token CLASS");
        RewriteRuleTokenStream stream_52 = new RewriteRuleTokenStream(adaptor,
                "token 52");
        RewriteRuleTokenStream stream_53 = new RewriteRuleTokenStream(adaptor,
                "token 53");
        RewriteRuleTokenStream stream_65 = new RewriteRuleTokenStream(adaptor,
                "token 65");
        RewriteRuleSubtreeStream stream_identifier = new RewriteRuleSubtreeStream(
                adaptor, "rule identifier");
        RewriteRuleSubtreeStream stream_statement = new RewriteRuleSubtreeStream(
                adaptor, "rule statement");

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:85:2: ( CLASS
            // identifier '{' 'publike' 'statike' 'asgje' 'kryesore' '(' 'Tekst'
            // '[' ']' identifier ')' '{' statement '}' '}' -> ^( MAIN_CLASS
            // identifier ^( MAIN_METHOD ^( PARAM_LIST ) statement ) ) )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:85:4: CLASS
            // identifier '{' 'publike' 'statike' 'asgje' 'kryesore' '(' 'Tekst'
            // '[' ']' identifier ')' '{' statement '}' '}'
            {
                CLASS3 = (Token) match(input, CLASS,
                        FOLLOW_CLASS_in_mainClass356);
                stream_CLASS.add(CLASS3);

                pushFollow(FOLLOW_identifier_in_mainClass358);
                identifier4 = identifier();
                state._fsp--;

                stream_identifier.add(identifier4.getTree());
                char_literal5 = (Token) match(input, 70,
                        FOLLOW_70_in_mainClass360);
                stream_70.add(char_literal5);

                string_literal6 = (Token) match(input, 68,
                        FOLLOW_68_in_mainClass362);
                stream_68.add(string_literal6);

                string_literal7 = (Token) match(input, 69,
                        FOLLOW_69_in_mainClass364);
                stream_69.add(string_literal7);

                string_literal8 = (Token) match(input, 61,
                        FOLLOW_61_in_mainClass366);
                stream_61.add(string_literal8);

                string_literal9 = (Token) match(input, 65,
                        FOLLOW_65_in_mainClass368);
                stream_65.add(string_literal9);

                char_literal10 = (Token) match(input, 52,
                        FOLLOW_52_in_mainClass370);
                stream_52.add(char_literal10);

                string_literal11 = (Token) match(input, 58,
                        FOLLOW_58_in_mainClass372);
                stream_58.add(string_literal11);

                char_literal12 = (Token) match(input, 59,
                        FOLLOW_59_in_mainClass376);
                stream_59.add(char_literal12);

                char_literal13 = (Token) match(input, 60,
                        FOLLOW_60_in_mainClass378);
                stream_60.add(char_literal13);

                pushFollow(FOLLOW_identifier_in_mainClass380);
                identifier14 = identifier();
                state._fsp--;

                stream_identifier.add(identifier14.getTree());
                char_literal15 = (Token) match(input, 53,
                        FOLLOW_53_in_mainClass382);
                stream_53.add(char_literal15);

                char_literal16 = (Token) match(input, 70,
                        FOLLOW_70_in_mainClass384);
                stream_70.add(char_literal16);

                pushFollow(FOLLOW_statement_in_mainClass386);
                statement17 = statement();
                state._fsp--;

                stream_statement.add(statement17.getTree());
                char_literal18 = (Token) match(input, 71,
                        FOLLOW_71_in_mainClass388);
                stream_71.add(char_literal18);

                char_literal19 = (Token) match(input, 71,
                        FOLLOW_71_in_mainClass390);
                stream_71.add(char_literal19);

                // AST REWRITE
                // elements: statement, identifier
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 87:3: -> ^( MAIN_CLASS identifier ^( MAIN_METHOD ^(
                // PARAM_LIST ) statement ) )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:87:6: ^( MAIN_CLASS
                    // identifier ^( MAIN_METHOD ^( PARAM_LIST ) statement ) )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(MAIN_CLASS,
                                        "MAIN_CLASS"), root_1);
                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:87:30: ^( MAIN_METHOD
                        // ^( PARAM_LIST ) statement )
                        {
                            CommonTree root_2 = (CommonTree) adaptor.nil();
                            root_2 = (CommonTree) adaptor.becomeRoot(
                                    (CommonTree) adaptor.create(MAIN_METHOD,
                                            "MAIN_METHOD"), root_2);
                            // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                            // Technology\\COMPILER CONSTRUCTION
                            // 1\\PA1\\ANTLRStarterKit\\ABC.g:87:44: ^(
                            // PARAM_LIST )
                            {
                                CommonTree root_3 = (CommonTree) adaptor.nil();
                                root_3 = (CommonTree) adaptor.becomeRoot(
                                        (CommonTree) adaptor.create(PARAM_LIST,
                                                "PARAM_LIST"), root_3);
                                adaptor.addChild(root_2, root_3);
                            }

                            adaptor.addChild(root_2,
                                    stream_statement.nextTree());
                            adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "mainClass"

    public static class classDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "classDeclaration"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:90:1: classDeclaration : CLASS identifier
    // '{' varDeclarationList methodDeclarationList '}' -> ^( CLASS identifier
    // varDeclarationList methodDeclarationList ) ;
    public final ABCParser.classDeclaration_return classDeclaration()
            throws RecognitionException {
        ABCParser.classDeclaration_return retval = new ABCParser.classDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CLASS20 = null;
        Token char_literal22 = null;
        Token char_literal25 = null;
        ParserRuleReturnScope identifier21 = null;
        ParserRuleReturnScope varDeclarationList23 = null;
        ParserRuleReturnScope methodDeclarationList24 = null;

        CommonTree CLASS20_tree = null;
        CommonTree char_literal22_tree = null;
        CommonTree char_literal25_tree = null;
        RewriteRuleTokenStream stream_70 = new RewriteRuleTokenStream(adaptor,
                "token 70");
        RewriteRuleTokenStream stream_71 = new RewriteRuleTokenStream(adaptor,
                "token 71");
        RewriteRuleTokenStream stream_CLASS = new RewriteRuleTokenStream(
                adaptor, "token CLASS");
        RewriteRuleSubtreeStream stream_methodDeclarationList = new RewriteRuleSubtreeStream(
                adaptor, "rule methodDeclarationList");
        RewriteRuleSubtreeStream stream_identifier = new RewriteRuleSubtreeStream(
                adaptor, "rule identifier");
        RewriteRuleSubtreeStream stream_varDeclarationList = new RewriteRuleSubtreeStream(
                adaptor, "rule varDeclarationList");

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:91:2: ( CLASS
            // identifier '{' varDeclarationList methodDeclarationList '}' -> ^(
            // CLASS identifier varDeclarationList methodDeclarationList ) )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:91:4: CLASS
            // identifier '{' varDeclarationList methodDeclarationList '}'
            {
                CLASS20 = (Token) match(input, CLASS,
                        FOLLOW_CLASS_in_classDeclaration424);
                stream_CLASS.add(CLASS20);

                pushFollow(FOLLOW_identifier_in_classDeclaration426);
                identifier21 = identifier();
                state._fsp--;

                stream_identifier.add(identifier21.getTree());
                char_literal22 = (Token) match(input, 70,
                        FOLLOW_70_in_classDeclaration428);
                stream_70.add(char_literal22);

                pushFollow(FOLLOW_varDeclarationList_in_classDeclaration432);
                varDeclarationList23 = varDeclarationList();
                state._fsp--;

                stream_varDeclarationList.add(varDeclarationList23.getTree());
                pushFollow(FOLLOW_methodDeclarationList_in_classDeclaration434);
                methodDeclarationList24 = methodDeclarationList();
                state._fsp--;

                stream_methodDeclarationList.add(methodDeclarationList24.getTree());
                char_literal25 = (Token) match(input, 71,
                        FOLLOW_71_in_classDeclaration436);
                stream_71.add(char_literal25);

                // AST REWRITE
                // elements: identifier, varDeclarationList,
                // methodDeclarationList, CLASS
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 93:3: -> ^( CLASS identifier varDeclarationList
                // methodDeclarationList )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:93:6: ^( CLASS identifier
                    // varDeclarationList methodDeclarationList )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                stream_CLASS.nextNode(), root_1);
                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        adaptor.addChild(root_1,
                                stream_varDeclarationList.nextTree());
                        adaptor.addChild(root_1,
                                stream_methodDeclarationList.nextTree());
                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "classDeclaration"

    public static class varDeclarationList_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "varDeclarationList"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:96:1: varDeclarationList : (
    // varDeclaration )* -> ^( VAR_LIST ( varDeclaration )* ) ;
    public final ABCParser.varDeclarationList_return varDeclarationList()
            throws RecognitionException {
        ABCParser.varDeclarationList_return retval = new ABCParser.varDeclarationList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ParserRuleReturnScope varDeclaration26 = null;

        RewriteRuleSubtreeStream stream_varDeclaration = new RewriteRuleSubtreeStream(
                adaptor, "rule varDeclaration");

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:97:2: ( (
            // varDeclaration )* -> ^( VAR_LIST ( varDeclaration )* ) )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:97:4: (
            // varDeclaration )*
            {
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:97:4: (
                // varDeclaration )*
                loop2: while (true) {
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);
                    if ((LA2_0 == IDENTIFIER)) {
                        int LA2_2 = input.LA(2);
                        if ((LA2_2 == IDENTIFIER)) {
                            alt2 = 1;
                        }

                    } else if ((LA2_0 == 58 || (LA2_0 >= 61 && LA2_0 <= 62) || LA2_0 == 67)) {
                        alt2 = 1;
                    }

                    switch (alt2) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:97:4: varDeclaration
                    {
                        pushFollow(FOLLOW_varDeclaration_in_varDeclarationList464);
                        varDeclaration26 = varDeclaration();
                        state._fsp--;

                        stream_varDeclaration.add(varDeclaration26.getTree());
                    }
                        break;

                    default:
                        break loop2;
                    }
                }

                // AST REWRITE
                // elements: varDeclaration
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 97:20: -> ^( VAR_LIST ( varDeclaration )* )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:97:23: ^( VAR_LIST (
                    // varDeclaration )* )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(VAR_LIST,
                                        "VAR_LIST"), root_1);
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:97:34: (
                        // varDeclaration )*
                        while (stream_varDeclaration.hasNext()) {
                            adaptor.addChild(root_1,
                                    stream_varDeclaration.nextTree());
                        }
                        stream_varDeclaration.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "varDeclarationList"

    public static class varDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "varDeclaration"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:100:1: varDeclaration : type identifier
    // ';' -> ^( VAR_DECL ^( TYPE_REF type ) identifier ) ;
    public final ABCParser.varDeclaration_return varDeclaration()
            throws RecognitionException {
        ABCParser.varDeclaration_return retval = new ABCParser.varDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal29 = null;
        ParserRuleReturnScope type27 = null;
        ParserRuleReturnScope identifier28 = null;

        CommonTree char_literal29_tree = null;
        RewriteRuleTokenStream stream_56 = new RewriteRuleTokenStream(adaptor,
                "token 56");
        RewriteRuleSubtreeStream stream_identifier = new RewriteRuleSubtreeStream(
                adaptor, "rule identifier");
        RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(
                adaptor, "rule type");

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:101:2: ( type
            // identifier ';' -> ^( VAR_DECL ^( TYPE_REF type ) identifier ) )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:101:4: type
            // identifier ';'
            {
                pushFollow(FOLLOW_type_in_varDeclaration485);
                type27 = type();
                state._fsp--;

                stream_type.add(type27.getTree());
                pushFollow(FOLLOW_identifier_in_varDeclaration487);
                identifier28 = identifier();
                state._fsp--;

                stream_identifier.add(identifier28.getTree());
                char_literal29 = (Token) match(input, 56,
                        FOLLOW_56_in_varDeclaration489);
                stream_56.add(char_literal29);

                // AST REWRITE
                // elements: identifier, type
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 101:24: -> ^( VAR_DECL ^( TYPE_REF type ) identifier )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:101:27: ^( VAR_DECL ^(
                    // TYPE_REF type ) identifier )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(VAR_DECL,
                                        "VAR_DECL"), root_1);
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:101:38: ^( TYPE_REF
                        // type )
                        {
                            CommonTree root_2 = (CommonTree) adaptor.nil();
                            root_2 = (CommonTree) adaptor.becomeRoot(
                                    (CommonTree) adaptor.create(TYPE_REF,
                                            "TYPE_REF"), root_2);
                            adaptor.addChild(root_2, stream_type.nextTree());
                            adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "varDeclaration"

    public static class methodDeclarationList_return extends
            ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "methodDeclarationList"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:104:1: methodDeclarationList : (
    // methodDeclaration )* -> ^( METHOD_LIST ( methodDeclaration )* ) ;
    public final ABCParser.methodDeclarationList_return methodDeclarationList()
            throws RecognitionException {
        ABCParser.methodDeclarationList_return retval = new ABCParser.methodDeclarationList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ParserRuleReturnScope methodDeclaration30 = null;

        RewriteRuleSubtreeStream stream_methodDeclaration = new RewriteRuleSubtreeStream(
                adaptor, "rule methodDeclaration");

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:105:2: ( (
            // methodDeclaration )* -> ^( METHOD_LIST ( methodDeclaration )* ) )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:105:4: (
            // methodDeclaration )*
            {
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:105:4: (
                // methodDeclaration )*
                loop3: while (true) {
                    int alt3 = 2;
                    int LA3_0 = input.LA(1);
                    if ((LA3_0 == 68)) {
                        alt3 = 1;
                    }

                    switch (alt3) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:105:4: methodDeclaration
                    {
                        pushFollow(FOLLOW_methodDeclaration_in_methodDeclarationList515);
                        methodDeclaration30 = methodDeclaration();
                        state._fsp--;

                        stream_methodDeclaration.add(methodDeclaration30.getTree());
                    }
                        break;

                    default:
                        break loop3;
                    }
                }

                // AST REWRITE
                // elements: methodDeclaration
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 105:23: -> ^( METHOD_LIST ( methodDeclaration )* )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:105:26: ^( METHOD_LIST (
                    // methodDeclaration )* )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(METHOD_LIST,
                                        "METHOD_LIST"), root_1);
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:105:40: (
                        // methodDeclaration )*
                        while (stream_methodDeclaration.hasNext()) {
                            adaptor.addChild(root_1,
                                    stream_methodDeclaration.nextTree());
                        }
                        stream_methodDeclaration.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "methodDeclarationList"

    public static class methodDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "methodDeclaration"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:108:1: methodDeclaration : 'publike' type
    // identifier '(' ( param ( ',' param )* )? ')' '{' varDeclarationList (
    // statement )* ( 'kthe' expression ';' )? '}' -> ^( METHOD_DECL ^( TYPE_REF
    // type ) identifier ^( PARAM_LIST ( param )* ) ^( METHOD_BODY
    // varDeclarationList ^( STMNT_LIST ( statement )* ( ^( RETURN expression )
    // )? ) ) ) ;
    public final ABCParser.methodDeclaration_return methodDeclaration()
            throws RecognitionException {
        ABCParser.methodDeclaration_return retval = new ABCParser.methodDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal31 = null;
        Token char_literal34 = null;
        Token char_literal36 = null;
        Token char_literal38 = null;
        Token char_literal39 = null;
        Token string_literal42 = null;
        Token char_literal44 = null;
        Token char_literal45 = null;
        ParserRuleReturnScope type32 = null;
        ParserRuleReturnScope identifier33 = null;
        ParserRuleReturnScope param35 = null;
        ParserRuleReturnScope param37 = null;
        ParserRuleReturnScope varDeclarationList40 = null;
        ParserRuleReturnScope statement41 = null;
        ParserRuleReturnScope expression43 = null;

        CommonTree string_literal31_tree = null;
        CommonTree char_literal34_tree = null;
        CommonTree char_literal36_tree = null;
        CommonTree char_literal38_tree = null;
        CommonTree char_literal39_tree = null;
        CommonTree string_literal42_tree = null;
        CommonTree char_literal44_tree = null;
        CommonTree char_literal45_tree = null;
        RewriteRuleTokenStream stream_66 = new RewriteRuleTokenStream(adaptor,
                "token 66");
        RewriteRuleTokenStream stream_56 = new RewriteRuleTokenStream(adaptor,
                "token 56");
        RewriteRuleTokenStream stream_68 = new RewriteRuleTokenStream(adaptor,
                "token 68");
        RewriteRuleTokenStream stream_70 = new RewriteRuleTokenStream(adaptor,
                "token 70");
        RewriteRuleTokenStream stream_71 = new RewriteRuleTokenStream(adaptor,
                "token 71");
        RewriteRuleTokenStream stream_52 = new RewriteRuleTokenStream(adaptor,
                "token 52");
        RewriteRuleTokenStream stream_53 = new RewriteRuleTokenStream(adaptor,
                "token 53");
        RewriteRuleTokenStream stream_54 = new RewriteRuleTokenStream(adaptor,
                "token 54");
        RewriteRuleSubtreeStream stream_identifier = new RewriteRuleSubtreeStream(
                adaptor, "rule identifier");
        RewriteRuleSubtreeStream stream_varDeclarationList = new RewriteRuleSubtreeStream(
                adaptor, "rule varDeclarationList");
        RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
                adaptor, "rule expression");
        RewriteRuleSubtreeStream stream_param = new RewriteRuleSubtreeStream(
                adaptor, "rule param");
        RewriteRuleSubtreeStream stream_statement = new RewriteRuleSubtreeStream(
                adaptor, "rule statement");
        RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(
                adaptor, "rule type");

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:109:2: ( 'publike'
            // type identifier '(' ( param ( ',' param )* )? ')' '{'
            // varDeclarationList ( statement )* ( 'kthe' expression ';' )? '}'
            // -> ^( METHOD_DECL ^( TYPE_REF type ) identifier ^( PARAM_LIST (
            // param )* ) ^( METHOD_BODY varDeclarationList ^( STMNT_LIST (
            // statement )* ( ^( RETURN expression ) )? ) ) ) )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:109:4: 'publike' type
            // identifier '(' ( param ( ',' param )* )? ')' '{'
            // varDeclarationList ( statement )* ( 'kthe' expression ';' )? '}'
            {
                string_literal31 = (Token) match(input, 68,
                        FOLLOW_68_in_methodDeclaration536);
                stream_68.add(string_literal31);

                pushFollow(FOLLOW_type_in_methodDeclaration538);
                type32 = type();
                state._fsp--;

                stream_type.add(type32.getTree());
                pushFollow(FOLLOW_identifier_in_methodDeclaration540);
                identifier33 = identifier();
                state._fsp--;

                stream_identifier.add(identifier33.getTree());
                char_literal34 = (Token) match(input, 52,
                        FOLLOW_52_in_methodDeclaration542);
                stream_52.add(char_literal34);

                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:109:34: ( param (
                // ',' param )* )?
                int alt5 = 2;
                int LA5_0 = input.LA(1);
                if ((LA5_0 == IDENTIFIER || LA5_0 == 58
                        || (LA5_0 >= 61 && LA5_0 <= 62) || LA5_0 == 67)) {
                    alt5 = 1;
                }
                switch (alt5) {
                case 1:
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:109:35: param (
                // ',' param )*
                {
                    pushFollow(FOLLOW_param_in_methodDeclaration545);
                    param35 = param();
                    state._fsp--;

                    stream_param.add(param35.getTree());
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:109:41: ( ',' param )*
                    loop4: while (true) {
                        int alt4 = 2;
                        int LA4_0 = input.LA(1);
                        if ((LA4_0 == 54)) {
                            alt4 = 1;
                        }

                        switch (alt4) {
                        case 1:
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:109:42: ',' param
                        {
                            char_literal36 = (Token) match(input, 54,
                                    FOLLOW_54_in_methodDeclaration548);
                            stream_54.add(char_literal36);

                            pushFollow(FOLLOW_param_in_methodDeclaration550);
                            param37 = param();
                            state._fsp--;

                            stream_param.add(param37.getTree());
                        }
                            break;

                        default:
                            break loop4;
                        }
                    }

                }
                    break;

                }

                char_literal38 = (Token) match(input, 53,
                        FOLLOW_53_in_methodDeclaration557);
                stream_53.add(char_literal38);

                char_literal39 = (Token) match(input, 70,
                        FOLLOW_70_in_methodDeclaration561);
                stream_70.add(char_literal39);

                pushFollow(FOLLOW_varDeclarationList_in_methodDeclaration563);
                varDeclarationList40 = varDeclarationList();
                state._fsp--;

                stream_varDeclarationList.add(varDeclarationList40.getTree());
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:110:26: (
                // statement )*
                loop6: while (true) {
                    int alt6 = 2;
                    int LA6_0 = input.LA(1);
                    if (((LA6_0 >= IDENTIFIER && LA6_0 <= IF)
                            || (LA6_0 >= SYSOUT && LA6_0 <= THIS)
                            || LA6_0 == WHILE || LA6_0 == 70)) {
                        alt6 = 1;
                    }

                    switch (alt6) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:110:27: statement
                    {
                        pushFollow(FOLLOW_statement_in_methodDeclaration566);
                        statement41 = statement();
                        state._fsp--;

                        stream_statement.add(statement41.getTree());
                    }
                        break;

                    default:
                        break loop6;
                    }
                }

                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:110:39: ( 'kthe'
                // expression ';' )?
                int alt7 = 2;
                int LA7_0 = input.LA(1);
                if ((LA7_0 == 66)) {
                    alt7 = 1;
                }
                switch (alt7) {
                case 1:
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:110:40: 'kthe'
                // expression ';'
                {
                    string_literal42 = (Token) match(input, 66,
                            FOLLOW_66_in_methodDeclaration571);
                    stream_66.add(string_literal42);

                    pushFollow(FOLLOW_expression_in_methodDeclaration573);
                    expression43 = expression();
                    state._fsp--;

                    stream_expression.add(expression43.getTree());
                    char_literal44 = (Token) match(input, 56,
                            FOLLOW_56_in_methodDeclaration575);
                    stream_56.add(char_literal44);

                }
                    break;

                }

                char_literal45 = (Token) match(input, 71,
                        FOLLOW_71_in_methodDeclaration579);
                stream_71.add(char_literal45);

                // AST REWRITE
                // elements: identifier, param, type, varDeclarationList,
                // statement, expression
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 111:3: -> ^( METHOD_DECL ^( TYPE_REF type ) identifier ^(
                // PARAM_LIST ( param )* ) ^( METHOD_BODY varDeclarationList ^(
                // STMNT_LIST ( statement )* ( ^( RETURN expression ) )? ) ) )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:111:6: ^( METHOD_DECL ^(
                    // TYPE_REF type ) identifier ^( PARAM_LIST ( param )* ) ^(
                    // METHOD_BODY varDeclarationList ^( STMNT_LIST ( statement
                    // )* ( ^( RETURN expression ) )? ) ) )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(METHOD_DECL,
                                        "METHOD_DECL"), root_1);
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:111:20: ^( TYPE_REF
                        // type )
                        {
                            CommonTree root_2 = (CommonTree) adaptor.nil();
                            root_2 = (CommonTree) adaptor.becomeRoot(
                                    (CommonTree) adaptor.create(TYPE_REF,
                                            "TYPE_REF"), root_2);
                            adaptor.addChild(root_2, stream_type.nextTree());
                            adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:111:48: ^( PARAM_LIST
                        // ( param )* )
                        {
                            CommonTree root_2 = (CommonTree) adaptor.nil();
                            root_2 = (CommonTree) adaptor.becomeRoot(
                                    (CommonTree) adaptor.create(PARAM_LIST,
                                            "PARAM_LIST"), root_2);
                            // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                            // Technology\\COMPILER CONSTRUCTION
                            // 1\\PA1\\ANTLRStarterKit\\ABC.g:111:61: ( param )*
                            while (stream_param.hasNext()) {
                                adaptor.addChild(root_2,
                                        stream_param.nextTree());
                            }
                            stream_param.reset();

                            adaptor.addChild(root_1, root_2);
                        }

                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:111:69: ^( METHOD_BODY
                        // varDeclarationList ^( STMNT_LIST ( statement )* ( ^(
                        // RETURN expression ) )? ) )
                        {
                            CommonTree root_2 = (CommonTree) adaptor.nil();
                            root_2 = (CommonTree) adaptor.becomeRoot(
                                    (CommonTree) adaptor.create(METHOD_BODY,
                                            "METHOD_BODY"), root_2);
                            adaptor.addChild(root_2,
                                    stream_varDeclarationList.nextTree());
                            // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                            // Technology\\COMPILER CONSTRUCTION
                            // 1\\PA1\\ANTLRStarterKit\\ABC.g:111:102: ^(
                            // STMNT_LIST ( statement )* ( ^( RETURN expression
                            // ) )? )
                            {
                                CommonTree root_3 = (CommonTree) adaptor.nil();
                                root_3 = (CommonTree) adaptor.becomeRoot(
                                        (CommonTree) adaptor.create(STMNT_LIST,
                                                "STMNT_LIST"), root_3);
                                // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                                // Technology\\COMPILER CONSTRUCTION
                                // 1\\PA1\\ANTLRStarterKit\\ABC.g:111:115: (
                                // statement )*
                                while (stream_statement.hasNext()) {
                                    adaptor.addChild(root_3,
                                            stream_statement.nextTree());
                                }
                                stream_statement.reset();

                                // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                                // Technology\\COMPILER CONSTRUCTION
                                // 1\\PA1\\ANTLRStarterKit\\ABC.g:111:126: ( ^(
                                // RETURN expression ) )?
                                if (stream_expression.hasNext()) {
                                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                                    // Technology\\COMPILER CONSTRUCTION
                                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:111:126:
                                    // ^( RETURN expression )
                                    {
                                        CommonTree root_4 = (CommonTree) adaptor.nil();
                                        root_4 = (CommonTree) adaptor.becomeRoot(
                                                (CommonTree) adaptor.create(
                                                        RETURN, "RETURN"),
                                                root_4);
                                        adaptor.addChild(root_4,
                                                stream_expression.nextTree());
                                        adaptor.addChild(root_3, root_4);
                                    }

                                }
                                stream_expression.reset();

                                adaptor.addChild(root_2, root_3);
                            }

                            adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "methodDeclaration"

    public static class param_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "param"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:114:1: param : type identifier -> ^( PARAM
    // ^( TYPE_REF type ) identifier ) ;
    public final ABCParser.param_return param() throws RecognitionException {
        ABCParser.param_return retval = new ABCParser.param_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ParserRuleReturnScope type46 = null;
        ParserRuleReturnScope identifier47 = null;

        RewriteRuleSubtreeStream stream_identifier = new RewriteRuleSubtreeStream(
                adaptor, "rule identifier");
        RewriteRuleSubtreeStream stream_type = new RewriteRuleSubtreeStream(
                adaptor, "rule type");

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:114:7: ( type
            // identifier -> ^( PARAM ^( TYPE_REF type ) identifier ) )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:114:9: type
            // identifier
            {
                pushFollow(FOLLOW_type_in_param633);
                type46 = type();
                state._fsp--;

                stream_type.add(type46.getTree());
                pushFollow(FOLLOW_identifier_in_param635);
                identifier47 = identifier();
                state._fsp--;

                stream_identifier.add(identifier47.getTree());
                // AST REWRITE
                // elements: type, identifier
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 114:25: -> ^( PARAM ^( TYPE_REF type ) identifier )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:114:28: ^( PARAM ^(
                    // TYPE_REF type ) identifier )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(PARAM, "PARAM"),
                                root_1);
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:114:36: ^( TYPE_REF
                        // type )
                        {
                            CommonTree root_2 = (CommonTree) adaptor.nil();
                            root_2 = (CommonTree) adaptor.becomeRoot(
                                    (CommonTree) adaptor.create(TYPE_REF,
                                            "TYPE_REF"), root_2);
                            adaptor.addChild(root_2, stream_type.nextTree());
                            adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "param"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "type"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:117:1: type : ( identifier | 'numer' '['
    // ']' -> ^( ARRAY_TYPE 'numer' ) | 'numer' | 'bul' | 'Tekst' | 'asgje' );
    public final ABCParser.type_return type() throws RecognitionException {
        ABCParser.type_return retval = new ABCParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal49 = null;
        Token char_literal50 = null;
        Token char_literal51 = null;
        Token string_literal52 = null;
        Token string_literal53 = null;
        Token string_literal54 = null;
        Token string_literal55 = null;
        ParserRuleReturnScope identifier48 = null;

        CommonTree string_literal49_tree = null;
        CommonTree char_literal50_tree = null;
        CommonTree char_literal51_tree = null;
        CommonTree string_literal52_tree = null;
        CommonTree string_literal53_tree = null;
        CommonTree string_literal54_tree = null;
        CommonTree string_literal55_tree = null;
        RewriteRuleTokenStream stream_67 = new RewriteRuleTokenStream(adaptor,
                "token 67");
        RewriteRuleTokenStream stream_59 = new RewriteRuleTokenStream(adaptor,
                "token 59");
        RewriteRuleTokenStream stream_60 = new RewriteRuleTokenStream(adaptor,
                "token 60");

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:117:7: ( identifier |
            // 'numer' '[' ']' -> ^( ARRAY_TYPE 'numer' ) | 'numer' | 'bul' |
            // 'Tekst' | 'asgje' )
            int alt8 = 6;
            switch (input.LA(1)) {
            case IDENTIFIER: {
                alt8 = 1;
            }
                break;
            case 67: {
                int LA8_2 = input.LA(2);
                if ((LA8_2 == 59)) {
                    alt8 = 2;
                } else if ((LA8_2 == IDENTIFIER)) {
                    alt8 = 3;
                }

                else {
                    int nvaeMark = input.mark();
                    try {
                        input.consume();
                        NoViableAltException nvae = new NoViableAltException(
                                "", 8, 2, input);
                        throw nvae;
                    } finally {
                        input.rewind(nvaeMark);
                    }
                }

            }
                break;
            case 62: {
                alt8 = 4;
            }
                break;
            case 58: {
                alt8 = 5;
            }
                break;
            case 61: {
                alt8 = 6;
            }
                break;
            default:
                NoViableAltException nvae = new NoViableAltException("", 8, 0,
                        input);
                throw nvae;
            }
            switch (alt8) {
            case 1:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:117:9: identifier
            {
                root_0 = (CommonTree) adaptor.nil();

                pushFollow(FOLLOW_identifier_in_type661);
                identifier48 = identifier();
                state._fsp--;

                adaptor.addChild(root_0, identifier48.getTree());

            }
                break;
            case 2:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:118:4: 'numer' '['
            // ']'
            {
                string_literal49 = (Token) match(input, 67,
                        FOLLOW_67_in_type666);
                stream_67.add(string_literal49);

                char_literal50 = (Token) match(input, 59, FOLLOW_59_in_type668);
                stream_59.add(char_literal50);

                char_literal51 = (Token) match(input, 60, FOLLOW_60_in_type670);
                stream_60.add(char_literal51);

                // AST REWRITE
                // elements: 67
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 118:20: -> ^( ARRAY_TYPE 'numer' )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:118:23: ^( ARRAY_TYPE
                    // 'numer' )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(ARRAY_TYPE,
                                        "ARRAY_TYPE"), root_1);
                        adaptor.addChild(root_1, stream_67.nextNode());
                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }
                break;
            case 3:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:119:4: 'numer'
            {
                root_0 = (CommonTree) adaptor.nil();

                string_literal52 = (Token) match(input, 67,
                        FOLLOW_67_in_type683);
                string_literal52_tree = (CommonTree) adaptor.create(string_literal52);
                adaptor.addChild(root_0, string_literal52_tree);

            }
                break;
            case 4:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:120:4: 'bul'
            {
                root_0 = (CommonTree) adaptor.nil();

                string_literal53 = (Token) match(input, 62,
                        FOLLOW_62_in_type688);
                string_literal53_tree = (CommonTree) adaptor.create(string_literal53);
                adaptor.addChild(root_0, string_literal53_tree);

            }
                break;
            case 5:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:121:4: 'Tekst'
            {
                root_0 = (CommonTree) adaptor.nil();

                string_literal54 = (Token) match(input, 58,
                        FOLLOW_58_in_type693);
                string_literal54_tree = (CommonTree) adaptor.create(string_literal54);
                adaptor.addChild(root_0, string_literal54_tree);

            }
                break;
            case 6:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:122:4: 'asgje'
            {
                root_0 = (CommonTree) adaptor.nil();

                string_literal55 = (Token) match(input, 61,
                        FOLLOW_61_in_type698);
                string_literal55_tree = (CommonTree) adaptor.create(string_literal55);
                adaptor.addChild(root_0, string_literal55_tree);

            }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "type"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "expression"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:125:1: expression : orExpr ;
    public final ABCParser.expression_return expression()
            throws RecognitionException {
        ABCParser.expression_return retval = new ABCParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        ParserRuleReturnScope orExpr56 = null;

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:126:2: ( orExpr )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:126:4: orExpr
            {
                root_0 = (CommonTree) adaptor.nil();

                pushFollow(FOLLOW_orExpr_in_expression709);
                orExpr56 = orExpr();
                state._fsp--;

                adaptor.addChild(root_0, orExpr56.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "expression"

    public static class arrayLengthReference_return extends
            ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "arrayLengthReference"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:130:1: arrayLengthReference : '.'
    // 'gjatesi' ;
    public final ABCParser.arrayLengthReference_return arrayLengthReference()
            throws RecognitionException {
        ABCParser.arrayLengthReference_return retval = new ABCParser.arrayLengthReference_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal57 = null;
        Token string_literal58 = null;

        CommonTree char_literal57_tree = null;
        CommonTree string_literal58_tree = null;

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:131:2: ( '.'
            // 'gjatesi' )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:131:4: '.' 'gjatesi'
            {
                root_0 = (CommonTree) adaptor.nil();

                char_literal57 = (Token) match(input, 55,
                        FOLLOW_55_in_arrayLengthReference724);
                char_literal57_tree = (CommonTree) adaptor.create(char_literal57);
                adaptor.addChild(root_0, char_literal57_tree);

                string_literal58 = (Token) match(input, 63,
                        FOLLOW_63_in_arrayLengthReference726);
                string_literal58_tree = (CommonTree) adaptor.create(string_literal58);
                adaptor.addChild(root_0, string_literal58_tree);

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "arrayLengthReference"

    public static class expressionList_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "expressionList"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:134:1: expressionList : ( expression ( ','
    // expression )* )? -> ^( EXPR_LIST ( expression )* ) ;
    public final ABCParser.expressionList_return expressionList()
            throws RecognitionException {
        ABCParser.expressionList_return retval = new ABCParser.expressionList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal60 = null;
        ParserRuleReturnScope expression59 = null;
        ParserRuleReturnScope expression61 = null;

        CommonTree char_literal60_tree = null;
        RewriteRuleTokenStream stream_54 = new RewriteRuleTokenStream(adaptor,
                "token 54");
        RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
                adaptor, "rule expression");

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:135:2: ( ( expression
            // ( ',' expression )* )? -> ^( EXPR_LIST ( expression )* ) )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:135:4: ( expression (
            // ',' expression )* )?
            {
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:135:4: (
                // expression ( ',' expression )* )?
                int alt10 = 2;
                int LA10_0 = input.LA(1);
                if ((LA10_0 == FALSE || LA10_0 == IDENTIFIER
                        || LA10_0 == INTEGER || LA10_0 == STRING
                        || (LA10_0 >= THIS && LA10_0 <= TRUE)
                        || LA10_0 == UNARY_NOT || LA10_0 == 52 || LA10_0 == 64)) {
                    alt10 = 1;
                }
                switch (alt10) {
                case 1:
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:135:5: expression
                // ( ',' expression )*
                {
                    pushFollow(FOLLOW_expression_in_expressionList739);
                    expression59 = expression();
                    state._fsp--;

                    stream_expression.add(expression59.getTree());
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:135:16: ( ',' expression
                    // )*
                    loop9: while (true) {
                        int alt9 = 2;
                        int LA9_0 = input.LA(1);
                        if ((LA9_0 == 54)) {
                            alt9 = 1;
                        }

                        switch (alt9) {
                        case 1:
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:135:17: ',' expression
                        {
                            char_literal60 = (Token) match(input, 54,
                                    FOLLOW_54_in_expressionList742);
                            stream_54.add(char_literal60);

                            pushFollow(FOLLOW_expression_in_expressionList744);
                            expression61 = expression();
                            state._fsp--;

                            stream_expression.add(expression61.getTree());
                        }
                            break;

                        default:
                            break loop9;
                        }
                    }

                }
                    break;

                }

                // AST REWRITE
                // elements: expression
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 135:36: -> ^( EXPR_LIST ( expression )* )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:135:39: ^( EXPR_LIST (
                    // expression )* )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(EXPR_LIST,
                                        "EXPR_LIST"), root_1);
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:135:51: ( expression
                        // )*
                        while (stream_expression.hasNext()) {
                            adaptor.addChild(root_1,
                                    stream_expression.nextTree());
                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "expressionList"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "statement"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:138:1: statement : ( '{' ( statement )*
    // '}' -> ^( STMNT_LIST ( statement )* ) | IF ^ '(' ! expression ')' !
    // statement ELSE ! statement | WHILE ^ '(' ! expression ')' ! statement |
    // SYSOUT ^ '(' ! expression ')' ! ';' !| ( THIS | identifier )
    // methodInvocation ';' -> ^( METHOD_CALL ( THIS )? ( ^( VAR_REF identifier
    // ) )? ( ^( SUFFIX_PART methodInvocation ) )+ ) | identifier '=' expression
    // ';' -> ^( ASSIGN ^( VAR_REF identifier ) expression ) | identifier '['
    // expression ']' '=' expression ';' -> ^( ARRAY_ASSIGN ^( VAR_REF
    // identifier ) expression expression ) );
    public final ABCParser.statement_return statement()
            throws RecognitionException {
        ABCParser.statement_return retval = new ABCParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal62 = null;
        Token char_literal64 = null;
        Token IF65 = null;
        Token char_literal66 = null;
        Token char_literal68 = null;
        Token ELSE70 = null;
        Token WHILE72 = null;
        Token char_literal73 = null;
        Token char_literal75 = null;
        Token SYSOUT77 = null;
        Token char_literal78 = null;
        Token char_literal80 = null;
        Token char_literal81 = null;
        Token THIS82 = null;
        Token char_literal85 = null;
        Token char_literal87 = null;
        Token char_literal89 = null;
        Token char_literal91 = null;
        Token char_literal93 = null;
        Token char_literal94 = null;
        Token char_literal96 = null;
        ParserRuleReturnScope statement63 = null;
        ParserRuleReturnScope expression67 = null;
        ParserRuleReturnScope statement69 = null;
        ParserRuleReturnScope statement71 = null;
        ParserRuleReturnScope expression74 = null;
        ParserRuleReturnScope statement76 = null;
        ParserRuleReturnScope expression79 = null;
        ParserRuleReturnScope identifier83 = null;
        ParserRuleReturnScope methodInvocation84 = null;
        ParserRuleReturnScope identifier86 = null;
        ParserRuleReturnScope expression88 = null;
        ParserRuleReturnScope identifier90 = null;
        ParserRuleReturnScope expression92 = null;
        ParserRuleReturnScope expression95 = null;

        CommonTree char_literal62_tree = null;
        CommonTree char_literal64_tree = null;
        CommonTree IF65_tree = null;
        CommonTree char_literal66_tree = null;
        CommonTree char_literal68_tree = null;
        CommonTree ELSE70_tree = null;
        CommonTree WHILE72_tree = null;
        CommonTree char_literal73_tree = null;
        CommonTree char_literal75_tree = null;
        CommonTree SYSOUT77_tree = null;
        CommonTree char_literal78_tree = null;
        CommonTree char_literal80_tree = null;
        CommonTree char_literal81_tree = null;
        CommonTree THIS82_tree = null;
        CommonTree char_literal85_tree = null;
        CommonTree char_literal87_tree = null;
        CommonTree char_literal89_tree = null;
        CommonTree char_literal91_tree = null;
        CommonTree char_literal93_tree = null;
        CommonTree char_literal94_tree = null;
        CommonTree char_literal96_tree = null;
        RewriteRuleTokenStream stream_56 = new RewriteRuleTokenStream(adaptor,
                "token 56");
        RewriteRuleTokenStream stream_57 = new RewriteRuleTokenStream(adaptor,
                "token 57");
        RewriteRuleTokenStream stream_59 = new RewriteRuleTokenStream(adaptor,
                "token 59");
        RewriteRuleTokenStream stream_70 = new RewriteRuleTokenStream(adaptor,
                "token 70");
        RewriteRuleTokenStream stream_THIS = new RewriteRuleTokenStream(
                adaptor, "token THIS");
        RewriteRuleTokenStream stream_71 = new RewriteRuleTokenStream(adaptor,
                "token 71");
        RewriteRuleTokenStream stream_60 = new RewriteRuleTokenStream(adaptor,
                "token 60");
        RewriteRuleSubtreeStream stream_identifier = new RewriteRuleSubtreeStream(
                adaptor, "rule identifier");
        RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
                adaptor, "rule expression");
        RewriteRuleSubtreeStream stream_methodInvocation = new RewriteRuleSubtreeStream(
                adaptor, "rule methodInvocation");
        RewriteRuleSubtreeStream stream_statement = new RewriteRuleSubtreeStream(
                adaptor, "rule statement");

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:139:2: ( '{' (
            // statement )* '}' -> ^( STMNT_LIST ( statement )* ) | IF ^ '(' !
            // expression ')' ! statement ELSE ! statement | WHILE ^ '(' !
            // expression ')' ! statement | SYSOUT ^ '(' ! expression ')' ! ';'
            // !| ( THIS | identifier ) methodInvocation ';' -> ^( METHOD_CALL (
            // THIS )? ( ^( VAR_REF identifier ) )? ( ^( SUFFIX_PART
            // methodInvocation ) )+ ) | identifier '=' expression ';' -> ^(
            // ASSIGN ^( VAR_REF identifier ) expression ) | identifier '['
            // expression ']' '=' expression ';' -> ^( ARRAY_ASSIGN ^( VAR_REF
            // identifier ) expression expression ) )
            int alt13 = 7;
            switch (input.LA(1)) {
            case 70: {
                alt13 = 1;
            }
                break;
            case IF: {
                alt13 = 2;
            }
                break;
            case WHILE: {
                alt13 = 3;
            }
                break;
            case SYSOUT: {
                alt13 = 4;
            }
                break;
            case THIS: {
                alt13 = 5;
            }
                break;
            case IDENTIFIER: {
                switch (input.LA(2)) {
                case 55: {
                    alt13 = 5;
                }
                    break;
                case 57: {
                    alt13 = 6;
                }
                    break;
                case 59: {
                    alt13 = 7;
                }
                    break;
                default:
                    int nvaeMark = input.mark();
                    try {
                        input.consume();
                        NoViableAltException nvae = new NoViableAltException(
                                "", 13, 6, input);
                        throw nvae;
                    } finally {
                        input.rewind(nvaeMark);
                    }
                }
            }
                break;
            default:
                NoViableAltException nvae = new NoViableAltException("", 13, 0,
                        input);
                throw nvae;
            }
            switch (alt13) {
            case 1:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:139:4: '{' (
            // statement )* '}'
            {
                char_literal62 = (Token) match(input, 70,
                        FOLLOW_70_in_statement769);
                stream_70.add(char_literal62);

                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:139:8: (
                // statement )*
                loop11: while (true) {
                    int alt11 = 2;
                    int LA11_0 = input.LA(1);
                    if (((LA11_0 >= IDENTIFIER && LA11_0 <= IF)
                            || (LA11_0 >= SYSOUT && LA11_0 <= THIS)
                            || LA11_0 == WHILE || LA11_0 == 70)) {
                        alt11 = 1;
                    }

                    switch (alt11) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:139:8: statement
                    {
                        pushFollow(FOLLOW_statement_in_statement771);
                        statement63 = statement();
                        state._fsp--;

                        stream_statement.add(statement63.getTree());
                    }
                        break;

                    default:
                        break loop11;
                    }
                }

                char_literal64 = (Token) match(input, 71,
                        FOLLOW_71_in_statement774);
                stream_71.add(char_literal64);

                // AST REWRITE
                // elements: statement
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 139:23: -> ^( STMNT_LIST ( statement )* )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:139:26: ^( STMNT_LIST (
                    // statement )* )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(STMNT_LIST,
                                        "STMNT_LIST"), root_1);
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:139:39: ( statement )*
                        while (stream_statement.hasNext()) {
                            adaptor.addChild(root_1,
                                    stream_statement.nextTree());
                        }
                        stream_statement.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }
                break;
            case 2:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:140:4: IF ^ '(' !
            // expression ')' ! statement ELSE ! statement
            {
                root_0 = (CommonTree) adaptor.nil();

                IF65 = (Token) match(input, IF, FOLLOW_IF_in_statement788);
                IF65_tree = (CommonTree) adaptor.create(IF65);
                root_0 = (CommonTree) adaptor.becomeRoot(IF65_tree, root_0);

                char_literal66 = (Token) match(input, 52,
                        FOLLOW_52_in_statement791);
                pushFollow(FOLLOW_expression_in_statement794);
                expression67 = expression();
                state._fsp--;

                adaptor.addChild(root_0, expression67.getTree());

                char_literal68 = (Token) match(input, 53,
                        FOLLOW_53_in_statement796);
                pushFollow(FOLLOW_statement_in_statement799);
                statement69 = statement();
                state._fsp--;

                adaptor.addChild(root_0, statement69.getTree());

                ELSE70 = (Token) match(input, ELSE, FOLLOW_ELSE_in_statement801);
                pushFollow(FOLLOW_statement_in_statement804);
                statement71 = statement();
                state._fsp--;

                adaptor.addChild(root_0, statement71.getTree());

            }
                break;
            case 3:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:141:4: WHILE ^ '(' !
            // expression ')' ! statement
            {
                root_0 = (CommonTree) adaptor.nil();

                WHILE72 = (Token) match(input, WHILE,
                        FOLLOW_WHILE_in_statement809);
                WHILE72_tree = (CommonTree) adaptor.create(WHILE72);
                root_0 = (CommonTree) adaptor.becomeRoot(WHILE72_tree, root_0);

                char_literal73 = (Token) match(input, 52,
                        FOLLOW_52_in_statement812);
                pushFollow(FOLLOW_expression_in_statement815);
                expression74 = expression();
                state._fsp--;

                adaptor.addChild(root_0, expression74.getTree());

                char_literal75 = (Token) match(input, 53,
                        FOLLOW_53_in_statement817);
                pushFollow(FOLLOW_statement_in_statement820);
                statement76 = statement();
                state._fsp--;

                adaptor.addChild(root_0, statement76.getTree());

            }
                break;
            case 4:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:142:4: SYSOUT ^ '(' !
            // expression ')' ! ';' !
            {
                root_0 = (CommonTree) adaptor.nil();

                SYSOUT77 = (Token) match(input, SYSOUT,
                        FOLLOW_SYSOUT_in_statement825);
                SYSOUT77_tree = (CommonTree) adaptor.create(SYSOUT77);
                root_0 = (CommonTree) adaptor.becomeRoot(SYSOUT77_tree, root_0);

                char_literal78 = (Token) match(input, 52,
                        FOLLOW_52_in_statement828);
                pushFollow(FOLLOW_expression_in_statement831);
                expression79 = expression();
                state._fsp--;

                adaptor.addChild(root_0, expression79.getTree());

                char_literal80 = (Token) match(input, 53,
                        FOLLOW_53_in_statement833);
                char_literal81 = (Token) match(input, 56,
                        FOLLOW_56_in_statement836);
            }
                break;
            case 5:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:143:4: ( THIS |
            // identifier ) methodInvocation ';'
            {
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:143:4: ( THIS |
                // identifier )
                int alt12 = 2;
                int LA12_0 = input.LA(1);
                if ((LA12_0 == THIS)) {
                    alt12 = 1;
                } else if ((LA12_0 == IDENTIFIER)) {
                    alt12 = 2;
                }

                else {
                    NoViableAltException nvae = new NoViableAltException("",
                            12, 0, input);
                    throw nvae;
                }

                switch (alt12) {
                case 1:
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:143:5: THIS
                {
                    THIS82 = (Token) match(input, THIS,
                            FOLLOW_THIS_in_statement843);
                    stream_THIS.add(THIS82);

                }
                    break;
                case 2:
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:143:10:
                // identifier
                {
                    pushFollow(FOLLOW_identifier_in_statement845);
                    identifier83 = identifier();
                    state._fsp--;

                    stream_identifier.add(identifier83.getTree());
                }
                    break;

                }

                pushFollow(FOLLOW_methodInvocation_in_statement848);
                methodInvocation84 = methodInvocation();
                state._fsp--;

                stream_methodInvocation.add(methodInvocation84.getTree());
                char_literal85 = (Token) match(input, 56,
                        FOLLOW_56_in_statement849);
                stream_56.add(char_literal85);

                // AST REWRITE
                // elements: identifier, THIS, methodInvocation
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 143:41: -> ^( METHOD_CALL ( THIS )? ( ^( VAR_REF identifier )
                // )? ( ^( SUFFIX_PART methodInvocation ) )+ )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:143:43: ^( METHOD_CALL (
                    // THIS )? ( ^( VAR_REF identifier ) )? ( ^( SUFFIX_PART
                    // methodInvocation ) )+ )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(METHOD_CALL,
                                        "METHOD_CALL"), root_1);
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:143:57: ( THIS )?
                        if (stream_THIS.hasNext()) {
                            adaptor.addChild(root_1, stream_THIS.nextNode());
                        }
                        stream_THIS.reset();

                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:143:63: ( ^( VAR_REF
                        // identifier ) )?
                        if (stream_identifier.hasNext()) {
                            // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                            // Technology\\COMPILER CONSTRUCTION
                            // 1\\PA1\\ANTLRStarterKit\\ABC.g:143:63: ^( VAR_REF
                            // identifier )
                            {
                                CommonTree root_2 = (CommonTree) adaptor.nil();
                                root_2 = (CommonTree) adaptor.becomeRoot(
                                        (CommonTree) adaptor.create(VAR_REF,
                                                "VAR_REF"), root_2);
                                adaptor.addChild(root_2,
                                        stream_identifier.nextTree());
                                adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_identifier.reset();

                        if (!(stream_methodInvocation.hasNext())) {
                            throw new RewriteEarlyExitException();
                        }
                        while (stream_methodInvocation.hasNext()) {
                            // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                            // Technology\\COMPILER CONSTRUCTION
                            // 1\\PA1\\ANTLRStarterKit\\ABC.g:143:86: ^(
                            // SUFFIX_PART methodInvocation )
                            {
                                CommonTree root_2 = (CommonTree) adaptor.nil();
                                root_2 = (CommonTree) adaptor.becomeRoot(
                                        (CommonTree) adaptor.create(
                                                SUFFIX_PART, "SUFFIX_PART"),
                                        root_2);
                                adaptor.addChild(root_2,
                                        stream_methodInvocation.nextTree());
                                adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_methodInvocation.reset();

                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }
                break;
            case 6:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:145:4: identifier '='
            // expression ';'
            {
                pushFollow(FOLLOW_identifier_in_statement877);
                identifier86 = identifier();
                state._fsp--;

                stream_identifier.add(identifier86.getTree());
                char_literal87 = (Token) match(input, 57,
                        FOLLOW_57_in_statement879);
                stream_57.add(char_literal87);

                pushFollow(FOLLOW_expression_in_statement881);
                expression88 = expression();
                state._fsp--;

                stream_expression.add(expression88.getTree());
                char_literal89 = (Token) match(input, 56,
                        FOLLOW_56_in_statement883);
                stream_56.add(char_literal89);

                // AST REWRITE
                // elements: identifier, expression
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 145:34: -> ^( ASSIGN ^( VAR_REF identifier ) expression )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:145:37: ^( ASSIGN ^(
                    // VAR_REF identifier ) expression )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(ASSIGN, "ASSIGN"),
                                root_1);
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:145:46: ^( VAR_REF
                        // identifier )
                        {
                            CommonTree root_2 = (CommonTree) adaptor.nil();
                            root_2 = (CommonTree) adaptor.becomeRoot(
                                    (CommonTree) adaptor.create(VAR_REF,
                                            "VAR_REF"), root_2);
                            adaptor.addChild(root_2,
                                    stream_identifier.nextTree());
                            adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }
                break;
            case 7:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:146:4: identifier '['
            // expression ']' '=' expression ';'
            {
                pushFollow(FOLLOW_identifier_in_statement902);
                identifier90 = identifier();
                state._fsp--;

                stream_identifier.add(identifier90.getTree());
                char_literal91 = (Token) match(input, 59,
                        FOLLOW_59_in_statement904);
                stream_59.add(char_literal91);

                pushFollow(FOLLOW_expression_in_statement906);
                expression92 = expression();
                state._fsp--;

                stream_expression.add(expression92.getTree());
                char_literal93 = (Token) match(input, 60,
                        FOLLOW_60_in_statement908);
                stream_60.add(char_literal93);

                char_literal94 = (Token) match(input, 57,
                        FOLLOW_57_in_statement910);
                stream_57.add(char_literal94);

                pushFollow(FOLLOW_expression_in_statement912);
                expression95 = expression();
                state._fsp--;

                stream_expression.add(expression95.getTree());
                char_literal96 = (Token) match(input, 56,
                        FOLLOW_56_in_statement914);
                stream_56.add(char_literal96);

                // AST REWRITE
                // elements: identifier, expression, expression
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 146:53: -> ^( ARRAY_ASSIGN ^( VAR_REF identifier ) expression
                // expression )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:146:56: ^( ARRAY_ASSIGN ^(
                    // VAR_REF identifier ) expression expression )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(ARRAY_ASSIGN,
                                        "ARRAY_ASSIGN"), root_1);
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:146:71: ^( VAR_REF
                        // identifier )
                        {
                            CommonTree root_2 = (CommonTree) adaptor.nil();
                            root_2 = (CommonTree) adaptor.becomeRoot(
                                    (CommonTree) adaptor.create(VAR_REF,
                                            "VAR_REF"), root_2);
                            adaptor.addChild(root_2,
                                    stream_identifier.nextTree());
                            adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "statement"

    public static class orExpr_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "orExpr"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:150:1: orExpr : andExpr ( LOGIC_OR ^
    // andExpr )* ;
    public final ABCParser.orExpr_return orExpr() throws RecognitionException {
        ABCParser.orExpr_return retval = new ABCParser.orExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOGIC_OR98 = null;
        ParserRuleReturnScope andExpr97 = null;
        ParserRuleReturnScope andExpr99 = null;

        CommonTree LOGIC_OR98_tree = null;

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:150:9: ( andExpr (
            // LOGIC_OR ^ andExpr )* )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:150:11: andExpr (
            // LOGIC_OR ^ andExpr )*
            {
                root_0 = (CommonTree) adaptor.nil();

                pushFollow(FOLLOW_andExpr_in_orExpr943);
                andExpr97 = andExpr();
                state._fsp--;

                adaptor.addChild(root_0, andExpr97.getTree());

                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:150:19: (
                // LOGIC_OR ^ andExpr )*
                loop14: while (true) {
                    int alt14 = 2;
                    int LA14_0 = input.LA(1);
                    if ((LA14_0 == LOGIC_OR)) {
                        alt14 = 1;
                    }

                    switch (alt14) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:150:21: LOGIC_OR ^ andExpr
                    {
                        LOGIC_OR98 = (Token) match(input, LOGIC_OR,
                                FOLLOW_LOGIC_OR_in_orExpr947);
                        LOGIC_OR98_tree = (CommonTree) adaptor.create(LOGIC_OR98);
                        root_0 = (CommonTree) adaptor.becomeRoot(
                                LOGIC_OR98_tree, root_0);

                        pushFollow(FOLLOW_andExpr_in_orExpr950);
                        andExpr99 = andExpr();
                        state._fsp--;

                        adaptor.addChild(root_0, andExpr99.getTree());

                    }
                        break;

                    default:
                        break loop14;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "orExpr"

    public static class andExpr_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "andExpr"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:153:1: andExpr : compareExpr ( LOGIC_AND ^
    // compareExpr )* ;
    public final ABCParser.andExpr_return andExpr() throws RecognitionException {
        ABCParser.andExpr_return retval = new ABCParser.andExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOGIC_AND101 = null;
        ParserRuleReturnScope compareExpr100 = null;
        ParserRuleReturnScope compareExpr102 = null;

        CommonTree LOGIC_AND101_tree = null;

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:153:9: ( compareExpr
            // ( LOGIC_AND ^ compareExpr )* )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:153:11: compareExpr (
            // LOGIC_AND ^ compareExpr )*
            {
                root_0 = (CommonTree) adaptor.nil();

                pushFollow(FOLLOW_compareExpr_in_andExpr963);
                compareExpr100 = compareExpr();
                state._fsp--;

                adaptor.addChild(root_0, compareExpr100.getTree());

                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:153:23: (
                // LOGIC_AND ^ compareExpr )*
                loop15: while (true) {
                    int alt15 = 2;
                    int LA15_0 = input.LA(1);
                    if ((LA15_0 == LOGIC_AND)) {
                        alt15 = 1;
                    }

                    switch (alt15) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:153:25: LOGIC_AND ^
                    // compareExpr
                    {
                        LOGIC_AND101 = (Token) match(input, LOGIC_AND,
                                FOLLOW_LOGIC_AND_in_andExpr967);
                        LOGIC_AND101_tree = (CommonTree) adaptor.create(LOGIC_AND101);
                        root_0 = (CommonTree) adaptor.becomeRoot(
                                LOGIC_AND101_tree, root_0);

                        pushFollow(FOLLOW_compareExpr_in_andExpr970);
                        compareExpr102 = compareExpr();
                        state._fsp--;

                        adaptor.addChild(root_0, compareExpr102.getTree());

                    }
                        break;

                    default:
                        break loop15;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "andExpr"

    public static class compareExpr_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "compareExpr"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:156:1: compareExpr : additiveExpr ( ( BT
    // ^| LT ^) additiveExpr )? ;
    public final ABCParser.compareExpr_return compareExpr()
            throws RecognitionException {
        ABCParser.compareExpr_return retval = new ABCParser.compareExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BT104 = null;
        Token LT105 = null;
        ParserRuleReturnScope additiveExpr103 = null;
        ParserRuleReturnScope additiveExpr106 = null;

        CommonTree BT104_tree = null;
        CommonTree LT105_tree = null;

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:157:2: ( additiveExpr
            // ( ( BT ^| LT ^) additiveExpr )? )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:157:4: additiveExpr (
            // ( BT ^| LT ^) additiveExpr )?
            {
                root_0 = (CommonTree) adaptor.nil();

                pushFollow(FOLLOW_additiveExpr_in_compareExpr986);
                additiveExpr103 = additiveExpr();
                state._fsp--;

                adaptor.addChild(root_0, additiveExpr103.getTree());

                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:157:17: ( ( BT ^|
                // LT ^) additiveExpr )?
                int alt17 = 2;
                int LA17_0 = input.LA(1);
                if ((LA17_0 == BT || LA17_0 == LT)) {
                    alt17 = 1;
                }
                switch (alt17) {
                case 1:
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:157:19: ( BT ^|
                // LT ^) additiveExpr
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:157:19: ( BT ^| LT ^)
                    int alt16 = 2;
                    int LA16_0 = input.LA(1);
                    if ((LA16_0 == BT)) {
                        alt16 = 1;
                    } else if ((LA16_0 == LT)) {
                        alt16 = 2;
                    }

                    else {
                        NoViableAltException nvae = new NoViableAltException(
                                "", 16, 0, input);
                        throw nvae;
                    }

                    switch (alt16) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:157:20: BT ^
                    {
                        BT104 = (Token) match(input, BT,
                                FOLLOW_BT_in_compareExpr991);
                        BT104_tree = (CommonTree) adaptor.create(BT104);
                        root_0 = (CommonTree) adaptor.becomeRoot(BT104_tree,
                                root_0);

                    }
                        break;
                    case 2:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:157:24: LT ^
                    {
                        LT105 = (Token) match(input, LT,
                                FOLLOW_LT_in_compareExpr994);
                        LT105_tree = (CommonTree) adaptor.create(LT105);
                        root_0 = (CommonTree) adaptor.becomeRoot(LT105_tree,
                                root_0);

                    }
                        break;

                    }

                    pushFollow(FOLLOW_additiveExpr_in_compareExpr998);
                    additiveExpr106 = additiveExpr();
                    state._fsp--;

                    adaptor.addChild(root_0, additiveExpr106.getTree());

                }
                    break;

                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "compareExpr"

    public static class additiveExpr_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "additiveExpr"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:161:1: additiveExpr : multExpr ( ( PLUS ^|
    // MINUS ^) multExpr )* ;
    public final ABCParser.additiveExpr_return additiveExpr()
            throws RecognitionException {
        ABCParser.additiveExpr_return retval = new ABCParser.additiveExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS108 = null;
        Token MINUS109 = null;
        ParserRuleReturnScope multExpr107 = null;
        ParserRuleReturnScope multExpr110 = null;

        CommonTree PLUS108_tree = null;
        CommonTree MINUS109_tree = null;

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:162:2: ( multExpr ( (
            // PLUS ^| MINUS ^) multExpr )* )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:162:4: multExpr ( (
            // PLUS ^| MINUS ^) multExpr )*
            {
                root_0 = (CommonTree) adaptor.nil();

                pushFollow(FOLLOW_multExpr_in_additiveExpr1015);
                multExpr107 = multExpr();
                state._fsp--;

                adaptor.addChild(root_0, multExpr107.getTree());

                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:162:13: ( ( PLUS
                // ^| MINUS ^) multExpr )*
                loop19: while (true) {
                    int alt19 = 2;
                    int LA19_0 = input.LA(1);
                    if ((LA19_0 == MINUS || LA19_0 == PLUS)) {
                        alt19 = 1;
                    }

                    switch (alt19) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:162:15: ( PLUS ^| MINUS ^)
                    // multExpr
                    {
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:162:15: ( PLUS ^|
                        // MINUS ^)
                        int alt18 = 2;
                        int LA18_0 = input.LA(1);
                        if ((LA18_0 == PLUS)) {
                            alt18 = 1;
                        } else if ((LA18_0 == MINUS)) {
                            alt18 = 2;
                        }

                        else {
                            NoViableAltException nvae = new NoViableAltException(
                                    "", 18, 0, input);
                            throw nvae;
                        }

                        switch (alt18) {
                        case 1:
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:162:16: PLUS ^
                        {
                            PLUS108 = (Token) match(input, PLUS,
                                    FOLLOW_PLUS_in_additiveExpr1020);
                            PLUS108_tree = (CommonTree) adaptor.create(PLUS108);
                            root_0 = (CommonTree) adaptor.becomeRoot(
                                    PLUS108_tree, root_0);

                        }
                            break;
                        case 2:
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:162:22: MINUS ^
                        {
                            MINUS109 = (Token) match(input, MINUS,
                                    FOLLOW_MINUS_in_additiveExpr1023);
                            MINUS109_tree = (CommonTree) adaptor.create(MINUS109);
                            root_0 = (CommonTree) adaptor.becomeRoot(
                                    MINUS109_tree, root_0);

                        }
                            break;

                        }

                        pushFollow(FOLLOW_multExpr_in_additiveExpr1027);
                        multExpr110 = multExpr();
                        state._fsp--;

                        adaptor.addChild(root_0, multExpr110.getTree());

                    }
                        break;

                    default:
                        break loop19;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "additiveExpr"

    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "multExpr"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:165:1: multExpr : unaryExpr ( MULT ^
    // unaryExpr )* ;
    public final ABCParser.multExpr_return multExpr()
            throws RecognitionException {
        ABCParser.multExpr_return retval = new ABCParser.multExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MULT112 = null;
        ParserRuleReturnScope unaryExpr111 = null;
        ParserRuleReturnScope unaryExpr113 = null;

        CommonTree MULT112_tree = null;

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:165:9: ( unaryExpr (
            // MULT ^ unaryExpr )* )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:165:11: unaryExpr (
            // MULT ^ unaryExpr )*
            {
                root_0 = (CommonTree) adaptor.nil();

                pushFollow(FOLLOW_unaryExpr_in_multExpr1039);
                unaryExpr111 = unaryExpr();
                state._fsp--;

                adaptor.addChild(root_0, unaryExpr111.getTree());

                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:165:21: ( MULT ^
                // unaryExpr )*
                loop20: while (true) {
                    int alt20 = 2;
                    int LA20_0 = input.LA(1);
                    if ((LA20_0 == MULT)) {
                        alt20 = 1;
                    }

                    switch (alt20) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:165:23: MULT ^ unaryExpr
                    {
                        MULT112 = (Token) match(input, MULT,
                                FOLLOW_MULT_in_multExpr1043);
                        MULT112_tree = (CommonTree) adaptor.create(MULT112);
                        root_0 = (CommonTree) adaptor.becomeRoot(MULT112_tree,
                                root_0);

                        pushFollow(FOLLOW_unaryExpr_in_multExpr1046);
                        unaryExpr113 = unaryExpr();
                        state._fsp--;

                        adaptor.addChild(root_0, unaryExpr113.getTree());

                    }
                        break;

                    default:
                        break loop20;
                    }
                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "multExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "unaryExpr"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:168:1: unaryExpr : ( UNARY_NOT ^)?
    // primaryExpression ;
    public final ABCParser.unaryExpr_return unaryExpr()
            throws RecognitionException {
        ABCParser.unaryExpr_return retval = new ABCParser.unaryExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UNARY_NOT114 = null;
        ParserRuleReturnScope primaryExpression115 = null;

        CommonTree UNARY_NOT114_tree = null;

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:169:2: ( ( UNARY_NOT
            // ^)? primaryExpression )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:169:4: ( UNARY_NOT
            // ^)? primaryExpression
            {
                root_0 = (CommonTree) adaptor.nil();

                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:169:4: (
                // UNARY_NOT ^)?
                int alt21 = 2;
                int LA21_0 = input.LA(1);
                if ((LA21_0 == UNARY_NOT)) {
                    alt21 = 1;
                }
                switch (alt21) {
                case 1:
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:169:5: UNARY_NOT
                // ^
                {
                    UNARY_NOT114 = (Token) match(input, UNARY_NOT,
                            FOLLOW_UNARY_NOT_in_unaryExpr1062);
                    UNARY_NOT114_tree = (CommonTree) adaptor.create(UNARY_NOT114);
                    root_0 = (CommonTree) adaptor.becomeRoot(UNARY_NOT114_tree,
                            root_0);

                }
                    break;

                }

                pushFollow(FOLLOW_primaryExpression_in_unaryExpr1067);
                primaryExpression115 = primaryExpression();
                state._fsp--;

                adaptor.addChild(root_0, primaryExpression115.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "unaryExpr"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "primaryExpression"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:172:1: primaryExpression :
    // primaryExpressionPrefix ( ( '[' indexExpr= expression ']' -> ^(
    // ARRAY_READ primaryExpressionPrefix $indexExpr) ) | ( arrayLengthReference
    // -> ^( ARRAYLENGTH_REFERENCE primaryExpressionPrefix ) ) | (
    // methodInvocation )+ -> ^( METHOD_CALL primaryExpressionPrefix ( ^(
    // SUFFIX_PART methodInvocation ) )+ ) | -> primaryExpressionPrefix ) ;
    public final ABCParser.primaryExpression_return primaryExpression()
            throws RecognitionException {
        ABCParser.primaryExpression_return retval = new ABCParser.primaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal117 = null;
        Token char_literal118 = null;
        ParserRuleReturnScope indexExpr = null;
        ParserRuleReturnScope primaryExpressionPrefix116 = null;
        ParserRuleReturnScope arrayLengthReference119 = null;
        ParserRuleReturnScope methodInvocation120 = null;

        CommonTree char_literal117_tree = null;
        CommonTree char_literal118_tree = null;
        RewriteRuleTokenStream stream_59 = new RewriteRuleTokenStream(adaptor,
                "token 59");
        RewriteRuleTokenStream stream_60 = new RewriteRuleTokenStream(adaptor,
                "token 60");
        RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
                adaptor, "rule expression");
        RewriteRuleSubtreeStream stream_methodInvocation = new RewriteRuleSubtreeStream(
                adaptor, "rule methodInvocation");
        RewriteRuleSubtreeStream stream_primaryExpressionPrefix = new RewriteRuleSubtreeStream(
                adaptor, "rule primaryExpressionPrefix");
        RewriteRuleSubtreeStream stream_arrayLengthReference = new RewriteRuleSubtreeStream(
                adaptor, "rule arrayLengthReference");

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:173:2: (
            // primaryExpressionPrefix ( ( '[' indexExpr= expression ']' -> ^(
            // ARRAY_READ primaryExpressionPrefix $indexExpr) ) | (
            // arrayLengthReference -> ^( ARRAYLENGTH_REFERENCE
            // primaryExpressionPrefix ) ) | ( methodInvocation )+ -> ^(
            // METHOD_CALL primaryExpressionPrefix ( ^( SUFFIX_PART
            // methodInvocation ) )+ ) | -> primaryExpressionPrefix ) )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:173:4:
            // primaryExpressionPrefix ( ( '[' indexExpr= expression ']' -> ^(
            // ARRAY_READ primaryExpressionPrefix $indexExpr) ) | (
            // arrayLengthReference -> ^( ARRAYLENGTH_REFERENCE
            // primaryExpressionPrefix ) ) | ( methodInvocation )+ -> ^(
            // METHOD_CALL primaryExpressionPrefix ( ^( SUFFIX_PART
            // methodInvocation ) )+ ) | -> primaryExpressionPrefix )
            {
                pushFollow(FOLLOW_primaryExpressionPrefix_in_primaryExpression1079);
                primaryExpressionPrefix116 = primaryExpressionPrefix();
                state._fsp--;

                stream_primaryExpressionPrefix.add(primaryExpressionPrefix116.getTree());
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:174:3: ( ( '['
                // indexExpr= expression ']' -> ^( ARRAY_READ
                // primaryExpressionPrefix $indexExpr) ) | (
                // arrayLengthReference -> ^( ARRAYLENGTH_REFERENCE
                // primaryExpressionPrefix ) ) | ( methodInvocation )+ -> ^(
                // METHOD_CALL primaryExpressionPrefix ( ^( SUFFIX_PART
                // methodInvocation ) )+ ) | -> primaryExpressionPrefix )
                int alt23 = 4;
                switch (input.LA(1)) {
                case 59: {
                    alt23 = 1;
                }
                    break;
                case 55: {
                    int LA23_2 = input.LA(2);
                    if ((LA23_2 == 63)) {
                        alt23 = 2;
                    } else if ((LA23_2 == IDENTIFIER)) {
                        alt23 = 3;
                    }

                    else {
                        int nvaeMark = input.mark();
                        try {
                            input.consume();
                            NoViableAltException nvae = new NoViableAltException(
                                    "", 23, 2, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                    }

                }
                    break;
                case BT:
                case LOGIC_AND:
                case LOGIC_OR:
                case LT:
                case MINUS:
                case MULT:
                case PLUS:
                case 53:
                case 54:
                case 56:
                case 60: {
                    alt23 = 4;
                }
                    break;
                default:
                    NoViableAltException nvae = new NoViableAltException("",
                            23, 0, input);
                    throw nvae;
                }
                switch (alt23) {
                case 1:
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:175:7: ( '['
                // indexExpr= expression ']' -> ^( ARRAY_READ
                // primaryExpressionPrefix $indexExpr) )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:175:7: ( '[' indexExpr=
                    // expression ']' -> ^( ARRAY_READ primaryExpressionPrefix
                    // $indexExpr) )
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:175:8: '[' indexExpr=
                    // expression ']'
                    {
                        char_literal117 = (Token) match(input, 59,
                                FOLLOW_59_in_primaryExpression1093);
                        stream_59.add(char_literal117);

                        pushFollow(FOLLOW_expression_in_primaryExpression1097);
                        indexExpr = expression();
                        state._fsp--;

                        stream_expression.add(indexExpr.getTree());
                        char_literal118 = (Token) match(input, 60,
                                FOLLOW_60_in_primaryExpression1099);
                        stream_60.add(char_literal118);

                        // AST REWRITE
                        // elements: primaryExpressionPrefix, indexExpr
                        // token labels:
                        // rule labels: indexExpr, retval
                        // token list labels:
                        // rule list labels:
                        // wildcard labels:
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_indexExpr = new RewriteRuleSubtreeStream(
                                adaptor, "rule indexExpr",
                                indexExpr != null ? indexExpr.getTree() : null);
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                                adaptor, "rule retval",
                                retval != null ? retval.getTree() : null);

                        root_0 = (CommonTree) adaptor.nil();
                        // 175:37: -> ^( ARRAY_READ primaryExpressionPrefix
                        // $indexExpr)
                        {
                            // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                            // Technology\\COMPILER CONSTRUCTION
                            // 1\\PA1\\ANTLRStarterKit\\ABC.g:175:40: ^(
                            // ARRAY_READ primaryExpressionPrefix $indexExpr)
                            {
                                CommonTree root_1 = (CommonTree) adaptor.nil();
                                root_1 = (CommonTree) adaptor.becomeRoot(
                                        (CommonTree) adaptor.create(ARRAY_READ,
                                                "ARRAY_READ"), root_1);
                                adaptor.addChild(
                                        root_1,
                                        stream_primaryExpressionPrefix.nextTree());
                                adaptor.addChild(root_1,
                                        stream_indexExpr.nextTree());
                                adaptor.addChild(root_0, root_1);
                            }

                        }

                        retval.tree = root_0;

                    }

                }
                    break;
                case 2:
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:176:7: (
                // arrayLengthReference -> ^( ARRAYLENGTH_REFERENCE
                // primaryExpressionPrefix ) )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:176:7: (
                    // arrayLengthReference -> ^( ARRAYLENGTH_REFERENCE
                    // primaryExpressionPrefix ) )
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:176:8:
                    // arrayLengthReference
                    {
                        pushFollow(FOLLOW_arrayLengthReference_in_primaryExpression1120);
                        arrayLengthReference119 = arrayLengthReference();
                        state._fsp--;

                        stream_arrayLengthReference.add(arrayLengthReference119.getTree());
                        // AST REWRITE
                        // elements: primaryExpressionPrefix
                        // token labels:
                        // rule labels: retval
                        // token list labels:
                        // rule list labels:
                        // wildcard labels:
                        retval.tree = root_0;
                        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                                adaptor, "rule retval",
                                retval != null ? retval.getTree() : null);

                        root_0 = (CommonTree) adaptor.nil();
                        // 176:29: -> ^( ARRAYLENGTH_REFERENCE
                        // primaryExpressionPrefix )
                        {
                            // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                            // Technology\\COMPILER CONSTRUCTION
                            // 1\\PA1\\ANTLRStarterKit\\ABC.g:176:32: ^(
                            // ARRAYLENGTH_REFERENCE primaryExpressionPrefix )
                            {
                                CommonTree root_1 = (CommonTree) adaptor.nil();
                                root_1 = (CommonTree) adaptor.becomeRoot(
                                        (CommonTree) adaptor.create(
                                                ARRAYLENGTH_REFERENCE,
                                                "ARRAYLENGTH_REFERENCE"),
                                        root_1);
                                adaptor.addChild(
                                        root_1,
                                        stream_primaryExpressionPrefix.nextTree());
                                adaptor.addChild(root_0, root_1);
                            }

                        }

                        retval.tree = root_0;

                    }

                }
                    break;
                case 3:
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:177:7: (
                // methodInvocation )+
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:177:7: ( methodInvocation
                    // )+
                    int cnt22 = 0;
                    loop22: while (true) {
                        int alt22 = 2;
                        int LA22_0 = input.LA(1);
                        if ((LA22_0 == 55)) {
                            alt22 = 1;
                        }

                        switch (alt22) {
                        case 1:
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:177:7:
                        // methodInvocation
                        {
                            pushFollow(FOLLOW_methodInvocation_in_primaryExpression1137);
                            methodInvocation120 = methodInvocation();
                            state._fsp--;

                            stream_methodInvocation.add(methodInvocation120.getTree());
                        }
                            break;

                        default:
                            if (cnt22 >= 1) {
                                break loop22;
                            }
                            EarlyExitException eee = new EarlyExitException(22,
                                    input);
                            throw eee;
                        }
                        cnt22++;
                    }

                    // AST REWRITE
                    // elements: primaryExpressionPrefix, methodInvocation
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                            adaptor, "rule retval",
                            retval != null ? retval.getTree() : null);

                    root_0 = (CommonTree) adaptor.nil();
                    // 177:27: -> ^( METHOD_CALL primaryExpressionPrefix ( ^(
                    // SUFFIX_PART methodInvocation ) )+ )
                    {
                        // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                        // Technology\\COMPILER CONSTRUCTION
                        // 1\\PA1\\ANTLRStarterKit\\ABC.g:177:30: ^( METHOD_CALL
                        // primaryExpressionPrefix ( ^( SUFFIX_PART
                        // methodInvocation ) )+ )
                        {
                            CommonTree root_1 = (CommonTree) adaptor.nil();
                            root_1 = (CommonTree) adaptor.becomeRoot(
                                    (CommonTree) adaptor.create(METHOD_CALL,
                                            "METHOD_CALL"), root_1);
                            adaptor.addChild(root_1,
                                    stream_primaryExpressionPrefix.nextTree());
                            if (!(stream_methodInvocation.hasNext())) {
                                throw new RewriteEarlyExitException();
                            }
                            while (stream_methodInvocation.hasNext()) {
                                // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                                // Technology\\COMPILER CONSTRUCTION
                                // 1\\PA1\\ANTLRStarterKit\\ABC.g:177:68: ^(
                                // SUFFIX_PART methodInvocation )
                                {
                                    CommonTree root_2 = (CommonTree) adaptor.nil();
                                    root_2 = (CommonTree) adaptor.becomeRoot(
                                            (CommonTree) adaptor.create(
                                                    SUFFIX_PART, "SUFFIX_PART"),
                                            root_2);
                                    adaptor.addChild(root_2,
                                            stream_methodInvocation.nextTree());
                                    adaptor.addChild(root_1, root_2);
                                }

                            }
                            stream_methodInvocation.reset();

                            adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;

                }
                    break;
                case 4:
                // C:\\Users\\user\\Desktop\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:178:7:
                {
                    // AST REWRITE
                    // elements: primaryExpressionPrefix
                    // token labels:
                    // rule labels: retval
                    // token list labels:
                    // rule list labels:
                    // wildcard labels:
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                            adaptor, "rule retval",
                            retval != null ? retval.getTree() : null);

                    root_0 = (CommonTree) adaptor.nil();
                    // 178:7: -> primaryExpressionPrefix
                    {
                        adaptor.addChild(root_0,
                                stream_primaryExpressionPrefix.nextTree());
                    }

                    retval.tree = root_0;

                }
                    break;

                }

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "primaryExpression"

    public static class methodInvocation_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "methodInvocation"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:182:1: methodInvocation : '.' ! identifier
    // '(' ! expressionList ')' !;
    public final ABCParser.methodInvocation_return methodInvocation()
            throws RecognitionException {
        ABCParser.methodInvocation_return retval = new ABCParser.methodInvocation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal121 = null;
        Token char_literal123 = null;
        Token char_literal125 = null;
        ParserRuleReturnScope identifier122 = null;
        ParserRuleReturnScope expressionList124 = null;

        CommonTree char_literal121_tree = null;
        CommonTree char_literal123_tree = null;
        CommonTree char_literal125_tree = null;

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:183:2: ( '.' !
            // identifier '(' ! expressionList ')' !)
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:183:4: '.' !
            // identifier '(' ! expressionList ')' !
            {
                root_0 = (CommonTree) adaptor.nil();

                char_literal121 = (Token) match(input, 55,
                        FOLLOW_55_in_methodInvocation1181);
                pushFollow(FOLLOW_identifier_in_methodInvocation1184);
                identifier122 = identifier();
                state._fsp--;

                adaptor.addChild(root_0, identifier122.getTree());

                char_literal123 = (Token) match(input, 52,
                        FOLLOW_52_in_methodInvocation1186);
                pushFollow(FOLLOW_expressionList_in_methodInvocation1189);
                expressionList124 = expressionList();
                state._fsp--;

                adaptor.addChild(root_0, expressionList124.getTree());

                char_literal125 = (Token) match(input, 53,
                        FOLLOW_53_in_methodInvocation1191);
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "methodInvocation"

    public static class primaryExpressionPrefix_return extends
            ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "primaryExpressionPrefix"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:187:1: primaryExpressionPrefix : ( INTEGER
    // -> ^( CONST INTEGER ) | STRING -> ^( CONST STRING ) | TRUE -> ^( CONST
    // TRUE ) | FALSE -> ^( CONST FALSE ) | THIS | '(' ! expression ')' !| 'iri'
    // 'numer' '[' expression ']' -> ^( INTARRAY_NEW expression ) | 'iri'
    // identifier '(' ')' -> ^( NEW identifier ) | identifier -> ^( VAR_REF
    // identifier ) );
    public final ABCParser.primaryExpressionPrefix_return primaryExpressionPrefix()
            throws RecognitionException {
        ABCParser.primaryExpressionPrefix_return retval = new ABCParser.primaryExpressionPrefix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER126 = null;
        Token STRING127 = null;
        Token TRUE128 = null;
        Token FALSE129 = null;
        Token THIS130 = null;
        Token char_literal131 = null;
        Token char_literal133 = null;
        Token string_literal134 = null;
        Token string_literal135 = null;
        Token char_literal136 = null;
        Token char_literal138 = null;
        Token string_literal139 = null;
        Token char_literal141 = null;
        Token char_literal142 = null;
        ParserRuleReturnScope expression132 = null;
        ParserRuleReturnScope expression137 = null;
        ParserRuleReturnScope identifier140 = null;
        ParserRuleReturnScope identifier143 = null;

        CommonTree INTEGER126_tree = null;
        CommonTree STRING127_tree = null;
        CommonTree TRUE128_tree = null;
        CommonTree FALSE129_tree = null;
        CommonTree THIS130_tree = null;
        CommonTree char_literal131_tree = null;
        CommonTree char_literal133_tree = null;
        CommonTree string_literal134_tree = null;
        CommonTree string_literal135_tree = null;
        CommonTree char_literal136_tree = null;
        CommonTree char_literal138_tree = null;
        CommonTree string_literal139_tree = null;
        CommonTree char_literal141_tree = null;
        CommonTree char_literal142_tree = null;
        RewriteRuleTokenStream stream_67 = new RewriteRuleTokenStream(adaptor,
                "token 67");
        RewriteRuleTokenStream stream_59 = new RewriteRuleTokenStream(adaptor,
                "token 59");
        RewriteRuleTokenStream stream_STRING = new RewriteRuleTokenStream(
                adaptor, "token STRING");
        RewriteRuleTokenStream stream_TRUE = new RewriteRuleTokenStream(
                adaptor, "token TRUE");
        RewriteRuleTokenStream stream_FALSE = new RewriteRuleTokenStream(
                adaptor, "token FALSE");
        RewriteRuleTokenStream stream_60 = new RewriteRuleTokenStream(adaptor,
                "token 60");
        RewriteRuleTokenStream stream_52 = new RewriteRuleTokenStream(adaptor,
                "token 52");
        RewriteRuleTokenStream stream_64 = new RewriteRuleTokenStream(adaptor,
                "token 64");
        RewriteRuleTokenStream stream_53 = new RewriteRuleTokenStream(adaptor,
                "token 53");
        RewriteRuleTokenStream stream_INTEGER = new RewriteRuleTokenStream(
                adaptor, "token INTEGER");
        RewriteRuleSubtreeStream stream_identifier = new RewriteRuleSubtreeStream(
                adaptor, "rule identifier");
        RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(
                adaptor, "rule expression");

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:188:2: ( INTEGER ->
            // ^( CONST INTEGER ) | STRING -> ^( CONST STRING ) | TRUE -> ^(
            // CONST TRUE ) | FALSE -> ^( CONST FALSE ) | THIS | '(' !
            // expression ')' !| 'iri' 'numer' '[' expression ']' -> ^(
            // INTARRAY_NEW expression ) | 'iri' identifier '(' ')' -> ^( NEW
            // identifier ) | identifier -> ^( VAR_REF identifier ) )
            int alt24 = 9;
            switch (input.LA(1)) {
            case INTEGER: {
                alt24 = 1;
            }
                break;
            case STRING: {
                alt24 = 2;
            }
                break;
            case TRUE: {
                alt24 = 3;
            }
                break;
            case FALSE: {
                alt24 = 4;
            }
                break;
            case THIS: {
                alt24 = 5;
            }
                break;
            case 52: {
                alt24 = 6;
            }
                break;
            case 64: {
                int LA24_7 = input.LA(2);
                if ((LA24_7 == 67)) {
                    alt24 = 7;
                } else if ((LA24_7 == IDENTIFIER)) {
                    alt24 = 8;
                }

                else {
                    int nvaeMark = input.mark();
                    try {
                        input.consume();
                        NoViableAltException nvae = new NoViableAltException(
                                "", 24, 7, input);
                        throw nvae;
                    } finally {
                        input.rewind(nvaeMark);
                    }
                }

            }
                break;
            case IDENTIFIER: {
                alt24 = 9;
            }
                break;
            default:
                NoViableAltException nvae = new NoViableAltException("", 24, 0,
                        input);
                throw nvae;
            }
            switch (alt24) {
            case 1:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:188:4: INTEGER
            {
                INTEGER126 = (Token) match(input, INTEGER,
                        FOLLOW_INTEGER_in_primaryExpressionPrefix1206);
                stream_INTEGER.add(INTEGER126);

                // AST REWRITE
                // elements: INTEGER
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 188:12: -> ^( CONST INTEGER )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:188:15: ^( CONST INTEGER )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(CONST, "CONST"),
                                root_1);
                        adaptor.addChild(root_1, stream_INTEGER.nextNode());
                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }
                break;
            case 2:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:189:4: STRING
            {
                STRING127 = (Token) match(input, STRING,
                        FOLLOW_STRING_in_primaryExpressionPrefix1219);
                stream_STRING.add(STRING127);

                // AST REWRITE
                // elements: STRING
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 189:11: -> ^( CONST STRING )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:189:14: ^( CONST STRING )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(CONST, "CONST"),
                                root_1);
                        adaptor.addChild(root_1, stream_STRING.nextNode());
                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }
                break;
            case 3:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:190:4: TRUE
            {
                TRUE128 = (Token) match(input, TRUE,
                        FOLLOW_TRUE_in_primaryExpressionPrefix1232);
                stream_TRUE.add(TRUE128);

                // AST REWRITE
                // elements: TRUE
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 190:10: -> ^( CONST TRUE )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:190:13: ^( CONST TRUE )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(CONST, "CONST"),
                                root_1);
                        adaptor.addChild(root_1, stream_TRUE.nextNode());
                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }
                break;
            case 4:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:191:4: FALSE
            {
                FALSE129 = (Token) match(input, FALSE,
                        FOLLOW_FALSE_in_primaryExpressionPrefix1246);
                stream_FALSE.add(FALSE129);

                // AST REWRITE
                // elements: FALSE
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 191:10: -> ^( CONST FALSE )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:191:13: ^( CONST FALSE )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(CONST, "CONST"),
                                root_1);
                        adaptor.addChild(root_1, stream_FALSE.nextNode());
                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }
                break;
            case 5:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:192:4: THIS
            {
                root_0 = (CommonTree) adaptor.nil();

                THIS130 = (Token) match(input, THIS,
                        FOLLOW_THIS_in_primaryExpressionPrefix1259);
                THIS130_tree = (CommonTree) adaptor.create(THIS130);
                adaptor.addChild(root_0, THIS130_tree);

            }
                break;
            case 6:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:193:4: '(' !
            // expression ')' !
            {
                root_0 = (CommonTree) adaptor.nil();

                char_literal131 = (Token) match(input, 52,
                        FOLLOW_52_in_primaryExpressionPrefix1264);
                pushFollow(FOLLOW_expression_in_primaryExpressionPrefix1267);
                expression132 = expression();
                state._fsp--;

                adaptor.addChild(root_0, expression132.getTree());

                char_literal133 = (Token) match(input, 53,
                        FOLLOW_53_in_primaryExpressionPrefix1269);
            }
                break;
            case 7:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:194:4: 'iri' 'numer'
            // '[' expression ']'
            {
                string_literal134 = (Token) match(input, 64,
                        FOLLOW_64_in_primaryExpressionPrefix1275);
                stream_64.add(string_literal134);

                string_literal135 = (Token) match(input, 67,
                        FOLLOW_67_in_primaryExpressionPrefix1277);
                stream_67.add(string_literal135);

                char_literal136 = (Token) match(input, 59,
                        FOLLOW_59_in_primaryExpressionPrefix1279);
                stream_59.add(char_literal136);

                pushFollow(FOLLOW_expression_in_primaryExpressionPrefix1281);
                expression137 = expression();
                state._fsp--;

                stream_expression.add(expression137.getTree());
                char_literal138 = (Token) match(input, 60,
                        FOLLOW_60_in_primaryExpressionPrefix1283);
                stream_60.add(char_literal138);

                // AST REWRITE
                // elements: expression
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 194:37: -> ^( INTARRAY_NEW expression )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:194:40: ^( INTARRAY_NEW
                    // expression )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(INTARRAY_NEW,
                                        "INTARRAY_NEW"), root_1);
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }
                break;
            case 8:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:195:4: 'iri'
            // identifier '(' ')'
            {
                string_literal139 = (Token) match(input, 64,
                        FOLLOW_64_in_primaryExpressionPrefix1296);
                stream_64.add(string_literal139);

                pushFollow(FOLLOW_identifier_in_primaryExpressionPrefix1298);
                identifier140 = identifier();
                state._fsp--;

                stream_identifier.add(identifier140.getTree());
                char_literal141 = (Token) match(input, 52,
                        FOLLOW_52_in_primaryExpressionPrefix1300);
                stream_52.add(char_literal141);

                char_literal142 = (Token) match(input, 53,
                        FOLLOW_53_in_primaryExpressionPrefix1302);
                stream_53.add(char_literal142);

                // AST REWRITE
                // elements: identifier
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 195:29: -> ^( NEW identifier )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:195:32: ^( NEW identifier
                    // )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(NEW, "NEW"), root_1);
                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }
                break;
            case 9:
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:196:4: identifier
            {
                pushFollow(FOLLOW_identifier_in_primaryExpressionPrefix1315);
                identifier143 = identifier();
                state._fsp--;

                stream_identifier.add(identifier143.getTree());
                // AST REWRITE
                // elements: identifier
                // token labels:
                // rule labels: retval
                // token list labels:
                // rule list labels:
                // wildcard labels:
                retval.tree = root_0;
                RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(
                        adaptor, "rule retval",
                        retval != null ? retval.getTree() : null);

                root_0 = (CommonTree) adaptor.nil();
                // 196:15: -> ^( VAR_REF identifier )
                {
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:196:18: ^( VAR_REF
                    // identifier )
                    {
                        CommonTree root_1 = (CommonTree) adaptor.nil();
                        root_1 = (CommonTree) adaptor.becomeRoot(
                                (CommonTree) adaptor.create(VAR_REF, "VAR_REF"),
                                root_1);
                        adaptor.addChild(root_1, stream_identifier.nextTree());
                        adaptor.addChild(root_0, root_1);
                    }

                }

                retval.tree = root_0;

            }
                break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "primaryExpressionPrefix"

    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;

        @Override
        public CommonTree getTree() {
            return tree;
        }
    };

    // $ANTLR start "identifier"
    // C:\\Users\\user\\Desktop\\COMPILER CONSTRUCTION
    // 1\\PA1\\ANTLRStarterKit\\ABC.g:201:1: identifier : IDENTIFIER ;
    public final ABCParser.identifier_return identifier()
            throws RecognitionException {
        ABCParser.identifier_return retval = new ABCParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENTIFIER144 = null;

        CommonTree IDENTIFIER144_tree = null;

        try {
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:202:2: ( IDENTIFIER )
            // C:\\Users\\user\\Desktop\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:202:4: IDENTIFIER
            {
                root_0 = (CommonTree) adaptor.nil();

                IDENTIFIER144 = (Token) match(input, IDENTIFIER,
                        FOLLOW_IDENTIFIER_in_identifier1339);
                IDENTIFIER144_tree = (CommonTree) adaptor.create(IDENTIFIER144);
                adaptor.addChild(root_0, IDENTIFIER144_tree);

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
            retval.tree = (CommonTree) adaptor.errorNode(input, retval.start,
                    input.LT(-1), re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }

    // $ANTLR end "identifier"

    // Delegated rules

    public static final BitSet FOLLOW_mainClass_in_goal330 = new BitSet(
            new long[] { 0x0000000000000402L });

    public static final BitSet FOLLOW_classDeclaration_in_goal333 = new BitSet(
            new long[] { 0x0000000000000402L });

    public static final BitSet FOLLOW_CLASS_in_mainClass356 = new BitSet(
            new long[] { 0x0000000000020000L });

    public static final BitSet FOLLOW_identifier_in_mainClass358 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000040L });

    public static final BitSet FOLLOW_70_in_mainClass360 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000010L });

    public static final BitSet FOLLOW_68_in_mainClass362 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000020L });

    public static final BitSet FOLLOW_69_in_mainClass364 = new BitSet(
            new long[] { 0x2000000000000000L });

    public static final BitSet FOLLOW_61_in_mainClass366 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000002L });

    public static final BitSet FOLLOW_65_in_mainClass368 = new BitSet(
            new long[] { 0x0010000000000000L });

    public static final BitSet FOLLOW_52_in_mainClass370 = new BitSet(
            new long[] { 0x0400000000000000L });

    public static final BitSet FOLLOW_58_in_mainClass372 = new BitSet(
            new long[] { 0x0800000000000000L });

    public static final BitSet FOLLOW_59_in_mainClass376 = new BitSet(
            new long[] { 0x1000000000000000L });

    public static final BitSet FOLLOW_60_in_mainClass378 = new BitSet(
            new long[] { 0x0000000000020000L });

    public static final BitSet FOLLOW_identifier_in_mainClass380 = new BitSet(
            new long[] { 0x0020000000000000L });

    public static final BitSet FOLLOW_53_in_mainClass382 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000040L });

    public static final BitSet FOLLOW_70_in_mainClass384 = new BitSet(
            new long[] { 0x00040C0000060000L, 0x0000000000000040L });

    public static final BitSet FOLLOW_statement_in_mainClass386 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000080L });

    public static final BitSet FOLLOW_71_in_mainClass388 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000080L });

    public static final BitSet FOLLOW_71_in_mainClass390 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_CLASS_in_classDeclaration424 = new BitSet(
            new long[] { 0x0000000000020000L });

    public static final BitSet FOLLOW_identifier_in_classDeclaration426 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000040L });

    public static final BitSet FOLLOW_70_in_classDeclaration428 = new BitSet(
            new long[] { 0x6400000000020000L, 0x0000000000000098L });

    public static final BitSet FOLLOW_varDeclarationList_in_classDeclaration432 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000090L });

    public static final BitSet FOLLOW_methodDeclarationList_in_classDeclaration434 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000080L });

    public static final BitSet FOLLOW_71_in_classDeclaration436 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_varDeclaration_in_varDeclarationList464 = new BitSet(
            new long[] { 0x6400000000020002L, 0x0000000000000008L });

    public static final BitSet FOLLOW_type_in_varDeclaration485 = new BitSet(
            new long[] { 0x0000000000020000L });

    public static final BitSet FOLLOW_identifier_in_varDeclaration487 = new BitSet(
            new long[] { 0x0100000000000000L });

    public static final BitSet FOLLOW_56_in_varDeclaration489 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_methodDeclaration_in_methodDeclarationList515 = new BitSet(
            new long[] { 0x0000000000000002L, 0x0000000000000010L });

    public static final BitSet FOLLOW_68_in_methodDeclaration536 = new BitSet(
            new long[] { 0x6400000000020000L, 0x0000000000000008L });

    public static final BitSet FOLLOW_type_in_methodDeclaration538 = new BitSet(
            new long[] { 0x0000000000020000L });

    public static final BitSet FOLLOW_identifier_in_methodDeclaration540 = new BitSet(
            new long[] { 0x0010000000000000L });

    public static final BitSet FOLLOW_52_in_methodDeclaration542 = new BitSet(
            new long[] { 0x6420000000020000L, 0x0000000000000008L });

    public static final BitSet FOLLOW_param_in_methodDeclaration545 = new BitSet(
            new long[] { 0x0060000000000000L });

    public static final BitSet FOLLOW_54_in_methodDeclaration548 = new BitSet(
            new long[] { 0x6400000000020000L, 0x0000000000000008L });

    public static final BitSet FOLLOW_param_in_methodDeclaration550 = new BitSet(
            new long[] { 0x0060000000000000L });

    public static final BitSet FOLLOW_53_in_methodDeclaration557 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000040L });

    public static final BitSet FOLLOW_70_in_methodDeclaration561 = new BitSet(
            new long[] { 0x64040C0000060000L, 0x00000000000000CCL });

    public static final BitSet FOLLOW_varDeclarationList_in_methodDeclaration563 = new BitSet(
            new long[] { 0x00040C0000060000L, 0x00000000000000C4L });

    public static final BitSet FOLLOW_statement_in_methodDeclaration566 = new BitSet(
            new long[] { 0x00040C0000060000L, 0x00000000000000C4L });

    public static final BitSet FOLLOW_66_in_methodDeclaration571 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_expression_in_methodDeclaration573 = new BitSet(
            new long[] { 0x0100000000000000L });

    public static final BitSet FOLLOW_56_in_methodDeclaration575 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000080L });

    public static final BitSet FOLLOW_71_in_methodDeclaration579 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_type_in_param633 = new BitSet(
            new long[] { 0x0000000000020000L });

    public static final BitSet FOLLOW_identifier_in_param635 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_identifier_in_type661 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_67_in_type666 = new BitSet(
            new long[] { 0x0800000000000000L });

    public static final BitSet FOLLOW_59_in_type668 = new BitSet(
            new long[] { 0x1000000000000000L });

    public static final BitSet FOLLOW_60_in_type670 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_67_in_type683 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_62_in_type688 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_58_in_type693 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_61_in_type698 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_orExpr_in_expression709 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_55_in_arrayLengthReference724 = new BitSet(
            new long[] { 0x8000000000000000L });

    public static final BitSet FOLLOW_63_in_arrayLengthReference726 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_expression_in_expressionList739 = new BitSet(
            new long[] { 0x0040000000000002L });

    public static final BitSet FOLLOW_54_in_expressionList742 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_expression_in_expressionList744 = new BitSet(
            new long[] { 0x0040000000000002L });

    public static final BitSet FOLLOW_70_in_statement769 = new BitSet(
            new long[] { 0x00040C0000060000L, 0x00000000000000C0L });

    public static final BitSet FOLLOW_statement_in_statement771 = new BitSet(
            new long[] { 0x00040C0000060000L, 0x00000000000000C0L });

    public static final BitSet FOLLOW_71_in_statement774 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_IF_in_statement788 = new BitSet(
            new long[] { 0x0010000000000000L });

    public static final BitSet FOLLOW_52_in_statement791 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_expression_in_statement794 = new BitSet(
            new long[] { 0x0020000000000000L });

    public static final BitSet FOLLOW_53_in_statement796 = new BitSet(
            new long[] { 0x00040C0000060000L, 0x0000000000000040L });

    public static final BitSet FOLLOW_statement_in_statement799 = new BitSet(
            new long[] { 0x0000000000002000L });

    public static final BitSet FOLLOW_ELSE_in_statement801 = new BitSet(
            new long[] { 0x00040C0000060000L, 0x0000000000000040L });

    public static final BitSet FOLLOW_statement_in_statement804 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_WHILE_in_statement809 = new BitSet(
            new long[] { 0x0010000000000000L });

    public static final BitSet FOLLOW_52_in_statement812 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_expression_in_statement815 = new BitSet(
            new long[] { 0x0020000000000000L });

    public static final BitSet FOLLOW_53_in_statement817 = new BitSet(
            new long[] { 0x00040C0000060000L, 0x0000000000000040L });

    public static final BitSet FOLLOW_statement_in_statement820 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_SYSOUT_in_statement825 = new BitSet(
            new long[] { 0x0010000000000000L });

    public static final BitSet FOLLOW_52_in_statement828 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_expression_in_statement831 = new BitSet(
            new long[] { 0x0020000000000000L });

    public static final BitSet FOLLOW_53_in_statement833 = new BitSet(
            new long[] { 0x0100000000000000L });

    public static final BitSet FOLLOW_56_in_statement836 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_THIS_in_statement843 = new BitSet(
            new long[] { 0x0080000000000000L });

    public static final BitSet FOLLOW_identifier_in_statement845 = new BitSet(
            new long[] { 0x0080000000000000L });

    public static final BitSet FOLLOW_methodInvocation_in_statement848 = new BitSet(
            new long[] { 0x0100000000000000L });

    public static final BitSet FOLLOW_56_in_statement849 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_identifier_in_statement877 = new BitSet(
            new long[] { 0x0200000000000000L });

    public static final BitSet FOLLOW_57_in_statement879 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_expression_in_statement881 = new BitSet(
            new long[] { 0x0100000000000000L });

    public static final BitSet FOLLOW_56_in_statement883 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_identifier_in_statement902 = new BitSet(
            new long[] { 0x0800000000000000L });

    public static final BitSet FOLLOW_59_in_statement904 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_expression_in_statement906 = new BitSet(
            new long[] { 0x1000000000000000L });

    public static final BitSet FOLLOW_60_in_statement908 = new BitSet(
            new long[] { 0x0200000000000000L });

    public static final BitSet FOLLOW_57_in_statement910 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_expression_in_statement912 = new BitSet(
            new long[] { 0x0100000000000000L });

    public static final BitSet FOLLOW_56_in_statement914 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_andExpr_in_orExpr943 = new BitSet(
            new long[] { 0x0000000000800002L });

    public static final BitSet FOLLOW_LOGIC_OR_in_orExpr947 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_andExpr_in_orExpr950 = new BitSet(
            new long[] { 0x0000000000800002L });

    public static final BitSet FOLLOW_compareExpr_in_andExpr963 = new BitSet(
            new long[] { 0x0000000000400002L });

    public static final BitSet FOLLOW_LOGIC_AND_in_andExpr967 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_compareExpr_in_andExpr970 = new BitSet(
            new long[] { 0x0000000000400002L });

    public static final BitSet FOLLOW_additiveExpr_in_compareExpr986 = new BitSet(
            new long[] { 0x0000000001000202L });

    public static final BitSet FOLLOW_BT_in_compareExpr991 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_LT_in_compareExpr994 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_additiveExpr_in_compareExpr998 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_multExpr_in_additiveExpr1015 = new BitSet(
            new long[] { 0x0000002100000002L });

    public static final BitSet FOLLOW_PLUS_in_additiveExpr1020 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_MINUS_in_additiveExpr1023 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_multExpr_in_additiveExpr1027 = new BitSet(
            new long[] { 0x0000002100000002L });

    public static final BitSet FOLLOW_unaryExpr_in_multExpr1039 = new BitSet(
            new long[] { 0x0000000200000002L });

    public static final BitSet FOLLOW_MULT_in_multExpr1043 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_unaryExpr_in_multExpr1046 = new BitSet(
            new long[] { 0x0000000200000002L });

    public static final BitSet FOLLOW_UNARY_NOT_in_unaryExpr1062 = new BitSet(
            new long[] { 0x0010190000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_primaryExpression_in_unaryExpr1067 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_primaryExpressionPrefix_in_primaryExpression1079 = new BitSet(
            new long[] { 0x0880000000000002L });

    public static final BitSet FOLLOW_59_in_primaryExpression1093 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_expression_in_primaryExpression1097 = new BitSet(
            new long[] { 0x1000000000000000L });

    public static final BitSet FOLLOW_60_in_primaryExpression1099 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_arrayLengthReference_in_primaryExpression1120 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_methodInvocation_in_primaryExpression1137 = new BitSet(
            new long[] { 0x0080000000000002L });

    public static final BitSet FOLLOW_55_in_methodInvocation1181 = new BitSet(
            new long[] { 0x0000000000020000L });

    public static final BitSet FOLLOW_identifier_in_methodInvocation1184 = new BitSet(
            new long[] { 0x0010000000000000L });

    public static final BitSet FOLLOW_52_in_methodInvocation1186 = new BitSet(
            new long[] { 0x0030590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_expressionList_in_methodInvocation1189 = new BitSet(
            new long[] { 0x0020000000000000L });

    public static final BitSet FOLLOW_53_in_methodInvocation1191 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_INTEGER_in_primaryExpressionPrefix1206 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_STRING_in_primaryExpressionPrefix1219 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_TRUE_in_primaryExpressionPrefix1232 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_FALSE_in_primaryExpressionPrefix1246 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_THIS_in_primaryExpressionPrefix1259 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_52_in_primaryExpressionPrefix1264 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_expression_in_primaryExpressionPrefix1267 = new BitSet(
            new long[] { 0x0020000000000000L });

    public static final BitSet FOLLOW_53_in_primaryExpressionPrefix1269 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_64_in_primaryExpressionPrefix1275 = new BitSet(
            new long[] { 0x0000000000000000L, 0x0000000000000008L });

    public static final BitSet FOLLOW_67_in_primaryExpressionPrefix1277 = new BitSet(
            new long[] { 0x0800000000000000L });

    public static final BitSet FOLLOW_59_in_primaryExpressionPrefix1279 = new BitSet(
            new long[] { 0x0010590000128000L, 0x0000000000000001L });

    public static final BitSet FOLLOW_expression_in_primaryExpressionPrefix1281 = new BitSet(
            new long[] { 0x1000000000000000L });

    public static final BitSet FOLLOW_60_in_primaryExpressionPrefix1283 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_64_in_primaryExpressionPrefix1296 = new BitSet(
            new long[] { 0x0000000000020000L });

    public static final BitSet FOLLOW_identifier_in_primaryExpressionPrefix1298 = new BitSet(
            new long[] { 0x0010000000000000L });

    public static final BitSet FOLLOW_52_in_primaryExpressionPrefix1300 = new BitSet(
            new long[] { 0x0020000000000000L });

    public static final BitSet FOLLOW_53_in_primaryExpressionPrefix1302 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_identifier_in_primaryExpressionPrefix1315 = new BitSet(
            new long[] { 0x0000000000000002L });

    public static final BitSet FOLLOW_IDENTIFIER_in_identifier1339 = new BitSet(
            new long[] { 0x0000000000000002L });
}

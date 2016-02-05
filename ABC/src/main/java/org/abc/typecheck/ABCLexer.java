// $ANTLR 3.5.1 C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g 2015-09-28 22:35:14
package org.abc.typecheck;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

@SuppressWarnings("all")
public class ABCLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ABCLexer() {
    }

    public ABCLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }

    public ABCLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);
    }

    @Override
    public String getGrammarFileName() {
        return "C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g";
    }

    // $ANTLR start "BT"
    public final void mBT() throws RecognitionException {
        try {
            int _type = BT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:2:4: ( '>' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:2:6: '>'
            {
                match('>');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "BT"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:3:7: ( 'klasa' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:3:9: 'klasa'
            {
                match("klasa");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "CLASS"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:4:6: ( 'tjeter' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:4:8: 'tjeter'
            {
                match("tjeter");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "ELSE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:5:7: ( 'fals' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:5:9: 'fals'
            {
                match("fals");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "FALSE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:6:4: ( 'nese' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:6:6: 'nese'
            {
                match("nese");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "IF"

    // $ANTLR start "LOGIC_AND"
    public final void mLOGIC_AND() throws RecognitionException {
        try {
            int _type = LOGIC_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:7:11: ( '&&' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:7:13: '&&'
            {
                match("&&");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "LOGIC_AND"

    // $ANTLR start "LOGIC_OR"
    public final void mLOGIC_OR() throws RecognitionException {
        try {
            int _type = LOGIC_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:8:10: ( '||' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:8:12: '||'
            {
                match("||");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "LOGIC_OR"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:9:4: ( '<' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:9:6: '<'
            {
                match('<');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "LT"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:10:7: ( '-' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:10:9: '-'
            {
                match('-');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "MINUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:11:6: ( '*' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:11:8: '*'
            {
                match('*');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "MULT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:12:6: ( '+' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:12:8: '+'
            {
                match('+');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "PLUS"

    // $ANTLR start "SYSOUT"
    public final void mSYSOUT() throws RecognitionException {
        try {
            int _type = SYSOUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:13:8: (
            // 'Sistem.printo' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:13:10:
            // 'Sistem.printo'
            {
                match("Sistem.printo");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "SYSOUT"

    // $ANTLR start "THIS"
    public final void mTHIS() throws RecognitionException {
        try {
            int _type = THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:14:6: ( 'ky' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:14:8: 'ky'
            {
                match("ky");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "THIS"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:15:6: ( 'vertete' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:15:8: 'vertete'
            {
                match("vertete");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "TRUE"

    // $ANTLR start "UNARY_NOT"
    public final void mUNARY_NOT() throws RecognitionException {
        try {
            int _type = UNARY_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:16:11: ( '!' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:16:13: '!'
            {
                match('!');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "UNARY_NOT"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:17:7: ( 'ndersa' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:17:9: 'ndersa'
            {
                match("ndersa");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "WHILE"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:18:7: ( '(' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:18:9: '('
            {
                match('(');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:19:7: ( ')' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:19:9: ')'
            {
                match(')');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:20:7: ( ',' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:20:9: ','
            {
                match(',');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:21:7: ( '.' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:21:9: '.'
            {
                match('.');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:22:7: ( ';' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:22:9: ';'
            {
                match(';');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:23:7: ( '=' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:23:9: '='
            {
                match('=');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:24:7: ( 'Tekst' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:24:9: 'Tekst'
            {
                match("Tekst");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:25:7: ( '[' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:25:9: '['
            {
                match('[');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:26:7: ( ']' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:26:9: ']'
            {
                match(']');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:27:7: ( 'asgje' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:27:9: 'asgje'
            {
                match("asgje");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:28:7: ( 'bul' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:28:9: 'bul'
            {
                match("bul");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:29:7: ( 'gjatesi' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:29:9: 'gjatesi'
            {
                match("gjatesi");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:30:7: ( 'iri' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:30:9: 'iri'
            {
                match("iri");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:31:7: ( 'kryesore' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:31:9: 'kryesore'
            {
                match("kryesore");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:32:7: ( 'kthe' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:32:9: 'kthe'
            {
                match("kthe");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:33:7: ( 'numer' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:33:9: 'numer'
            {
                match("numer");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:34:7: ( 'publike' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:34:9: 'publike'
            {
                match("publike");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:35:7: ( 'statike' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:35:9: 'statike'
            {
                match("statike");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:36:7: ( '{' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:36:9: '{'
            {
                match('{');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:37:7: ( '}' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:37:9: '}'
            {
                match('}');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "T__71"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:207:9: ( '0' | '1' ..
            // '9' ( '0' .. '9' )* )
            int alt2 = 2;
            int LA2_0 = input.LA(1);
            if ((LA2_0 == '0')) {
                alt2 = 1;
            } else if (((LA2_0 >= '1' && LA2_0 <= '9'))) {
                alt2 = 2;
            }

            else {
                NoViableAltException nvae = new NoViableAltException("", 2, 0,
                        input);
                throw nvae;
            }

            switch (alt2) {
            case 1:
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:207:11: '0'
            {
                match('0');
            }
                break;
            case 2:
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:208:4: '1' .. '9' (
            // '0' .. '9' )*
            {
                matchRange('1', '9');
                // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:208:13: ( '0' ..
                // '9' )*
                loop1: while (true) {
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);
                    if (((LA1_0 >= '0' && LA1_0 <= '9'))) {
                        alt1 = 1;
                    }

                    switch (alt1) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:
                    {
                        if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                            input.consume();
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(
                                    null, input);
                            recover(mse);
                            throw mse;
                        }
                    }
                        break;

                    default:
                        break loop1;
                    }
                }

            }
                break;

            }
            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "INTEGER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:211:10: ( '\"' (
            // IDENTIFIER )* '\"' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:211:12: '\"' (
            // IDENTIFIER )* '\"'
            {
                match('\"');
                // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:211:15: (
                // IDENTIFIER )*
                loop3: while (true) {
                    int alt3 = 2;
                    int LA3_0 = input.LA(1);
                    if (((LA3_0 >= 'A' && LA3_0 <= 'Z') || (LA3_0 >= 'a' && LA3_0 <= 'z'))) {
                        alt3 = 1;
                    }

                    switch (alt3) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:211:15: IDENTIFIER
                    {
                        mIDENTIFIER();

                    }
                        break;

                    default:
                        break loop3;
                    }
                }

                match('\"');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "STRING"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:215:2: ( Letter (
            // Letter | DigitUS )* )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:215:4: Letter (
            // Letter | DigitUS )*
            {
                mLetter();

                // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:215:11: ( Letter
                // | DigitUS )*
                loop4: while (true) {
                    int alt4 = 2;
                    int LA4_0 = input.LA(1);
                    if (((LA4_0 >= '0' && LA4_0 <= '9')
                            || (LA4_0 >= 'A' && LA4_0 <= 'Z') || LA4_0 == '_' || (LA4_0 >= 'a' && LA4_0 <= 'z'))) {
                        alt4 = 1;
                    }

                    switch (alt4) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:
                    {
                        if ((input.LA(1) >= '0' && input.LA(1) <= '9')
                                || (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
                                || input.LA(1) == '_'
                                || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                            input.consume();
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(
                                    null, input);
                            recover(mse);
                            throw mse;
                        }
                    }
                        break;

                    default:
                        break loop4;
                    }
                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:220:8: ( 'a' .. 'z' |
            // 'A' .. 'Z' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:
            {
                if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
                        || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "Letter"

    // $ANTLR start "DigitUS"
    public final void mDigitUS() throws RecognitionException {
        try {
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:227:2: ( '0' .. '9' |
            // '_' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:
            {
                if ((input.LA(1) >= '0' && input.LA(1) <= '9')
                        || input.LA(1) == '_') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "DigitUS"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:231:5: ( ( ' ' |
            // '\\r' | '\\t' | '\ ' | '\\n' ) )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:231:8: ( ' ' | '\\r'
            // | '\\t' | '\ ' | '\\n' )
            {
                if ((input.LA(1) >= '\t' && input.LA(1) <= '\n')
                        || (input.LA(1) >= '\f' && input.LA(1) <= '\r')
                        || input.LA(1) == ' ') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(
                            null, input);
                    recover(mse);
                    throw mse;
                }
                _channel = HIDDEN;
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "WS"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:236:5: ( '//' (~ (
            // '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
            // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:236:7: '//' (~ (
            // '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
                match("//");

                // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:236:12: (~ (
                // '\\n' | '\\r' ) )*
                loop5: while (true) {
                    int alt5 = 2;
                    int LA5_0 = input.LA(1);
                    if (((LA5_0 >= '\u0000' && LA5_0 <= '\t')
                            || (LA5_0 >= '\u000B' && LA5_0 <= '\f') || (LA5_0 >= '\u000E' && LA5_0 <= '\uFFFF'))) {
                        alt5 = 1;
                    }

                    switch (alt5) {
                    case 1:
                    // C:\\Users\\user\\Desktop\\MSC SOFTWARE
                    // Technology\\COMPILER CONSTRUCTION
                    // 1\\PA1\\ANTLRStarterKit\\ABC.g:
                    {
                        if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t')
                                || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f')
                                || (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF')) {
                            input.consume();
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(
                                    null, input);
                            recover(mse);
                            throw mse;
                        }
                    }
                        break;

                    default:
                        break loop5;
                    }
                }

                // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:236:26: ( '\\r'
                // )?
                int alt6 = 2;
                int LA6_0 = input.LA(1);
                if ((LA6_0 == '\r')) {
                    alt6 = 1;
                }
                switch (alt6) {
                case 1:
                // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
                // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:236:26: '\\r'
                {
                    match('\r');
                }
                    break;

                }

                match('\n');
                _channel = HIDDEN;
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }

    // $ANTLR end "LINE_COMMENT"

    @Override
    public void mTokens() throws RecognitionException {
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:8: ( BT | CLASS | ELSE
        // | FALSE | IF | LOGIC_AND | LOGIC_OR | LT | MINUS | MULT | PLUS |
        // SYSOUT | THIS | TRUE | UNARY_NOT | WHILE | T__52 | T__53 | T__54 |
        // T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63
        // | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 |
        // INTEGER | STRING | IDENTIFIER | WS | LINE_COMMENT )
        int alt7 = 41;
        alt7 = dfa7.predict(input);
        switch (alt7) {
        case 1:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:10: BT
        {
            mBT();

        }
            break;
        case 2:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:13: CLASS
        {
            mCLASS();

        }
            break;
        case 3:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:19: ELSE
        {
            mELSE();

        }
            break;
        case 4:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:24: FALSE
        {
            mFALSE();

        }
            break;
        case 5:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:30: IF
        {
            mIF();

        }
            break;
        case 6:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:33: LOGIC_AND
        {
            mLOGIC_AND();

        }
            break;
        case 7:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:43: LOGIC_OR
        {
            mLOGIC_OR();

        }
            break;
        case 8:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:52: LT
        {
            mLT();

        }
            break;
        case 9:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:55: MINUS
        {
            mMINUS();

        }
            break;
        case 10:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:61: MULT
        {
            mMULT();

        }
            break;
        case 11:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:66: PLUS
        {
            mPLUS();

        }
            break;
        case 12:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:71: SYSOUT
        {
            mSYSOUT();

        }
            break;
        case 13:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:78: THIS
        {
            mTHIS();

        }
            break;
        case 14:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:83: TRUE
        {
            mTRUE();

        }
            break;
        case 15:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:88: UNARY_NOT
        {
            mUNARY_NOT();

        }
            break;
        case 16:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:98: WHILE
        {
            mWHILE();

        }
            break;
        case 17:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:104: T__52
        {
            mT__52();

        }
            break;
        case 18:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:110: T__53
        {
            mT__53();

        }
            break;
        case 19:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:116: T__54
        {
            mT__54();

        }
            break;
        case 20:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:122: T__55
        {
            mT__55();

        }
            break;
        case 21:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:128: T__56
        {
            mT__56();

        }
            break;
        case 22:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:134: T__57
        {
            mT__57();

        }
            break;
        case 23:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:140: T__58
        {
            mT__58();

        }
            break;
        case 24:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:146: T__59
        {
            mT__59();

        }
            break;
        case 25:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:152: T__60
        {
            mT__60();

        }
            break;
        case 26:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:158: T__61
        {
            mT__61();

        }
            break;
        case 27:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:164: T__62
        {
            mT__62();

        }
            break;
        case 28:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:170: T__63
        {
            mT__63();

        }
            break;
        case 29:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:176: T__64
        {
            mT__64();

        }
            break;
        case 30:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:182: T__65
        {
            mT__65();

        }
            break;
        case 31:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:188: T__66
        {
            mT__66();

        }
            break;
        case 32:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:194: T__67
        {
            mT__67();

        }
            break;
        case 33:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:200: T__68
        {
            mT__68();

        }
            break;
        case 34:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:206: T__69
        {
            mT__69();

        }
            break;
        case 35:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:212: T__70
        {
            mT__70();

        }
            break;
        case 36:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:218: T__71
        {
            mT__71();

        }
            break;
        case 37:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:224: INTEGER
        {
            mINTEGER();

        }
            break;
        case 38:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:232: STRING
        {
            mSTRING();

        }
            break;
        case 39:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:239: IDENTIFIER
        {
            mIDENTIFIER();

        }
            break;
        case 40:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:250: WS
        {
            mWS();

        }
            break;
        case 41:
        // C:\\Users\\user\\Desktop\\MSC SOFTWARE Technology\\COMPILER
        // CONSTRUCTION 1\\PA1\\ANTLRStarterKit\\ABC.g:1:253: LINE_COMMENT
        {
            mLINE_COMMENT();

        }
            break;

        }
    }

    protected DFA7 dfa7 = new DFA7(this);

    static final String DFA7_eotS = "\2\uffff\4\42\6\uffff\2\42\7\uffff\1\42\2\uffff\6\42\7\uffff\1\42\1\70"
            + "\21\42\1\uffff\13\42\1\125\1\42\1\127\4\42\1\134\1\42\1\136\1\137\6\42"
            + "\1\uffff\1\42\1\uffff\2\42\1\151\1\42\1\uffff\1\42\2\uffff\1\42\1\155"
            + "\2\42\1\160\1\161\3\42\1\uffff\1\42\1\166\1\167\1\uffff\2\42\2\uffff\4"
            + "\42\3\uffff\1\176\1\177\1\u0080\1\u0081\1\u0082\5\uffff";

    static final String DFA7_eofS = "\u0083\uffff";

    static final String DFA7_minS = "\1\11\1\uffff\1\154\1\152\1\141\1\144\6\uffff\1\151\1\145\7\uffff\1\145"
            + "\2\uffff\1\163\1\165\1\152\1\162\1\165\1\164\7\uffff\1\141\1\60\1\171"
            + "\1\150\1\145\1\154\1\163\1\145\1\155\1\163\1\162\1\153\1\147\1\154\1\141"
            + "\1\151\1\142\1\141\1\163\1\uffff\2\145\1\164\1\163\1\145\1\162\1\145\2"
            + "\164\1\163\1\152\1\60\1\164\1\60\1\154\1\164\1\141\1\163\1\60\1\145\2"
            + "\60\1\163\1\162\2\145\1\164\1\145\1\uffff\1\145\1\uffff\2\151\1\60\1\157"
            + "\1\uffff\1\162\2\uffff\1\141\1\60\1\155\1\164\2\60\1\163\2\153\1\uffff"
            + "\1\162\2\60\1\uffff\1\56\1\145\2\uffff\1\151\3\145\3\uffff\5\60\5\uffff";

    static final String DFA7_maxS = "\1\175\1\uffff\1\171\1\152\1\141\1\165\6\uffff\1\151\1\145\7\uffff\1\145"
            + "\2\uffff\1\163\1\165\1\152\1\162\1\165\1\164\7\uffff\1\141\1\172\1\171"
            + "\1\150\1\145\1\154\1\163\1\145\1\155\1\163\1\162\1\153\1\147\1\154\1\141"
            + "\1\151\1\142\1\141\1\163\1\uffff\2\145\1\164\1\163\1\145\1\162\1\145\2"
            + "\164\1\163\1\152\1\172\1\164\1\172\1\154\1\164\1\141\1\163\1\172\1\145"
            + "\2\172\1\163\1\162\2\145\1\164\1\145\1\uffff\1\145\1\uffff\2\151\1\172"
            + "\1\157\1\uffff\1\162\2\uffff\1\141\1\172\1\155\1\164\2\172\1\163\2\153"
            + "\1\uffff\1\162\2\172\1\uffff\1\56\1\145\2\uffff\1\151\3\145\3\uffff\5"
            + "\172\5\uffff";

    static final String DFA7_acceptS = "\1\uffff\1\1\4\uffff\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff\1\17\1\21\1\22"
            + "\1\23\1\24\1\25\1\26\1\uffff\1\30\1\31\6\uffff\1\43\1\44\1\45\1\46\1\47"
            + "\1\50\1\51\23\uffff\1\15\34\uffff\1\33\1\uffff\1\35\4\uffff\1\37\1\uffff"
            + "\1\4\1\5\11\uffff\1\2\3\uffff\1\40\2\uffff\1\27\1\32\4\uffff\1\3\1\20"
            + "\1\14\5\uffff\1\16\1\34\1\41\1\42\1\36";

    static final String DFA7_specialS = "\u0083\uffff}>";

    static final String[] DFA7_transitionS = {
            "\2\43\1\uffff\2\43\22\uffff\1\43\1\16\1\41\3\uffff\1\6\1\uffff\1\17\1"
                    + "\20\1\12\1\13\1\21\1\11\1\22\1\44\12\40\1\uffff\1\23\1\10\1\24\1\1\2"
                    + "\uffff\22\42\1\14\1\25\6\42\1\26\1\uffff\1\27\3\uffff\1\30\1\31\3\42"
                    + "\1\4\1\32\1\42\1\33\1\42\1\2\2\42\1\5\1\42\1\34\2\42\1\35\1\3\1\42\1"
                    + "\15\4\42\1\36\1\7\1\37", "",
            "\1\45\5\uffff\1\47\1\uffff\1\50\4\uffff\1\46", "\1\51", "\1\52",
            "\1\54\1\53\17\uffff\1\55", "", "", "", "", "", "", "\1\56",
            "\1\57", "", "", "", "", "", "", "", "\1\60", "", "", "\1\61",
            "\1\62", "\1\63", "\1\64", "\1\65", "\1\66", "", "", "", "", "",
            "", "", "\1\67", "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\71", "\1\72", "\1\73", "\1\74", "\1\75", "\1\76", "\1\77",
            "\1\100", "\1\101", "\1\102", "\1\103", "\1\104", "\1\105",
            "\1\106", "\1\107", "\1\110", "\1\111", "", "\1\112", "\1\113",
            "\1\114", "\1\115", "\1\116", "\1\117", "\1\120", "\1\121",
            "\1\122", "\1\123", "\1\124",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42", "\1\126",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42", "\1\130",
            "\1\131", "\1\132", "\1\133",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42", "\1\135",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42", "\1\140",
            "\1\141", "\1\142", "\1\143", "\1\144", "\1\145", "", "\1\146", "",
            "\1\147", "\1\150",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42", "\1\152", "",
            "\1\153", "", "", "\1\154",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42", "\1\156",
            "\1\157", "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42", "\1\162",
            "\1\163", "\1\164", "", "\1\165",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42", "", "\1\170",
            "\1\171", "", "", "\1\172", "\1\173", "\1\174", "\1\175", "", "",
            "", "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42", "", "", "", "",
            "" };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);

    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);

    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);

    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);

    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);

    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);

    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    protected class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }

        @Override
        public String getDescription() {
            return "1:1: Tokens : ( BT | CLASS | ELSE | FALSE | IF | LOGIC_AND | LOGIC_OR | LT | MINUS | MULT | PLUS | SYSOUT | THIS | TRUE | UNARY_NOT | WHILE | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | INTEGER | STRING | IDENTIFIER | WS | LINE_COMMENT );";
        }
    }

}

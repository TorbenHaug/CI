// $ANTLR 3.4 C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g 2014-11-13 08:23:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class miniPLexer extends Lexer {
    public static final int EOF=-1;
    public static final int BEGINSYMBOL=4;
    public static final int BOOLEANCONST=5;
    public static final int CMDENDSYMBOL=6;
    public static final int COMMENT=7;
    public static final int CONSTANTSYMBOL=8;
    public static final int DECLARATION=9;
    public static final int DIGIT=10;
    public static final int DOSYMBOL=11;
    public static final int ELSESYMBOL=12;
    public static final int ENDSYMBOL=13;
    public static final int FISYMBOL=14;
    public static final int ID=15;
    public static final int IFSYMBOL=16;
    public static final int INTEGERCONST=17;
    public static final int KLAMMERAUFSYMBOL=18;
    public static final int KLAMMERZUSYMBOL=19;
    public static final int LISTCUTSYMBOL=20;
    public static final int MALGETEILTSYMBOL=21;
    public static final int ODSYMBOL=22;
    public static final int PLUSMINUSSYMBOL=23;
    public static final int PRINTLNSYMBOL=24;
    public static final int PROGRAMMCODE=25;
    public static final int PROGRAMSYMBOL=26;
    public static final int READSYMBOL=27;
    public static final int REALCONST=28;
    public static final int REALCUTSYMBOL=29;
    public static final int START=30;
    public static final int STRINGCONST=31;
    public static final int THENSYMBOL=32;
    public static final int UNSIGNEDINTEGERCONST=33;
    public static final int VERGLEICHSSYMBOL=34;
    public static final int WHILESYMBOL=35;
    public static final int WS=36;
    public static final int ZUWEISUNGSSYMBOL=37;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public miniPLexer() {} 
    public miniPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public miniPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g"; }

    // $ANTLR start "PROGRAMSYMBOL"
    public final void mPROGRAMSYMBOL() throws RecognitionException {
        try {
            int _type = PROGRAMSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:53:16: ( 'program' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:53:18: 'program'
            {
            match("program"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PROGRAMSYMBOL"

    // $ANTLR start "BEGINSYMBOL"
    public final void mBEGINSYMBOL() throws RecognitionException {
        try {
            int _type = BEGINSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:54:14: ( 'begin' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:54:16: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGINSYMBOL"

    // $ANTLR start "ENDSYMBOL"
    public final void mENDSYMBOL() throws RecognitionException {
        try {
            int _type = ENDSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:55:11: ( 'end' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:55:13: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENDSYMBOL"

    // $ANTLR start "IFSYMBOL"
    public final void mIFSYMBOL() throws RecognitionException {
        try {
            int _type = IFSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:56:11: ( 'if' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:56:13: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IFSYMBOL"

    // $ANTLR start "THENSYMBOL"
    public final void mTHENSYMBOL() throws RecognitionException {
        try {
            int _type = THENSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:57:13: ( 'then' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:57:15: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "THENSYMBOL"

    // $ANTLR start "ELSESYMBOL"
    public final void mELSESYMBOL() throws RecognitionException {
        try {
            int _type = ELSESYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:58:13: ( 'else' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:58:15: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ELSESYMBOL"

    // $ANTLR start "FISYMBOL"
    public final void mFISYMBOL() throws RecognitionException {
        try {
            int _type = FISYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:59:10: ( 'fi' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:59:12: 'fi'
            {
            match("fi"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FISYMBOL"

    // $ANTLR start "WHILESYMBOL"
    public final void mWHILESYMBOL() throws RecognitionException {
        try {
            int _type = WHILESYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:60:14: ( 'while' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:60:16: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHILESYMBOL"

    // $ANTLR start "DOSYMBOL"
    public final void mDOSYMBOL() throws RecognitionException {
        try {
            int _type = DOSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:61:10: ( 'do' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:61:12: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOSYMBOL"

    // $ANTLR start "ODSYMBOL"
    public final void mODSYMBOL() throws RecognitionException {
        try {
            int _type = ODSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:62:10: ( 'od' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:62:12: 'od'
            {
            match("od"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ODSYMBOL"

    // $ANTLR start "PRINTLNSYMBOL"
    public final void mPRINTLNSYMBOL() throws RecognitionException {
        try {
            int _type = PRINTLNSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:63:16: ( 'println' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:63:18: 'println'
            {
            match("println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRINTLNSYMBOL"

    // $ANTLR start "READSYMBOL"
    public final void mREADSYMBOL() throws RecognitionException {
        try {
            int _type = READSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:64:12: ( 'read' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:64:14: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "READSYMBOL"

    // $ANTLR start "ZUWEISUNGSSYMBOL"
    public final void mZUWEISUNGSSYMBOL() throws RecognitionException {
        try {
            int _type = ZUWEISUNGSSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:66:18: ( ':=' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:66:20: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ZUWEISUNGSSYMBOL"

    // $ANTLR start "VERGLEICHSSYMBOL"
    public final void mVERGLEICHSSYMBOL() throws RecognitionException {
        try {
            int _type = VERGLEICHSSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:67:18: ( '<' | '<=' | '=' | '<>' | '>=' | '>' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                switch ( input.LA(2) ) {
                case '=':
                    {
                    alt1=2;
                    }
                    break;
                case '>':
                    {
                    alt1=4;
                    }
                    break;
                default:
                    alt1=1;
                }

                }
                break;
            case '=':
                {
                alt1=3;
                }
                break;
            case '>':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='=') ) {
                    alt1=5;
                }
                else {
                    alt1=6;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:67:20: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:67:26: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:67:33: '='
                    {
                    match('='); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:67:39: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:67:46: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:67:53: '>'
                    {
                    match('>'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VERGLEICHSSYMBOL"

    // $ANTLR start "KLAMMERAUFSYMBOL"
    public final void mKLAMMERAUFSYMBOL() throws RecognitionException {
        try {
            int _type = KLAMMERAUFSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:68:18: ( '(' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:68:20: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KLAMMERAUFSYMBOL"

    // $ANTLR start "KLAMMERZUSYMBOL"
    public final void mKLAMMERZUSYMBOL() throws RecognitionException {
        try {
            int _type = KLAMMERZUSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:69:17: ( ')' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:69:19: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KLAMMERZUSYMBOL"

    // $ANTLR start "CONSTANTSYMBOL"
    public final void mCONSTANTSYMBOL() throws RecognitionException {
        try {
            int _type = CONSTANTSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:70:17: ( 'string' | 'integer' | 'real' | 'boolean' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt2=1;
                }
                break;
            case 'i':
                {
                alt2=2;
                }
                break;
            case 'r':
                {
                alt2=3;
                }
                break;
            case 'b':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:70:19: 'string'
                    {
                    match("string"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:70:30: 'integer'
                    {
                    match("integer"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:70:42: 'real'
                    {
                    match("real"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:70:50: 'boolean'
                    {
                    match("boolean"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONSTANTSYMBOL"

    // $ANTLR start "PLUSMINUSSYMBOL"
    public final void mPLUSMINUSSYMBOL() throws RecognitionException {
        try {
            int _type = PLUSMINUSSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:71:17: ( '+' | '-' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUSMINUSSYMBOL"

    // $ANTLR start "MALGETEILTSYMBOL"
    public final void mMALGETEILTSYMBOL() throws RecognitionException {
        try {
            int _type = MALGETEILTSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:72:18: ( '*' | '/' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MALGETEILTSYMBOL"

    // $ANTLR start "LISTCUTSYMBOL"
    public final void mLISTCUTSYMBOL() throws RecognitionException {
        try {
            int _type = LISTCUTSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:73:16: ( ',' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:73:18: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LISTCUTSYMBOL"

    // $ANTLR start "CMDENDSYMBOL"
    public final void mCMDENDSYMBOL() throws RecognitionException {
        try {
            int _type = CMDENDSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:74:15: ( ';' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:74:17: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CMDENDSYMBOL"

    // $ANTLR start "REALCUTSYMBOL"
    public final void mREALCUTSYMBOL() throws RecognitionException {
        try {
            int _type = REALCUTSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:75:17: ( '.' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:75:19: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REALCUTSYMBOL"

    // $ANTLR start "UNSIGNEDINTEGERCONST"
    public final void mUNSIGNEDINTEGERCONST() throws RecognitionException {
        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:78:32: ( ( DIGIT )+ )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:78:34: ( DIGIT )+
            {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:78:34: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNSIGNEDINTEGERCONST"

    // $ANTLR start "BOOLEANCONST"
    public final void mBOOLEANCONST() throws RecognitionException {
        try {
            int _type = BOOLEANCONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:79:14: ( 'true' | 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='t') ) {
                alt4=1;
            }
            else if ( (LA4_0=='f') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:79:16: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:79:25: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEANCONST"

    // $ANTLR start "INTEGERCONST"
    public final void mINTEGERCONST() throws RecognitionException {
        try {
            int _type = INTEGERCONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:80:22: ( ( PLUSMINUSSYMBOL )? UNSIGNEDINTEGERCONST )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:80:24: ( PLUSMINUSSYMBOL )? UNSIGNEDINTEGERCONST
            {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:80:24: ( PLUSMINUSSYMBOL )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            mUNSIGNEDINTEGERCONST(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGERCONST"

    // $ANTLR start "REALCONST"
    public final void mREALCONST() throws RecognitionException {
        try {
            int _type = REALCONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:82:22: ( INTEGERCONST REALCUTSYMBOL ( UNSIGNEDINTEGERCONST )? )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:82:24: INTEGERCONST REALCUTSYMBOL ( UNSIGNEDINTEGERCONST )?
            {
            mINTEGERCONST(); 


            mREALCUTSYMBOL(); 


            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:82:51: ( UNSIGNEDINTEGERCONST )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:82:51: UNSIGNEDINTEGERCONST
                    {
                    mUNSIGNEDINTEGERCONST(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REALCONST"

    // $ANTLR start "STRINGCONST"
    public final void mSTRINGCONST() throws RecognitionException {
        try {
            int _type = STRINGCONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:85:13: ( '(\\'' ( options {greedy=false; } : . )* '\\')' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:85:15: '(\\'' ( options {greedy=false; } : . )* '\\')'
            {
            match("('"); 



            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:85:21: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\'') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==')') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '(')||(LA7_1 >= '*' && LA7_1 <= '\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '&')||(LA7_0 >= '(' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:85:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match("')"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRINGCONST"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:89:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:89:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:89:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '9')||(LA8_0 >= 'A' && LA8_0 <= 'Z')||LA8_0=='_'||(LA8_0 >= 'a' && LA8_0 <= 'z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:92:17: ( '0' .. '9' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:95:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:95:11: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:95:16: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:95:43: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            match("*/"); 



            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:99:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:99:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:8: ( PROGRAMSYMBOL | BEGINSYMBOL | ENDSYMBOL | IFSYMBOL | THENSYMBOL | ELSESYMBOL | FISYMBOL | WHILESYMBOL | DOSYMBOL | ODSYMBOL | PRINTLNSYMBOL | READSYMBOL | ZUWEISUNGSSYMBOL | VERGLEICHSSYMBOL | KLAMMERAUFSYMBOL | KLAMMERZUSYMBOL | CONSTANTSYMBOL | PLUSMINUSSYMBOL | MALGETEILTSYMBOL | LISTCUTSYMBOL | CMDENDSYMBOL | REALCUTSYMBOL | BOOLEANCONST | INTEGERCONST | REALCONST | STRINGCONST | ID | COMMENT | WS )
        int alt10=29;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:10: PROGRAMSYMBOL
                {
                mPROGRAMSYMBOL(); 


                }
                break;
            case 2 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:24: BEGINSYMBOL
                {
                mBEGINSYMBOL(); 


                }
                break;
            case 3 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:36: ENDSYMBOL
                {
                mENDSYMBOL(); 


                }
                break;
            case 4 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:46: IFSYMBOL
                {
                mIFSYMBOL(); 


                }
                break;
            case 5 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:55: THENSYMBOL
                {
                mTHENSYMBOL(); 


                }
                break;
            case 6 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:66: ELSESYMBOL
                {
                mELSESYMBOL(); 


                }
                break;
            case 7 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:77: FISYMBOL
                {
                mFISYMBOL(); 


                }
                break;
            case 8 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:86: WHILESYMBOL
                {
                mWHILESYMBOL(); 


                }
                break;
            case 9 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:98: DOSYMBOL
                {
                mDOSYMBOL(); 


                }
                break;
            case 10 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:107: ODSYMBOL
                {
                mODSYMBOL(); 


                }
                break;
            case 11 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:116: PRINTLNSYMBOL
                {
                mPRINTLNSYMBOL(); 


                }
                break;
            case 12 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:130: READSYMBOL
                {
                mREADSYMBOL(); 


                }
                break;
            case 13 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:141: ZUWEISUNGSSYMBOL
                {
                mZUWEISUNGSSYMBOL(); 


                }
                break;
            case 14 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:158: VERGLEICHSSYMBOL
                {
                mVERGLEICHSSYMBOL(); 


                }
                break;
            case 15 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:175: KLAMMERAUFSYMBOL
                {
                mKLAMMERAUFSYMBOL(); 


                }
                break;
            case 16 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:192: KLAMMERZUSYMBOL
                {
                mKLAMMERZUSYMBOL(); 


                }
                break;
            case 17 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:208: CONSTANTSYMBOL
                {
                mCONSTANTSYMBOL(); 


                }
                break;
            case 18 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:223: PLUSMINUSSYMBOL
                {
                mPLUSMINUSSYMBOL(); 


                }
                break;
            case 19 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:239: MALGETEILTSYMBOL
                {
                mMALGETEILTSYMBOL(); 


                }
                break;
            case 20 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:256: LISTCUTSYMBOL
                {
                mLISTCUTSYMBOL(); 


                }
                break;
            case 21 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:270: CMDENDSYMBOL
                {
                mCMDENDSYMBOL(); 


                }
                break;
            case 22 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:283: REALCUTSYMBOL
                {
                mREALCUTSYMBOL(); 


                }
                break;
            case 23 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:297: BOOLEANCONST
                {
                mBOOLEANCONST(); 


                }
                break;
            case 24 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:310: INTEGERCONST
                {
                mINTEGERCONST(); 


                }
                break;
            case 25 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:323: REALCONST
                {
                mREALCONST(); 


                }
                break;
            case 26 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:333: STRINGCONST
                {
                mSTRINGCONST(); 


                }
                break;
            case 27 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:345: ID
                {
                mID(); 


                }
                break;
            case 28 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:348: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 29 :
                // C:\\Users\\abq308\\Desktop\\CI\\MiniP\\miniP.g:1:356: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\12\26\2\uffff\1\51\1\uffff\1\26\1\53\1\27\3\uffff\1\55"+
        "\3\uffff\5\26\1\65\3\26\1\71\2\26\1\74\1\75\1\26\2\uffff\1\26\4"+
        "\uffff\4\26\1\104\1\26\1\uffff\3\26\1\uffff\2\26\2\uffff\6\26\1"+
        "\uffff\1\122\1\26\1\124\1\125\2\26\1\130\1\131\3\26\1\135\1\26\1"+
        "\uffff\1\26\2\uffff\1\125\1\140\2\uffff\3\26\1\uffff\2\26\1\uffff"+
        "\1\131\1\146\1\147\2\131\2\uffff";
    static final String DFA10_eofS =
        "\150\uffff";
    static final String DFA10_minS =
        "\1\11\1\162\1\145\1\154\1\146\1\150\1\141\1\150\1\157\1\144\1\145"+
        "\2\uffff\1\47\1\uffff\1\164\1\60\1\52\3\uffff\1\56\3\uffff\1\151"+
        "\1\147\1\157\1\144\1\163\1\60\1\164\1\145\1\165\1\60\1\154\1\151"+
        "\2\60\1\141\2\uffff\1\162\4\uffff\1\147\1\156\1\151\1\154\1\60\1"+
        "\145\1\uffff\1\145\1\156\1\145\1\uffff\1\163\1\154\2\uffff\1\144"+
        "\1\151\1\162\1\164\1\156\1\145\1\uffff\1\60\1\147\2\60\2\145\2\60"+
        "\1\156\1\141\1\154\1\60\1\141\1\uffff\1\145\2\uffff\2\60\2\uffff"+
        "\1\147\1\155\1\156\1\uffff\1\156\1\162\1\uffff\5\60\2\uffff";
    static final String DFA10_maxS =
        "\1\172\1\162\1\157\2\156\1\162\1\151\1\150\1\157\1\144\1\145\2\uffff"+
        "\1\47\1\uffff\1\164\1\71\1\52\3\uffff\1\71\3\uffff\1\157\1\147\1"+
        "\157\1\144\1\163\1\172\1\164\1\145\1\165\1\172\1\154\1\151\2\172"+
        "\1\141\2\uffff\1\162\4\uffff\1\147\1\156\1\151\1\154\1\172\1\145"+
        "\1\uffff\1\145\1\156\1\145\1\uffff\1\163\1\154\2\uffff\1\154\1\151"+
        "\1\162\1\164\1\156\1\145\1\uffff\1\172\1\147\2\172\2\145\2\172\1"+
        "\156\1\141\1\154\1\172\1\141\1\uffff\1\145\2\uffff\2\172\2\uffff"+
        "\1\147\1\155\1\156\1\uffff\1\156\1\162\1\uffff\5\172\2\uffff";
    static final String DFA10_acceptS =
        "\13\uffff\1\15\1\16\1\uffff\1\20\3\uffff\1\24\1\25\1\26\1\uffff"+
        "\1\33\1\23\1\35\17\uffff\1\32\1\17\1\uffff\1\22\1\34\1\30\1\31\6"+
        "\uffff\1\4\3\uffff\1\7\2\uffff\1\11\1\12\6\uffff\1\3\15\uffff\1"+
        "\6\1\uffff\1\5\1\27\2\uffff\1\14\1\21\3\uffff\1\2\2\uffff\1\10\5"+
        "\uffff\1\1\1\13";
    static final String DFA10_specialS =
        "\150\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\7\uffff\1\15\1\16\1\27\1\20"+
            "\1\22\1\20\1\24\1\21\12\25\1\13\1\23\3\14\2\uffff\32\26\6\uffff"+
            "\1\26\1\2\1\26\1\10\1\3\1\6\2\26\1\4\5\26\1\11\1\1\1\26\1\12"+
            "\1\17\1\5\2\26\1\7\3\26",
            "\1\31",
            "\1\32\11\uffff\1\33",
            "\1\35\1\uffff\1\34",
            "\1\36\7\uffff\1\37",
            "\1\40\11\uffff\1\41",
            "\1\43\7\uffff\1\42",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "",
            "\1\50",
            "",
            "\1\52",
            "\12\25",
            "\1\54",
            "",
            "",
            "",
            "\1\56\1\uffff\12\25",
            "",
            "",
            "",
            "\1\60\5\uffff\1\57",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\72",
            "\1\73",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\76",
            "",
            "",
            "\1\77",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "",
            "",
            "\1\113\7\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\123",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\126",
            "\1\127",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\136",
            "",
            "\1\137",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PROGRAMSYMBOL | BEGINSYMBOL | ENDSYMBOL | IFSYMBOL | THENSYMBOL | ELSESYMBOL | FISYMBOL | WHILESYMBOL | DOSYMBOL | ODSYMBOL | PRINTLNSYMBOL | READSYMBOL | ZUWEISUNGSSYMBOL | VERGLEICHSSYMBOL | KLAMMERAUFSYMBOL | KLAMMERZUSYMBOL | CONSTANTSYMBOL | PLUSMINUSSYMBOL | MALGETEILTSYMBOL | LISTCUTSYMBOL | CMDENDSYMBOL | REALCUTSYMBOL | BOOLEANCONST | INTEGERCONST | REALCONST | STRINGCONST | ID | COMMENT | WS );";
        }
    }
 

}
// $ANTLR 3.4 Z:\\win7\\CI\\CI4\\buchstabenGrammar.g 2015-01-14 09:48:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class buchstabenGrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int AUFGABE=4;
    public static final int EQUALS=5;
    public static final int LETTER=6;
    public static final int MINUS=7;
    public static final int NEWLINE=8;
    public static final int PLUS=9;
    public static final int RAETSEL=10;
    public static final int WORT=11;
    public static final int WS=12;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public buchstabenGrammarLexer() {} 
    public buchstabenGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public buchstabenGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Z:\\win7\\CI\\CI4\\buchstabenGrammar.g"; }

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:34:5: ( ( ' ' | '\\t' ) )
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:34:9: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:39:6: ( '+' )
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:39:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:40:8: ( '-' )
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:40:11: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:42:9: ( '=' )
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:42:12: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:44:9: ( ( '\\r' )? '\\n' )
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:44:11: ( '\\r' )? '\\n'
            {
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:44:11: ( '\\r' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:44:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:46:9: ( 'A' .. 'Z' )
            // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
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
    // $ANTLR end "LETTER"

    public void mTokens() throws RecognitionException {
        // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:1:8: ( WS | PLUS | MINUS | EQUALS | NEWLINE | LETTER )
        int alt2=6;
        switch ( input.LA(1) ) {
        case '\t':
        case ' ':
            {
            alt2=1;
            }
            break;
        case '+':
            {
            alt2=2;
            }
            break;
        case '-':
            {
            alt2=3;
            }
            break;
        case '=':
            {
            alt2=4;
            }
            break;
        case '\n':
        case '\r':
            {
            alt2=5;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt2=6;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:1:10: WS
                {
                mWS(); 


                }
                break;
            case 2 :
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:1:13: PLUS
                {
                mPLUS(); 


                }
                break;
            case 3 :
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:1:18: MINUS
                {
                mMINUS(); 


                }
                break;
            case 4 :
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:1:24: EQUALS
                {
                mEQUALS(); 


                }
                break;
            case 5 :
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:1:31: NEWLINE
                {
                mNEWLINE(); 


                }
                break;
            case 6 :
                // Z:\\win7\\CI\\CI4\\buchstabenGrammar.g:1:39: LETTER
                {
                mLETTER(); 


                }
                break;

        }

    }


 

}
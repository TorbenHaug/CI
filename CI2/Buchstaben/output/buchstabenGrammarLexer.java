// $ANTLR 3.4 C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g 2014-11-13 08:20:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class buchstabenGrammarLexer extends Lexer {
    public static final int EOF=-1;
    public static final int CHAR=4;
    public static final int EQUAL_SIGN=5;
    public static final int IGNOREDSIGNES=6;
    public static final int INPUT_STRING=7;
    public static final int PLUS_MINUS_SIGN=8;
    public static final int SYMBOLPUZZLE=9;

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
    public String getGrammarFileName() { return "C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g"; }

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g:87:6: ( ( 'A' .. 'Z' ) )
            // C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g:
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
    // $ANTLR end "CHAR"

    // $ANTLR start "PLUS_MINUS_SIGN"
    public final void mPLUS_MINUS_SIGN() throws RecognitionException {
        try {
            int _type = PLUS_MINUS_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g:88:17: ( '+' | '-' )
            // C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g:
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
    // $ANTLR end "PLUS_MINUS_SIGN"

    // $ANTLR start "EQUAL_SIGN"
    public final void mEQUAL_SIGN() throws RecognitionException {
        try {
            int _type = EQUAL_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g:89:12: ( '=' )
            // C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g:89:14: '='
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
    // $ANTLR end "EQUAL_SIGN"

    // $ANTLR start "IGNOREDSIGNES"
    public final void mIGNOREDSIGNES() throws RecognitionException {
        try {
            int _type = IGNOREDSIGNES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g:90:15: ( ( '\\n' | '\\r' | ' ' ) )
            // C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g:90:17: ( '\\n' | '\\r' | ' ' )
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
    // $ANTLR end "IGNOREDSIGNES"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g:1:8: ( CHAR | PLUS_MINUS_SIGN | EQUAL_SIGN | IGNOREDSIGNES )
        int alt1=4;
        switch ( input.LA(1) ) {
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
            alt1=1;
            }
            break;
        case '+':
        case '-':
            {
            alt1=2;
            }
            break;
        case '=':
            {
            alt1=3;
            }
            break;
        case '\n':
        case '\r':
        case ' ':
            {
            alt1=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;

        }

        switch (alt1) {
            case 1 :
                // C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g:1:10: CHAR
                {
                mCHAR(); 


                }
                break;
            case 2 :
                // C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g:1:15: PLUS_MINUS_SIGN
                {
                mPLUS_MINUS_SIGN(); 


                }
                break;
            case 3 :
                // C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g:1:31: EQUAL_SIGN
                {
                mEQUAL_SIGN(); 


                }
                break;
            case 4 :
                // C:\\Users\\abq308\\Desktop\\CI\\Buchstaben\\buchstabenGrammar.g:1:42: IGNOREDSIGNES
                {
                mIGNOREDSIGNES(); 


                }
                break;

        }

    }


 

}
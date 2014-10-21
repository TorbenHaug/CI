// Generated from C:\Users\ClausTorben\OneDrive\Dokumente\Studium\Praktikum\CI\CI1\src\minip\minipGrammar.g4 by ANTLR 4.4
package minip;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minipGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAMSYMBOL=1, BEGINSYMBOL=2, ENDSYMBOL=3, IFSYMBOL=4, THENSYMBOL=5, 
		ELSESYMBOL=6, FISYMBOL=7, WHILESYMBOL=8, DOSYMBOL=9, ODSYMBOL=10, PRINTLNSYMBOL=11, 
		READSYMBOL=12, ZUWEISUNGSSYMBOL=13, VERGLEICHSSYMBOL=14, KLAMMERAUFSYMBOL=15, 
		KLAMMERZUSYMBOL=16, CONSTANTSYMBOL=17, PLUSMINUSSYMBOL=18, MALGETEILTSYMBOL=19, 
		LISTCUTSYMBOL=20, CMDENDSYMBOL=21, REALCUTSYMBOL=22, UNSIGNEDINTEGERCONST=23, 
		BOOLEANCONST=24, STRINGCONST=25, ID=26, COMMENT=27, WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'"
	};
	public static final String[] ruleNames = {
		"PROGRAMSYMBOL", "BEGINSYMBOL", "ENDSYMBOL", "IFSYMBOL", "THENSYMBOL", 
		"ELSESYMBOL", "FISYMBOL", "WHILESYMBOL", "DOSYMBOL", "ODSYMBOL", "PRINTLNSYMBOL", 
		"READSYMBOL", "ZUWEISUNGSSYMBOL", "VERGLEICHSSYMBOL", "KLAMMERAUFSYMBOL", 
		"KLAMMERZUSYMBOL", "CONSTANTSYMBOL", "PLUSMINUSSYMBOL", "MALGETEILTSYMBOL", 
		"LISTCUTSYMBOL", "CMDENDSYMBOL", "REALCUTSYMBOL", "UNSIGNEDINTEGERCONST", 
		"BOOLEANCONST", "STRINGCONST", "ID", "DIGIT", "COMMENT", "WS"
	};


	public minipGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "minipGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 27: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		case 28: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip(); break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00e2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u0083\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00a1\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\30\6\30\u00ae\n\30\r\30\16\30\u00af\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u00bb\n\31\3\32\3\32\3\32\3\32\7\32\u00c1"+
		"\n\32\f\32\16\32\u00c4\13\32\3\32\3\32\3\32\3\33\3\33\7\33\u00cb\n\33"+
		"\f\33\16\33\u00ce\13\33\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00d6\n\35"+
		"\f\35\16\35\u00d9\13\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\4\u00c2"+
		"\u00d7\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\29\35;\36\3\2\7\4\2--//\4\2,,\61\61\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\u00ed\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\3=\3\2\2\2\5E\3\2\2\2\7K\3\2\2\2\tO\3\2\2\2\13R\3\2\2\2\rW\3"+
		"\2\2\2\17\\\3\2\2\2\21_\3\2\2\2\23e\3\2\2\2\25h\3\2\2\2\27k\3\2\2\2\31"+
		"q\3\2\2\2\33v\3\2\2\2\35\u0082\3\2\2\2\37\u0084\3\2\2\2!\u0086\3\2\2\2"+
		"#\u00a0\3\2\2\2%\u00a2\3\2\2\2\'\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00a8\3"+
		"\2\2\2-\u00aa\3\2\2\2/\u00ad\3\2\2\2\61\u00ba\3\2\2\2\63\u00bc\3\2\2\2"+
		"\65\u00c8\3\2\2\2\67\u00cf\3\2\2\29\u00d1\3\2\2\2;\u00df\3\2\2\2=>\7r"+
		"\2\2>?\7t\2\2?@\7q\2\2@A\7i\2\2AB\7t\2\2BC\7c\2\2CD\7o\2\2D\4\3\2\2\2"+
		"EF\7d\2\2FG\7g\2\2GH\7i\2\2HI\7k\2\2IJ\7p\2\2J\6\3\2\2\2KL\7g\2\2LM\7"+
		"p\2\2MN\7f\2\2N\b\3\2\2\2OP\7k\2\2PQ\7h\2\2Q\n\3\2\2\2RS\7v\2\2ST\7j\2"+
		"\2TU\7g\2\2UV\7p\2\2V\f\3\2\2\2WX\7g\2\2XY\7n\2\2YZ\7u\2\2Z[\7g\2\2[\16"+
		"\3\2\2\2\\]\7h\2\2]^\7k\2\2^\20\3\2\2\2_`\7y\2\2`a\7j\2\2ab\7k\2\2bc\7"+
		"n\2\2cd\7g\2\2d\22\3\2\2\2ef\7f\2\2fg\7q\2\2g\24\3\2\2\2hi\7q\2\2ij\7"+
		"f\2\2j\26\3\2\2\2kl\7r\2\2lm\7t\2\2mn\7k\2\2no\7p\2\2op\7v\2\2p\30\3\2"+
		"\2\2qr\7t\2\2rs\7g\2\2st\7c\2\2tu\7f\2\2u\32\3\2\2\2vw\7<\2\2wx\7?\2\2"+
		"x\34\3\2\2\2y\u0083\7>\2\2z{\7>\2\2{\u0083\7?\2\2|\u0083\7?\2\2}~\7>\2"+
		"\2~\u0083\7@\2\2\177\u0080\7@\2\2\u0080\u0083\7?\2\2\u0081\u0083\7@\2"+
		"\2\u0082y\3\2\2\2\u0082z\3\2\2\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0082\177"+
		"\3\2\2\2\u0082\u0081\3\2\2\2\u0083\36\3\2\2\2\u0084\u0085\7*\2\2\u0085"+
		" \3\2\2\2\u0086\u0087\7+\2\2\u0087\"\3\2\2\2\u0088\u0089\7u\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2"+
		"\u008d\u00a1\7i\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091"+
		"\7v\2\2\u0091\u0092\7g\2\2\u0092\u0093\7i\2\2\u0093\u0094\7g\2\2\u0094"+
		"\u00a1\7t\2\2\u0095\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097\u0098\7c\2\2"+
		"\u0098\u00a1\7n\2\2\u0099\u009a\7d\2\2\u009a\u009b\7q\2\2\u009b\u009c"+
		"\7q\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a1\7p\2\2\u00a0\u0088\3\2\2\2\u00a0\u008e\3\2\2\2\u00a0\u0095\3\2"+
		"\2\2\u00a0\u0099\3\2\2\2\u00a1$\3\2\2\2\u00a2\u00a3\t\2\2\2\u00a3&\3\2"+
		"\2\2\u00a4\u00a5\t\3\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7.\2\2\u00a7*\3\2"+
		"\2\2\u00a8\u00a9\7=\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7\60\2\2\u00ab.\3\2"+
		"\2\2\u00ac\u00ae\5\67\34\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7v\2\2"+
		"\u00b2\u00b3\7t\2\2\u00b3\u00b4\7w\2\2\u00b4\u00bb\7g\2\2\u00b5\u00b6"+
		"\7h\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7u\2\2\u00b9"+
		"\u00bb\7g\2\2\u00ba\u00b1\3\2\2\2\u00ba\u00b5\3\2\2\2\u00bb\62\3\2\2\2"+
		"\u00bc\u00bd\7*\2\2\u00bd\u00be\7)\2\2\u00be\u00c2\3\2\2\2\u00bf\u00c1"+
		"\13\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c3\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6"+
		"\7)\2\2\u00c6\u00c7\7+\2\2\u00c7\64\3\2\2\2\u00c8\u00cc\t\4\2\2\u00c9"+
		"\u00cb\t\5\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\66\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0"+
		"\4\62;\2\u00d08\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3\7,\2\2\u00d3"+
		"\u00d7\3\2\2\2\u00d4\u00d6\13\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\7,\2\2\u00db\u00dc\7\61\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\b\35\2\2\u00de:\3\2\2\2\u00df\u00e0\t\6\2\2\u00e0\u00e1"+
		"\b\36\3\2\u00e1<\3\2\2\2\n\2\u0082\u00a0\u00af\u00ba\u00c2\u00cc\u00d7"+
		"\4\3\35\2\3\36\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
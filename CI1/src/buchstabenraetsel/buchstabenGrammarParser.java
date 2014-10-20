// Generated from C:\Users\ClausTorben\OneDrive\Dokumente\Studium\Praktikum\CI\CI1\src\buchstabenraetsel\buchstabenGrammar.g4 by ANTLR 4.4
package buchstabenraetsel;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class buchstabenGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZIFFER=1, PLUSMINUS=2, ZUWEISUNG=3, IGNOREDSIGNES=4;
	public static final String[] tokenNames = {
		"<INVALID>", "ZIFFER", "PLUSMINUS", "'='", "IGNOREDSIGNES"
	};
	public static final int
		RULE_start = 0, RULE_line1 = 1, RULE_line2 = 2, RULE_line3 = 3;
	public static final String[] ruleNames = {
		"start", "line1", "line2", "line3"
	};

	@Override
	public String getGrammarFileName() { return "buchstabenGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public buchstabenGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Line1Context line1(int i) {
			return getRuleContext(Line1Context.class,i);
		}
		public List<Line1Context> line1() {
			return getRuleContexts(Line1Context.class);
		}
		public Line3Context line3() {
			return getRuleContext(Line3Context.class,0);
		}
		public Line2Context line2() {
			return getRuleContext(Line2Context.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof buchstabenGrammarListener ) ((buchstabenGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof buchstabenGrammarListener ) ((buchstabenGrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); line1();
			setState(9); line2();
			setState(10); line1();
			setState(11); line3();
			setState(12); line1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Line1Context extends ParserRuleContext {
		public TerminalNode PLUSMINUS() { return getToken(buchstabenGrammarParser.PLUSMINUS, 0); }
		public List<TerminalNode> ZIFFER() { return getTokens(buchstabenGrammarParser.ZIFFER); }
		public TerminalNode ZIFFER(int i) {
			return getToken(buchstabenGrammarParser.ZIFFER, i);
		}
		public TerminalNode ZUWEISUNG() { return getToken(buchstabenGrammarParser.ZUWEISUNG, 0); }
		public Line1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof buchstabenGrammarListener ) ((buchstabenGrammarListener)listener).enterLine1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof buchstabenGrammarListener ) ((buchstabenGrammarListener)listener).exitLine1(this);
		}
	}

	public final Line1Context line1() throws RecognitionException {
		Line1Context _localctx = new Line1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_line1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); match(ZIFFER);
			setState(15); match(PLUSMINUS);
			setState(16); match(ZIFFER);
			setState(17); match(ZUWEISUNG);
			setState(18); match(ZIFFER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Line2Context extends ParserRuleContext {
		public List<TerminalNode> PLUSMINUS() { return getTokens(buchstabenGrammarParser.PLUSMINUS); }
		public TerminalNode PLUSMINUS(int i) {
			return getToken(buchstabenGrammarParser.PLUSMINUS, i);
		}
		public Line2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof buchstabenGrammarListener ) ((buchstabenGrammarListener)listener).enterLine2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof buchstabenGrammarListener ) ((buchstabenGrammarListener)listener).exitLine2(this);
		}
	}

	public final Line2Context line2() throws RecognitionException {
		Line2Context _localctx = new Line2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_line2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); match(PLUSMINUS);
			setState(21); match(PLUSMINUS);
			setState(22); match(PLUSMINUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Line3Context extends ParserRuleContext {
		public TerminalNode ZUWEISUNG(int i) {
			return getToken(buchstabenGrammarParser.ZUWEISUNG, i);
		}
		public List<TerminalNode> ZUWEISUNG() { return getTokens(buchstabenGrammarParser.ZUWEISUNG); }
		public Line3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof buchstabenGrammarListener ) ((buchstabenGrammarListener)listener).enterLine3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof buchstabenGrammarListener ) ((buchstabenGrammarListener)listener).exitLine3(this);
		}
	}

	public final Line3Context line3() throws RecognitionException {
		Line3Context _localctx = new Line3Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_line3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(ZUWEISUNG);
			setState(25); match(ZUWEISUNG);
			setState(26); match(ZUWEISUNG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\6\37\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\32\2\n\3\2\2\2\4"+
		"\20\3\2\2\2\6\26\3\2\2\2\b\32\3\2\2\2\n\13\5\4\3\2\13\f\5\6\4\2\f\r\5"+
		"\4\3\2\r\16\5\b\5\2\16\17\5\4\3\2\17\3\3\2\2\2\20\21\7\3\2\2\21\22\7\4"+
		"\2\2\22\23\7\3\2\2\23\24\7\5\2\2\24\25\7\3\2\2\25\5\3\2\2\2\26\27\7\4"+
		"\2\2\27\30\7\4\2\2\30\31\7\4\2\2\31\7\3\2\2\2\32\33\7\5\2\2\33\34\7\5"+
		"\2\2\34\35\7\5\2\2\35\t\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
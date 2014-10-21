// Generated from C:\Users\ClausTorben\OneDrive\Dokumente\Studium\Praktikum\CI\CI1\src\minip\minipGrammar.g4 by ANTLR 4.4
package minip;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minipGrammarParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'program'", "'begin'", "'end'", "'if'", "'then'", "'else'", 
		"'fi'", "'while'", "'do'", "'od'", "'print'", "'read'", "':='", "VERGLEICHSSYMBOL", 
		"'('", "')'", "CONSTANTSYMBOL", "PLUSMINUSSYMBOL", "MALGETEILTSYMBOL", 
		"','", "';'", "'.'", "UNSIGNEDINTEGERCONST", "BOOLEANCONST", "STRINGCONST", 
		"ID", "COMMENT", "WS"
	};
	public static final int
		RULE_start = 0, RULE_declaration = 1, RULE_programmcode = 2, RULE_anweisung = 3, 
		RULE_zuweisung = 4, RULE_zuweisungvalue = 5, RULE_condition = 6, RULE_vergleich = 7, 
		RULE_schleife = 8, RULE_number = 9, RULE_integer = 10, RULE_real = 11, 
		RULE_println = 12, RULE_read = 13, RULE_arithausdr = 14, RULE_a = 15, 
		RULE_addition = 16, RULE_e = 17, RULE_multiplikation = 18, RULE_p = 19, 
		RULE_arithidentifiere = 20;
	public static final String[] ruleNames = {
		"start", "declaration", "programmcode", "anweisung", "zuweisung", "zuweisungvalue", 
		"condition", "vergleich", "schleife", "number", "integer", "real", "println", 
		"read", "arithausdr", "a", "addition", "e", "multiplikation", "p", "arithidentifiere"
	};

	@Override
	public String getGrammarFileName() { return "minipGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public minipGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode PROGRAMSYMBOL() { return getToken(minipGrammarParser.PROGRAMSYMBOL, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode ENDSYMBOL() { return getToken(minipGrammarParser.ENDSYMBOL, 0); }
		public TerminalNode BEGINSYMBOL() { return getToken(minipGrammarParser.BEGINSYMBOL, 0); }
		public ProgrammcodeContext programmcode() {
			return getRuleContext(ProgrammcodeContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); match(PROGRAMSYMBOL);
			setState(43); declaration();
			setState(44); match(BEGINSYMBOL);
			setState(45); programmcode();
			setState(46); match(ENDSYMBOL);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode CMDENDSYMBOL(int i) {
			return getToken(minipGrammarParser.CMDENDSYMBOL, i);
		}
		public List<TerminalNode> ID() { return getTokens(minipGrammarParser.ID); }
		public List<TerminalNode> CONSTANTSYMBOL() { return getTokens(minipGrammarParser.CONSTANTSYMBOL); }
		public List<TerminalNode> LISTCUTSYMBOL() { return getTokens(minipGrammarParser.LISTCUTSYMBOL); }
		public TerminalNode CONSTANTSYMBOL(int i) {
			return getToken(minipGrammarParser.CONSTANTSYMBOL, i);
		}
		public List<TerminalNode> CMDENDSYMBOL() { return getTokens(minipGrammarParser.CMDENDSYMBOL); }
		public TerminalNode ID(int i) {
			return getToken(minipGrammarParser.ID, i);
		}
		public TerminalNode LISTCUTSYMBOL(int i) {
			return getToken(minipGrammarParser.LISTCUTSYMBOL, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTANTSYMBOL) {
				{
				{
				setState(48); match(CONSTANTSYMBOL);
				setState(49); match(ID);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LISTCUTSYMBOL) {
					{
					{
					setState(50); match(LISTCUTSYMBOL);
					setState(51); match(ID);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57); match(CMDENDSYMBOL);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ProgrammcodeContext extends ParserRuleContext {
		public List<AnweisungContext> anweisung() {
			return getRuleContexts(AnweisungContext.class);
		}
		public AnweisungContext anweisung(int i) {
			return getRuleContext(AnweisungContext.class,i);
		}
		public ProgrammcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programmcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterProgrammcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitProgrammcode(this);
		}
	}

	public final ProgrammcodeContext programmcode() throws RecognitionException {
		ProgrammcodeContext _localctx = new ProgrammcodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programmcode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IFSYMBOL) | (1L << WHILESYMBOL) | (1L << PRINTLNSYMBOL) | (1L << READSYMBOL) | (1L << ID))) != 0)) {
				{
				{
				setState(63); anweisung();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AnweisungContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public ZuweisungContext zuweisung() {
			return getRuleContext(ZuweisungContext.class,0);
		}
		public SchleifeContext schleife() {
			return getRuleContext(SchleifeContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AnweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterAnweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitAnweisung(this);
		}
	}

	public final AnweisungContext anweisung() throws RecognitionException {
		AnweisungContext _localctx = new AnweisungContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_anweisung);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); zuweisung();
				}
				break;
			case IFSYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); condition();
				}
				break;
			case WHILESYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(71); schleife();
				}
				break;
			case PRINTLNSYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(72); println();
				}
				break;
			case READSYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(73); read();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ZuweisungContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(minipGrammarParser.ID, 0); }
		public TerminalNode CMDENDSYMBOL() { return getToken(minipGrammarParser.CMDENDSYMBOL, 0); }
		public ZuweisungvalueContext zuweisungvalue() {
			return getRuleContext(ZuweisungvalueContext.class,0);
		}
		public TerminalNode ZUWEISUNGSSYMBOL() { return getToken(minipGrammarParser.ZUWEISUNGSSYMBOL, 0); }
		public ZuweisungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zuweisung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterZuweisung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitZuweisung(this);
		}
	}

	public final ZuweisungContext zuweisung() throws RecognitionException {
		ZuweisungContext _localctx = new ZuweisungContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_zuweisung);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(ID);
			setState(77); match(ZUWEISUNGSSYMBOL);
			setState(78); zuweisungvalue();
			setState(79); match(CMDENDSYMBOL);
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

	public static class ZuweisungvalueContext extends ParserRuleContext {
		public TerminalNode BOOLEANCONST() { return getToken(minipGrammarParser.BOOLEANCONST, 0); }
		public TerminalNode STRINGCONST() { return getToken(minipGrammarParser.STRINGCONST, 0); }
		public ArithausdrContext arithausdr() {
			return getRuleContext(ArithausdrContext.class,0);
		}
		public VergleichContext vergleich() {
			return getRuleContext(VergleichContext.class,0);
		}
		public ZuweisungvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zuweisungvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterZuweisungvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitZuweisungvalue(this);
		}
	}

	public final ZuweisungvalueContext zuweisungvalue() throws RecognitionException {
		ZuweisungvalueContext _localctx = new ZuweisungvalueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_zuweisungvalue);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(STRINGCONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82); match(BOOLEANCONST);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83); vergleich();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84); arithausdr();
				}
				break;
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

	public static class ConditionContext extends ParserRuleContext {
		public ProgrammcodeContext programmcode(int i) {
			return getRuleContext(ProgrammcodeContext.class,i);
		}
		public TerminalNode FISYMBOL() { return getToken(minipGrammarParser.FISYMBOL, 0); }
		public TerminalNode ELSESYMBOL() { return getToken(minipGrammarParser.ELSESYMBOL, 0); }
		public TerminalNode IFSYMBOL() { return getToken(minipGrammarParser.IFSYMBOL, 0); }
		public VergleichContext vergleich() {
			return getRuleContext(VergleichContext.class,0);
		}
		public TerminalNode THENSYMBOL() { return getToken(minipGrammarParser.THENSYMBOL, 0); }
		public List<ProgrammcodeContext> programmcode() {
			return getRuleContexts(ProgrammcodeContext.class);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(IFSYMBOL);
			setState(88); vergleich();
			setState(89); match(THENSYMBOL);
			setState(90); programmcode();
			setState(93);
			_la = _input.LA(1);
			if (_la==ELSESYMBOL) {
				{
				setState(91); match(ELSESYMBOL);
				setState(92); programmcode();
				}
			}

			setState(95); match(FISYMBOL);
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

	public static class VergleichContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public List<TerminalNode> ID() { return getTokens(minipGrammarParser.ID); }
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(minipGrammarParser.ID, i);
		}
		public TerminalNode VERGLEICHSSYMBOL() { return getToken(minipGrammarParser.VERGLEICHSSYMBOL, 0); }
		public VergleichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vergleich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterVergleich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitVergleich(this);
		}
	}

	public final VergleichContext vergleich() throws RecognitionException {
		VergleichContext _localctx = new VergleichContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vergleich);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			switch (_input.LA(1)) {
			case PLUSMINUSSYMBOL:
			case UNSIGNEDINTEGERCONST:
				{
				setState(97); number();
				}
				break;
			case ID:
				{
				setState(98); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(101); match(VERGLEICHSSYMBOL);
			setState(104);
			switch (_input.LA(1)) {
			case PLUSMINUSSYMBOL:
			case UNSIGNEDINTEGERCONST:
				{
				setState(102); number();
				}
				break;
			case ID:
				{
				setState(103); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class SchleifeContext extends ParserRuleContext {
		public TerminalNode DOSYMBOL() { return getToken(minipGrammarParser.DOSYMBOL, 0); }
		public TerminalNode WHILESYMBOL() { return getToken(minipGrammarParser.WHILESYMBOL, 0); }
		public VergleichContext vergleich() {
			return getRuleContext(VergleichContext.class,0);
		}
		public TerminalNode ODSYMBOL() { return getToken(minipGrammarParser.ODSYMBOL, 0); }
		public ProgrammcodeContext programmcode() {
			return getRuleContext(ProgrammcodeContext.class,0);
		}
		public SchleifeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schleife; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterSchleife(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitSchleife(this);
		}
	}

	public final SchleifeContext schleife() throws RecognitionException {
		SchleifeContext _localctx = new SchleifeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_schleife);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(WHILESYMBOL);
			setState(107); vergleich();
			setState(108); match(DOSYMBOL);
			setState(109); programmcode();
			setState(110); match(ODSYMBOL);
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

	public static class NumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		try {
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); real();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); integer();
				}
				break;
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode UNSIGNEDINTEGERCONST() { return getToken(minipGrammarParser.UNSIGNEDINTEGERCONST, 0); }
		public TerminalNode PLUSMINUSSYMBOL() { return getToken(minipGrammarParser.PLUSMINUSSYMBOL, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if (_la==PLUSMINUSSYMBOL) {
				{
				setState(116); match(PLUSMINUSSYMBOL);
				}
			}

			setState(119); match(UNSIGNEDINTEGERCONST);
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

	public static class RealContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode UNSIGNEDINTEGERCONST() { return getToken(minipGrammarParser.UNSIGNEDINTEGERCONST, 0); }
		public TerminalNode REALCUTSYMBOL() { return getToken(minipGrammarParser.REALCUTSYMBOL, 0); }
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitReal(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); integer();
			setState(122); match(REALCUTSYMBOL);
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(123); match(UNSIGNEDINTEGERCONST);
				}
				break;
			}
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

	public static class PrintlnContext extends ParserRuleContext {
		public TerminalNode KLAMMERAUFSYMBOL() { return getToken(minipGrammarParser.KLAMMERAUFSYMBOL, 0); }
		public TerminalNode PRINTLNSYMBOL() { return getToken(minipGrammarParser.PRINTLNSYMBOL, 0); }
		public TerminalNode KLAMMERZUSYMBOL() { return getToken(minipGrammarParser.KLAMMERZUSYMBOL, 0); }
		public TerminalNode CMDENDSYMBOL() { return getToken(minipGrammarParser.CMDENDSYMBOL, 0); }
		public List<ZuweisungvalueContext> zuweisungvalue() {
			return getRuleContexts(ZuweisungvalueContext.class);
		}
		public ZuweisungvalueContext zuweisungvalue(int i) {
			return getRuleContext(ZuweisungvalueContext.class,i);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitPrintln(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_println);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(PRINTLNSYMBOL);
			setState(127); match(KLAMMERAUFSYMBOL);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KLAMMERAUFSYMBOL) | (1L << PLUSMINUSSYMBOL) | (1L << UNSIGNEDINTEGERCONST) | (1L << BOOLEANCONST) | (1L << STRINGCONST) | (1L << ID))) != 0)) {
				{
				{
				setState(128); zuweisungvalue();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134); match(KLAMMERZUSYMBOL);
			setState(135); match(CMDENDSYMBOL);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(minipGrammarParser.ID, 0); }
		public TerminalNode KLAMMERAUFSYMBOL() { return getToken(minipGrammarParser.KLAMMERAUFSYMBOL, 0); }
		public TerminalNode READSYMBOL() { return getToken(minipGrammarParser.READSYMBOL, 0); }
		public TerminalNode KLAMMERZUSYMBOL() { return getToken(minipGrammarParser.KLAMMERZUSYMBOL, 0); }
		public TerminalNode CMDENDSYMBOL() { return getToken(minipGrammarParser.CMDENDSYMBOL, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitRead(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(READSYMBOL);
			setState(138); match(KLAMMERAUFSYMBOL);
			setState(139); match(ID);
			setState(140); match(KLAMMERZUSYMBOL);
			setState(141); match(CMDENDSYMBOL);
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

	public static class ArithausdrContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public ArithausdrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithausdr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterArithausdr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitArithausdr(this);
		}
	}

	public final ArithausdrContext arithausdr() throws RecognitionException {
		ArithausdrContext _localctx = new ArithausdrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arithausdr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); a();
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

	public static class AContext extends ParserRuleContext {
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitA(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); e();
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(146); addition();
				}
				break;
			}
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

	public static class AdditionContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode PLUSMINUSSYMBOL() { return getToken(minipGrammarParser.PLUSMINUSSYMBOL, 0); }
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitAddition(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_addition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(PLUSMINUSSYMBOL);
			setState(150); a();
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

	public static class EContext extends ParserRuleContext {
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public MultiplikationContext multiplikation() {
			return getRuleContext(MultiplikationContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitE(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_e);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); p();
			setState(154);
			_la = _input.LA(1);
			if (_la==MALGETEILTSYMBOL) {
				{
				setState(153); multiplikation();
				}
			}

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

	public static class MultiplikationContext extends ParserRuleContext {
		public TerminalNode MALGETEILTSYMBOL() { return getToken(minipGrammarParser.MALGETEILTSYMBOL, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public MultiplikationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplikation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterMultiplikation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitMultiplikation(this);
		}
	}

	public final MultiplikationContext multiplikation() throws RecognitionException {
		MultiplikationContext _localctx = new MultiplikationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiplikation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(MALGETEILTSYMBOL);
			setState(157); e();
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

	public static class PContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public ArithidentifiereContext arithidentifiere() {
			return getRuleContext(ArithidentifiereContext.class,0);
		}
		public TerminalNode KLAMMERAUFSYMBOL() { return getToken(minipGrammarParser.KLAMMERAUFSYMBOL, 0); }
		public TerminalNode KLAMMERZUSYMBOL() { return getToken(minipGrammarParser.KLAMMERZUSYMBOL, 0); }
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitP(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_p);
		try {
			setState(164);
			switch (_input.LA(1)) {
			case KLAMMERAUFSYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(159); match(KLAMMERAUFSYMBOL);
				setState(160); a();
				setState(161); match(KLAMMERZUSYMBOL);
				}
				break;
			case PLUSMINUSSYMBOL:
			case UNSIGNEDINTEGERCONST:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(163); arithidentifiere();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ArithidentifiereContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ID() { return getToken(minipGrammarParser.ID, 0); }
		public ArithidentifiereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithidentifiere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).enterArithidentifiere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof minipGrammarListener ) ((minipGrammarListener)listener).exitArithidentifiere(this);
		}
	}

	public final ArithidentifiereContext arithidentifiere() throws RecognitionException {
		ArithidentifiereContext _localctx = new ArithidentifiereContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arithidentifiere);
		try {
			setState(168);
			switch (_input.LA(1)) {
			case PLUSMINUSSYMBOL:
			case UNSIGNEDINTEGERCONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(166); number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(167); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u00ad\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\7\3=\n\3\f\3\16\3@\13\3\3\4\7"+
		"\4C\n\4\f\4\16\4F\13\4\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\b\3\b\3"+
		"\t\3\t\5\tf\n\t\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\5\13u\n\13\3\f\5\fx\n\f\3\f\3\f\3\r\3\r\3\r\5\r\177\n\r\3\16\3\16\3\16"+
		"\7\16\u0084\n\16\f\16\16\16\u0087\13\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u0096\n\21\3\22\3\22\3\22\3\23"+
		"\3\23\5\23\u009d\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00a7"+
		"\n\25\3\26\3\26\5\26\u00ab\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\2\u00ac\2,\3\2\2\2\4>\3\2\2\2\6D\3\2\2\2\bL\3\2"+
		"\2\2\nN\3\2\2\2\fW\3\2\2\2\16Y\3\2\2\2\20e\3\2\2\2\22l\3\2\2\2\24t\3\2"+
		"\2\2\26w\3\2\2\2\30{\3\2\2\2\32\u0080\3\2\2\2\34\u008b\3\2\2\2\36\u0091"+
		"\3\2\2\2 \u0093\3\2\2\2\"\u0097\3\2\2\2$\u009a\3\2\2\2&\u009e\3\2\2\2"+
		"(\u00a6\3\2\2\2*\u00aa\3\2\2\2,-\7\3\2\2-.\5\4\3\2./\7\4\2\2/\60\5\6\4"+
		"\2\60\61\7\5\2\2\61\3\3\2\2\2\62\63\7\23\2\2\638\7\34\2\2\64\65\7\26\2"+
		"\2\65\67\7\34\2\2\66\64\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3"+
		"\2\2\2:8\3\2\2\2;=\7\27\2\2<\62\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2"+
		"?\5\3\2\2\2@>\3\2\2\2AC\5\b\5\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2"+
		"\2E\7\3\2\2\2FD\3\2\2\2GM\5\n\6\2HM\5\16\b\2IM\5\22\n\2JM\5\32\16\2KM"+
		"\5\34\17\2LG\3\2\2\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\t\3\2\2"+
		"\2NO\7\34\2\2OP\7\17\2\2PQ\5\f\7\2QR\7\27\2\2R\13\3\2\2\2SX\7\33\2\2T"+
		"X\7\32\2\2UX\5\20\t\2VX\5\36\20\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2"+
		"\2\2X\r\3\2\2\2YZ\7\6\2\2Z[\5\20\t\2[\\\7\7\2\2\\_\5\6\4\2]^\7\b\2\2^"+
		"`\5\6\4\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\t\2\2b\17\3\2\2\2cf\5\24\13"+
		"\2df\7\34\2\2ec\3\2\2\2ed\3\2\2\2fg\3\2\2\2gj\7\20\2\2hk\5\24\13\2ik\7"+
		"\34\2\2jh\3\2\2\2ji\3\2\2\2k\21\3\2\2\2lm\7\n\2\2mn\5\20\t\2no\7\13\2"+
		"\2op\5\6\4\2pq\7\f\2\2q\23\3\2\2\2ru\5\30\r\2su\5\26\f\2tr\3\2\2\2ts\3"+
		"\2\2\2u\25\3\2\2\2vx\7\24\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\31\2\2"+
		"z\27\3\2\2\2{|\5\26\f\2|~\7\30\2\2}\177\7\31\2\2~}\3\2\2\2~\177\3\2\2"+
		"\2\177\31\3\2\2\2\u0080\u0081\7\r\2\2\u0081\u0085\7\21\2\2\u0082\u0084"+
		"\5\f\7\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\22"+
		"\2\2\u0089\u008a\7\27\2\2\u008a\33\3\2\2\2\u008b\u008c\7\16\2\2\u008c"+
		"\u008d\7\21\2\2\u008d\u008e\7\34\2\2\u008e\u008f\7\22\2\2\u008f\u0090"+
		"\7\27\2\2\u0090\35\3\2\2\2\u0091\u0092\5 \21\2\u0092\37\3\2\2\2\u0093"+
		"\u0095\5$\23\2\u0094\u0096\5\"\22\2\u0095\u0094\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096!\3\2\2\2\u0097\u0098\7\24\2\2\u0098\u0099\5 \21\2\u0099#"+
		"\3\2\2\2\u009a\u009c\5(\25\2\u009b\u009d\5&\24\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d%\3\2\2\2\u009e\u009f\7\25\2\2\u009f\u00a0\5$\23\2"+
		"\u00a0\'\3\2\2\2\u00a1\u00a2\7\21\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a4"+
		"\7\22\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a7\5*\26\2\u00a6\u00a1\3\2\2\2"+
		"\u00a6\u00a5\3\2\2\2\u00a7)\3\2\2\2\u00a8\u00ab\5\24\13\2\u00a9\u00ab"+
		"\7\34\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab+\3\2\2\2\228>"+
		"DLW_ejtw~\u0085\u0095\u009c\u00a6\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
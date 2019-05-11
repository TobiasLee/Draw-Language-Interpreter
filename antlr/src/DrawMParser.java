// Generated from DrawM.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrawMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ORIGIN=2, STEP=3, DRAW=4, SCALE=5, FOR=6, T=7, FROM=8, TO=9, ROT=10, 
		COMMA=11, IS=12, SEMICO=13, WIDTH=14, COLOR=15, MUL=16, DIV=17, POWER=18, 
		ADD=19, SUB=20, PI=21, E=22, SIN=23, COS=24, TAN=25, EXP=26, LN=27, SQRT=28, 
		L_BRACKET=29, R_BRACKET=30, NUMBER=31, ID=32, CONST_ID=33, NEWLINE=34, 
		WS=35, COMMENT=36, LINE_COMMENT=37, ErrText=38;
	public static final int
		RULE_prog = 0, RULE_stats = 1, RULE_stat = 2, RULE_forStat = 3, RULE_originStat = 4, 
		RULE_scaleStat = 5, RULE_rotStat = 6, RULE_colorStat = 7, RULE_widthStat = 8, 
		RULE_assignStat = 9, RULE_expr = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stats", "stat", "forStat", "originStat", "scaleStat", "rotStat", 
			"colorStat", "widthStat", "assignStat", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'origin'", "'step'", "'draw'", "'scale'", "'for'", "'t'", 
			"'from'", "'to'", "'rot'", "','", "'is'", "';'", "'width'", "'color'", 
			"'*'", "'/'", "'^'", "'+'", "'-'", "'pi'", "'e'", "'sin'", "'cos'", "'tan'", 
			"'exp'", "'ln'", "'sqrt'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ORIGIN", "STEP", "DRAW", "SCALE", "FOR", "T", "FROM", "TO", 
			"ROT", "COMMA", "IS", "SEMICO", "WIDTH", "COLOR", "MUL", "DIV", "POWER", 
			"ADD", "SUB", "PI", "E", "SIN", "COS", "TAN", "EXP", "LN", "SQRT", "L_BRACKET", 
			"R_BRACKET", "NUMBER", "ID", "CONST_ID", "NEWLINE", "WS", "COMMENT", 
			"LINE_COMMENT", "ErrText"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DrawM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DrawMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DrawMParser.EOF, 0); }
		public List<StatsContext> stats() {
			return getRuleContexts(StatsContext.class);
		}
		public StatsContext stats(int i) {
			return getRuleContext(StatsContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(DrawMParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(DrawMParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ORIGIN) | (1L << SCALE) | (1L << FOR) | (1L << ROT) | (1L << WIDTH) | (1L << COLOR) | (1L << ID))) != 0)) {
				{
				{
				setState(22);
				stats();
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(23);
					match(NEWLINE);
					}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			match(EOF);
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

	public static class StatsContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public List<TerminalNode> SEMICO() { return getTokens(DrawMParser.SEMICO); }
		public TerminalNode SEMICO(int i) {
			return getToken(DrawMParser.SEMICO, i);
		}
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitStats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stats);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				stat();
				setState(37);
				match(SEMICO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				stat();
				notifyErrorListeners("Missing closing ';'");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				stat();
				setState(43);
				match(SEMICO);
				setState(44);
				match(SEMICO);
				notifyErrorListeners("To many ';'");
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

	public static class StatContext extends ParserRuleContext {
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public OriginStatContext originStat() {
			return getRuleContext(OriginStatContext.class,0);
		}
		public WidthStatContext widthStat() {
			return getRuleContext(WidthStatContext.class,0);
		}
		public ScaleStatContext scaleStat() {
			return getRuleContext(ScaleStatContext.class,0);
		}
		public RotStatContext rotStat() {
			return getRuleContext(RotStatContext.class,0);
		}
		public ColorStatContext colorStat() {
			return getRuleContext(ColorStatContext.class,0);
		}
		public AssignStatContext assignStat() {
			return getRuleContext(AssignStatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				forStat();
				}
				break;
			case ORIGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				originStat();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				widthStat();
				}
				break;
			case SCALE:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				scaleStat();
				}
				break;
			case ROT:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				rotStat();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				colorStat();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				assignStat();
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

	public static class ForStatContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(DrawMParser.FOR, 0); }
		public TerminalNode T() { return getToken(DrawMParser.T, 0); }
		public TerminalNode FROM() { return getToken(DrawMParser.FROM, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(DrawMParser.TO, 0); }
		public TerminalNode STEP() { return getToken(DrawMParser.STEP, 0); }
		public TerminalNode DRAW() { return getToken(DrawMParser.DRAW, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawMParser.L_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(DrawMParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(DrawMParser.R_BRACKET, 0); }
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(FOR);
			setState(59);
			match(T);
			setState(60);
			match(FROM);
			setState(61);
			expr(0);
			setState(62);
			match(TO);
			setState(63);
			expr(0);
			setState(64);
			match(STEP);
			setState(65);
			expr(0);
			setState(66);
			match(DRAW);
			setState(67);
			match(L_BRACKET);
			setState(68);
			expr(0);
			setState(69);
			match(COMMA);
			setState(70);
			expr(0);
			setState(71);
			match(R_BRACKET);
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

	public static class OriginStatContext extends ParserRuleContext {
		public TerminalNode ORIGIN() { return getToken(DrawMParser.ORIGIN, 0); }
		public TerminalNode IS() { return getToken(DrawMParser.IS, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawMParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DrawMParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(DrawMParser.R_BRACKET, 0); }
		public OriginStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitOriginStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OriginStatContext originStat() throws RecognitionException {
		OriginStatContext _localctx = new OriginStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_originStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ORIGIN);
			setState(74);
			match(IS);
			setState(75);
			match(L_BRACKET);
			setState(76);
			expr(0);
			setState(77);
			match(COMMA);
			setState(78);
			expr(0);
			setState(79);
			match(R_BRACKET);
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

	public static class ScaleStatContext extends ParserRuleContext {
		public TerminalNode SCALE() { return getToken(DrawMParser.SCALE, 0); }
		public TerminalNode IS() { return getToken(DrawMParser.IS, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawMParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(DrawMParser.COMMA, 0); }
		public TerminalNode R_BRACKET() { return getToken(DrawMParser.R_BRACKET, 0); }
		public ScaleStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitScaleStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaleStatContext scaleStat() throws RecognitionException {
		ScaleStatContext _localctx = new ScaleStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_scaleStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(SCALE);
			setState(82);
			match(IS);
			setState(83);
			match(L_BRACKET);
			setState(84);
			expr(0);
			setState(85);
			match(COMMA);
			setState(86);
			expr(0);
			setState(87);
			match(R_BRACKET);
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

	public static class RotStatContext extends ParserRuleContext {
		public TerminalNode ROT() { return getToken(DrawMParser.ROT, 0); }
		public TerminalNode IS() { return getToken(DrawMParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RotStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitRotStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotStatContext rotStat() throws RecognitionException {
		RotStatContext _localctx = new RotStatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rotStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ROT);
			setState(90);
			match(IS);
			setState(91);
			expr(0);
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

	public static class ColorStatContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(DrawMParser.COLOR, 0); }
		public TerminalNode IS() { return getToken(DrawMParser.IS, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawMParser.L_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DrawMParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DrawMParser.COMMA, i);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawMParser.R_BRACKET, 0); }
		public ColorStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitColorStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorStatContext colorStat() throws RecognitionException {
		ColorStatContext _localctx = new ColorStatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_colorStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(COLOR);
			setState(94);
			match(IS);
			setState(95);
			match(L_BRACKET);
			setState(96);
			expr(0);
			setState(97);
			match(COMMA);
			setState(98);
			expr(0);
			setState(99);
			match(COMMA);
			setState(100);
			expr(0);
			setState(101);
			match(R_BRACKET);
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

	public static class WidthStatContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(DrawMParser.WIDTH, 0); }
		public TerminalNode IS() { return getToken(DrawMParser.IS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WidthStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitWidthStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthStatContext widthStat() throws RecognitionException {
		WidthStatContext _localctx = new WidthStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_widthStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(WIDTH);
			setState(104);
			match(IS);
			setState(105);
			expr(0);
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

	public static class AssignStatContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DrawMParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatContext assignStat() throws RecognitionException {
		AssignStatContext _localctx = new AssignStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(ID);
			setState(108);
			match(T__0);
			setState(109);
			expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncSinContext extends ExprContext {
		public TerminalNode SIN() { return getToken(DrawMParser.SIN, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawMParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawMParser.R_BRACKET, 0); }
		public FuncSinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitFuncSin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EContext extends ExprContext {
		public TerminalNode E() { return getToken(DrawMParser.E, 0); }
		public EContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(DrawMParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(DrawMParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(DrawMParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(DrawMParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnarySubContext extends ExprContext {
		public TerminalNode SUB() { return getToken(DrawMParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnarySubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitUnarySub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncTanContext extends ExprContext {
		public TerminalNode TAN() { return getToken(DrawMParser.TAN, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawMParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawMParser.R_BRACKET, 0); }
		public FuncTanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitFuncTan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PieContext extends ExprContext {
		public TerminalNode PI() { return getToken(DrawMParser.PI, 0); }
		public PieContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitPie(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncExpContext extends ExprContext {
		public TerminalNode EXP() { return getToken(DrawMParser.EXP, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawMParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawMParser.R_BRACKET, 0); }
		public FuncExpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitFuncExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncLnContext extends ExprContext {
		public TerminalNode LN() { return getToken(DrawMParser.LN, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawMParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawMParser.R_BRACKET, 0); }
		public FuncLnContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitFuncLn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TContext extends ExprContext {
		public TerminalNode T() { return getToken(DrawMParser.T, 0); }
		public TContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(DrawMParser.NUMBER, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCosContext extends ExprContext {
		public TerminalNode COS() { return getToken(DrawMParser.COS, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawMParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawMParser.R_BRACKET, 0); }
		public FuncCosContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitFuncCos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(DrawMParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncSqrtContext extends ExprContext {
		public TerminalNode SQRT() { return getToken(DrawMParser.SQRT, 0); }
		public TerminalNode L_BRACKET() { return getToken(DrawMParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawMParser.R_BRACKET, 0); }
		public FuncSqrtContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitFuncSqrt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POWER() { return getToken(DrawMParser.POWER, 0); }
		public PowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends ExprContext {
		public TerminalNode L_BRACKET() { return getToken(DrawMParser.L_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(DrawMParser.R_BRACKET, 0); }
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DrawMVisitor ) return ((DrawMVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
				{
				_localctx = new UnarySubContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(112);
				match(SUB);
				setState(113);
				expr(16);
				}
				break;
			case T:
				{
				_localctx = new TContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(T);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(NUMBER);
				}
				break;
			case PI:
				{
				_localctx = new PieContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(PI);
				}
				break;
			case E:
				{
				_localctx = new EContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(E);
				}
				break;
			case L_BRACKET:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(L_BRACKET);
				setState(119);
				expr(0);
				setState(120);
				match(R_BRACKET);
				}
				break;
			case COS:
				{
				_localctx = new FuncCosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(COS);
				setState(123);
				match(L_BRACKET);
				setState(124);
				expr(0);
				setState(125);
				match(R_BRACKET);
				}
				break;
			case SIN:
				{
				_localctx = new FuncSinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(SIN);
				setState(128);
				match(L_BRACKET);
				setState(129);
				expr(0);
				setState(130);
				match(R_BRACKET);
				}
				break;
			case TAN:
				{
				_localctx = new FuncTanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(TAN);
				setState(133);
				match(L_BRACKET);
				setState(134);
				expr(0);
				setState(135);
				match(R_BRACKET);
				}
				break;
			case EXP:
				{
				_localctx = new FuncExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(EXP);
				setState(138);
				match(L_BRACKET);
				setState(139);
				expr(0);
				setState(140);
				match(R_BRACKET);
				}
				break;
			case LN:
				{
				_localctx = new FuncLnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(LN);
				setState(143);
				match(L_BRACKET);
				setState(144);
				expr(0);
				setState(145);
				match(R_BRACKET);
				}
				break;
			case SQRT:
				{
				_localctx = new FuncSqrtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(SQRT);
				setState(148);
				match(L_BRACKET);
				setState(149);
				expr(0);
				setState(150);
				match(R_BRACKET);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(156);
						match(POWER);
						setState(157);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(159);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						expr(15);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(162);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						expr(14);
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00ac\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\7\2 \n\2\f\2\16\2#\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u009c\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a7\n\f\f\f\16"+
		"\f\u00aa\13\f\3\f\2\3\26\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\22\23\3"+
		"\2\25\26\2\u00b9\2!\3\2\2\2\4\61\3\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nK\3\2"+
		"\2\2\fS\3\2\2\2\16[\3\2\2\2\20_\3\2\2\2\22i\3\2\2\2\24m\3\2\2\2\26\u009b"+
		"\3\2\2\2\30\34\5\4\3\2\31\33\7$\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32"+
		"\3\2\2\2\34\35\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\37\30\3\2\2\2 #\3\2\2"+
		"\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\2\2\3%\3\3\2\2\2&\'"+
		"\5\6\4\2\'(\7\17\2\2(\62\3\2\2\2)*\5\6\4\2*+\b\3\1\2+\62\3\2\2\2,-\5\6"+
		"\4\2-.\7\17\2\2./\7\17\2\2/\60\b\3\1\2\60\62\3\2\2\2\61&\3\2\2\2\61)\3"+
		"\2\2\2\61,\3\2\2\2\62\5\3\2\2\2\63;\5\b\5\2\64;\5\n\6\2\65;\5\22\n\2\66"+
		";\5\f\7\2\67;\5\16\b\28;\5\20\t\29;\5\24\13\2:\63\3\2\2\2:\64\3\2\2\2"+
		":\65\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\7\3\2\2\2<="+
		"\7\b\2\2=>\7\t\2\2>?\7\n\2\2?@\5\26\f\2@A\7\13\2\2AB\5\26\f\2BC\7\5\2"+
		"\2CD\5\26\f\2DE\7\6\2\2EF\7\37\2\2FG\5\26\f\2GH\7\r\2\2HI\5\26\f\2IJ\7"+
		" \2\2J\t\3\2\2\2KL\7\4\2\2LM\7\16\2\2MN\7\37\2\2NO\5\26\f\2OP\7\r\2\2"+
		"PQ\5\26\f\2QR\7 \2\2R\13\3\2\2\2ST\7\7\2\2TU\7\16\2\2UV\7\37\2\2VW\5\26"+
		"\f\2WX\7\r\2\2XY\5\26\f\2YZ\7 \2\2Z\r\3\2\2\2[\\\7\f\2\2\\]\7\16\2\2]"+
		"^\5\26\f\2^\17\3\2\2\2_`\7\21\2\2`a\7\16\2\2ab\7\37\2\2bc\5\26\f\2cd\7"+
		"\r\2\2de\5\26\f\2ef\7\r\2\2fg\5\26\f\2gh\7 \2\2h\21\3\2\2\2ij\7\20\2\2"+
		"jk\7\16\2\2kl\5\26\f\2l\23\3\2\2\2mn\7\"\2\2no\7\3\2\2op\5\26\f\2p\25"+
		"\3\2\2\2qr\b\f\1\2rs\7\26\2\2s\u009c\5\26\f\22t\u009c\7\t\2\2u\u009c\7"+
		"!\2\2v\u009c\7\27\2\2w\u009c\7\30\2\2xy\7\37\2\2yz\5\26\f\2z{\7 \2\2{"+
		"\u009c\3\2\2\2|}\7\32\2\2}~\7\37\2\2~\177\5\26\f\2\177\u0080\7 \2\2\u0080"+
		"\u009c\3\2\2\2\u0081\u0082\7\31\2\2\u0082\u0083\7\37\2\2\u0083\u0084\5"+
		"\26\f\2\u0084\u0085\7 \2\2\u0085\u009c\3\2\2\2\u0086\u0087\7\33\2\2\u0087"+
		"\u0088\7\37\2\2\u0088\u0089\5\26\f\2\u0089\u008a\7 \2\2\u008a\u009c\3"+
		"\2\2\2\u008b\u008c\7\34\2\2\u008c\u008d\7\37\2\2\u008d\u008e\5\26\f\2"+
		"\u008e\u008f\7 \2\2\u008f\u009c\3\2\2\2\u0090\u0091\7\35\2\2\u0091\u0092"+
		"\7\37\2\2\u0092\u0093\5\26\f\2\u0093\u0094\7 \2\2\u0094\u009c\3\2\2\2"+
		"\u0095\u0096\7\36\2\2\u0096\u0097\7\37\2\2\u0097\u0098\5\26\f\2\u0098"+
		"\u0099\7 \2\2\u0099\u009c\3\2\2\2\u009a\u009c\7\"\2\2\u009bq\3\2\2\2\u009b"+
		"t\3\2\2\2\u009bu\3\2\2\2\u009bv\3\2\2\2\u009bw\3\2\2\2\u009bx\3\2\2\2"+
		"\u009b|\3\2\2\2\u009b\u0081\3\2\2\2\u009b\u0086\3\2\2\2\u009b\u008b\3"+
		"\2\2\2\u009b\u0090\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u00a8\3\2\2\2\u009d\u009e\f\21\2\2\u009e\u009f\7\24\2\2\u009f\u00a7\5"+
		"\26\f\21\u00a0\u00a1\f\20\2\2\u00a1\u00a2\t\2\2\2\u00a2\u00a7\5\26\f\21"+
		"\u00a3\u00a4\f\17\2\2\u00a4\u00a5\t\3\2\2\u00a5\u00a7\5\26\f\20\u00a6"+
		"\u009d\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\27\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\t\34!\61:\u009b\u00a6\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
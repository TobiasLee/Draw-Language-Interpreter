// Generated from Draw.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DrawLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ORIGIN=1, STEP=2, DRAW=3, SCALE=4, FOR=5, T=6, FROM=7, TO=8, ROT=9, COMMA=10, 
		IS=11, SEMICO=12, WIDTH=13, COLOR=14, MUL=15, DIV=16, POWER=17, ADD=18, 
		SUB=19, PI=20, COS=21, E=22, SIN=23, TAN=24, EXP=25, LN=26, SQRT=27, L_BRACKET=28, 
		R_BRACKET=29, NUMBER=30, CONST_ID=31, NEWLINE=32, WS=33, COMMENT=34, LINE_COMMENT=35, 
		INT=36, FLOAT=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ORIGIN", "STEP", "DRAW", "SCALE", "FOR", "T", "FROM", "TO", "ROT", "COMMA", 
			"IS", "SEMICO", "WIDTH", "COLOR", "MUL", "DIV", "POWER", "ADD", "SUB", 
			"PI", "COS", "E", "SIN", "TAN", "EXP", "LN", "SQRT", "L_BRACKET", "R_BRACKET", 
			"NUMBER", "CONST_ID", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT", "DIGIT", 
			"INT", "FLOAT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'origin'", "'step'", "'draw'", "'scale'", "'for'", "'t'", "'from'", 
			"'to'", "'rot'", "','", "'is'", "';'", "'width'", "'color'", "'*'", "'/'", 
			"'^'", "'+'", "'-'", "'pi'", "'cos'", "'e'", "'sin'", "'tan'", "'exp'", 
			"'ln'", "'sqrt'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ORIGIN", "STEP", "DRAW", "SCALE", "FOR", "T", "FROM", "TO", "ROT", 
			"COMMA", "IS", "SEMICO", "WIDTH", "COLOR", "MUL", "DIV", "POWER", "ADD", 
			"SUB", "PI", "COS", "E", "SIN", "TAN", "EXP", "LN", "SQRT", "L_BRACKET", 
			"R_BRACKET", "NUMBER", "CONST_ID", "NEWLINE", "WS", "COMMENT", "LINE_COMMENT", 
			"INT", "FLOAT"
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


	public DrawLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Draw.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\37\3\37\5\37\u00b9\n\37\3 \6 \u00bc\n \r \16"+
		" \u00bd\3!\5!\u00c1\n!\3!\3!\3\"\6\"\u00c6\n\"\r\"\16\"\u00c7\3\"\3\""+
		"\3#\3#\3#\3#\7#\u00d0\n#\f#\16#\u00d3\13#\3#\3#\3#\3#\3#\3$\3$\3$\3$\7"+
		"$\u00de\n$\f$\16$\u00e1\13$\3$\3$\3%\3%\3&\6&\u00e8\n&\r&\16&\u00e9\3"+
		"\'\6\'\u00ed\n\'\r\'\16\'\u00ee\3\'\3\'\7\'\u00f3\n\'\f\'\16\'\u00f6\13"+
		"\'\3\'\3\'\6\'\u00fa\n\'\r\'\16\'\u00fb\5\'\u00fe\n\'\3\u00d1\2(\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I\2K&M\'\3\2\5\3\2\62;\4\2\13\13\"\"\4\2\f\f\17\17\2\u0108\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5V\3\2\2\2\7[\3\2\2\2\t`\3\2\2\2\13"+
		"f\3\2\2\2\rj\3\2\2\2\17l\3\2\2\2\21q\3\2\2\2\23t\3\2\2\2\25x\3\2\2\2\27"+
		"z\3\2\2\2\31}\3\2\2\2\33\177\3\2\2\2\35\u0085\3\2\2\2\37\u008b\3\2\2\2"+
		"!\u008d\3\2\2\2#\u008f\3\2\2\2%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0095\3"+
		"\2\2\2+\u0098\3\2\2\2-\u009c\3\2\2\2/\u009e\3\2\2\2\61\u00a2\3\2\2\2\63"+
		"\u00a6\3\2\2\2\65\u00aa\3\2\2\2\67\u00ad\3\2\2\29\u00b2\3\2\2\2;\u00b4"+
		"\3\2\2\2=\u00b8\3\2\2\2?\u00bb\3\2\2\2A\u00c0\3\2\2\2C\u00c5\3\2\2\2E"+
		"\u00cb\3\2\2\2G\u00d9\3\2\2\2I\u00e4\3\2\2\2K\u00e7\3\2\2\2M\u00fd\3\2"+
		"\2\2OP\7q\2\2PQ\7t\2\2QR\7k\2\2RS\7i\2\2ST\7k\2\2TU\7p\2\2U\4\3\2\2\2"+
		"VW\7u\2\2WX\7v\2\2XY\7g\2\2YZ\7r\2\2Z\6\3\2\2\2[\\\7f\2\2\\]\7t\2\2]^"+
		"\7c\2\2^_\7y\2\2_\b\3\2\2\2`a\7u\2\2ab\7e\2\2bc\7c\2\2cd\7n\2\2de\7g\2"+
		"\2e\n\3\2\2\2fg\7h\2\2gh\7q\2\2hi\7t\2\2i\f\3\2\2\2jk\7v\2\2k\16\3\2\2"+
		"\2lm\7h\2\2mn\7t\2\2no\7q\2\2op\7o\2\2p\20\3\2\2\2qr\7v\2\2rs\7q\2\2s"+
		"\22\3\2\2\2tu\7t\2\2uv\7q\2\2vw\7v\2\2w\24\3\2\2\2xy\7.\2\2y\26\3\2\2"+
		"\2z{\7k\2\2{|\7u\2\2|\30\3\2\2\2}~\7=\2\2~\32\3\2\2\2\177\u0080\7y\2\2"+
		"\u0080\u0081\7k\2\2\u0081\u0082\7f\2\2\u0082\u0083\7v\2\2\u0083\u0084"+
		"\7j\2\2\u0084\34\3\2\2\2\u0085\u0086\7e\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7n\2\2\u0088\u0089\7q\2\2\u0089\u008a\7t\2\2\u008a\36\3\2\2\2\u008b\u008c"+
		"\7,\2\2\u008c \3\2\2\2\u008d\u008e\7\61\2\2\u008e\"\3\2\2\2\u008f\u0090"+
		"\7`\2\2\u0090$\3\2\2\2\u0091\u0092\7-\2\2\u0092&\3\2\2\2\u0093\u0094\7"+
		"/\2\2\u0094(\3\2\2\2\u0095\u0096\7r\2\2\u0096\u0097\7k\2\2\u0097*\3\2"+
		"\2\2\u0098\u0099\7e\2\2\u0099\u009a\7q\2\2\u009a\u009b\7u\2\2\u009b,\3"+
		"\2\2\2\u009c\u009d\7g\2\2\u009d.\3\2\2\2\u009e\u009f\7u\2\2\u009f\u00a0"+
		"\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4"+
		"\7c\2\2\u00a4\u00a5\7p\2\2\u00a5\62\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8"+
		"\7z\2\2\u00a8\u00a9\7r\2\2\u00a9\64\3\2\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac"+
		"\7p\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7s\2\2\u00af\u00b0"+
		"\7t\2\2\u00b0\u00b1\7v\2\2\u00b18\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3:\3"+
		"\2\2\2\u00b4\u00b5\7+\2\2\u00b5<\3\2\2\2\u00b6\u00b9\5M\'\2\u00b7\u00b9"+
		"\5K&\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9>\3\2\2\2\u00ba\u00bc"+
		"\t\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be@\3\2\2\2\u00bf\u00c1\7\17\2\2\u00c0\u00bf\3\2\2\2"+
		"\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7\f\2\2\u00c3B\3"+
		"\2\2\2\u00c4\u00c6\t\3\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\""+
		"\2\2\u00caD\3\2\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00cd\7,\2\2\u00cd\u00d1"+
		"\3\2\2\2\u00ce\u00d0\13\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d5\7,\2\2\u00d5\u00d6\7\61\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\b#\2\2\u00d8F\3\2\2\2\u00d9\u00da\7\61\2\2\u00da\u00db\7\61\2\2"+
		"\u00db\u00df\3\2\2\2\u00dc\u00de\n\4\2\2\u00dd\u00dc\3\2\2\2\u00de\u00e1"+
		"\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e2\u00e3\b$\2\2\u00e3H\3\2\2\2\u00e4\u00e5\t\2\2\2\u00e5"+
		"J\3\2\2\2\u00e6\u00e8\4\62;\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2"+
		"\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00eaL\3\2\2\2\u00eb\u00ed\5"+
		"I%\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f4\7\60\2\2\u00f1\u00f3\5"+
		"I%\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00fe\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\7\60"+
		"\2\2\u00f8\u00fa\5I%\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ec\3\2\2\2\u00fd"+
		"\u00f7\3\2\2\2\u00feN\3\2\2\2\16\2\u00b8\u00bd\u00c0\u00c7\u00d1\u00df"+
		"\u00e9\u00ee\u00f4\u00fb\u00fd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
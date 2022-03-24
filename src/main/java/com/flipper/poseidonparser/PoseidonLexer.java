// Generated from C:/Users/dev/Desktop/Projects/Java/PoseidonParser/src/main/antlr\Poseidon.g4 by ANTLR 4.9.2
package com.flipper.poseidonparser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PoseidonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, DELIMITED_COMMENT=4, SINGLE_LINE_COMMENT=5, OPEN_CURLY=6, 
		CLOSE_CURLY=7, SEMICOLON=8, CLOSEBLOCK=9, LITERAL_STRING=10, ARRAY=11, 
		CLASSNAME=12, O_PATCHES=13, O_MODS=14, O_DEFS=15, O_IMAGESETS=16, O_WIDGETSTYLES=17, 
		MODULE_ENGINE=18, MODULE_GAMELIB=19, MODULE_GAME=20, MODULE_WORLD=21, 
		MODULE_MISSION=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WS", "DELIMITED_COMMENT", "SINGLE_LINE_COMMENT", "OPEN_CURLY", 
			"CLOSE_CURLY", "SEMICOLON", "CLOSEBLOCK", "LITERAL_STRING", "ARRAY", 
			"CLASSNAME", "O_PATCHES", "O_MODS", "O_DEFS", "O_IMAGESETS", "O_WIDGETSTYLES", 
			"MODULE_ENGINE", "MODULE_GAMELIB", "MODULE_GAME", "MODULE_WORLD", "MODULE_MISSION", 
			"VARIABLENAME", "LETTERS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'='", null, null, null, "'{'", "'}'", "';'", "'};'", 
			null, null, null, "'CfgPatches'", "'CfgMods'", "'defs'", "'imageSets'", 
			"'widgetStyles'", "'engineScriptModule'", "'gameLibScriptModule'", "'gameScriptModule'", 
			"'worldScriptModule'", "'missionScriptModule'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "DELIMITED_COMMENT", "SINGLE_LINE_COMMENT", "OPEN_CURLY", 
			"CLOSE_CURLY", "SEMICOLON", "CLOSEBLOCK", "LITERAL_STRING", "ARRAY", 
			"CLASSNAME", "O_PATCHES", "O_MODS", "O_DEFS", "O_IMAGESETS", "O_WIDGETSTYLES", 
			"MODULE_ENGINE", "MODULE_GAMELIB", "MODULE_GAME", "MODULE_WORLD", "MODULE_MISSION"
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


	public PoseidonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Poseidon.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u011c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\7\5D\n\5\f\5\16\5G\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6R\n\6"+
		"\f\6\16\6U\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\7\13d\n\13\f\13\16\13g\13\13\3\13\3\13\3\f\3\f\3\f\3\f\7\fo\n\f\f\f\16"+
		"\fr\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0082"+
		"\n\r\r\r\16\r\u0083\5\r\u0086\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\6\30\u0117\n\30\r\30"+
		"\16\30\u0118\3\31\3\31\4Ee\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2"+
		"\61\2\3\2\6\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2]]__\5\2\63;C\\c|\2\u012a"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3\63\3\2"+
		"\2\2\59\3\2\2\2\7;\3\2\2\2\t?\3\2\2\2\13M\3\2\2\2\rX\3\2\2\2\17Z\3\2\2"+
		"\2\21\\\3\2\2\2\23^\3\2\2\2\25a\3\2\2\2\27j\3\2\2\2\31\u0085\3\2\2\2\33"+
		"\u0087\3\2\2\2\35\u0092\3\2\2\2\37\u009a\3\2\2\2!\u009f\3\2\2\2#\u00a9"+
		"\3\2\2\2%\u00b6\3\2\2\2\'\u00c9\3\2\2\2)\u00dd\3\2\2\2+\u00ee\3\2\2\2"+
		"-\u0100\3\2\2\2/\u0116\3\2\2\2\61\u011a\3\2\2\2\63\64\7e\2\2\64\65\7n"+
		"\2\2\65\66\7c\2\2\66\67\7u\2\2\678\7u\2\28\4\3\2\2\29:\7?\2\2:\6\3\2\2"+
		"\2;<\t\2\2\2<=\3\2\2\2=>\b\4\2\2>\b\3\2\2\2?@\7\61\2\2@A\7,\2\2AE\3\2"+
		"\2\2BD\13\2\2\2CB\3\2\2\2DG\3\2\2\2EF\3\2\2\2EC\3\2\2\2FH\3\2\2\2GE\3"+
		"\2\2\2HI\7,\2\2IJ\7\61\2\2JK\3\2\2\2KL\b\5\3\2L\n\3\2\2\2MN\7\61\2\2N"+
		"O\7\61\2\2OS\3\2\2\2PR\n\3\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TV\3\2\2\2US\3\2\2\2VW\b\6\3\2W\f\3\2\2\2XY\7}\2\2Y\16\3\2\2\2Z[\7\177"+
		"\2\2[\20\3\2\2\2\\]\7=\2\2]\22\3\2\2\2^_\7\177\2\2_`\7=\2\2`\24\3\2\2"+
		"\2ae\7$\2\2bd\13\2\2\2cb\3\2\2\2dg\3\2\2\2ef\3\2\2\2ec\3\2\2\2fh\3\2\2"+
		"\2ge\3\2\2\2hi\7$\2\2i\26\3\2\2\2jk\7}\2\2kp\5\25\13\2lm\7.\2\2mo\5\25"+
		"\13\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7"+
		"\177\2\2tu\5\21\t\2u\30\3\2\2\2v\u0086\5\33\16\2w\u0086\5\35\17\2x\u0086"+
		"\5\37\20\2y\u0086\5!\21\2z\u0086\5#\22\2{\u0086\5%\23\2|\u0086\5\'\24"+
		"\2}\u0086\5)\25\2~\u0086\5+\26\2\177\u0086\5-\27\2\u0080\u0082\5\61\31"+
		"\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0086\3\2\2\2\u0085v\3\2\2\2\u0085w\3\2\2\2\u0085x\3\2"+
		"\2\2\u0085y\3\2\2\2\u0085z\3\2\2\2\u0085{\3\2\2\2\u0085|\3\2\2\2\u0085"+
		"}\3\2\2\2\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0081\3\2\2\2\u0086\32"+
		"\3\2\2\2\u0087\u0088\7E\2\2\u0088\u0089\7h\2\2\u0089\u008a\7i\2\2\u008a"+
		"\u008b\7R\2\2\u008b\u008c\7c\2\2\u008c\u008d\7v\2\2\u008d\u008e\7e\2\2"+
		"\u008e\u008f\7j\2\2\u008f\u0090\7g\2\2\u0090\u0091\7u\2\2\u0091\34\3\2"+
		"\2\2\u0092\u0093\7E\2\2\u0093\u0094\7h\2\2\u0094\u0095\7i\2\2\u0095\u0096"+
		"\7O\2\2\u0096\u0097\7q\2\2\u0097\u0098\7f\2\2\u0098\u0099\7u\2\2\u0099"+
		"\36\3\2\2\2\u009a\u009b\7f\2\2\u009b\u009c\7g\2\2\u009c\u009d\7h\2\2\u009d"+
		"\u009e\7u\2\2\u009e \3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7o\2\2\u00a1"+
		"\u00a2\7c\2\2\u00a2\u00a3\7i\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7U\2\2"+
		"\u00a5\u00a6\7g\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7u\2\2\u00a8\"\3\2"+
		"\2\2\u00a9\u00aa\7y\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad"+
		"\7i\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7U\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\u00b2\7{\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7g\2\2"+
		"\u00b4\u00b5\7u\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7p\2"+
		"\2\u00b8\u00b9\7i\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc"+
		"\7g\2\2\u00bc\u00bd\7U\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7k\2\2\u00c0\u00c1\7r\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7O\2\2"+
		"\u00c3\u00c4\7q\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6\7w\2\2\u00c6\u00c7"+
		"\7n\2\2\u00c7\u00c8\7g\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7i\2\2\u00ca\u00cb"+
		"\7c\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7N\2\2\u00ce"+
		"\u00cf\7k\2\2\u00cf\u00d0\7d\2\2\u00d0\u00d1\7U\2\2\u00d1\u00d2\7e\2\2"+
		"\u00d2\u00d3\7t\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6"+
		"\7v\2\2\u00d6\u00d7\7O\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7f\2\2\u00d9"+
		"\u00da\7w\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7g\2\2\u00dc(\3\2\2\2\u00dd"+
		"\u00de\7i\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7o\2\2\u00e0\u00e1\7g\2\2"+
		"\u00e1\u00e2\7U\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5"+
		"\7k\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7O\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7n\2\2"+
		"\u00ec\u00ed\7g\2\2\u00ed*\3\2\2\2\u00ee\u00ef\7y\2\2\u00ef\u00f0\7q\2"+
		"\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7f\2\2\u00f3\u00f4"+
		"\7U\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7k\2\2\u00f7"+
		"\u00f8\7r\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7O\2\2\u00fa\u00fb\7q\2\2"+
		"\u00fb\u00fc\7f\2\2\u00fc\u00fd\7w\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff"+
		"\7g\2\2\u00ff,\3\2\2\2\u0100\u0101\7o\2\2\u0101\u0102\7k\2\2\u0102\u0103"+
		"\7u\2\2\u0103\u0104\7u\2\2\u0104\u0105\7k\2\2\u0105\u0106\7q\2\2\u0106"+
		"\u0107\7p\2\2\u0107\u0108\7U\2\2\u0108\u0109\7e\2\2\u0109\u010a\7t\2\2"+
		"\u010a\u010b\7k\2\2\u010b\u010c\7r\2\2\u010c\u010d\7v\2\2\u010d\u010e"+
		"\7O\2\2\u010e\u010f\7q\2\2\u010f\u0110\7f\2\2\u0110\u0111\7w\2\2\u0111"+
		"\u0112\7n\2\2\u0112\u0113\7g\2\2\u0113.\3\2\2\2\u0114\u0117\5\61\31\2"+
		"\u0115\u0117\t\4\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\60\3\2\2\2\u011a"+
		"\u011b\t\5\2\2\u011b\62\3\2\2\2\13\2ESep\u0083\u0085\u0116\u0118\4\2\3"+
		"\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
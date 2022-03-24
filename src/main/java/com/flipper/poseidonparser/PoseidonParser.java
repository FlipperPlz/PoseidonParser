// Generated from C:/Users/dev/Desktop/Projects/Java/PoseidonParser/src/main/antlr\Poseidon.g4 by ANTLR 4.9.2
package com.flipper.poseidonparser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PoseidonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, DELIMITED_COMMENT=4, SINGLE_LINE_COMMENT=5, OPEN_CURLY=6, 
		CLOSE_CURLY=7, SEMICOLON=8, CLOSEBLOCK=9, LITERAL_STRING=10, ARRAY=11, 
		CLASSNAME=12, O_PATCHES=13, O_MODS=14, O_DEFS=15, O_IMAGESETS=16, O_WIDGETSTYLES=17, 
		MODULE_ENGINE=18, MODULE_GAMELIB=19, MODULE_GAME=20, MODULE_WORLD=21, 
		MODULE_MISSION=22, VARIABLENAME=23;
	public static final int
		RULE_poseidonConfig = 0, RULE_classDefinitions = 1, RULE_classBlock = 2, 
		RULE_variableDeclaration = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"poseidonConfig", "classDefinitions", "classBlock", "variableDeclaration"
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
			"MODULE_ENGINE", "MODULE_GAMELIB", "MODULE_GAME", "MODULE_WORLD", "MODULE_MISSION", 
			"VARIABLENAME"
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
	public String getGrammarFileName() { return "Poseidon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PoseidonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PoseidonConfigContext extends ParserRuleContext {
		public List<ClassDefinitionsContext> classDefinitions() {
			return getRuleContexts(ClassDefinitionsContext.class);
		}
		public ClassDefinitionsContext classDefinitions(int i) {
			return getRuleContext(ClassDefinitionsContext.class,i);
		}
		public TerminalNode EOF() { return getToken(PoseidonParser.EOF, 0); }
		public PoseidonConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poseidonConfig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoseidonListener ) ((PoseidonListener)listener).enterPoseidonConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoseidonListener ) ((PoseidonListener)listener).exitPoseidonConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PoseidonVisitor ) return ((PoseidonVisitor<? extends T>)visitor).visitPoseidonConfig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PoseidonConfigContext poseidonConfig() throws RecognitionException {
		PoseidonConfigContext _localctx = new PoseidonConfigContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_poseidonConfig);
		int _la;
		try {
			setState(15);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(8);
					classDefinitions();
					}
					}
					setState(13);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				match(EOF);
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

	public static class ClassDefinitionsContext extends ParserRuleContext {
		public TerminalNode CLASSNAME() { return getToken(PoseidonParser.CLASSNAME, 0); }
		public ClassBlockContext classBlock() {
			return getRuleContext(ClassBlockContext.class,0);
		}
		public ClassDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoseidonListener ) ((PoseidonListener)listener).enterClassDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoseidonListener ) ((PoseidonListener)listener).exitClassDefinitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PoseidonVisitor ) return ((PoseidonVisitor<? extends T>)visitor).visitClassDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionsContext classDefinitions() throws RecognitionException {
		ClassDefinitionsContext _localctx = new ClassDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDefinitions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(T__0);
			setState(18);
			match(CLASSNAME);
			setState(19);
			classBlock();
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

	public static class ClassBlockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(PoseidonParser.OPEN_CURLY, 0); }
		public List<TerminalNode> CLOSEBLOCK() { return getTokens(PoseidonParser.CLOSEBLOCK); }
		public TerminalNode CLOSEBLOCK(int i) {
			return getToken(PoseidonParser.CLOSEBLOCK, i);
		}
		public TerminalNode SEMICOLON() { return getToken(PoseidonParser.SEMICOLON, 0); }
		public List<ClassBlockContext> classBlock() {
			return getRuleContexts(ClassBlockContext.class);
		}
		public ClassBlockContext classBlock(int i) {
			return getRuleContext(ClassBlockContext.class,i);
		}
		public ClassBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoseidonListener ) ((PoseidonListener)listener).enterClassBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoseidonListener ) ((PoseidonListener)listener).exitClassBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PoseidonVisitor ) return ((PoseidonVisitor<? extends T>)visitor).visitClassBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBlockContext classBlock() throws RecognitionException {
		ClassBlockContext _localctx = new ClassBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(OPEN_CURLY);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << WS) | (1L << DELIMITED_COMMENT) | (1L << SINGLE_LINE_COMMENT) | (1L << OPEN_CURLY) | (1L << CLOSE_CURLY) | (1L << SEMICOLON) | (1L << LITERAL_STRING) | (1L << ARRAY) | (1L << CLASSNAME) | (1L << O_PATCHES) | (1L << O_MODS) | (1L << O_DEFS) | (1L << O_IMAGESETS) | (1L << O_WIDGETSTYLES) | (1L << MODULE_ENGINE) | (1L << MODULE_GAMELIB) | (1L << MODULE_GAME) | (1L << MODULE_WORLD) | (1L << MODULE_MISSION) | (1L << VARIABLENAME))) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(22);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==CLOSEBLOCK) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 2:
					{
					setState(23);
					classBlock();
					}
					break;
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(CLOSEBLOCK);
			setState(30);
			match(SEMICOLON);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode VARIABLENAME() { return getToken(PoseidonParser.VARIABLENAME, 0); }
		public List<TerminalNode> ARRAY() { return getTokens(PoseidonParser.ARRAY); }
		public TerminalNode ARRAY(int i) {
			return getToken(PoseidonParser.ARRAY, i);
		}
		public List<TerminalNode> LITERAL_STRING() { return getTokens(PoseidonParser.LITERAL_STRING); }
		public TerminalNode LITERAL_STRING(int i) {
			return getToken(PoseidonParser.LITERAL_STRING, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PoseidonListener ) ((PoseidonListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PoseidonListener ) ((PoseidonListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PoseidonVisitor ) return ((PoseidonVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(VARIABLENAME);
			setState(33);
			match(T__1);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LITERAL_STRING || _la==ARRAY) {
				{
				{
				setState(34);
				_la = _input.LA(1);
				if ( !(_la==LITERAL_STRING || _la==ARRAY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(39);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\5\2\22\n\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\7\4\33\n\4\f\4\16\4\36\13\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\7\5&\n\5\f\5\16\5)\13\5\3\5\2\2\6\2\4\6\b\2\4\3\2\13\13\3\2\f\r\2"+
		"+\2\21\3\2\2\2\4\23\3\2\2\2\6\27\3\2\2\2\b\"\3\2\2\2\n\f\5\4\3\2\13\n"+
		"\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\22\3\2\2\2\17\r\3\2"+
		"\2\2\20\22\7\2\2\3\21\r\3\2\2\2\21\20\3\2\2\2\22\3\3\2\2\2\23\24\7\3\2"+
		"\2\24\25\7\16\2\2\25\26\5\6\4\2\26\5\3\2\2\2\27\34\7\b\2\2\30\33\n\2\2"+
		"\2\31\33\5\6\4\2\32\30\3\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2"+
		"\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\13\2\2 !\7\n\2\2!\7"+
		"\3\2\2\2\"#\7\31\2\2#\'\7\4\2\2$&\t\3\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2"+
		"\2\'(\3\2\2\2(\t\3\2\2\2)\'\3\2\2\2\7\r\21\32\34\'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
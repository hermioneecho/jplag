// Generated from Solidity.g4 by ANTLR 4.4
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SolidityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__89=1, T__88=2, T__87=3, T__86=4, T__85=5, T__84=6, T__83=7, T__82=8, 
		T__81=9, T__80=10, T__79=11, T__78=12, T__77=13, T__76=14, T__75=15, T__74=16, 
		T__73=17, T__72=18, T__71=19, T__70=20, T__69=21, T__68=22, T__67=23, 
		T__66=24, T__65=25, T__64=26, T__63=27, T__62=28, T__61=29, T__60=30, 
		T__59=31, T__58=32, T__57=33, T__56=34, T__55=35, T__54=36, T__53=37, 
		T__52=38, T__51=39, T__50=40, T__49=41, T__48=42, T__47=43, T__46=44, 
		T__45=45, T__44=46, T__43=47, T__42=48, T__41=49, T__40=50, T__39=51, 
		T__38=52, T__37=53, T__36=54, T__35=55, T__34=56, T__33=57, T__32=58, 
		T__31=59, T__30=60, T__29=61, T__28=62, T__27=63, T__26=64, T__25=65, 
		T__24=66, T__23=67, T__22=68, T__21=69, T__20=70, T__19=71, T__18=72, 
		T__17=73, T__16=74, T__15=75, T__14=76, T__13=77, T__12=78, T__11=79, 
		T__10=80, T__9=81, T__8=82, T__7=83, T__6=84, T__5=85, T__4=86, T__3=87, 
		T__2=88, T__1=89, T__0=90, Int=91, Uint=92, Byte=93, Fixed=94, Ufixed=95, 
		VersionLiteral=96, BooleanLiteral=97, DecimalNumber=98, HexNumber=99, 
		NumberUnit=100, HexLiteral=101, ReservedKeyword=102, AnonymousKeyword=103, 
		BreakKeyword=104, ConstantKeyword=105, ContinueKeyword=106, ExternalKeyword=107, 
		IndexedKeyword=108, InternalKeyword=109, PayableKeyword=110, PrivateKeyword=111, 
		PublicKeyword=112, PureKeyword=113, ViewKeyword=114, Identifier=115, StringLiteral=116, 
		WS=117, COMMENT=118, LINE_COMMENT=119;
	public static final String[] tokenNames = {
		"<INVALID>", "'default'", "'+='", "'%='", "'library'", "'interface'", 
		"'new'", "'storage'", "'!='", "'while'", "'{'", "'pragma'", "'^='", "'&&'", 
		"'>>'", "'**'", "'byte'", "'='", "'<<='", "'for'", "'^'", "'delete'", 
		"'|='", "'constructor'", "'do'", "'('", "'-='", "','", "'/='", "'after'", 
		"'memory'", "'var'", "'>='", "'++'", "'<'", "']'", "'~'", "'calldata'", 
		"'let'", "'returns'", "'function'", "'+'", "'mapping'", "'struct'", "'*='", 
		"'/'", "'as'", "'&='", "'return'", "'using'", "'>>='", "'||'", "';'", 
		"'<<'", "'=:'", "'}'", "'if'", "':='", "'?'", "'enum'", "'event'", "'<='", 
		"'from'", "'&'", "'switch'", "'is'", "'*'", "'emit'", "'.'", "'->'", "'case'", 
		"'throw'", "':'", "'['", "'contract'", "'=='", "'|'", "'--'", "'address'", 
		"'bool'", "'>'", "'!'", "'=>'", "'string'", "'%'", "'modifier'", "'else'", 
		"')'", "'assembly'", "'-'", "'import'", "Int", "Uint", "Byte", "Fixed", 
		"Ufixed", "VersionLiteral", "BooleanLiteral", "DecimalNumber", "HexNumber", 
		"NumberUnit", "HexLiteral", "ReservedKeyword", "'anonymous'", "'break'", 
		"'constant'", "'continue'", "'external'", "'indexed'", "'internal'", "'payable'", 
		"'private'", "'public'", "'pure'", "'view'", "Identifier", "StringLiteral", 
		"WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_sourceUnit = 0, RULE_pragmaDirective = 1, RULE_pragmaName = 2, RULE_pragmaValue = 3, 
		RULE_version = 4, RULE_versionOperator = 5, RULE_versionConstraint = 6, 
		RULE_importDeclaration = 7, RULE_importDirective = 8, RULE_contractDefinition = 9, 
		RULE_inheritanceSpecifier = 10, RULE_contractPart = 11, RULE_stateVariableDeclaration = 12, 
		RULE_usingForDeclaration = 13, RULE_structDefinition = 14, RULE_constructorDefinition = 15, 
		RULE_modifierDefinition = 16, RULE_modifierInvocation = 17, RULE_functionDefinition = 18, 
		RULE_returnParameters = 19, RULE_modifierList = 20, RULE_eventDefinition = 21, 
		RULE_enumValue = 22, RULE_enumDefinition = 23, RULE_parameterList = 24, 
		RULE_parameter = 25, RULE_eventParameterList = 26, RULE_eventParameter = 27, 
		RULE_functionTypeParameterList = 28, RULE_functionTypeParameter = 29, 
		RULE_variableDeclaration = 30, RULE_typeName = 31, RULE_userDefinedTypeName = 32, 
		RULE_mapping = 33, RULE_functionTypeName = 34, RULE_storageLocation = 35, 
		RULE_stateMutability = 36, RULE_block = 37, RULE_statement = 38, RULE_expressionStatement = 39, 
		RULE_ifStatement = 40, RULE_whileStatement = 41, RULE_simpleStatement = 42, 
		RULE_forStatement = 43, RULE_inlineAssemblyStatement = 44, RULE_doWhileStatement = 45, 
		RULE_continueStatement = 46, RULE_breakStatement = 47, RULE_returnStatement = 48, 
		RULE_throwStatement = 49, RULE_emitStatement = 50, RULE_variableDeclarationStatement = 51, 
		RULE_variableDeclarationList = 52, RULE_identifierList = 53, RULE_elementaryTypeName = 54, 
		RULE_expression = 55, RULE_primaryExpression = 56, RULE_expressionList = 57, 
		RULE_nameValueList = 58, RULE_nameValue = 59, RULE_functionCallArguments = 60, 
		RULE_functionCall = 61, RULE_assemblyBlock = 62, RULE_assemblyItem = 63, 
		RULE_assemblyExpression = 64, RULE_assemblyCall = 65, RULE_assemblyLocalDefinition = 66, 
		RULE_assemblyAssignment = 67, RULE_assemblyIdentifierOrList = 68, RULE_assemblyIdentifierList = 69, 
		RULE_assemblyStackAssignment = 70, RULE_labelDefinition = 71, RULE_assemblySwitch = 72, 
		RULE_assemblyCase = 73, RULE_assemblyFunctionDefinition = 74, RULE_assemblyFunctionReturns = 75, 
		RULE_assemblyFor = 76, RULE_assemblyIf = 77, RULE_assemblyLiteral = 78, 
		RULE_subAssembly = 79, RULE_tupleExpression = 80, RULE_elementaryTypeNameExpression = 81, 
		RULE_numberLiteral = 82, RULE_identifier = 83;
	public static final String[] ruleNames = {
		"sourceUnit", "pragmaDirective", "pragmaName", "pragmaValue", "version", 
		"versionOperator", "versionConstraint", "importDeclaration", "importDirective", 
		"contractDefinition", "inheritanceSpecifier", "contractPart", "stateVariableDeclaration", 
		"usingForDeclaration", "structDefinition", "constructorDefinition", "modifierDefinition", 
		"modifierInvocation", "functionDefinition", "returnParameters", "modifierList", 
		"eventDefinition", "enumValue", "enumDefinition", "parameterList", "parameter", 
		"eventParameterList", "eventParameter", "functionTypeParameterList", "functionTypeParameter", 
		"variableDeclaration", "typeName", "userDefinedTypeName", "mapping", "functionTypeName", 
		"storageLocation", "stateMutability", "block", "statement", "expressionStatement", 
		"ifStatement", "whileStatement", "simpleStatement", "forStatement", "inlineAssemblyStatement", 
		"doWhileStatement", "continueStatement", "breakStatement", "returnStatement", 
		"throwStatement", "emitStatement", "variableDeclarationStatement", "variableDeclarationList", 
		"identifierList", "elementaryTypeName", "expression", "primaryExpression", 
		"expressionList", "nameValueList", "nameValue", "functionCallArguments", 
		"functionCall", "assemblyBlock", "assemblyItem", "assemblyExpression", 
		"assemblyCall", "assemblyLocalDefinition", "assemblyAssignment", "assemblyIdentifierOrList", 
		"assemblyIdentifierList", "assemblyStackAssignment", "labelDefinition", 
		"assemblySwitch", "assemblyCase", "assemblyFunctionDefinition", "assemblyFunctionReturns", 
		"assemblyFor", "assemblyIf", "assemblyLiteral", "subAssembly", "tupleExpression", 
		"elementaryTypeNameExpression", "numberLiteral", "identifier"
	};

	@Override
	public String getGrammarFileName() { return "Solidity.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolidityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SourceUnitContext extends ParserRuleContext {
		public ContractDefinitionContext contractDefinition(int i) {
			return getRuleContext(ContractDefinitionContext.class,i);
		}
		public TerminalNode EOF() { return getToken(SolidityParser.EOF, 0); }
		public PragmaDirectiveContext pragmaDirective(int i) {
			return getRuleContext(PragmaDirectiveContext.class,i);
		}
		public ImportDirectiveContext importDirective(int i) {
			return getRuleContext(ImportDirectiveContext.class,i);
		}
		public List<ContractDefinitionContext> contractDefinition() {
			return getRuleContexts(ContractDefinitionContext.class);
		}
		public List<ImportDirectiveContext> importDirective() {
			return getRuleContexts(ImportDirectiveContext.class);
		}
		public List<PragmaDirectiveContext> pragmaDirective() {
			return getRuleContexts(PragmaDirectiveContext.class);
		}
		public SourceUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSourceUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSourceUnit(this);
		}
	}

	public final SourceUnitContext sourceUnit() throws RecognitionException {
		SourceUnitContext _localctx = new SourceUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__86) | (1L << T__85) | (1L << T__79))) != 0) || _la==T__16 || _la==T__0) {
				{
				setState(171);
				switch (_input.LA(1)) {
				case T__79:
					{
					setState(168); pragmaDirective();
					}
					break;
				case T__0:
					{
					setState(169); importDirective();
					}
					break;
				case T__86:
				case T__85:
				case T__16:
					{
					setState(170); contractDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176); match(EOF);
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

	public static class PragmaDirectiveContext extends ParserRuleContext {
		public PragmaNameContext pragmaName() {
			return getRuleContext(PragmaNameContext.class,0);
		}
		public PragmaValueContext pragmaValue() {
			return getRuleContext(PragmaValueContext.class,0);
		}
		public PragmaDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaDirective(this);
		}
	}

	public final PragmaDirectiveContext pragmaDirective() throws RecognitionException {
		PragmaDirectiveContext _localctx = new PragmaDirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmaDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(T__79);
			setState(179); pragmaName();
			setState(180); pragmaValue();
			setState(181); match(T__38);
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

	public static class PragmaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PragmaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaName(this);
		}
	}

	public final PragmaNameContext pragmaName() throws RecognitionException {
		PragmaNameContext _localctx = new PragmaNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragmaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); identifier();
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

	public static class PragmaValueContext extends ParserRuleContext {
		public VersionContext version() {
			return getRuleContext(VersionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PragmaValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmaValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPragmaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPragmaValue(this);
		}
	}

	public final PragmaValueContext pragmaValue() throws RecognitionException {
		PragmaValueContext _localctx = new PragmaValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pragmaValue);
		try {
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); version();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186); expression(0);
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

	public static class VersionContext extends ParserRuleContext {
		public List<VersionConstraintContext> versionConstraint() {
			return getRuleContexts(VersionConstraintContext.class);
		}
		public VersionConstraintContext versionConstraint(int i) {
			return getRuleContext(VersionConstraintContext.class,i);
		}
		public VersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersion(this);
		}
	}

	public final VersionContext version() throws RecognitionException {
		VersionContext _localctx = new VersionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_version);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); versionConstraint();
			setState(191);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__73) | (1L << T__70) | (1L << T__58) | (1L << T__56) | (1L << T__54) | (1L << T__29))) != 0) || _la==T__10 || _la==VersionLiteral) {
				{
				setState(190); versionConstraint();
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

	public static class VersionOperatorContext extends ParserRuleContext {
		public VersionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionOperator(this);
		}
	}

	public final VersionOperatorContext versionOperator() throws RecognitionException {
		VersionOperatorContext _localctx = new VersionOperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_versionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__73 - 17)) | (1L << (T__70 - 17)) | (1L << (T__58 - 17)) | (1L << (T__56 - 17)) | (1L << (T__54 - 17)) | (1L << (T__29 - 17)) | (1L << (T__10 - 17)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VersionConstraintContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SolidityParser.VersionLiteral, 0); }
		public VersionOperatorContext versionOperator() {
			return getRuleContext(VersionOperatorContext.class,0);
		}
		public VersionConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVersionConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVersionConstraint(this);
		}
	}

	public final VersionConstraintContext versionConstraint() throws RecognitionException {
		VersionConstraintContext _localctx = new VersionConstraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_versionConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (T__73 - 17)) | (1L << (T__70 - 17)) | (1L << (T__58 - 17)) | (1L << (T__56 - 17)) | (1L << (T__54 - 17)) | (1L << (T__29 - 17)) | (1L << (T__10 - 17)))) != 0)) {
				{
				setState(195); versionOperator();
				}
			}

			setState(198); match(VersionLiteral);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); identifier();
			setState(203);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(201); match(T__44);
				setState(202); identifier();
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

	public static class ImportDirectiveContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public ImportDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterImportDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitImportDirective(this);
		}
	}

	public final ImportDirectiveContext importDirective() throws RecognitionException {
		ImportDirectiveContext _localctx = new ImportDirectiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_importDirective);
		int _la;
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); match(T__0);
				setState(206); match(StringLiteral);
				setState(209);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(207); match(T__44);
					setState(208); identifier();
					}
				}

				setState(211); match(T__38);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); match(T__0);
				setState(215);
				switch (_input.LA(1)) {
				case T__24:
					{
					setState(213); match(T__24);
					}
					break;
				case T__53:
				case T__28:
				case Identifier:
					{
					setState(214); identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(219);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(217); match(T__44);
					setState(218); identifier();
					}
				}

				setState(221); match(T__28);
				setState(222); match(StringLiteral);
				setState(223); match(T__38);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224); match(T__0);
				setState(225); match(T__80);
				setState(226); importDeclaration();
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__63) {
					{
					{
					setState(227); match(T__63);
					setState(228); importDeclaration();
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234); match(T__35);
				setState(235); match(T__28);
				setState(236); match(StringLiteral);
				setState(237); match(T__38);
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

	public static class ContractDefinitionContext extends ParserRuleContext {
		public List<ContractPartContext> contractPart() {
			return getRuleContexts(ContractPartContext.class);
		}
		public ContractPartContext contractPart(int i) {
			return getRuleContext(ContractPartContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InheritanceSpecifierContext inheritanceSpecifier(int i) {
			return getRuleContext(InheritanceSpecifierContext.class,i);
		}
		public List<InheritanceSpecifierContext> inheritanceSpecifier() {
			return getRuleContexts(InheritanceSpecifierContext.class);
		}
		public ContractDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractDefinition(this);
		}
	}

	public final ContractDefinitionContext contractDefinition() throws RecognitionException {
		ContractDefinitionContext _localctx = new ContractDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_contractDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !(_la==T__86 || _la==T__85 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(242); identifier();
			setState(252);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(243); match(T__25);
				setState(244); inheritanceSpecifier();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__63) {
					{
					{
					setState(245); match(T__63);
					setState(246); inheritanceSpecifier();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(254); match(T__80);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__67) | (1L << T__59) | (1L << T__53) | (1L << T__50) | (1L << T__48) | (1L << T__47) | (1L << T__41) | (1L << T__31) | (1L << T__30) | (1L << T__28))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__12 - 78)) | (1L << (T__11 - 78)) | (1L << (T__7 - 78)) | (1L << (T__5 - 78)) | (1L << (Int - 78)) | (1L << (Uint - 78)) | (1L << (Byte - 78)) | (1L << (Fixed - 78)) | (1L << (Ufixed - 78)) | (1L << (Identifier - 78)))) != 0)) {
				{
				{
				setState(255); contractPart();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261); match(T__35);
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

	public static class InheritanceSpecifierContext extends ParserRuleContext {
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public InheritanceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inheritanceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInheritanceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInheritanceSpecifier(this);
		}
	}

	public final InheritanceSpecifierContext inheritanceSpecifier() throws RecognitionException {
		InheritanceSpecifierContext _localctx = new InheritanceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inheritanceSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); userDefinedTypeName();
			setState(275);
			_la = _input.LA(1);
			if (_la==T__65) {
				{
				setState(264); match(T__65);
				setState(265); expression(0);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__63) {
					{
					{
					setState(266); match(T__63);
					setState(267); expression(0);
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(273); match(T__3);
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

	public static class ContractPartContext extends ParserRuleContext {
		public ConstructorDefinitionContext constructorDefinition() {
			return getRuleContext(ConstructorDefinitionContext.class,0);
		}
		public UsingForDeclarationContext usingForDeclaration() {
			return getRuleContext(UsingForDeclarationContext.class,0);
		}
		public EventDefinitionContext eventDefinition() {
			return getRuleContext(EventDefinitionContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public EnumDefinitionContext enumDefinition() {
			return getRuleContext(EnumDefinitionContext.class,0);
		}
		public ModifierDefinitionContext modifierDefinition() {
			return getRuleContext(ModifierDefinitionContext.class,0);
		}
		public StateVariableDeclarationContext stateVariableDeclaration() {
			return getRuleContext(StateVariableDeclarationContext.class,0);
		}
		public ContractPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContractPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContractPart(this);
		}
	}

	public final ContractPartContext contractPart() throws RecognitionException {
		ContractPartContext _localctx = new ContractPartContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contractPart);
		try {
			setState(285);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); stateVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278); usingForDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279); structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280); constructorDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281); modifierDefinition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(282); functionDefinition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(283); eventDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(284); enumDefinition();
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

	public static class StateVariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> ConstantKeyword() { return getTokens(SolidityParser.ConstantKeyword); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public TerminalNode ConstantKeyword(int i) {
			return getToken(SolidityParser.ConstantKeyword, i);
		}
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public StateVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateVariableDeclaration(this);
		}
	}

	public final StateVariableDeclarationContext stateVariableDeclaration() throws RecognitionException {
		StateVariableDeclarationContext _localctx = new StateVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stateVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); typeName(0);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (ConstantKeyword - 105)) | (1L << (InternalKeyword - 105)) | (1L << (PrivateKeyword - 105)) | (1L << (PublicKeyword - 105)))) != 0)) {
				{
				{
				setState(288);
				_la = _input.LA(1);
				if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (ConstantKeyword - 105)) | (1L << (InternalKeyword - 105)) | (1L << (PrivateKeyword - 105)) | (1L << (PublicKeyword - 105)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294); identifier();
			setState(297);
			_la = _input.LA(1);
			if (_la==T__73) {
				{
				setState(295); match(T__73);
				setState(296); expression(0);
				}
			}

			setState(299); match(T__38);
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

	public static class UsingForDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UsingForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingForDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUsingForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUsingForDeclaration(this);
		}
	}

	public final UsingForDeclarationContext usingForDeclaration() throws RecognitionException {
		UsingForDeclarationContext _localctx = new UsingForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_usingForDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301); match(T__41);
			setState(302); identifier();
			setState(303); match(T__71);
			setState(306);
			switch (_input.LA(1)) {
			case T__24:
				{
				setState(304); match(T__24);
				}
				break;
			case T__74:
			case T__59:
			case T__53:
			case T__50:
			case T__48:
			case T__28:
			case T__12:
			case T__11:
			case T__7:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case Identifier:
				{
				setState(305); typeName(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(308); match(T__38);
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

	public static class StructDefinitionContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStructDefinition(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_structDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(T__47);
			setState(311); identifier();
			setState(312); match(T__80);
			setState(323);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__59) | (1L << T__53) | (1L << T__50) | (1L << T__48) | (1L << T__28))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__12 - 78)) | (1L << (T__11 - 78)) | (1L << (T__7 - 78)) | (1L << (Int - 78)) | (1L << (Uint - 78)) | (1L << (Byte - 78)) | (1L << (Fixed - 78)) | (1L << (Ufixed - 78)) | (1L << (Identifier - 78)))) != 0)) {
				{
				setState(313); variableDeclaration();
				setState(314); match(T__38);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__59) | (1L << T__53) | (1L << T__50) | (1L << T__48) | (1L << T__28))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__12 - 78)) | (1L << (T__11 - 78)) | (1L << (T__7 - 78)) | (1L << (Int - 78)) | (1L << (Uint - 78)) | (1L << (Byte - 78)) | (1L << (Fixed - 78)) | (1L << (Ufixed - 78)) | (1L << (Identifier - 78)))) != 0)) {
					{
					{
					setState(315); variableDeclaration();
					setState(316); match(T__38);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(325); match(T__35);
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

	public static class ConstructorDefinitionContext extends ParserRuleContext {
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterConstructorDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitConstructorDefinition(this);
		}
	}

	public final ConstructorDefinitionContext constructorDefinition() throws RecognitionException {
		ConstructorDefinitionContext _localctx = new ConstructorDefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constructorDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); match(T__67);
			setState(328); parameterList();
			setState(329); modifierList();
			setState(330); block();
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

	public static class ModifierDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierDefinition(this);
		}
	}

	public final ModifierDefinitionContext modifierDefinition() throws RecognitionException {
		ModifierDefinitionContext _localctx = new ModifierDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modifierDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(T__5);
			setState(333); identifier();
			setState(335);
			_la = _input.LA(1);
			if (_la==T__65) {
				{
				setState(334); parameterList();
				}
			}

			setState(337); block();
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

	public static class ModifierInvocationContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ModifierInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierInvocation(this);
		}
	}

	public final ModifierInvocationContext modifierInvocation() throws RecognitionException {
		ModifierInvocationContext _localctx = new ModifierInvocationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_modifierInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); identifier();
			setState(345);
			_la = _input.LA(1);
			if (_la==T__65) {
				{
				setState(340); match(T__65);
				setState(342);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__84) | (1L << T__74) | (1L << T__69) | (1L << T__65) | (1L << T__61) | (1L << T__59) | (1L << T__57) | (1L << T__54) | (1L << T__53) | (1L << T__49) | (1L << T__28))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__17 - 73)) | (1L << (T__13 - 73)) | (1L << (T__12 - 73)) | (1L << (T__11 - 73)) | (1L << (T__9 - 73)) | (1L << (T__7 - 73)) | (1L << (T__1 - 73)) | (1L << (Int - 73)) | (1L << (Uint - 73)) | (1L << (Byte - 73)) | (1L << (Fixed - 73)) | (1L << (Ufixed - 73)) | (1L << (BooleanLiteral - 73)) | (1L << (DecimalNumber - 73)) | (1L << (HexNumber - 73)) | (1L << (HexLiteral - 73)) | (1L << (Identifier - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(341); expressionList();
					}
				}

				setState(344); match(T__3);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public ReturnParametersContext returnParameters() {
			return getRuleContext(ReturnParametersContext.class,0);
		}
		public ModifierListContext modifierList() {
			return getRuleContext(ModifierListContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(T__50);
			setState(349);
			_la = _input.LA(1);
			if (_la==T__53 || _la==T__28 || _la==Identifier) {
				{
				setState(348); identifier();
				}
			}

			setState(351); parameterList();
			setState(352); modifierList();
			setState(354);
			_la = _input.LA(1);
			if (_la==T__51) {
				{
				setState(353); returnParameters();
				}
			}

			setState(358);
			switch (_input.LA(1)) {
			case T__38:
				{
				setState(356); match(T__38);
				}
				break;
			case T__80:
				{
				setState(357); block();
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

	public static class ReturnParametersContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ReturnParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnParameters(this);
		}
	}

	public final ReturnParametersContext returnParameters() throws RecognitionException {
		ReturnParametersContext _localctx = new ReturnParametersContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360); match(T__51);
			setState(361); parameterList();
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

	public static class ModifierListContext extends ParserRuleContext {
		public List<ModifierInvocationContext> modifierInvocation() {
			return getRuleContexts(ModifierInvocationContext.class);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<TerminalNode> PrivateKeyword() { return getTokens(SolidityParser.PrivateKeyword); }
		public TerminalNode PrivateKeyword(int i) {
			return getToken(SolidityParser.PrivateKeyword, i);
		}
		public ModifierInvocationContext modifierInvocation(int i) {
			return getRuleContext(ModifierInvocationContext.class,i);
		}
		public TerminalNode PublicKeyword(int i) {
			return getToken(SolidityParser.PublicKeyword, i);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public List<TerminalNode> PublicKeyword() { return getTokens(SolidityParser.PublicKeyword); }
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public ModifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterModifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitModifierList(this);
		}
	}

	public final ModifierListContext modifierList() throws RecognitionException {
		ModifierListContext _localctx = new ModifierListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__53 || _la==T__28 || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (ConstantKeyword - 105)) | (1L << (ExternalKeyword - 105)) | (1L << (InternalKeyword - 105)) | (1L << (PayableKeyword - 105)) | (1L << (PrivateKeyword - 105)) | (1L << (PublicKeyword - 105)) | (1L << (PureKeyword - 105)) | (1L << (ViewKeyword - 105)) | (1L << (Identifier - 105)))) != 0)) {
				{
				setState(369);
				switch (_input.LA(1)) {
				case T__53:
				case T__28:
				case Identifier:
					{
					setState(363); modifierInvocation();
					}
					break;
				case ConstantKeyword:
				case PayableKeyword:
				case PureKeyword:
				case ViewKeyword:
					{
					setState(364); stateMutability();
					}
					break;
				case ExternalKeyword:
					{
					setState(365); match(ExternalKeyword);
					}
					break;
				case PublicKeyword:
					{
					setState(366); match(PublicKeyword);
					}
					break;
				case InternalKeyword:
					{
					setState(367); match(InternalKeyword);
					}
					break;
				case PrivateKeyword:
					{
					setState(368); match(PrivateKeyword);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(373);
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

	public static class EventDefinitionContext extends ParserRuleContext {
		public TerminalNode AnonymousKeyword() { return getToken(SolidityParser.AnonymousKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterListContext eventParameterList() {
			return getRuleContext(EventParameterListContext.class,0);
		}
		public EventDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventDefinition(this);
		}
	}

	public final EventDefinitionContext eventDefinition() throws RecognitionException {
		EventDefinitionContext _localctx = new EventDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_eventDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(T__30);
			setState(375); identifier();
			setState(376); eventParameterList();
			setState(378);
			_la = _input.LA(1);
			if (_la==AnonymousKeyword) {
				{
				setState(377); match(AnonymousKeyword);
				}
			}

			setState(380); match(T__38);
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

	public static class EnumValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumValue(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); identifier();
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

	public static class EnumDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEnumDefinition(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_enumDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); match(T__31);
			setState(385); identifier();
			setState(386); match(T__80);
			setState(388);
			_la = _input.LA(1);
			if (_la==T__53 || _la==T__28 || _la==Identifier) {
				{
				setState(387); enumValue();
				}
			}

			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__63) {
				{
				{
				setState(390); match(T__63);
				setState(391); enumValue();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397); match(T__35);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); match(T__65);
			setState(408);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__59) | (1L << T__53) | (1L << T__50) | (1L << T__48) | (1L << T__28))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__12 - 78)) | (1L << (T__11 - 78)) | (1L << (T__7 - 78)) | (1L << (Int - 78)) | (1L << (Uint - 78)) | (1L << (Byte - 78)) | (1L << (Fixed - 78)) | (1L << (Ufixed - 78)) | (1L << (Identifier - 78)))) != 0)) {
				{
				setState(400); parameter();
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__63) {
					{
					{
					setState(401); match(T__63);
					setState(402); parameter();
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(410); match(T__3);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412); typeName(0);
			setState(414);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(413); storageLocation();
				}
				break;
			}
			setState(417);
			_la = _input.LA(1);
			if (_la==T__53 || _la==T__28 || _la==Identifier) {
				{
				setState(416); identifier();
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

	public static class EventParameterListContext extends ParserRuleContext {
		public EventParameterContext eventParameter(int i) {
			return getRuleContext(EventParameterContext.class,i);
		}
		public List<EventParameterContext> eventParameter() {
			return getRuleContexts(EventParameterContext.class);
		}
		public EventParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameterList(this);
		}
	}

	public final EventParameterListContext eventParameterList() throws RecognitionException {
		EventParameterListContext _localctx = new EventParameterListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eventParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419); match(T__65);
			setState(428);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__59) | (1L << T__53) | (1L << T__50) | (1L << T__48) | (1L << T__28))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__12 - 78)) | (1L << (T__11 - 78)) | (1L << (T__7 - 78)) | (1L << (Int - 78)) | (1L << (Uint - 78)) | (1L << (Byte - 78)) | (1L << (Fixed - 78)) | (1L << (Ufixed - 78)) | (1L << (Identifier - 78)))) != 0)) {
				{
				setState(420); eventParameter();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__63) {
					{
					{
					setState(421); match(T__63);
					setState(422); eventParameter();
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(430); match(T__3);
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

	public static class EventParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode IndexedKeyword() { return getToken(SolidityParser.IndexedKeyword, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EventParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEventParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEventParameter(this);
		}
	}

	public final EventParameterContext eventParameter() throws RecognitionException {
		EventParameterContext _localctx = new EventParameterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eventParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432); typeName(0);
			setState(434);
			_la = _input.LA(1);
			if (_la==IndexedKeyword) {
				{
				setState(433); match(IndexedKeyword);
				}
			}

			setState(437);
			_la = _input.LA(1);
			if (_la==T__53 || _la==T__28 || _la==Identifier) {
				{
				setState(436); identifier();
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

	public static class FunctionTypeParameterListContext extends ParserRuleContext {
		public FunctionTypeParameterContext functionTypeParameter(int i) {
			return getRuleContext(FunctionTypeParameterContext.class,i);
		}
		public List<FunctionTypeParameterContext> functionTypeParameter() {
			return getRuleContexts(FunctionTypeParameterContext.class);
		}
		public FunctionTypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameterList(this);
		}
	}

	public final FunctionTypeParameterListContext functionTypeParameterList() throws RecognitionException {
		FunctionTypeParameterListContext _localctx = new FunctionTypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionTypeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439); match(T__65);
			setState(448);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__59) | (1L << T__53) | (1L << T__50) | (1L << T__48) | (1L << T__28))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__12 - 78)) | (1L << (T__11 - 78)) | (1L << (T__7 - 78)) | (1L << (Int - 78)) | (1L << (Uint - 78)) | (1L << (Byte - 78)) | (1L << (Fixed - 78)) | (1L << (Ufixed - 78)) | (1L << (Identifier - 78)))) != 0)) {
				{
				setState(440); functionTypeParameter();
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__63) {
					{
					{
					setState(441); match(T__63);
					setState(442); functionTypeParameter();
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(450); match(T__3);
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

	public static class FunctionTypeParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public FunctionTypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeParameter(this);
		}
	}

	public final FunctionTypeParameterContext functionTypeParameter() throws RecognitionException {
		FunctionTypeParameterContext _localctx = new FunctionTypeParameterContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionTypeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452); typeName(0);
			setState(454);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__60) | (1L << T__53))) != 0)) {
				{
				setState(453); storageLocation();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StorageLocationContext storageLocation() {
			return getRuleContext(StorageLocationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456); typeName(0);
			setState(458);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(457); storageLocation();
				}
				break;
			}
			setState(460); identifier();
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

	public static class TypeNameContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UserDefinedTypeNameContext userDefinedTypeName() {
			return getRuleContext(UserDefinedTypeNameContext.class,0);
		}
		public FunctionTypeNameContext functionTypeName() {
			return getRuleContext(FunctionTypeNameContext.class,0);
		}
		public MappingContext mapping() {
			return getRuleContext(MappingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		return typeName(0);
	}

	private TypeNameContext typeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeNameContext _localctx = new TypeNameContext(_ctx, _parentState);
		TypeNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_typeName, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(463); elementaryTypeName();
				}
				break;
			case 2:
				{
				setState(464); userDefinedTypeName();
				}
				break;
			case 3:
				{
				setState(465); mapping();
				}
				break;
			case 4:
				{
				setState(466); functionTypeName();
				}
				break;
			case 5:
				{
				setState(467); match(T__12);
				setState(468); match(PayableKeyword);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeName);
					setState(471);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(472); match(T__17);
					setState(474);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__84) | (1L << T__74) | (1L << T__69) | (1L << T__65) | (1L << T__61) | (1L << T__59) | (1L << T__57) | (1L << T__54) | (1L << T__53) | (1L << T__49) | (1L << T__28))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__17 - 73)) | (1L << (T__13 - 73)) | (1L << (T__12 - 73)) | (1L << (T__11 - 73)) | (1L << (T__9 - 73)) | (1L << (T__7 - 73)) | (1L << (T__1 - 73)) | (1L << (Int - 73)) | (1L << (Uint - 73)) | (1L << (Byte - 73)) | (1L << (Fixed - 73)) | (1L << (Ufixed - 73)) | (1L << (BooleanLiteral - 73)) | (1L << (DecimalNumber - 73)) | (1L << (HexNumber - 73)) | (1L << (HexLiteral - 73)) | (1L << (Identifier - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
						{
						setState(473); expression(0);
						}
					}

					setState(476); match(T__55);
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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

	public static class UserDefinedTypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public UserDefinedTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterUserDefinedTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitUserDefinedTypeName(this);
		}
	}

	public final UserDefinedTypeNameContext userDefinedTypeName() throws RecognitionException {
		UserDefinedTypeNameContext _localctx = new UserDefinedTypeNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_userDefinedTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482); identifier();
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483); match(T__22);
					setState(484); identifier();
					}
					} 
				}
				setState(489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	public static class MappingContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitMapping(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490); match(T__48);
			setState(491); match(T__65);
			setState(492); elementaryTypeName();
			setState(493); match(T__8);
			setState(494); typeName(0);
			setState(495); match(T__3);
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

	public static class FunctionTypeNameContext extends ParserRuleContext {
		public TerminalNode ExternalKeyword(int i) {
			return getToken(SolidityParser.ExternalKeyword, i);
		}
		public List<StateMutabilityContext> stateMutability() {
			return getRuleContexts(StateMutabilityContext.class);
		}
		public FunctionTypeParameterListContext functionTypeParameterList(int i) {
			return getRuleContext(FunctionTypeParameterListContext.class,i);
		}
		public StateMutabilityContext stateMutability(int i) {
			return getRuleContext(StateMutabilityContext.class,i);
		}
		public List<FunctionTypeParameterListContext> functionTypeParameterList() {
			return getRuleContexts(FunctionTypeParameterListContext.class);
		}
		public TerminalNode InternalKeyword(int i) {
			return getToken(SolidityParser.InternalKeyword, i);
		}
		public List<TerminalNode> InternalKeyword() { return getTokens(SolidityParser.InternalKeyword); }
		public List<TerminalNode> ExternalKeyword() { return getTokens(SolidityParser.ExternalKeyword); }
		public FunctionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionTypeName(this);
		}
	}

	public final FunctionTypeNameContext functionTypeName() throws RecognitionException {
		FunctionTypeNameContext _localctx = new FunctionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionTypeName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497); match(T__50);
			setState(498); functionTypeParameterList();
			setState(504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(502);
					switch (_input.LA(1)) {
					case InternalKeyword:
						{
						setState(499); match(InternalKeyword);
						}
						break;
					case ExternalKeyword:
						{
						setState(500); match(ExternalKeyword);
						}
						break;
					case ConstantKeyword:
					case PayableKeyword:
					case PureKeyword:
					case ViewKeyword:
						{
						setState(501); stateMutability();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(509);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(507); match(T__51);
				setState(508); functionTypeParameterList();
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

	public static class StorageLocationContext extends ParserRuleContext {
		public StorageLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStorageLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStorageLocation(this);
		}
	}

	public final StorageLocationContext storageLocation() throws RecognitionException {
		StorageLocationContext _localctx = new StorageLocationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_storageLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__83) | (1L << T__60) | (1L << T__53))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class StateMutabilityContext extends ParserRuleContext {
		public TerminalNode PayableKeyword() { return getToken(SolidityParser.PayableKeyword, 0); }
		public TerminalNode PureKeyword() { return getToken(SolidityParser.PureKeyword, 0); }
		public TerminalNode ViewKeyword() { return getToken(SolidityParser.ViewKeyword, 0); }
		public TerminalNode ConstantKeyword() { return getToken(SolidityParser.ConstantKeyword, 0); }
		public StateMutabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateMutability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStateMutability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStateMutability(this);
		}
	}

	public final StateMutabilityContext stateMutability() throws RecognitionException {
		StateMutabilityContext _localctx = new StateMutabilityContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_stateMutability);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (ConstantKeyword - 105)) | (1L << (PayableKeyword - 105)) | (1L << (PureKeyword - 105)) | (1L << (ViewKeyword - 105)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515); match(T__80);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__84) | (1L << T__81) | (1L << T__80) | (1L << T__74) | (1L << T__71) | (1L << T__69) | (1L << T__66) | (1L << T__65) | (1L << T__61) | (1L << T__59) | (1L << T__57) | (1L << T__54) | (1L << T__53) | (1L << T__50) | (1L << T__49) | (1L << T__48) | (1L << T__42) | (1L << T__34) | (1L << T__28))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__23 - 67)) | (1L << (T__19 - 67)) | (1L << (T__17 - 67)) | (1L << (T__13 - 67)) | (1L << (T__12 - 67)) | (1L << (T__11 - 67)) | (1L << (T__9 - 67)) | (1L << (T__7 - 67)) | (1L << (T__2 - 67)) | (1L << (T__1 - 67)) | (1L << (Int - 67)) | (1L << (Uint - 67)) | (1L << (Byte - 67)) | (1L << (Fixed - 67)) | (1L << (Ufixed - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (DecimalNumber - 67)) | (1L << (HexNumber - 67)) | (1L << (HexLiteral - 67)) | (1L << (BreakKeyword - 67)) | (1L << (ContinueKeyword - 67)) | (1L << (Identifier - 67)) | (1L << (StringLiteral - 67)))) != 0)) {
				{
				{
				setState(516); statement();
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522); match(T__35);
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

	public static class StatementContext extends ParserRuleContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public InlineAssemblyStatementContext inlineAssemblyStatement() {
			return getRuleContext(InlineAssemblyStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public EmitStatementContext emitStatement() {
			return getRuleContext(EmitStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_statement);
		try {
			setState(536);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(524); ifStatement();
				}
				break;
			case T__81:
				enterOuterAlt(_localctx, 2);
				{
				setState(525); whileStatement();
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 3);
				{
				setState(526); forStatement();
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 4);
				{
				setState(527); block();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 5);
				{
				setState(528); inlineAssemblyStatement();
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 6);
				{
				setState(529); doWhileStatement();
				}
				break;
			case ContinueKeyword:
				enterOuterAlt(_localctx, 7);
				{
				setState(530); continueStatement();
				}
				break;
			case BreakKeyword:
				enterOuterAlt(_localctx, 8);
				{
				setState(531); breakStatement();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 9);
				{
				setState(532); returnStatement();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 10);
				{
				setState(533); throwStatement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 11);
				{
				setState(534); emitStatement();
				}
				break;
			case T__84:
			case T__74:
			case T__69:
			case T__65:
			case T__61:
			case T__59:
			case T__57:
			case T__54:
			case T__53:
			case T__50:
			case T__49:
			case T__48:
			case T__28:
			case T__17:
			case T__13:
			case T__12:
			case T__11:
			case T__9:
			case T__7:
			case T__1:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 12);
				{
				setState(535); simpleStatement();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538); expression(0);
			setState(539); match(T__38);
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

	public static class IfStatementContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); match(T__34);
			setState(542); match(T__65);
			setState(543); expression(0);
			setState(544); match(T__3);
			setState(545); statement();
			setState(548);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(546); match(T__4);
				setState(547); statement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550); match(T__81);
			setState(551); match(T__65);
			setState(552); expression(0);
			setState(553); match(T__3);
			setState(554); statement();
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public VariableDeclarationStatementContext variableDeclarationStatement() {
			return getRuleContext(VariableDeclarationStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_simpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(556); variableDeclarationStatement();
				}
				break;
			case 2:
				{
				setState(557); expressionStatement();
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

	public static class ForStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560); match(T__71);
			setState(561); match(T__65);
			setState(564);
			switch (_input.LA(1)) {
			case T__84:
			case T__74:
			case T__69:
			case T__65:
			case T__61:
			case T__59:
			case T__57:
			case T__54:
			case T__53:
			case T__50:
			case T__49:
			case T__48:
			case T__28:
			case T__17:
			case T__13:
			case T__12:
			case T__11:
			case T__9:
			case T__7:
			case T__1:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(562); simpleStatement();
				}
				break;
			case T__38:
				{
				setState(563); match(T__38);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(568);
			switch (_input.LA(1)) {
			case T__84:
			case T__74:
			case T__69:
			case T__65:
			case T__61:
			case T__59:
			case T__57:
			case T__54:
			case T__53:
			case T__49:
			case T__28:
			case T__17:
			case T__13:
			case T__12:
			case T__11:
			case T__9:
			case T__7:
			case T__1:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(566); expressionStatement();
				}
				break;
			case T__38:
				{
				setState(567); match(T__38);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(571);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__84) | (1L << T__74) | (1L << T__69) | (1L << T__65) | (1L << T__61) | (1L << T__59) | (1L << T__57) | (1L << T__54) | (1L << T__53) | (1L << T__49) | (1L << T__28))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__17 - 73)) | (1L << (T__13 - 73)) | (1L << (T__12 - 73)) | (1L << (T__11 - 73)) | (1L << (T__9 - 73)) | (1L << (T__7 - 73)) | (1L << (T__1 - 73)) | (1L << (Int - 73)) | (1L << (Uint - 73)) | (1L << (Byte - 73)) | (1L << (Fixed - 73)) | (1L << (Ufixed - 73)) | (1L << (BooleanLiteral - 73)) | (1L << (DecimalNumber - 73)) | (1L << (HexNumber - 73)) | (1L << (HexLiteral - 73)) | (1L << (Identifier - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
				{
				setState(570); expression(0);
				}
			}

			setState(573); match(T__3);
			setState(574); statement();
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

	public static class InlineAssemblyStatementContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public InlineAssemblyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineAssemblyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterInlineAssemblyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitInlineAssemblyStatement(this);
		}
	}

	public final InlineAssemblyStatementContext inlineAssemblyStatement() throws RecognitionException {
		InlineAssemblyStatementContext _localctx = new InlineAssemblyStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_inlineAssemblyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576); match(T__2);
			setState(578);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(577); match(StringLiteral);
				}
			}

			setState(580); assemblyBlock();
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitDoWhileStatement(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582); match(T__66);
			setState(583); statement();
			setState(584); match(T__81);
			setState(585); match(T__65);
			setState(586); expression(0);
			setState(587); match(T__3);
			setState(588); match(T__38);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590); match(ContinueKeyword);
			setState(591); match(T__38);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593); match(BreakKeyword);
			setState(594); match(T__38);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596); match(T__42);
			setState(598);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__84) | (1L << T__74) | (1L << T__69) | (1L << T__65) | (1L << T__61) | (1L << T__59) | (1L << T__57) | (1L << T__54) | (1L << T__53) | (1L << T__49) | (1L << T__28))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__17 - 73)) | (1L << (T__13 - 73)) | (1L << (T__12 - 73)) | (1L << (T__11 - 73)) | (1L << (T__9 - 73)) | (1L << (T__7 - 73)) | (1L << (T__1 - 73)) | (1L << (Int - 73)) | (1L << (Uint - 73)) | (1L << (Byte - 73)) | (1L << (Fixed - 73)) | (1L << (Ufixed - 73)) | (1L << (BooleanLiteral - 73)) | (1L << (DecimalNumber - 73)) | (1L << (HexNumber - 73)) | (1L << (HexLiteral - 73)) | (1L << (Identifier - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
				{
				setState(597); expression(0);
				}
			}

			setState(600); match(T__38);
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

	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602); match(T__19);
			setState(603); match(T__38);
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

	public static class EmitStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public EmitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterEmitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitEmitStatement(this);
		}
	}

	public final EmitStatementContext emitStatement() throws RecognitionException {
		EmitStatementContext _localctx = new EmitStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_emitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); match(T__23);
			setState(606); functionCall();
			setState(607); match(T__38);
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

	public static class VariableDeclarationStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationStatement(this);
		}
	}

	public final VariableDeclarationStatementContext variableDeclarationStatement() throws RecognitionException {
		VariableDeclarationStatementContext _localctx = new VariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_variableDeclarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(609); match(T__59);
				setState(610); identifierList();
				}
				break;
			case 2:
				{
				setState(611); variableDeclaration();
				}
				break;
			case 3:
				{
				setState(612); match(T__65);
				setState(613); variableDeclarationList();
				setState(614); match(T__3);
				}
				break;
			}
			setState(620);
			_la = _input.LA(1);
			if (_la==T__73) {
				{
				setState(618); match(T__73);
				setState(619); expression(0);
				}
			}

			setState(622); match(T__38);
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

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__59) | (1L << T__53) | (1L << T__50) | (1L << T__48) | (1L << T__28))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__12 - 78)) | (1L << (T__11 - 78)) | (1L << (T__7 - 78)) | (1L << (Int - 78)) | (1L << (Uint - 78)) | (1L << (Byte - 78)) | (1L << (Fixed - 78)) | (1L << (Ufixed - 78)) | (1L << (Identifier - 78)))) != 0)) {
				{
				setState(624); variableDeclaration();
				}
			}

			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__63) {
				{
				{
				setState(627); match(T__63);
				setState(629);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__59) | (1L << T__53) | (1L << T__50) | (1L << T__48) | (1L << T__28))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__12 - 78)) | (1L << (T__11 - 78)) | (1L << (T__7 - 78)) | (1L << (Int - 78)) | (1L << (Uint - 78)) | (1L << (Byte - 78)) | (1L << (Fixed - 78)) | (1L << (Ufixed - 78)) | (1L << (Identifier - 78)))) != 0)) {
					{
					setState(628); variableDeclaration();
					}
				}

				}
				}
				setState(635);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_identifierList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(636); match(T__65);
			setState(643);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(638);
					_la = _input.LA(1);
					if (_la==T__53 || _la==T__28 || _la==Identifier) {
						{
						setState(637); identifier();
						}
					}

					setState(640); match(T__63);
					}
					} 
				}
				setState(645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(647);
			_la = _input.LA(1);
			if (_la==T__53 || _la==T__28 || _la==Identifier) {
				{
				setState(646); identifier();
				}
			}

			setState(649); match(T__3);
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

	public static class ElementaryTypeNameContext extends ParserRuleContext {
		public TerminalNode Uint() { return getToken(SolidityParser.Uint, 0); }
		public TerminalNode Byte() { return getToken(SolidityParser.Byte, 0); }
		public TerminalNode Ufixed() { return getToken(SolidityParser.Ufixed, 0); }
		public TerminalNode Int() { return getToken(SolidityParser.Int, 0); }
		public TerminalNode Fixed() { return getToken(SolidityParser.Fixed, 0); }
		public ElementaryTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterElementaryTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitElementaryTypeName(this);
		}
	}

	public final ElementaryTypeNameContext elementaryTypeName() throws RecognitionException {
		ElementaryTypeNameContext _localctx = new ElementaryTypeNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elementaryTypeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_la = _input.LA(1);
			if ( !(_la==T__74 || _la==T__59 || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__12 - 78)) | (1L << (T__11 - 78)) | (1L << (T__7 - 78)) | (1L << (Int - 78)) | (1L << (Uint - 78)) | (1L << (Byte - 78)) | (1L << (Fixed - 78)) | (1L << (Ufixed - 78)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(654);
				_la = _input.LA(1);
				if ( !(_la==T__57 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(655); expression(19);
				}
				break;
			case 2:
				{
				setState(656);
				_la = _input.LA(1);
				if ( !(_la==T__49 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(657); expression(18);
				}
				break;
			case 3:
				{
				setState(658);
				_la = _input.LA(1);
				if ( !(_la==T__69 || _la==T__61) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(659); expression(17);
				}
				break;
			case 4:
				{
				setState(660); match(T__9);
				setState(661); expression(16);
				}
				break;
			case 5:
				{
				setState(662); match(T__54);
				setState(663); expression(15);
				}
				break;
			case 6:
				{
				setState(664); match(T__84);
				setState(665); typeName(0);
				}
				break;
			case 7:
				{
				setState(666); match(T__65);
				setState(667); expression(0);
				setState(668); match(T__3);
				}
				break;
			case 8:
				{
				setState(670); primaryExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(732);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(730);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(673);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(674); match(T__75);
						setState(675); expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(676);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(677);
						_la = _input.LA(1);
						if ( !(((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (T__45 - 45)) | (1L << (T__24 - 45)) | (1L << (T__6 - 45)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(678); expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(679);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(680);
						_la = _input.LA(1);
						if ( !(_la==T__49 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(681); expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(682);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(683);
						_la = _input.LA(1);
						if ( !(_la==T__76 || _la==T__37) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(684); expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(685);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(686); match(T__27);
						setState(687); expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(688);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(689); match(T__70);
						setState(690); expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(691);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(692); match(T__14);
						setState(693); expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(694);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(695);
						_la = _input.LA(1);
						if ( !(((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & ((1L << (T__58 - 32)) | (1L << (T__56 - 32)) | (1L << (T__29 - 32)) | (1L << (T__10 - 32)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(696); expression(8);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(697);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(698);
						_la = _input.LA(1);
						if ( !(_la==T__82 || _la==T__15) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(699); expression(7);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(700);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(701); match(T__77);
						setState(702); expression(6);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(703);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(704); match(T__39);
						setState(705); expression(5);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(706);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(707); match(T__32);
						setState(708); expression(0);
						setState(709); match(T__18);
						setState(710); expression(4);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(712);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(713);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__88) | (1L << T__87) | (1L << T__78) | (1L << T__73) | (1L << T__72) | (1L << T__68) | (1L << T__64) | (1L << T__62) | (1L << T__46) | (1L << T__43) | (1L << T__40))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(714); expression(3);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(715);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(716);
						_la = _input.LA(1);
						if ( !(_la==T__57 || _la==T__13) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(717);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(718); match(T__17);
						setState(719); expression(0);
						setState(720); match(T__55);
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(722);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(723); match(T__65);
						setState(724); functionCallArguments();
						setState(725); match(T__3);
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(727);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(728); match(T__22);
						setState(729); identifier();
						}
						break;
					}
					} 
				}
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
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

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(SolidityParser.BooleanLiteral, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementaryTypeNameExpressionContext elementaryTypeNameExpression() {
			return getRuleContext(ElementaryTypeNameExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primaryExpression);
		try {
			setState(750);
			switch (_input.LA(1)) {
			case BooleanLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(735); match(BooleanLiteral);
				}
				break;
			case DecimalNumber:
			case HexNumber:
				enterOuterAlt(_localctx, 2);
				{
				setState(736); numberLiteral();
				}
				break;
			case HexLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(737); match(HexLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(738); match(StringLiteral);
				}
				break;
			case T__53:
			case T__28:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(739); identifier();
				setState(742);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(740); match(T__17);
					setState(741); match(T__55);
					}
					break;
				}
				}
				break;
			case T__65:
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(744); tupleExpression();
				}
				break;
			case T__74:
			case T__59:
			case T__12:
			case T__11:
			case T__7:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
				enterOuterAlt(_localctx, 7);
				{
				setState(745); elementaryTypeNameExpression();
				setState(748);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(746); match(T__17);
					setState(747); match(T__55);
					}
					break;
				}
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752); expression(0);
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__63) {
				{
				{
				setState(753); match(T__63);
				setState(754); expression(0);
				}
				}
				setState(759);
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

	public static class NameValueListContext extends ParserRuleContext {
		public NameValueContext nameValue(int i) {
			return getRuleContext(NameValueContext.class,i);
		}
		public List<NameValueContext> nameValue() {
			return getRuleContexts(NameValueContext.class);
		}
		public NameValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValueList(this);
		}
	}

	public final NameValueListContext nameValueList() throws RecognitionException {
		NameValueListContext _localctx = new NameValueListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_nameValueList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(760); nameValue();
			setState(765);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(761); match(T__63);
					setState(762); nameValue();
					}
					} 
				}
				setState(767);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(769);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(768); match(T__63);
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

	public static class NameValueContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNameValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNameValue(this);
		}
	}

	public final NameValueContext nameValue() throws RecognitionException {
		NameValueContext _localctx = new NameValueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_nameValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771); identifier();
			setState(772); match(T__18);
			setState(773); expression(0);
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

	public static class FunctionCallArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public NameValueListContext nameValueList() {
			return getRuleContext(NameValueListContext.class,0);
		}
		public FunctionCallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCallArguments(this);
		}
	}

	public final FunctionCallArgumentsContext functionCallArguments() throws RecognitionException {
		FunctionCallArgumentsContext _localctx = new FunctionCallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_functionCallArguments);
		int _la;
		try {
			setState(783);
			switch (_input.LA(1)) {
			case T__80:
				enterOuterAlt(_localctx, 1);
				{
				setState(775); match(T__80);
				setState(777);
				_la = _input.LA(1);
				if (_la==T__53 || _la==T__28 || _la==Identifier) {
					{
					setState(776); nameValueList();
					}
				}

				setState(779); match(T__35);
				}
				break;
			case T__84:
			case T__74:
			case T__69:
			case T__65:
			case T__61:
			case T__59:
			case T__57:
			case T__54:
			case T__53:
			case T__49:
			case T__28:
			case T__17:
			case T__13:
			case T__12:
			case T__11:
			case T__9:
			case T__7:
			case T__3:
			case T__1:
			case Int:
			case Uint:
			case Byte:
			case Fixed:
			case Ufixed:
			case BooleanLiteral:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__84) | (1L << T__74) | (1L << T__69) | (1L << T__65) | (1L << T__61) | (1L << T__59) | (1L << T__57) | (1L << T__54) | (1L << T__53) | (1L << T__49) | (1L << T__28))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__17 - 73)) | (1L << (T__13 - 73)) | (1L << (T__12 - 73)) | (1L << (T__11 - 73)) | (1L << (T__9 - 73)) | (1L << (T__7 - 73)) | (1L << (T__1 - 73)) | (1L << (Int - 73)) | (1L << (Uint - 73)) | (1L << (Byte - 73)) | (1L << (Fixed - 73)) | (1L << (Ufixed - 73)) | (1L << (BooleanLiteral - 73)) | (1L << (DecimalNumber - 73)) | (1L << (HexNumber - 73)) | (1L << (HexLiteral - 73)) | (1L << (Identifier - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(780); expressionList();
					}
				}

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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallArgumentsContext functionCallArguments() {
			return getRuleContext(FunctionCallArgumentsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785); expression(0);
			setState(786); match(T__65);
			setState(787); functionCallArguments();
			setState(788); match(T__3);
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

	public static class AssemblyBlockContext extends ParserRuleContext {
		public List<AssemblyItemContext> assemblyItem() {
			return getRuleContexts(AssemblyItemContext.class);
		}
		public AssemblyItemContext assemblyItem(int i) {
			return getRuleContext(AssemblyItemContext.class,i);
		}
		public AssemblyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyBlock(this);
		}
	}

	public final AssemblyBlockContext assemblyBlock() throws RecognitionException {
		AssemblyBlockContext _localctx = new AssemblyBlockContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_assemblyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790); match(T__80);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__80) | (1L << T__74) | (1L << T__71) | (1L << T__65) | (1L << T__53) | (1L << T__52) | (1L << T__50) | (1L << T__42) | (1L << T__36) | (1L << T__34) | (1L << T__28))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__26 - 64)) | (1L << (T__12 - 64)) | (1L << (T__2 - 64)) | (1L << (DecimalNumber - 64)) | (1L << (HexNumber - 64)) | (1L << (HexLiteral - 64)) | (1L << (BreakKeyword - 64)) | (1L << (ContinueKeyword - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(791); assemblyItem();
				}
				}
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(797); match(T__35);
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

	public static class AssemblyItemContext extends ParserRuleContext {
		public AssemblyLocalDefinitionContext assemblyLocalDefinition() {
			return getRuleContext(AssemblyLocalDefinitionContext.class,0);
		}
		public AssemblyFunctionDefinitionContext assemblyFunctionDefinition() {
			return getRuleContext(AssemblyFunctionDefinitionContext.class,0);
		}
		public SubAssemblyContext subAssembly() {
			return getRuleContext(SubAssemblyContext.class,0);
		}
		public TerminalNode BreakKeyword() { return getToken(SolidityParser.BreakKeyword, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIfContext assemblyIf() {
			return getRuleContext(AssemblyIfContext.class,0);
		}
		public AssemblySwitchContext assemblySwitch() {
			return getRuleContext(AssemblySwitchContext.class,0);
		}
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public AssemblyAssignmentContext assemblyAssignment() {
			return getRuleContext(AssemblyAssignmentContext.class,0);
		}
		public TerminalNode ContinueKeyword() { return getToken(SolidityParser.ContinueKeyword, 0); }
		public AssemblyStackAssignmentContext assemblyStackAssignment() {
			return getRuleContext(AssemblyStackAssignmentContext.class,0);
		}
		public AssemblyForContext assemblyFor() {
			return getRuleContext(AssemblyForContext.class,0);
		}
		public AssemblyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyItem(this);
		}
	}

	public final AssemblyItemContext assemblyItem() throws RecognitionException {
		AssemblyItemContext _localctx = new AssemblyItemContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assemblyItem);
		try {
			setState(816);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(799); identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(800); assemblyBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(801); assemblyExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(802); assemblyLocalDefinition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(803); assemblyAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(804); assemblyStackAssignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(805); labelDefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(806); assemblySwitch();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(807); assemblyFunctionDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(808); assemblyFor();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(809); assemblyIf();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(810); match(BreakKeyword);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(811); match(ContinueKeyword);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(812); subAssembly();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(813); numberLiteral();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(814); match(StringLiteral);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(815); match(HexLiteral);
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

	public static class AssemblyExpressionContext extends ParserRuleContext {
		public AssemblyCallContext assemblyCall() {
			return getRuleContext(AssemblyCallContext.class,0);
		}
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyExpression(this);
		}
	}

	public final AssemblyExpressionContext assemblyExpression() throws RecognitionException {
		AssemblyExpressionContext _localctx = new AssemblyExpressionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_assemblyExpression);
		try {
			setState(820);
			switch (_input.LA(1)) {
			case T__74:
			case T__53:
			case T__42:
			case T__28:
			case T__12:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(818); assemblyCall();
				}
				break;
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(819); assemblyLiteral();
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

	public static class AssemblyCallContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCall(this);
		}
	}

	public final AssemblyCallContext assemblyCall() throws RecognitionException {
		AssemblyCallContext _localctx = new AssemblyCallContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_assemblyCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			switch (_input.LA(1)) {
			case T__42:
				{
				setState(822); match(T__42);
				}
				break;
			case T__12:
				{
				setState(823); match(T__12);
				}
				break;
			case T__74:
				{
				setState(824); match(T__74);
				}
				break;
			case T__53:
			case T__28:
			case Identifier:
				{
				setState(825); identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(840);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(828); match(T__65);
				setState(830);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__74) | (1L << T__53) | (1L << T__42) | (1L << T__28))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__12 - 78)) | (1L << (DecimalNumber - 78)) | (1L << (HexNumber - 78)) | (1L << (HexLiteral - 78)) | (1L << (Identifier - 78)) | (1L << (StringLiteral - 78)))) != 0)) {
					{
					setState(829); assemblyExpression();
					}
				}

				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__63) {
					{
					{
					setState(832); match(T__63);
					setState(833); assemblyExpression();
					}
					}
					setState(838);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(839); match(T__3);
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

	public static class AssemblyLocalDefinitionContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyLocalDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLocalDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLocalDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLocalDefinition(this);
		}
	}

	public final AssemblyLocalDefinitionContext assemblyLocalDefinition() throws RecognitionException {
		AssemblyLocalDefinitionContext _localctx = new AssemblyLocalDefinitionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_assemblyLocalDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842); match(T__52);
			setState(843); assemblyIdentifierOrList();
			setState(846);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(844); match(T__33);
				setState(845); assemblyExpression();
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

	public static class AssemblyAssignmentContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyIdentifierOrListContext assemblyIdentifierOrList() {
			return getRuleContext(AssemblyIdentifierOrListContext.class,0);
		}
		public AssemblyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyAssignment(this);
		}
	}

	public final AssemblyAssignmentContext assemblyAssignment() throws RecognitionException {
		AssemblyAssignmentContext _localctx = new AssemblyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_assemblyAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848); assemblyIdentifierOrList();
			setState(849); match(T__33);
			setState(850); assemblyExpression();
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

	public static class AssemblyIdentifierOrListContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyIdentifierOrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierOrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierOrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierOrList(this);
		}
	}

	public final AssemblyIdentifierOrListContext assemblyIdentifierOrList() throws RecognitionException {
		AssemblyIdentifierOrListContext _localctx = new AssemblyIdentifierOrListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_assemblyIdentifierOrList);
		try {
			setState(857);
			switch (_input.LA(1)) {
			case T__53:
			case T__28:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(852); identifier();
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 2);
				{
				setState(853); match(T__65);
				setState(854); assemblyIdentifierList();
				setState(855); match(T__3);
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

	public static class AssemblyIdentifierListContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public AssemblyIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIdentifierList(this);
		}
	}

	public final AssemblyIdentifierListContext assemblyIdentifierList() throws RecognitionException {
		AssemblyIdentifierListContext _localctx = new AssemblyIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_assemblyIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859); identifier();
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__63) {
				{
				{
				setState(860); match(T__63);
				setState(861); identifier();
				}
				}
				setState(866);
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

	public static class AssemblyStackAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyStackAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyStackAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyStackAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyStackAssignment(this);
		}
	}

	public final AssemblyStackAssignmentContext assemblyStackAssignment() throws RecognitionException {
		AssemblyStackAssignmentContext _localctx = new AssemblyStackAssignmentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assemblyStackAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867); match(T__36);
			setState(868); identifier();
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

	public static class LabelDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitLabelDefinition(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870); identifier();
			setState(871); match(T__18);
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

	public static class AssemblySwitchContext extends ParserRuleContext {
		public AssemblyCaseContext assemblyCase(int i) {
			return getRuleContext(AssemblyCaseContext.class,i);
		}
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public List<AssemblyCaseContext> assemblyCase() {
			return getRuleContexts(AssemblyCaseContext.class);
		}
		public AssemblySwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblySwitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblySwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblySwitch(this);
		}
	}

	public final AssemblySwitchContext assemblySwitch() throws RecognitionException {
		AssemblySwitchContext _localctx = new AssemblySwitchContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_assemblySwitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873); match(T__26);
			setState(874); assemblyExpression();
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__89 || _la==T__20) {
				{
				{
				setState(875); assemblyCase();
				}
				}
				setState(880);
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

	public static class AssemblyCaseContext extends ParserRuleContext {
		public AssemblyLiteralContext assemblyLiteral() {
			return getRuleContext(AssemblyLiteralContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyCase(this);
		}
	}

	public final AssemblyCaseContext assemblyCase() throws RecognitionException {
		AssemblyCaseContext _localctx = new AssemblyCaseContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_assemblyCase);
		try {
			setState(887);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(881); match(T__20);
				setState(882); assemblyLiteral();
				setState(883); assemblyBlock();
				}
				break;
			case T__89:
				enterOuterAlt(_localctx, 2);
				{
				setState(885); match(T__89);
				setState(886); assemblyBlock();
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

	public static class AssemblyFunctionDefinitionContext extends ParserRuleContext {
		public AssemblyFunctionReturnsContext assemblyFunctionReturns() {
			return getRuleContext(AssemblyFunctionReturnsContext.class,0);
		}
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyFunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionDefinition(this);
		}
	}

	public final AssemblyFunctionDefinitionContext assemblyFunctionDefinition() throws RecognitionException {
		AssemblyFunctionDefinitionContext _localctx = new AssemblyFunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_assemblyFunctionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889); match(T__50);
			setState(890); identifier();
			setState(891); match(T__65);
			setState(893);
			_la = _input.LA(1);
			if (_la==T__53 || _la==T__28 || _la==Identifier) {
				{
				setState(892); assemblyIdentifierList();
				}
			}

			setState(895); match(T__3);
			setState(897);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(896); assemblyFunctionReturns();
				}
			}

			setState(899); assemblyBlock();
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

	public static class AssemblyFunctionReturnsContext extends ParserRuleContext {
		public AssemblyIdentifierListContext assemblyIdentifierList() {
			return getRuleContext(AssemblyIdentifierListContext.class,0);
		}
		public AssemblyFunctionReturnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFunctionReturns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFunctionReturns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFunctionReturns(this);
		}
	}

	public final AssemblyFunctionReturnsContext assemblyFunctionReturns() throws RecognitionException {
		AssemblyFunctionReturnsContext _localctx = new AssemblyFunctionReturnsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_assemblyFunctionReturns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(901); match(T__21);
			setState(902); assemblyIdentifierList();
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

	public static class AssemblyForContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression(int i) {
			return getRuleContext(AssemblyExpressionContext.class,i);
		}
		public AssemblyBlockContext assemblyBlock(int i) {
			return getRuleContext(AssemblyBlockContext.class,i);
		}
		public List<AssemblyExpressionContext> assemblyExpression() {
			return getRuleContexts(AssemblyExpressionContext.class);
		}
		public List<AssemblyBlockContext> assemblyBlock() {
			return getRuleContexts(AssemblyBlockContext.class);
		}
		public AssemblyForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyFor(this);
		}
	}

	public final AssemblyForContext assemblyFor() throws RecognitionException {
		AssemblyForContext _localctx = new AssemblyForContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_assemblyFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904); match(T__71);
			setState(907);
			switch (_input.LA(1)) {
			case T__80:
				{
				setState(905); assemblyBlock();
				}
				break;
			case T__74:
			case T__53:
			case T__42:
			case T__28:
			case T__12:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(906); assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(909); assemblyExpression();
			setState(912);
			switch (_input.LA(1)) {
			case T__80:
				{
				setState(910); assemblyBlock();
				}
				break;
			case T__74:
			case T__53:
			case T__42:
			case T__28:
			case T__12:
			case DecimalNumber:
			case HexNumber:
			case HexLiteral:
			case Identifier:
			case StringLiteral:
				{
				setState(911); assemblyExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(914); assemblyBlock();
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

	public static class AssemblyIfContext extends ParserRuleContext {
		public AssemblyExpressionContext assemblyExpression() {
			return getRuleContext(AssemblyExpressionContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public AssemblyIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyIf(this);
		}
	}

	public final AssemblyIfContext assemblyIf() throws RecognitionException {
		AssemblyIfContext _localctx = new AssemblyIfContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_assemblyIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916); match(T__34);
			setState(917); assemblyExpression();
			setState(918); assemblyBlock();
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

	public static class AssemblyLiteralContext extends ParserRuleContext {
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode HexLiteral() { return getToken(SolidityParser.HexLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(SolidityParser.StringLiteral, 0); }
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public AssemblyLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblyLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterAssemblyLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitAssemblyLiteral(this);
		}
	}

	public final AssemblyLiteralContext assemblyLiteral() throws RecognitionException {
		AssemblyLiteralContext _localctx = new AssemblyLiteralContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_assemblyLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (DecimalNumber - 98)) | (1L << (HexNumber - 98)) | (1L << (HexLiteral - 98)) | (1L << (StringLiteral - 98)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class SubAssemblyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssemblyBlockContext assemblyBlock() {
			return getRuleContext(AssemblyBlockContext.class,0);
		}
		public SubAssemblyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAssembly; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterSubAssembly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitSubAssembly(this);
		}
	}

	public final SubAssemblyContext subAssembly() throws RecognitionException {
		SubAssemblyContext _localctx = new SubAssemblyContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_subAssembly);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922); match(T__2);
			setState(923); identifier();
			setState(924); assemblyBlock();
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

	public static class TupleExpressionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitTupleExpression(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_tupleExpression);
		int _la;
		try {
			setState(952);
			switch (_input.LA(1)) {
			case T__65:
				enterOuterAlt(_localctx, 1);
				{
				setState(926); match(T__65);
				{
				setState(928);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__84) | (1L << T__74) | (1L << T__69) | (1L << T__65) | (1L << T__61) | (1L << T__59) | (1L << T__57) | (1L << T__54) | (1L << T__53) | (1L << T__49) | (1L << T__28))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__17 - 73)) | (1L << (T__13 - 73)) | (1L << (T__12 - 73)) | (1L << (T__11 - 73)) | (1L << (T__9 - 73)) | (1L << (T__7 - 73)) | (1L << (T__1 - 73)) | (1L << (Int - 73)) | (1L << (Uint - 73)) | (1L << (Byte - 73)) | (1L << (Fixed - 73)) | (1L << (Ufixed - 73)) | (1L << (BooleanLiteral - 73)) | (1L << (DecimalNumber - 73)) | (1L << (HexNumber - 73)) | (1L << (HexLiteral - 73)) | (1L << (Identifier - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(927); expression(0);
					}
				}

				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__63) {
					{
					{
					setState(930); match(T__63);
					setState(932);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__84) | (1L << T__74) | (1L << T__69) | (1L << T__65) | (1L << T__61) | (1L << T__59) | (1L << T__57) | (1L << T__54) | (1L << T__53) | (1L << T__49) | (1L << T__28))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__17 - 73)) | (1L << (T__13 - 73)) | (1L << (T__12 - 73)) | (1L << (T__11 - 73)) | (1L << (T__9 - 73)) | (1L << (T__7 - 73)) | (1L << (T__1 - 73)) | (1L << (Int - 73)) | (1L << (Uint - 73)) | (1L << (Byte - 73)) | (1L << (Fixed - 73)) | (1L << (Ufixed - 73)) | (1L << (BooleanLiteral - 73)) | (1L << (DecimalNumber - 73)) | (1L << (HexNumber - 73)) | (1L << (HexLiteral - 73)) | (1L << (Identifier - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
						{
						setState(931); expression(0);
						}
					}

					}
					}
					setState(938);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(939); match(T__3);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(940); match(T__17);
				setState(949);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__84) | (1L << T__74) | (1L << T__69) | (1L << T__65) | (1L << T__61) | (1L << T__59) | (1L << T__57) | (1L << T__54) | (1L << T__53) | (1L << T__49) | (1L << T__28))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__17 - 73)) | (1L << (T__13 - 73)) | (1L << (T__12 - 73)) | (1L << (T__11 - 73)) | (1L << (T__9 - 73)) | (1L << (T__7 - 73)) | (1L << (T__1 - 73)) | (1L << (Int - 73)) | (1L << (Uint - 73)) | (1L << (Byte - 73)) | (1L << (Fixed - 73)) | (1L << (Ufixed - 73)) | (1L << (BooleanLiteral - 73)) | (1L << (DecimalNumber - 73)) | (1L << (HexNumber - 73)) | (1L << (HexLiteral - 73)) | (1L << (Identifier - 73)) | (1L << (StringLiteral - 73)))) != 0)) {
					{
					setState(941); expression(0);
					setState(946);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__63) {
						{
						{
						setState(942); match(T__63);
						setState(943); expression(0);
						}
						}
						setState(948);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(951); match(T__55);
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

	public static class ElementaryTypeNameExpressionContext extends ParserRuleContext {
		public ElementaryTypeNameContext elementaryTypeName() {
			return getRuleContext(ElementaryTypeNameContext.class,0);
		}
		public ElementaryTypeNameExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryTypeNameExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterElementaryTypeNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitElementaryTypeNameExpression(this);
		}
	}

	public final ElementaryTypeNameExpressionContext elementaryTypeNameExpression() throws RecognitionException {
		ElementaryTypeNameExpressionContext _localctx = new ElementaryTypeNameExpressionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_elementaryTypeNameExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954); elementaryTypeName();
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

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode HexNumber() { return getToken(SolidityParser.HexNumber, 0); }
		public TerminalNode DecimalNumber() { return getToken(SolidityParser.DecimalNumber, 0); }
		public TerminalNode NumberUnit() { return getToken(SolidityParser.NumberUnit, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitNumberLiteral(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			_la = _input.LA(1);
			if ( !(_la==DecimalNumber || _la==HexNumber) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(958);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(957); match(NumberUnit);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SolidityParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolidityListener ) ((SolidityListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			_la = _input.LA(1);
			if ( !(_la==T__53 || _la==T__28 || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31: return typeName_sempred((TypeNameContext)_localctx, predIndex);
		case 55: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 14);
		case 2: return precpred(_ctx, 13);
		case 3: return precpred(_ctx, 12);
		case 4: return precpred(_ctx, 11);
		case 5: return precpred(_ctx, 10);
		case 6: return precpred(_ctx, 9);
		case 7: return precpred(_ctx, 8);
		case 8: return precpred(_ctx, 7);
		case 9: return precpred(_ctx, 6);
		case 10: return precpred(_ctx, 5);
		case 11: return precpred(_ctx, 4);
		case 12: return precpred(_ctx, 3);
		case 13: return precpred(_ctx, 2);
		case 14: return precpred(_ctx, 25);
		case 15: return precpred(_ctx, 23);
		case 16: return precpred(_ctx, 22);
		case 17: return precpred(_ctx, 21);
		}
		return true;
	}
	private boolean typeName_sempred(TypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3y\u03c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\7\2\u00ae\n\2\f\2\16\2\u00b1\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00be\n\5\3\6\3\6\5\6\u00c2\n\6\3\7\3\7"+
		"\3\b\5\b\u00c7\n\b\3\b\3\b\3\t\3\t\3\t\5\t\u00ce\n\t\3\n\3\n\3\n\3\n\5"+
		"\n\u00d4\n\n\3\n\3\n\3\n\3\n\5\n\u00da\n\n\3\n\3\n\5\n\u00de\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e8\n\n\f\n\16\n\u00eb\13\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00f2\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00fa\n\13"+
		"\f\13\16\13\u00fd\13\13\5\13\u00ff\n\13\3\13\3\13\7\13\u0103\n\13\f\13"+
		"\16\13\u0106\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u010f\n\f\f\f\16"+
		"\f\u0112\13\f\3\f\3\f\5\f\u0116\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0120\n\r\3\16\3\16\7\16\u0124\n\16\f\16\16\16\u0127\13\16\3\16\3\16"+
		"\3\16\5\16\u012c\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0135\n"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0141\n\20"+
		"\f\20\16\20\u0144\13\20\5\20\u0146\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\5\22\u0152\n\22\3\22\3\22\3\23\3\23\3\23\5\23\u0159"+
		"\n\23\3\23\5\23\u015c\n\23\3\24\3\24\5\24\u0160\n\24\3\24\3\24\3\24\5"+
		"\24\u0165\n\24\3\24\3\24\5\24\u0169\n\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\7\26\u0174\n\26\f\26\16\26\u0177\13\26\3\27\3\27\3\27"+
		"\3\27\5\27\u017d\n\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u0187"+
		"\n\31\3\31\3\31\7\31\u018b\n\31\f\31\16\31\u018e\13\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\7\32\u0196\n\32\f\32\16\32\u0199\13\32\5\32\u019b\n\32"+
		"\3\32\3\32\3\33\3\33\5\33\u01a1\n\33\3\33\5\33\u01a4\n\33\3\34\3\34\3"+
		"\34\3\34\7\34\u01aa\n\34\f\34\16\34\u01ad\13\34\5\34\u01af\n\34\3\34\3"+
		"\34\3\35\3\35\5\35\u01b5\n\35\3\35\5\35\u01b8\n\35\3\36\3\36\3\36\3\36"+
		"\7\36\u01be\n\36\f\36\16\36\u01c1\13\36\5\36\u01c3\n\36\3\36\3\36\3\37"+
		"\3\37\5\37\u01c9\n\37\3 \3 \5 \u01cd\n \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!"+
		"\u01d8\n!\3!\3!\3!\5!\u01dd\n!\3!\7!\u01e0\n!\f!\16!\u01e3\13!\3\"\3\""+
		"\3\"\7\"\u01e8\n\"\f\"\16\"\u01eb\13\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\7$\u01f9\n$\f$\16$\u01fc\13$\3$\3$\5$\u0200\n$\3%\3%\3&\3&\3\'\3"+
		"\'\7\'\u0208\n\'\f\'\16\'\u020b\13\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\5(\u021b\n(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\5*\u0227\n*\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\5,\u0231\n,\3-\3-\3-\3-\5-\u0237\n-\3-\3-\5-\u023b"+
		"\n-\3-\5-\u023e\n-\3-\3-\3-\3.\3.\5.\u0245\n.\3.\3.\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\5\62\u0259\n\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\5\65\u026b\n\65\3\65\3\65\5\65\u026f\n\65\3\65\3\65\3\66\5\66\u0274"+
		"\n\66\3\66\3\66\5\66\u0278\n\66\7\66\u027a\n\66\f\66\16\66\u027d\13\66"+
		"\3\67\3\67\5\67\u0281\n\67\3\67\7\67\u0284\n\67\f\67\16\67\u0287\13\67"+
		"\3\67\5\67\u028a\n\67\3\67\3\67\38\38\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\59\u02a2\n9\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\7"+
		"9\u02dd\n9\f9\169\u02e0\139\3:\3:\3:\3:\3:\3:\3:\5:\u02e9\n:\3:\3:\3:"+
		"\3:\5:\u02ef\n:\5:\u02f1\n:\3;\3;\3;\7;\u02f6\n;\f;\16;\u02f9\13;\3<\3"+
		"<\3<\7<\u02fe\n<\f<\16<\u0301\13<\3<\5<\u0304\n<\3=\3=\3=\3=\3>\3>\5>"+
		"\u030c\n>\3>\3>\5>\u0310\n>\5>\u0312\n>\3?\3?\3?\3?\3?\3@\3@\7@\u031b"+
		"\n@\f@\16@\u031e\13@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\5A\u0333\nA\3B\3B\5B\u0337\nB\3C\3C\3C\3C\5C\u033d\nC\3C\3C\5"+
		"C\u0341\nC\3C\3C\7C\u0345\nC\fC\16C\u0348\13C\3C\5C\u034b\nC\3D\3D\3D"+
		"\3D\5D\u0351\nD\3E\3E\3E\3E\3F\3F\3F\3F\3F\5F\u035c\nF\3G\3G\3G\7G\u0361"+
		"\nG\fG\16G\u0364\13G\3H\3H\3H\3I\3I\3I\3J\3J\3J\7J\u036f\nJ\fJ\16J\u0372"+
		"\13J\3K\3K\3K\3K\3K\3K\5K\u037a\nK\3L\3L\3L\3L\5L\u0380\nL\3L\3L\5L\u0384"+
		"\nL\3L\3L\3M\3M\3M\3N\3N\3N\5N\u038e\nN\3N\3N\3N\5N\u0393\nN\3N\3N\3O"+
		"\3O\3O\3O\3P\3P\3Q\3Q\3Q\3Q\3R\3R\5R\u03a3\nR\3R\3R\5R\u03a7\nR\7R\u03a9"+
		"\nR\fR\16R\u03ac\13R\3R\3R\3R\3R\3R\7R\u03b3\nR\fR\16R\u03b6\13R\5R\u03b8"+
		"\nR\3R\5R\u03bb\nR\3S\3S\3T\3T\5T\u03c1\nT\3U\3U\3U\2\4@pV\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\2\23\t\2\23\23\26\26\"\"$$&&??RR\4\2\6\7LL\5\2kkooqr\5\2\t\t  \'\'\5"+
		"\2kkppst\7\2\22\22!!PQUU]a\4\2##OO\4\2++[[\4\2\27\27\37\37\5\2//DDVV\4"+
		"\2\20\20\67\67\6\2\"\"$$??RR\4\2\n\nMM\13\2\4\5\16\16\23\24\30\30\34\34"+
		"\36\36..\61\61\64\64\5\2deggvv\3\2de\5\2\'\'@@uu\u041e\2\u00af\3\2\2\2"+
		"\4\u00b4\3\2\2\2\6\u00b9\3\2\2\2\b\u00bd\3\2\2\2\n\u00bf\3\2\2\2\f\u00c3"+
		"\3\2\2\2\16\u00c6\3\2\2\2\20\u00ca\3\2\2\2\22\u00f1\3\2\2\2\24\u00f3\3"+
		"\2\2\2\26\u0109\3\2\2\2\30\u011f\3\2\2\2\32\u0121\3\2\2\2\34\u012f\3\2"+
		"\2\2\36\u0138\3\2\2\2 \u0149\3\2\2\2\"\u014e\3\2\2\2$\u0155\3\2\2\2&\u015d"+
		"\3\2\2\2(\u016a\3\2\2\2*\u0175\3\2\2\2,\u0178\3\2\2\2.\u0180\3\2\2\2\60"+
		"\u0182\3\2\2\2\62\u0191\3\2\2\2\64\u019e\3\2\2\2\66\u01a5\3\2\2\28\u01b2"+
		"\3\2\2\2:\u01b9\3\2\2\2<\u01c6\3\2\2\2>\u01ca\3\2\2\2@\u01d7\3\2\2\2B"+
		"\u01e4\3\2\2\2D\u01ec\3\2\2\2F\u01f3\3\2\2\2H\u0201\3\2\2\2J\u0203\3\2"+
		"\2\2L\u0205\3\2\2\2N\u021a\3\2\2\2P\u021c\3\2\2\2R\u021f\3\2\2\2T\u0228"+
		"\3\2\2\2V\u0230\3\2\2\2X\u0232\3\2\2\2Z\u0242\3\2\2\2\\\u0248\3\2\2\2"+
		"^\u0250\3\2\2\2`\u0253\3\2\2\2b\u0256\3\2\2\2d\u025c\3\2\2\2f\u025f\3"+
		"\2\2\2h\u026a\3\2\2\2j\u0273\3\2\2\2l\u027e\3\2\2\2n\u028d\3\2\2\2p\u02a1"+
		"\3\2\2\2r\u02f0\3\2\2\2t\u02f2\3\2\2\2v\u02fa\3\2\2\2x\u0305\3\2\2\2z"+
		"\u0311\3\2\2\2|\u0313\3\2\2\2~\u0318\3\2\2\2\u0080\u0332\3\2\2\2\u0082"+
		"\u0336\3\2\2\2\u0084\u033c\3\2\2\2\u0086\u034c\3\2\2\2\u0088\u0352\3\2"+
		"\2\2\u008a\u035b\3\2\2\2\u008c\u035d\3\2\2\2\u008e\u0365\3\2\2\2\u0090"+
		"\u0368\3\2\2\2\u0092\u036b\3\2\2\2\u0094\u0379\3\2\2\2\u0096\u037b\3\2"+
		"\2\2\u0098\u0387\3\2\2\2\u009a\u038a\3\2\2\2\u009c\u0396\3\2\2\2\u009e"+
		"\u039a\3\2\2\2\u00a0\u039c\3\2\2\2\u00a2\u03ba\3\2\2\2\u00a4\u03bc\3\2"+
		"\2\2\u00a6\u03be\3\2\2\2\u00a8\u03c2\3\2\2\2\u00aa\u00ae\5\4\3\2\u00ab"+
		"\u00ae\5\22\n\2\u00ac\u00ae\5\24\13\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\2"+
		"\2\3\u00b3\3\3\2\2\2\u00b4\u00b5\7\r\2\2\u00b5\u00b6\5\6\4\2\u00b6\u00b7"+
		"\5\b\5\2\u00b7\u00b8\7\66\2\2\u00b8\5\3\2\2\2\u00b9\u00ba\5\u00a8U\2\u00ba"+
		"\7\3\2\2\2\u00bb\u00be\5\n\6\2\u00bc\u00be\5p9\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\t\3\2\2\2\u00bf\u00c1\5\16\b\2\u00c0\u00c2\5\16\b"+
		"\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\13\3\2\2\2\u00c3\u00c4"+
		"\t\2\2\2\u00c4\r\3\2\2\2\u00c5\u00c7\5\f\7\2\u00c6\u00c5\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7b\2\2\u00c9\17\3\2\2\2"+
		"\u00ca\u00cd\5\u00a8U\2\u00cb\u00cc\7\60\2\2\u00cc\u00ce\5\u00a8U\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\21\3\2\2\2\u00cf\u00d0\7\\\2"+
		"\2\u00d0\u00d3\7v\2\2\u00d1\u00d2\7\60\2\2\u00d2\u00d4\5\u00a8U\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00f2\7\66"+
		"\2\2\u00d6\u00d9\7\\\2\2\u00d7\u00da\7D\2\2\u00d8\u00da\5\u00a8U\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00dc\7\60"+
		"\2\2\u00dc\u00de\5\u00a8U\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\7@\2\2\u00e0\u00e1\7v\2\2\u00e1\u00f2\7\66"+
		"\2\2\u00e2\u00e3\7\\\2\2\u00e3\u00e4\7\f\2\2\u00e4\u00e9\5\20\t\2\u00e5"+
		"\u00e6\7\35\2\2\u00e6\u00e8\5\20\t\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3"+
		"\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00ed\79\2\2\u00ed\u00ee\7@\2\2\u00ee\u00ef\7v\2"+
		"\2\u00ef\u00f0\7\66\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00cf\3\2\2\2\u00f1"+
		"\u00d6\3\2\2\2\u00f1\u00e2\3\2\2\2\u00f2\23\3\2\2\2\u00f3\u00f4\t\3\2"+
		"\2\u00f4\u00fe\5\u00a8U\2\u00f5\u00f6\7C\2\2\u00f6\u00fb\5\26\f\2\u00f7"+
		"\u00f8\7\35\2\2\u00f8\u00fa\5\26\f\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3"+
		"\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0104\7\f\2\2\u0101\u0103\5\30\r\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0107\u0108\79\2\2\u0108\25\3\2\2\2\u0109\u0115"+
		"\5B\"\2\u010a\u010b\7\33\2\2\u010b\u0110\5p9\2\u010c\u010d\7\35\2\2\u010d"+
		"\u010f\5p9\2\u010e\u010c\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2"+
		"\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114"+
		"\7Y\2\2\u0114\u0116\3\2\2\2\u0115\u010a\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\27\3\2\2\2\u0117\u0120\5\32\16\2\u0118\u0120\5\34\17\2\u0119\u0120\5"+
		"\36\20\2\u011a\u0120\5 \21\2\u011b\u0120\5\"\22\2\u011c\u0120\5&\24\2"+
		"\u011d\u0120\5,\27\2\u011e\u0120\5\60\31\2\u011f\u0117\3\2\2\2\u011f\u0118"+
		"\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011a\3\2\2\2\u011f\u011b\3\2\2\2\u011f"+
		"\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120\31\3\2\2"+
		"\2\u0121\u0125\5@!\2\u0122\u0124\t\4\2\2\u0123\u0122\3\2\2\2\u0124\u0127"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u012b\5\u00a8U\2\u0129\u012a\7\23\2\2\u012a\u012c"+
		"\5p9\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\7\66\2\2\u012e\33\3\2\2\2\u012f\u0130\7\63\2\2\u0130\u0131\5\u00a8"+
		"U\2\u0131\u0134\7\25\2\2\u0132\u0135\7D\2\2\u0133\u0135\5@!\2\u0134\u0132"+
		"\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\7\66\2\2"+
		"\u0137\35\3\2\2\2\u0138\u0139\7-\2\2\u0139\u013a\5\u00a8U\2\u013a\u0145"+
		"\7\f\2\2\u013b\u013c\5> \2\u013c\u0142\7\66\2\2\u013d\u013e\5> \2\u013e"+
		"\u013f\7\66\2\2\u013f\u0141\3\2\2\2\u0140\u013d\3\2\2\2\u0141\u0144\3"+
		"\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0145\u013b\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0148\79\2\2\u0148\37\3\2\2\2\u0149\u014a\7\31\2\2\u014a\u014b"+
		"\5\62\32\2\u014b\u014c\5*\26\2\u014c\u014d\5L\'\2\u014d!\3\2\2\2\u014e"+
		"\u014f\7W\2\2\u014f\u0151\5\u00a8U\2\u0150\u0152\5\62\32\2\u0151\u0150"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\5L\'\2\u0154"+
		"#\3\2\2\2\u0155\u015b\5\u00a8U\2\u0156\u0158\7\33\2\2\u0157\u0159\5t;"+
		"\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c"+
		"\7Y\2\2\u015b\u0156\3\2\2\2\u015b\u015c\3\2\2\2\u015c%\3\2\2\2\u015d\u015f"+
		"\7*\2\2\u015e\u0160\5\u00a8U\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2"+
		"\u0160\u0161\3\2\2\2\u0161\u0162\5\62\32\2\u0162\u0164\5*\26\2\u0163\u0165"+
		"\5(\25\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0169\7\66\2\2\u0167\u0169\5L\'\2\u0168\u0166\3\2\2\2\u0168\u0167\3\2"+
		"\2\2\u0169\'\3\2\2\2\u016a\u016b\7)\2\2\u016b\u016c\5\62\32\2\u016c)\3"+
		"\2\2\2\u016d\u0174\5$\23\2\u016e\u0174\5J&\2\u016f\u0174\7m\2\2\u0170"+
		"\u0174\7r\2\2\u0171\u0174\7o\2\2\u0172\u0174\7q\2\2\u0173\u016d\3\2\2"+
		"\2\u0173\u016e\3\2\2\2\u0173\u016f\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176+\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7>\2\2\u0179"+
		"\u017a\5\u00a8U\2\u017a\u017c\5\66\34\2\u017b\u017d\7i\2\2\u017c\u017b"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\7\66\2\2"+
		"\u017f-\3\2\2\2\u0180\u0181\5\u00a8U\2\u0181/\3\2\2\2\u0182\u0183\7=\2"+
		"\2\u0183\u0184\5\u00a8U\2\u0184\u0186\7\f\2\2\u0185\u0187\5.\30\2\u0186"+
		"\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018c\3\2\2\2\u0188\u0189\7\35"+
		"\2\2\u0189\u018b\5.\30\2\u018a\u0188\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018f\u0190\79\2\2\u0190\61\3\2\2\2\u0191\u019a\7\33\2\2\u0192\u0197"+
		"\5\64\33\2\u0193\u0194\7\35\2\2\u0194\u0196\5\64\33\2\u0195\u0193\3\2"+
		"\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198"+
		"\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u0192\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u019c\3\2\2\2\u019c\u019d\7Y\2\2\u019d\63\3\2\2\2\u019e\u01a0"+
		"\5@!\2\u019f\u01a1\5H%\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a3\3\2\2\2\u01a2\u01a4\5\u00a8U\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\65\3\2\2\2\u01a5\u01ae\7\33\2\2\u01a6\u01ab\58\35\2\u01a7"+
		"\u01a8\7\35\2\2\u01a8\u01aa\58\35\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3"+
		"\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ae\u01a6\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0\u01b1\7Y\2\2\u01b1\67\3\2\2\2\u01b2\u01b4\5@!\2\u01b3\u01b5"+
		"\7n\2\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6"+
		"\u01b8\5\u00a8U\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b89\3\2\2"+
		"\2\u01b9\u01c2\7\33\2\2\u01ba\u01bf\5<\37\2\u01bb\u01bc\7\35\2\2\u01bc"+
		"\u01be\5<\37\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2"+
		"\u01ba\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\7Y"+
		"\2\2\u01c5;\3\2\2\2\u01c6\u01c8\5@!\2\u01c7\u01c9\5H%\2\u01c8\u01c7\3"+
		"\2\2\2\u01c8\u01c9\3\2\2\2\u01c9=\3\2\2\2\u01ca\u01cc\5@!\2\u01cb\u01cd"+
		"\5H%\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01cf\5\u00a8U\2\u01cf?\3\2\2\2\u01d0\u01d1\b!\1\2\u01d1\u01d8\5n8\2"+
		"\u01d2\u01d8\5B\"\2\u01d3\u01d8\5D#\2\u01d4\u01d8\5F$\2\u01d5\u01d6\7"+
		"P\2\2\u01d6\u01d8\7p\2\2\u01d7\u01d0\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d7"+
		"\u01d3\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01e1\3\2"+
		"\2\2\u01d9\u01da\f\5\2\2\u01da\u01dc\7K\2\2\u01db\u01dd\5p9\2\u01dc\u01db"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\7%\2\2\u01df"+
		"\u01d9\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2A\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e9\5\u00a8U\2\u01e5\u01e6"+
		"\7F\2\2\u01e6\u01e8\5\u00a8U\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2"+
		"\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01eaC\3\2\2\2\u01eb\u01e9\3"+
		"\2\2\2\u01ec\u01ed\7,\2\2\u01ed\u01ee\7\33\2\2\u01ee\u01ef\5n8\2\u01ef"+
		"\u01f0\7T\2\2\u01f0\u01f1\5@!\2\u01f1\u01f2\7Y\2\2\u01f2E\3\2\2\2\u01f3"+
		"\u01f4\7*\2\2\u01f4\u01fa\5:\36\2\u01f5\u01f9\7o\2\2\u01f6\u01f9\7m\2"+
		"\2\u01f7\u01f9\5J&\2\u01f8\u01f5\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f7"+
		"\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01ff\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01fe\7)\2\2\u01fe\u0200\5:\36"+
		"\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200G\3\2\2\2\u0201\u0202"+
		"\t\5\2\2\u0202I\3\2\2\2\u0203\u0204\t\6\2\2\u0204K\3\2\2\2\u0205\u0209"+
		"\7\f\2\2\u0206\u0208\5N(\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2"+
		"\2\2\u020c\u020d\79\2\2\u020dM\3\2\2\2\u020e\u021b\5R*\2\u020f\u021b\5"+
		"T+\2\u0210\u021b\5X-\2\u0211\u021b\5L\'\2\u0212\u021b\5Z.\2\u0213\u021b"+
		"\5\\/\2\u0214\u021b\5^\60\2\u0215\u021b\5`\61\2\u0216\u021b\5b\62\2\u0217"+
		"\u021b\5d\63\2\u0218\u021b\5f\64\2\u0219\u021b\5V,\2\u021a\u020e\3\2\2"+
		"\2\u021a\u020f\3\2\2\2\u021a\u0210\3\2\2\2\u021a\u0211\3\2\2\2\u021a\u0212"+
		"\3\2\2\2\u021a\u0213\3\2\2\2\u021a\u0214\3\2\2\2\u021a\u0215\3\2\2\2\u021a"+
		"\u0216\3\2\2\2\u021a\u0217\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u0219\3\2"+
		"\2\2\u021bO\3\2\2\2\u021c\u021d\5p9\2\u021d\u021e\7\66\2\2\u021eQ\3\2"+
		"\2\2\u021f\u0220\7:\2\2\u0220\u0221\7\33\2\2\u0221\u0222\5p9\2\u0222\u0223"+
		"\7Y\2\2\u0223\u0226\5N(\2\u0224\u0225\7X\2\2\u0225\u0227\5N(\2\u0226\u0224"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227S\3\2\2\2\u0228\u0229\7\13\2\2\u0229"+
		"\u022a\7\33\2\2\u022a\u022b\5p9\2\u022b\u022c\7Y\2\2\u022c\u022d\5N(\2"+
		"\u022dU\3\2\2\2\u022e\u0231\5h\65\2\u022f\u0231\5P)\2\u0230\u022e\3\2"+
		"\2\2\u0230\u022f\3\2\2\2\u0231W\3\2\2\2\u0232\u0233\7\25\2\2\u0233\u0236"+
		"\7\33\2\2\u0234\u0237\5V,\2\u0235\u0237\7\66\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0235\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u023b\5P)\2\u0239\u023b\7\66"+
		"\2\2\u023a\u0238\3\2\2\2\u023a\u0239\3\2\2\2\u023b\u023d\3\2\2\2\u023c"+
		"\u023e\5p9\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2"+
		"\2\u023f\u0240\7Y\2\2\u0240\u0241\5N(\2\u0241Y\3\2\2\2\u0242\u0244\7Z"+
		"\2\2\u0243\u0245\7v\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u0247\5~@\2\u0247[\3\2\2\2\u0248\u0249\7\32\2\2\u0249"+
		"\u024a\5N(\2\u024a\u024b\7\13\2\2\u024b\u024c\7\33\2\2\u024c\u024d\5p"+
		"9\2\u024d\u024e\7Y\2\2\u024e\u024f\7\66\2\2\u024f]\3\2\2\2\u0250\u0251"+
		"\7l\2\2\u0251\u0252\7\66\2\2\u0252_\3\2\2\2\u0253\u0254\7j\2\2\u0254\u0255"+
		"\7\66\2\2\u0255a\3\2\2\2\u0256\u0258\7\62\2\2\u0257\u0259\5p9\2\u0258"+
		"\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\7\66"+
		"\2\2\u025bc\3\2\2\2\u025c\u025d\7I\2\2\u025d\u025e\7\66\2\2\u025ee\3\2"+
		"\2\2\u025f\u0260\7E\2\2\u0260\u0261\5|?\2\u0261\u0262\7\66\2\2\u0262g"+
		"\3\2\2\2\u0263\u0264\7!\2\2\u0264\u026b\5l\67\2\u0265\u026b\5> \2\u0266"+
		"\u0267\7\33\2\2\u0267\u0268\5j\66\2\u0268\u0269\7Y\2\2\u0269\u026b\3\2"+
		"\2\2\u026a\u0263\3\2\2\2\u026a\u0265\3\2\2\2\u026a\u0266\3\2\2\2\u026b"+
		"\u026e\3\2\2\2\u026c\u026d\7\23\2\2\u026d\u026f\5p9\2\u026e\u026c\3\2"+
		"\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\7\66\2\2\u0271"+
		"i\3\2\2\2\u0272\u0274\5> \2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u027b\3\2\2\2\u0275\u0277\7\35\2\2\u0276\u0278\5> \2\u0277\u0276\3\2"+
		"\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u0275\3\2\2\2\u027a"+
		"\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027ck\3\2\2\2"+
		"\u027d\u027b\3\2\2\2\u027e\u0285\7\33\2\2\u027f\u0281\5\u00a8U\2\u0280"+
		"\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0284\7\35"+
		"\2\2\u0283\u0280\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u028a\5\u00a8"+
		"U\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b"+
		"\u028c\7Y\2\2\u028cm\3\2\2\2\u028d\u028e\t\7\2\2\u028eo\3\2\2\2\u028f"+
		"\u0290\b9\1\2\u0290\u0291\t\b\2\2\u0291\u02a2\5p9\25\u0292\u0293\t\t\2"+
		"\2\u0293\u02a2\5p9\24\u0294\u0295\t\n\2\2\u0295\u02a2\5p9\23\u0296\u0297"+
		"\7S\2\2\u0297\u02a2\5p9\22\u0298\u0299\7&\2\2\u0299\u02a2\5p9\21\u029a"+
		"\u029b\7\b\2\2\u029b\u02a2\5@!\2\u029c\u029d\7\33\2\2\u029d\u029e\5p9"+
		"\2\u029e\u029f\7Y\2\2\u029f\u02a2\3\2\2\2\u02a0\u02a2\5r:\2\u02a1\u028f"+
		"\3\2\2\2\u02a1\u0292\3\2\2\2\u02a1\u0294\3\2\2\2\u02a1\u0296\3\2\2\2\u02a1"+
		"\u0298\3\2\2\2\u02a1\u029a\3\2\2\2\u02a1\u029c\3\2\2\2\u02a1\u02a0\3\2"+
		"\2\2\u02a2\u02de\3\2\2\2\u02a3\u02a4\f\20\2\2\u02a4\u02a5\7\21\2\2\u02a5"+
		"\u02dd\5p9\21\u02a6\u02a7\f\17\2\2\u02a7\u02a8\t\13\2\2\u02a8\u02dd\5"+
		"p9\20\u02a9\u02aa\f\16\2\2\u02aa\u02ab\t\t\2\2\u02ab\u02dd\5p9\17\u02ac"+
		"\u02ad\f\r\2\2\u02ad\u02ae\t\f\2\2\u02ae\u02dd\5p9\16\u02af\u02b0\f\f"+
		"\2\2\u02b0\u02b1\7A\2\2\u02b1\u02dd\5p9\r\u02b2\u02b3\f\13\2\2\u02b3\u02b4"+
		"\7\26\2\2\u02b4\u02dd\5p9\f\u02b5\u02b6\f\n\2\2\u02b6\u02b7\7N\2\2\u02b7"+
		"\u02dd\5p9\13\u02b8\u02b9\f\t\2\2\u02b9\u02ba\t\r\2\2\u02ba\u02dd\5p9"+
		"\n\u02bb\u02bc\f\b\2\2\u02bc\u02bd\t\16\2\2\u02bd\u02dd\5p9\t\u02be\u02bf"+
		"\f\7\2\2\u02bf\u02c0\7\17\2\2\u02c0\u02dd\5p9\b\u02c1\u02c2\f\6\2\2\u02c2"+
		"\u02c3\7\65\2\2\u02c3\u02dd\5p9\7\u02c4\u02c5\f\5\2\2\u02c5\u02c6\7<\2"+
		"\2\u02c6\u02c7\5p9\2\u02c7\u02c8\7J\2\2\u02c8\u02c9\5p9\6\u02c9\u02dd"+
		"\3\2\2\2\u02ca\u02cb\f\4\2\2\u02cb\u02cc\t\17\2\2\u02cc\u02dd\5p9\5\u02cd"+
		"\u02ce\f\33\2\2\u02ce\u02dd\t\b\2\2\u02cf\u02d0\f\31\2\2\u02d0\u02d1\7"+
		"K\2\2\u02d1\u02d2\5p9\2\u02d2\u02d3\7%\2\2\u02d3\u02dd\3\2\2\2\u02d4\u02d5"+
		"\f\30\2\2\u02d5\u02d6\7\33\2\2\u02d6\u02d7\5z>\2\u02d7\u02d8\7Y\2\2\u02d8"+
		"\u02dd\3\2\2\2\u02d9\u02da\f\27\2\2\u02da\u02db\7F\2\2\u02db\u02dd\5\u00a8"+
		"U\2\u02dc\u02a3\3\2\2\2\u02dc\u02a6\3\2\2\2\u02dc\u02a9\3\2\2\2\u02dc"+
		"\u02ac\3\2\2\2\u02dc\u02af\3\2\2\2\u02dc\u02b2\3\2\2\2\u02dc\u02b5\3\2"+
		"\2\2\u02dc\u02b8\3\2\2\2\u02dc\u02bb\3\2\2\2\u02dc\u02be\3\2\2\2\u02dc"+
		"\u02c1\3\2\2\2\u02dc\u02c4\3\2\2\2\u02dc\u02ca\3\2\2\2\u02dc\u02cd\3\2"+
		"\2\2\u02dc\u02cf\3\2\2\2\u02dc\u02d4\3\2\2\2\u02dc\u02d9\3\2\2\2\u02dd"+
		"\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02dfq\3\2\2\2"+
		"\u02e0\u02de\3\2\2\2\u02e1\u02f1\7c\2\2\u02e2\u02f1\5\u00a6T\2\u02e3\u02f1"+
		"\7g\2\2\u02e4\u02f1\7v\2\2\u02e5\u02e8\5\u00a8U\2\u02e6\u02e7\7K\2\2\u02e7"+
		"\u02e9\7%\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02f1\3\2"+
		"\2\2\u02ea\u02f1\5\u00a2R\2\u02eb\u02ee\5\u00a4S\2\u02ec\u02ed\7K\2\2"+
		"\u02ed\u02ef\7%\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1"+
		"\3\2\2\2\u02f0\u02e1\3\2\2\2\u02f0\u02e2\3\2\2\2\u02f0\u02e3\3\2\2\2\u02f0"+
		"\u02e4\3\2\2\2\u02f0\u02e5\3\2\2\2\u02f0\u02ea\3\2\2\2\u02f0\u02eb\3\2"+
		"\2\2\u02f1s\3\2\2\2\u02f2\u02f7\5p9\2\u02f3\u02f4\7\35\2\2\u02f4\u02f6"+
		"\5p9\2\u02f5\u02f3\3\2\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8u\3\2\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02ff\5x=\2\u02fb"+
		"\u02fc\7\35\2\2\u02fc\u02fe\5x=\2\u02fd\u02fb\3\2\2\2\u02fe\u0301\3\2"+
		"\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0303\3\2\2\2\u0301"+
		"\u02ff\3\2\2\2\u0302\u0304\7\35\2\2\u0303\u0302\3\2\2\2\u0303\u0304\3"+
		"\2\2\2\u0304w\3\2\2\2\u0305\u0306\5\u00a8U\2\u0306\u0307\7J\2\2\u0307"+
		"\u0308\5p9\2\u0308y\3\2\2\2\u0309\u030b\7\f\2\2\u030a\u030c\5v<\2\u030b"+
		"\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0312\79"+
		"\2\2\u030e\u0310\5t;\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0312"+
		"\3\2\2\2\u0311\u0309\3\2\2\2\u0311\u030f\3\2\2\2\u0312{\3\2\2\2\u0313"+
		"\u0314\5p9\2\u0314\u0315\7\33\2\2\u0315\u0316\5z>\2\u0316\u0317\7Y\2\2"+
		"\u0317}\3\2\2\2\u0318\u031c\7\f\2\2\u0319\u031b\5\u0080A\2\u031a\u0319"+
		"\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d"+
		"\u031f\3\2\2\2\u031e\u031c\3\2\2\2\u031f\u0320\79\2\2\u0320\177\3\2\2"+
		"\2\u0321\u0333\5\u00a8U\2\u0322\u0333\5~@\2\u0323\u0333\5\u0082B\2\u0324"+
		"\u0333\5\u0086D\2\u0325\u0333\5\u0088E\2\u0326\u0333\5\u008eH\2\u0327"+
		"\u0333\5\u0090I\2\u0328\u0333\5\u0092J\2\u0329\u0333\5\u0096L\2\u032a"+
		"\u0333\5\u009aN\2\u032b\u0333\5\u009cO\2\u032c\u0333\7j\2\2\u032d\u0333"+
		"\7l\2\2\u032e\u0333\5\u00a0Q\2\u032f\u0333\5\u00a6T\2\u0330\u0333\7v\2"+
		"\2\u0331\u0333\7g\2\2\u0332\u0321\3\2\2\2\u0332\u0322\3\2\2\2\u0332\u0323"+
		"\3\2\2\2\u0332\u0324\3\2\2\2\u0332\u0325\3\2\2\2\u0332\u0326\3\2\2\2\u0332"+
		"\u0327\3\2\2\2\u0332\u0328\3\2\2\2\u0332\u0329\3\2\2\2\u0332\u032a\3\2"+
		"\2\2\u0332\u032b\3\2\2\2\u0332\u032c\3\2\2\2\u0332\u032d\3\2\2\2\u0332"+
		"\u032e\3\2\2\2\u0332\u032f\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0331\3\2"+
		"\2\2\u0333\u0081\3\2\2\2\u0334\u0337\5\u0084C\2\u0335\u0337\5\u009eP\2"+
		"\u0336\u0334\3\2\2\2\u0336\u0335\3\2\2\2\u0337\u0083\3\2\2\2\u0338\u033d"+
		"\7\62\2\2\u0339\u033d\7P\2\2\u033a\u033d\7\22\2\2\u033b\u033d\5\u00a8"+
		"U\2\u033c\u0338\3\2\2\2\u033c\u0339\3\2\2\2\u033c\u033a\3\2\2\2\u033c"+
		"\u033b\3\2\2\2\u033d\u034a\3\2\2\2\u033e\u0340\7\33\2\2\u033f\u0341\5"+
		"\u0082B\2\u0340\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0346\3\2\2\2"+
		"\u0342\u0343\7\35\2\2\u0343\u0345\5\u0082B\2\u0344\u0342\3\2\2\2\u0345"+
		"\u0348\3\2\2\2\u0346\u0344\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0349\3\2"+
		"\2\2\u0348\u0346\3\2\2\2\u0349\u034b\7Y\2\2\u034a\u033e\3\2\2\2\u034a"+
		"\u034b\3\2\2\2\u034b\u0085\3\2\2\2\u034c\u034d\7(\2\2\u034d\u0350\5\u008a"+
		"F\2\u034e\u034f\7;\2\2\u034f\u0351\5\u0082B\2\u0350\u034e\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u0087\3\2\2\2\u0352\u0353\5\u008aF\2\u0353\u0354"+
		"\7;\2\2\u0354\u0355\5\u0082B\2\u0355\u0089\3\2\2\2\u0356\u035c\5\u00a8"+
		"U\2\u0357\u0358\7\33\2\2\u0358\u0359\5\u008cG\2\u0359\u035a\7Y\2\2\u035a"+
		"\u035c\3\2\2\2\u035b\u0356\3\2\2\2\u035b\u0357\3\2\2\2\u035c\u008b\3\2"+
		"\2\2\u035d\u0362\5\u00a8U\2\u035e\u035f\7\35\2\2\u035f\u0361\5\u00a8U"+
		"\2\u0360\u035e\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0362\u0363"+
		"\3\2\2\2\u0363\u008d\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u0366\78\2\2\u0366"+
		"\u0367\5\u00a8U\2\u0367\u008f\3\2\2\2\u0368\u0369\5\u00a8U\2\u0369\u036a"+
		"\7J\2\2\u036a\u0091\3\2\2\2\u036b\u036c\7B\2\2\u036c\u0370\5\u0082B\2"+
		"\u036d\u036f\5\u0094K\2\u036e\u036d\3\2\2\2\u036f\u0372\3\2\2\2\u0370"+
		"\u036e\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0093\3\2\2\2\u0372\u0370\3\2"+
		"\2\2\u0373\u0374\7H\2\2\u0374\u0375\5\u009eP\2\u0375\u0376\5~@\2\u0376"+
		"\u037a\3\2\2\2\u0377\u0378\7\3\2\2\u0378\u037a\5~@\2\u0379\u0373\3\2\2"+
		"\2\u0379\u0377\3\2\2\2\u037a\u0095\3\2\2\2\u037b\u037c\7*\2\2\u037c\u037d"+
		"\5\u00a8U\2\u037d\u037f\7\33\2\2\u037e\u0380\5\u008cG\2\u037f\u037e\3"+
		"\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383\7Y\2\2\u0382"+
		"\u0384\5\u0098M\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385"+
		"\3\2\2\2\u0385\u0386\5~@\2\u0386\u0097\3\2\2\2\u0387\u0388\7G\2\2\u0388"+
		"\u0389\5\u008cG\2\u0389\u0099\3\2\2\2\u038a\u038d\7\25\2\2\u038b\u038e"+
		"\5~@\2\u038c\u038e\5\u0082B\2\u038d\u038b\3\2\2\2\u038d\u038c\3\2\2\2"+
		"\u038e\u038f\3\2\2\2\u038f\u0392\5\u0082B\2\u0390\u0393\5~@\2\u0391\u0393"+
		"\5\u0082B\2\u0392\u0390\3\2\2\2\u0392\u0391\3\2\2\2\u0393\u0394\3\2\2"+
		"\2\u0394\u0395\5~@\2\u0395\u009b\3\2\2\2\u0396\u0397\7:\2\2\u0397\u0398"+
		"\5\u0082B\2\u0398\u0399\5~@\2\u0399\u009d\3\2\2\2\u039a\u039b\t\20\2\2"+
		"\u039b\u009f\3\2\2\2\u039c\u039d\7Z\2\2\u039d\u039e\5\u00a8U\2\u039e\u039f"+
		"\5~@\2\u039f\u00a1\3\2\2\2\u03a0\u03a2\7\33\2\2\u03a1\u03a3\5p9\2\u03a2"+
		"\u03a1\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03aa\3\2\2\2\u03a4\u03a6\7\35"+
		"\2\2\u03a5\u03a7\5p9\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03a9"+
		"\3\2\2\2\u03a8\u03a4\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ad\u03bb\7Y"+
		"\2\2\u03ae\u03b7\7K\2\2\u03af\u03b4\5p9\2\u03b0\u03b1\7\35\2\2\u03b1\u03b3"+
		"\5p9\2\u03b2\u03b0\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b7\u03af\3\2"+
		"\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb\7%\2\2\u03ba"+
		"\u03a0\3\2\2\2\u03ba\u03ae\3\2\2\2\u03bb\u00a3\3\2\2\2\u03bc\u03bd\5n"+
		"8\2\u03bd\u00a5\3\2\2\2\u03be\u03c0\t\21\2\2\u03bf\u03c1\7f\2\2\u03c0"+
		"\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u00a7\3\2\2\2\u03c2\u03c3\t\22"+
		"\2\2\u03c3\u00a9\3\2\2\2j\u00ad\u00af\u00bd\u00c1\u00c6\u00cd\u00d3\u00d9"+
		"\u00dd\u00e9\u00f1\u00fb\u00fe\u0104\u0110\u0115\u011f\u0125\u012b\u0134"+
		"\u0142\u0145\u0151\u0158\u015b\u015f\u0164\u0168\u0173\u0175\u017c\u0186"+
		"\u018c\u0197\u019a\u01a0\u01a3\u01ab\u01ae\u01b4\u01b7\u01bf\u01c2\u01c8"+
		"\u01cc\u01d7\u01dc\u01e1\u01e9\u01f8\u01fa\u01ff\u0209\u021a\u0226\u0230"+
		"\u0236\u023a\u023d\u0244\u0258\u026a\u026e\u0273\u0277\u027b\u0280\u0285"+
		"\u0289\u02a1\u02dc\u02de\u02e8\u02ee\u02f0\u02f7\u02ff\u0303\u030b\u030f"+
		"\u0311\u031c\u0332\u0336\u033c\u0340\u0346\u034a\u0350\u035b\u0362\u0370"+
		"\u0379\u037f\u0383\u038d\u0392\u03a2\u03a6\u03aa\u03b4\u03b7\u03ba\u03c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
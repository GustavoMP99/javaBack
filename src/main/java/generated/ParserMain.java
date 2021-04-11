// Generated from C:/Users/M-ROD/OneDrive/Documents/TEC-I2021/Compi/backendJava/backendJava/src/main/java/confG4\ParserMain.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserMain extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, ASSIGN=2, PIZQ=3, PDER=4, VIR=5, DOSPUN=6, SUM=7, SUB=8, MUL=9, 
		DIV=10, IF=11, WHILE=12, LET=13, THEN=14, ELSE=15, IN=16, DO=17, BEGIN=18, 
		END=19, CONST=20, VAR=21, ID=22, NUM=23, OPE=24, WS=25;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_singleCommand = 2, RULE_declaration = 3, 
		RULE_singleDeclaration = 4, RULE_typeDenoter = 5, RULE_expression = 6, 
		RULE_primaryExp = 7, RULE_operador = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "singleCommand", "declaration", "singleDeclaration", 
			"typeDenoter", "expression", "primaryExp", "operador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'('", "')'", "'~'", "':'", "'+'", "'-'", "'*'", 
			"'/'", "'if'", "'while'", "'let'", "'then'", "'else'", "'in'", "'do'", 
			"'begin'", "'end'", "'const'", "'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "ASSIGN", "PIZQ", "PDER", "VIR", "DOSPUN", "SUM", "SUB", 
			"MUL", "DIV", "IF", "WHILE", "LET", "THEN", "ELSE", "IN", "DO", "BEGIN", 
			"END", "CONST", "VAR", "ID", "NUM", "OPE", "WS"
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
	public String getGrammarFileName() { return "ParserMain.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserMain(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramASTContext extends ProgramContext {
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ParserMain.EOF, 0); }
		public ProgramASTContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterProgramAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitProgramAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitProgramAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			_localctx = new ProgramASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			singleCommand();
			setState(19);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommandASTContext extends CommandContext {
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(ParserMain.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(ParserMain.PyCOMA, i);
		}
		public CommandASTContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterCommandAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitCommandAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitCommandAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			_localctx = new CommandASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			singleCommand();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(22);
				match(PyCOMA);
				setState(23);
				singleCommand();
				}
				}
				setState(28);
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

	public static class SingleCommandContext extends ParserRuleContext {
		public SingleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCommand; }
	 
		public SingleCommandContext() { }
		public void copyFrom(SingleCommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetSCASTContext extends SingleCommandContext {
		public TerminalNode LET() { return getToken(ParserMain.LET, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(ParserMain.IN, 0); }
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public LetSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterLetSCAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitLetSCAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitLetSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssingSCASTContext extends SingleCommandContext {
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ParserMain.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssingSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterAssingSCAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitAssingSCAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitAssingSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallSCASTContext extends SingleCommandContext {
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode PIZQ() { return getToken(ParserMain.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(ParserMain.PDER, 0); }
		public CallSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterCallSCAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitCallSCAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitCallSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileSCASTContext extends SingleCommandContext {
		public TerminalNode WHILE() { return getToken(ParserMain.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(ParserMain.DO, 0); }
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public WhileSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterWhileSCAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitWhileSCAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitWhileSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfSCASTContext extends SingleCommandContext {
		public TerminalNode IF() { return getToken(ParserMain.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ParserMain.THEN, 0); }
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ParserMain.ELSE, 0); }
		public IfSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterIfSCAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitIfSCAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitIfSCAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockSCASTContext extends SingleCommandContext {
		public TerminalNode BEGIN() { return getToken(ParserMain.BEGIN, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode END() { return getToken(ParserMain.END, 0); }
		public BlockSCASTContext(SingleCommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterBlockSCAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitBlockSCAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitBlockSCAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleCommandContext singleCommand() throws RecognitionException {
		SingleCommandContext _localctx = new SingleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleCommand);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AssingSCASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(ID);
				setState(30);
				match(ASSIGN);
				setState(31);
				expression();
				}
				break;
			case 2:
				_localctx = new CallSCASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(ID);
				setState(33);
				match(PIZQ);
				setState(34);
				expression();
				setState(35);
				match(PDER);
				}
				break;
			case 3:
				_localctx = new IfSCASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(IF);
				setState(38);
				expression();
				setState(39);
				match(THEN);
				setState(40);
				singleCommand();
				setState(41);
				match(ELSE);
				setState(42);
				singleCommand();
				}
				break;
			case 4:
				_localctx = new WhileSCASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(WHILE);
				setState(45);
				expression();
				setState(46);
				match(DO);
				setState(47);
				singleCommand();
				}
				break;
			case 5:
				_localctx = new LetSCASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(LET);
				setState(50);
				declaration();
				setState(51);
				match(IN);
				setState(52);
				singleCommand();
				}
				break;
			case 6:
				_localctx = new BlockSCASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				match(BEGIN);
				setState(55);
				command();
				setState(56);
				match(END);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationASTContext extends DeclarationContext {
		public List<SingleDeclarationContext> singleDeclaration() {
			return getRuleContexts(SingleDeclarationContext.class);
		}
		public SingleDeclarationContext singleDeclaration(int i) {
			return getRuleContext(SingleDeclarationContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(ParserMain.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(ParserMain.PyCOMA, i);
		}
		public DeclarationASTContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterDeclarationAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitDeclarationAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitDeclarationAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			_localctx = new DeclarationASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			singleDeclaration();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(61);
				match(PyCOMA);
				setState(62);
				singleDeclaration();
				}
				}
				setState(67);
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

	public static class SingleDeclarationContext extends ParserRuleContext {
		public SingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeclaration; }
	 
		public SingleDeclarationContext() { }
		public void copyFrom(SingleDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstDeclASTContext extends SingleDeclarationContext {
		public TerminalNode CONST() { return getToken(ParserMain.CONST, 0); }
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode VIR() { return getToken(ParserMain.VIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstDeclASTContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterConstDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitConstDeclAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitConstDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclASTContext extends SingleDeclarationContext {
		public TerminalNode VAR() { return getToken(ParserMain.VAR, 0); }
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode DOSPUN() { return getToken(ParserMain.DOSPUN, 0); }
		public TypeDenoterContext typeDenoter() {
			return getRuleContext(TypeDenoterContext.class,0);
		}
		public VarDeclASTContext(SingleDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterVarDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitVarDeclAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitVarDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDeclarationContext singleDeclaration() throws RecognitionException {
		SingleDeclarationContext _localctx = new SingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDeclaration);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				_localctx = new ConstDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(CONST);
				setState(69);
				match(ID);
				setState(70);
				match(VIR);
				setState(71);
				expression();
				}
				break;
			case VAR:
				_localctx = new VarDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(VAR);
				setState(73);
				match(ID);
				setState(74);
				match(DOSPUN);
				setState(75);
				typeDenoter();
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

	public static class TypeDenoterContext extends ParserRuleContext {
		public TypeDenoterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDenoter; }
	 
		public TypeDenoterContext() { }
		public void copyFrom(TypeDenoterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeDenoterASTContext extends TypeDenoterContext {
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TypeDenoterASTContext(TypeDenoterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterTypeDenoterAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitTypeDenoterAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitTypeDenoterAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDenoterContext typeDenoter() throws RecognitionException {
		TypeDenoterContext _localctx = new TypeDenoterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeDenoter);
		try {
			_localctx = new TypeDenoterASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionASTContext extends ExpressionContext {
		public List<PrimaryExpContext> primaryExp() {
			return getRuleContexts(PrimaryExpContext.class);
		}
		public PrimaryExpContext primaryExp(int i) {
			return getRuleContext(PrimaryExpContext.class,i);
		}
		public List<OperadorContext> operador() {
			return getRuleContexts(OperadorContext.class);
		}
		public OperadorContext operador(int i) {
			return getRuleContext(OperadorContext.class,i);
		}
		public ExpressionASTContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			_localctx = new ExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			primaryExp();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				{
				setState(81);
				operador();
				setState(82);
				primaryExp();
				}
				}
				setState(88);
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

	public static class PrimaryExpContext extends ParserRuleContext {
		public PrimaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExp; }
	 
		public PrimaryExpContext() { }
		public void copyFrom(PrimaryExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumPEASTContext extends PrimaryExpContext {
		public TerminalNode NUM() { return getToken(ParserMain.NUM, 0); }
		public NumPEASTContext(PrimaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterNumPEAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitNumPEAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitNumPEAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdPEASTContext extends PrimaryExpContext {
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public IdPEASTContext(PrimaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterIdPEAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitIdPEAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitIdPEAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupPEASTContext extends PrimaryExpContext {
		public TerminalNode PIZQ() { return getToken(ParserMain.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(ParserMain.PDER, 0); }
		public GroupPEASTContext(PrimaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterGroupPEAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitGroupPEAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitGroupPEAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpContext primaryExp() throws RecognitionException {
		PrimaryExpContext _localctx = new PrimaryExpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primaryExp);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new NumPEASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(NUM);
				}
				break;
			case ID:
				_localctx = new IdPEASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(ID);
				}
				break;
			case PIZQ:
				_localctx = new GroupPEASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(PIZQ);
				setState(92);
				expression();
				setState(93);
				match(PDER);
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

	public static class OperadorContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(ParserMain.SUM, 0); }
		public TerminalNode SUB() { return getToken(ParserMain.SUB, 0); }
		public TerminalNode MUL() { return getToken(ParserMain.MUL, 0); }
		public TerminalNode DIV() { return getToken(ParserMain.DIV, 0); }
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << SUB) | (1L << MUL) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33f\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\7\5B\n\5\f\5\16\5E\13\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\b\3\b\3\b\3\b\7\bW\n\b\f\b"+
		"\16\bZ\13\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3\n\3\n\3\n\2\2\13\2\4\6"+
		"\b\n\f\16\20\22\2\3\3\2\t\f\2g\2\24\3\2\2\2\4\27\3\2\2\2\6<\3\2\2\2\b"+
		">\3\2\2\2\nN\3\2\2\2\fP\3\2\2\2\16R\3\2\2\2\20a\3\2\2\2\22c\3\2\2\2\24"+
		"\25\5\6\4\2\25\26\7\2\2\3\26\3\3\2\2\2\27\34\5\6\4\2\30\31\7\3\2\2\31"+
		"\33\5\6\4\2\32\30\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35"+
		"\5\3\2\2\2\36\34\3\2\2\2\37 \7\30\2\2 !\7\4\2\2!=\5\16\b\2\"#\7\30\2\2"+
		"#$\7\5\2\2$%\5\16\b\2%&\7\6\2\2&=\3\2\2\2\'(\7\r\2\2()\5\16\b\2)*\7\20"+
		"\2\2*+\5\6\4\2+,\7\21\2\2,-\5\6\4\2-=\3\2\2\2./\7\16\2\2/\60\5\16\b\2"+
		"\60\61\7\23\2\2\61\62\5\6\4\2\62=\3\2\2\2\63\64\7\17\2\2\64\65\5\b\5\2"+
		"\65\66\7\22\2\2\66\67\5\6\4\2\67=\3\2\2\289\7\24\2\29:\5\4\3\2:;\7\25"+
		"\2\2;=\3\2\2\2<\37\3\2\2\2<\"\3\2\2\2<\'\3\2\2\2<.\3\2\2\2<\63\3\2\2\2"+
		"<8\3\2\2\2=\7\3\2\2\2>C\5\n\6\2?@\7\3\2\2@B\5\n\6\2A?\3\2\2\2BE\3\2\2"+
		"\2CA\3\2\2\2CD\3\2\2\2D\t\3\2\2\2EC\3\2\2\2FG\7\26\2\2GH\7\30\2\2HI\7"+
		"\7\2\2IO\5\16\b\2JK\7\27\2\2KL\7\30\2\2LM\7\b\2\2MO\5\f\7\2NF\3\2\2\2"+
		"NJ\3\2\2\2O\13\3\2\2\2PQ\7\30\2\2Q\r\3\2\2\2RX\5\20\t\2ST\5\22\n\2TU\5"+
		"\20\t\2UW\3\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\17\3\2\2\2"+
		"ZX\3\2\2\2[b\7\31\2\2\\b\7\30\2\2]^\7\5\2\2^_\5\16\b\2_`\7\6\2\2`b\3\2"+
		"\2\2a[\3\2\2\2a\\\3\2\2\2a]\3\2\2\2b\21\3\2\2\2cd\t\2\2\2d\23\3\2\2\2"+
		"\b\34<CNXa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
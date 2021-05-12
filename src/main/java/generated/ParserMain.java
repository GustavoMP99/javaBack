// Generated from C:/Users/M-ROD/OneDrive/Documents/TEC - I Semestre 2021/Compi/backendJava/backendJava/src/main/java/confG4\ParserMain.g4 by ANTLR 4.9.1
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
		IF=1, ELSE=2, RETURN=3, CLASS=4, NEW=5, STRING=6, INT=7, BOOLEAN=8, LENGTH=9, 
		WHILE=10, TRUE=11, FALSE=12, OR=13, PRINT=14, AND=15, CHAR=16, EQUAL=17, 
		LEFTP=18, RIGTHP=19, LEFTPB=20, RIGTHPB=21, LEFTPC=22, RIGTHPC=23, SEMICOLON=24, 
		POINT=25, ALERT=26, IDENTICAL=27, COMA=28, MINUS=29, MAX=30, DIF=31, MINUSEQUAL=32, 
		MAXEQUAL=33, UNDERSCORE=34, EXTRA=35, SUM=36, SUBTRACT=37, MULT=38, DIV=39, 
		WS=40, COMMENT=41, INTLITERAL=42, STRINGLITERAL=43, REALLITERAL=44, ID=45, 
		LETTER=46, DIGIT=47, PRINTABLE=48;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block = 2, RULE_funtionDecl = 3, 
		RULE_formalParams = 4, RULE_formalParam = 5, RULE_whileStatement = 6, 
		RULE_ifStatement = 7, RULE_returnStatement = 8, RULE_printStatement = 9, 
		RULE_classDecl = 10, RULE_classVariableDecl = 11, RULE_variableDecl = 12, 
		RULE_type = 13, RULE_simpleType = 14, RULE_arrayType = 15, RULE_assignment = 16, 
		RULE_arrayAssignament = 17, RULE_expression = 18, RULE_simpleExpression = 19, 
		RULE_term = 20, RULE_factor = 21, RULE_unary = 22, RULE_allocationExpression = 23, 
		RULE_arrayAlocationExpression = 24, RULE_subExpression = 25, RULE_funtionCall = 26, 
		RULE_actualParams = 27, RULE_arrayLookUp = 28, RULE_arrayLength = 29, 
		RULE_relationalOp = 30, RULE_additiveOp = 31, RULE_multiplicativeOp = 32, 
		RULE_literal = 33, RULE_booleanLiteral = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block", "funtionDecl", "formalParams", "formalParam", 
			"whileStatement", "ifStatement", "returnStatement", "printStatement", 
			"classDecl", "classVariableDecl", "variableDecl", "type", "simpleType", 
			"arrayType", "assignment", "arrayAssignament", "expression", "simpleExpression", 
			"term", "factor", "unary", "allocationExpression", "arrayAlocationExpression", 
			"subExpression", "funtionCall", "actualParams", "arrayLookUp", "arrayLength", 
			"relationalOp", "additiveOp", "multiplicativeOp", "literal", "booleanLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'return'", "'class'", "'new'", "'string'", "'int'", 
			"'boolean'", "'length'", "'while'", "'true'", "'false'", "'or'", "'print'", 
			"'and'", "'char'", "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"'.'", "'!'", "'=='", "','", "'<'", "'>'", "'!='", "'<='", "'>='", "'_'", 
			"'\"'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "RETURN", "CLASS", "NEW", "STRING", "INT", "BOOLEAN", 
			"LENGTH", "WHILE", "TRUE", "FALSE", "OR", "PRINT", "AND", "CHAR", "EQUAL", 
			"LEFTP", "RIGTHP", "LEFTPB", "RIGTHPB", "LEFTPC", "RIGTHPC", "SEMICOLON", 
			"POINT", "ALERT", "IDENTICAL", "COMA", "MINUS", "MAX", "DIF", "MINUSEQUAL", 
			"MAXEQUAL", "UNDERSCORE", "EXTRA", "SUM", "SUBTRACT", "MULT", "DIV", 
			"WS", "COMMENT", "INTLITERAL", "STRINGLITERAL", "REALLITERAL", "ID", 
			"LETTER", "DIGIT", "PRINTABLE"
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		int _la;
		try {
			_localctx = new ProgramASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << RETURN) | (1L << CLASS) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << WHILE) | (1L << PRINT) | (1L << CHAR) | (1L << LEFTPB) | (1L << ID))) != 0)) {
				{
				{
				setState(70);
				statement();
				}
				}
				setState(75);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallFuntionDeclASTContext extends StatementContext {
		public FuntionDeclContext funtionDecl() {
			return getRuleContext(FuntionDeclContext.class,0);
		}
		public CallFuntionDeclASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterCallFuntionDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitCallFuntionDeclAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitCallFuntionDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallBlockASTContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CallBlockASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterCallBlockAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitCallBlockAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitCallBlockAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallClassDeclASTContext extends StatementContext {
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserMain.SEMICOLON, 0); }
		public CallClassDeclASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterCallClassDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitCallClassDeclAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitCallClassDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallAssignamentASTContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserMain.SEMICOLON, 0); }
		public CallAssignamentASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterCallAssignamentAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitCallAssignamentAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitCallAssignamentAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallPrintStatementASTContext extends StatementContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserMain.SEMICOLON, 0); }
		public CallPrintStatementASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterCallPrintStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitCallPrintStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitCallPrintStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallWhileStatementASTContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public CallWhileStatementASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterCallWhileStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitCallWhileStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitCallWhileStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallvariableDeclASTContext extends StatementContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserMain.SEMICOLON, 0); }
		public CallvariableDeclASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterCallvariableDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitCallvariableDeclAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitCallvariableDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallIfStatementASTContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CallIfStatementASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterCallIfStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitCallIfStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitCallIfStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallArrayAssignamentASTContext extends StatementContext {
		public ArrayAssignamentContext arrayAssignament() {
			return getRuleContext(ArrayAssignamentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserMain.SEMICOLON, 0); }
		public CallArrayAssignamentASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterCallArrayAssignamentAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitCallArrayAssignamentAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitCallArrayAssignamentAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallReturnStatementASTContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserMain.SEMICOLON, 0); }
		public CallReturnStatementASTContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterCallReturnStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitCallReturnStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitCallReturnStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new CallvariableDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				variableDecl();
				setState(77);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new CallClassDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				classDecl();
				setState(80);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new CallAssignamentASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				assignment();
				setState(83);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new CallArrayAssignamentASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				arrayAssignament();
				setState(86);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new CallPrintStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(88);
				printStatement();
				setState(89);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new CallIfStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				ifStatement();
				}
				break;
			case 7:
				_localctx = new CallWhileStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				whileStatement();
				}
				break;
			case 8:
				_localctx = new CallReturnStatementASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				returnStatement();
				setState(94);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new CallFuntionDeclASTContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(96);
				funtionDecl();
				}
				break;
			case 10:
				_localctx = new CallBlockASTContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(97);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockASTContext extends BlockContext {
		public TerminalNode LEFTPB() { return getToken(ParserMain.LEFTPB, 0); }
		public TerminalNode RIGTHPB() { return getToken(ParserMain.RIGTHPB, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockASTContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterBlockAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitBlockAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitBlockAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			_localctx = new BlockASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(LEFTPB);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << RETURN) | (1L << CLASS) | (1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << WHILE) | (1L << PRINT) | (1L << CHAR) | (1L << LEFTPB) | (1L << ID))) != 0)) {
				{
				{
				setState(101);
				statement();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(RIGTHPB);
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

	public static class FuntionDeclContext extends ParserRuleContext {
		public FuntionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funtionDecl; }
	 
		public FuntionDeclContext() { }
		public void copyFrom(FuntionDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuntionDeclASTContext extends FuntionDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode LEFTP() { return getToken(ParserMain.LEFTP, 0); }
		public TerminalNode RIGTHP() { return getToken(ParserMain.RIGTHP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public FuntionDeclASTContext(FuntionDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFuntionDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFuntionDeclAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFuntionDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuntionDeclContext funtionDecl() throws RecognitionException {
		FuntionDeclContext _localctx = new FuntionDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funtionDecl);
		int _la;
		try {
			_localctx = new FuntionDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			type();
			setState(110);
			match(ID);
			setState(111);
			match(LEFTP);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << CHAR) | (1L << ID))) != 0)) {
				{
				setState(112);
				formalParams();
				}
			}

			setState(115);
			match(RIGTHP);
			setState(116);
			block();
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

	public static class FormalParamsContext extends ParserRuleContext {
		public FormalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParams; }
	 
		public FormalParamsContext() { }
		public void copyFrom(FormalParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalParamsASTContext extends FormalParamsContext {
		public List<FormalParamContext> formalParam() {
			return getRuleContexts(FormalParamContext.class);
		}
		public FormalParamContext formalParam(int i) {
			return getRuleContext(FormalParamContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ParserMain.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ParserMain.COMA, i);
		}
		public FormalParamsASTContext(FormalParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFormalParamsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFormalParamsAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFormalParamsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamsContext formalParams() throws RecognitionException {
		FormalParamsContext _localctx = new FormalParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formalParams);
		int _la;
		try {
			_localctx = new FormalParamsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			formalParam();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(119);
				match(COMA);
				setState(120);
				formalParam();
				}
				}
				setState(125);
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

	public static class FormalParamContext extends ParserRuleContext {
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
	 
		public FormalParamContext() { }
		public void copyFrom(FormalParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FormalParamASTContext extends FormalParamContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserMain.SEMICOLON, 0); }
		public FormalParamASTContext(FormalParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFormalParamAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFormalParamAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFormalParamAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formalParam);
		try {
			_localctx = new FormalParamASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			type();
			setState(127);
			match(ID);
			setState(128);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	 
		public WhileStatementContext() { }
		public void copyFrom(WhileStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementASTContext extends WhileStatementContext {
		public TerminalNode WHILE() { return getToken(ParserMain.WHILE, 0); }
		public TerminalNode LEFTP() { return getToken(ParserMain.LEFTP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGTHP() { return getToken(ParserMain.RIGTHP, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementASTContext(WhileStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterWhileStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitWhileStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitWhileStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		try {
			_localctx = new WhileStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(WHILE);
			setState(131);
			match(LEFTP);
			setState(132);
			expression();
			setState(133);
			match(RIGTHP);
			setState(134);
			block();
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
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatementASTContext extends IfStatementContext {
		public TerminalNode IF() { return getToken(ParserMain.IF, 0); }
		public TerminalNode LEFTP() { return getToken(ParserMain.LEFTP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGTHP() { return getToken(ParserMain.RIGTHP, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ParserMain.ELSE, 0); }
		public IfStatementASTContext(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterIfStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitIfStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitIfStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifStatement);
		int _la;
		try {
			_localctx = new IfStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(IF);
			setState(137);
			match(LEFTP);
			setState(138);
			expression();
			setState(139);
			match(RIGTHP);
			setState(140);
			block();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(141);
				match(ELSE);
				setState(142);
				block();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnStatementASTContext extends ReturnStatementContext {
		public TerminalNode RETURN() { return getToken(ParserMain.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementASTContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterReturnStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitReturnStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitReturnStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStatement);
		try {
			_localctx = new ReturnStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(RETURN);
			setState(146);
			expression();
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

	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	 
		public PrintStatementContext() { }
		public void copyFrom(PrintStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatementASTContext extends PrintStatementContext {
		public TerminalNode PRINT() { return getToken(ParserMain.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementASTContext(PrintStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterPrintStatementAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitPrintStatementAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitPrintStatementAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printStatement);
		try {
			_localctx = new PrintStatementASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(PRINT);
			setState(149);
			expression();
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

	public static class ClassDeclContext extends ParserRuleContext {
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
	 
		public ClassDeclContext() { }
		public void copyFrom(ClassDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDeclASTContext extends ClassDeclContext {
		public TerminalNode CLASS() { return getToken(ParserMain.CLASS, 0); }
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode LEFTPB() { return getToken(ParserMain.LEFTPB, 0); }
		public TerminalNode RIGTHPB() { return getToken(ParserMain.RIGTHPB, 0); }
		public List<ClassVariableDeclContext> classVariableDecl() {
			return getRuleContexts(ClassVariableDeclContext.class);
		}
		public ClassVariableDeclContext classVariableDecl(int i) {
			return getRuleContext(ClassVariableDeclContext.class,i);
		}
		public ClassDeclASTContext(ClassDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterClassDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitClassDeclAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitClassDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classDecl);
		int _la;
		try {
			_localctx = new ClassDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(CLASS);
			setState(152);
			match(ID);
			setState(153);
			match(LEFTPB);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << INT) | (1L << BOOLEAN) | (1L << CHAR))) != 0)) {
				{
				{
				setState(154);
				classVariableDecl();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(RIGTHPB);
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

	public static class ClassVariableDeclContext extends ParserRuleContext {
		public ClassVariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVariableDecl; }
	 
		public ClassVariableDeclContext() { }
		public void copyFrom(ClassVariableDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassVariableDeclASTContext extends ClassVariableDeclContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ParserMain.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassVariableDeclASTContext(ClassVariableDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterClassVariableDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitClassVariableDeclAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitClassVariableDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVariableDeclContext classVariableDecl() throws RecognitionException {
		ClassVariableDeclContext _localctx = new ClassVariableDeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_classVariableDecl);
		int _la;
		try {
			_localctx = new ClassVariableDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			simpleType();
			setState(163);
			match(ID);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(164);
				match(EQUAL);
				setState(165);
				expression();
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

	public static class VariableDeclContext extends ParserRuleContext {
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
	 
		public VariableDeclContext() { }
		public void copyFrom(VariableDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclASTContext extends VariableDeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ParserMain.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclASTContext(VariableDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterVariableDeclAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitVariableDeclAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitVariableDeclAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDecl);
		int _la;
		try {
			_localctx = new VariableDeclASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			type();
			setState(169);
			match(ID);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(170);
				match(EQUAL);
				setState(171);
				expression();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleTypeTASTContext extends TypeContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public SimpleTypeTASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterSimpleTypeTAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitSimpleTypeTAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitSimpleTypeTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdTASTContext extends TypeContext {
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public IdTASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterIdTAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitIdTAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitIdTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTypeTASTContext extends TypeContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ArrayTypeTASTContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterArrayTypeTAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitArrayTypeTAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitArrayTypeTAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new SimpleTypeTASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				simpleType();
				}
				break;
			case 2:
				_localctx = new ArrayTypeTASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				arrayType();
				}
				break;
			case 3:
				_localctx = new IdTASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(ID);
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
	 
		public SimpleTypeContext() { }
		public void copyFrom(SimpleTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntSTASTContext extends SimpleTypeContext {
		public TerminalNode INT() { return getToken(ParserMain.INT, 0); }
		public IntSTASTContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterIntSTAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitIntSTAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitIntSTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringSTASTContext extends SimpleTypeContext {
		public TerminalNode STRING() { return getToken(ParserMain.STRING, 0); }
		public StringSTASTContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterStringSTAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitStringSTAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitStringSTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharSTASTContext extends SimpleTypeContext {
		public TerminalNode CHAR() { return getToken(ParserMain.CHAR, 0); }
		public CharSTASTContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterCharSTAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitCharSTAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitCharSTAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoleanSTASTContext extends SimpleTypeContext {
		public TerminalNode BOOLEAN() { return getToken(ParserMain.BOOLEAN, 0); }
		public BoleanSTASTContext(SimpleTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterBoleanSTAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitBoleanSTAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitBoleanSTAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_simpleType);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				_localctx = new BoleanSTASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(BOOLEAN);
				}
				break;
			case CHAR:
				_localctx = new CharSTASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(CHAR);
				}
				break;
			case INT:
				_localctx = new IntSTASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(INT);
				}
				break;
			case STRING:
				_localctx = new StringSTASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(STRING);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
	 
		public ArrayTypeContext() { }
		public void copyFrom(ArrayTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayTypeASTContext extends ArrayTypeContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode LEFTPC() { return getToken(ParserMain.LEFTPC, 0); }
		public TerminalNode RIGTHPC() { return getToken(ParserMain.RIGTHPC, 0); }
		public ArrayTypeASTContext(ArrayTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterArrayTypeAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitArrayTypeAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitArrayTypeAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			_localctx = new ArrayTypeASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			simpleType();
			setState(186);
			match(LEFTPC);
			setState(187);
			match(RIGTHPC);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentASTContext extends AssignmentContext {
		public List<TerminalNode> ID() { return getTokens(ParserMain.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserMain.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(ParserMain.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode POINT() { return getToken(ParserMain.POINT, 0); }
		public AssignmentASTContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterAssignmentAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitAssignmentAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitAssignmentAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		int _la;
		try {
			_localctx = new AssignmentASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ID);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINT) {
				{
				setState(190);
				match(POINT);
				setState(191);
				match(ID);
				}
			}

			setState(194);
			match(EQUAL);
			setState(195);
			expression();
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

	public static class ArrayAssignamentContext extends ParserRuleContext {
		public ArrayAssignamentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignament; }
	 
		public ArrayAssignamentContext() { }
		public void copyFrom(ArrayAssignamentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAssignamentASTContext extends ArrayAssignamentContext {
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode LEFTPC() { return getToken(ParserMain.LEFTPC, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGTHPC() { return getToken(ParserMain.RIGTHPC, 0); }
		public TerminalNode EQUAL() { return getToken(ParserMain.EQUAL, 0); }
		public ArrayAssignamentASTContext(ArrayAssignamentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterArrayAssignamentAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitArrayAssignamentAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitArrayAssignamentAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignamentContext arrayAssignament() throws RecognitionException {
		ArrayAssignamentContext _localctx = new ArrayAssignamentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayAssignament);
		try {
			_localctx = new ArrayAssignamentASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ID);
			setState(198);
			match(LEFTPC);
			setState(199);
			expression();
			setState(200);
			match(RIGTHPC);
			setState(201);
			match(EQUAL);
			setState(202);
			expression();
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
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<RelationalOpContext> relationalOp() {
			return getRuleContexts(RelationalOpContext.class);
		}
		public RelationalOpContext relationalOp(int i) {
			return getRuleContext(RelationalOpContext.class,i);
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
		enterRule(_localctx, 36, RULE_expression);
		try {
			int _alt;
			_localctx = new ExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			simpleExpression();
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					relationalOp();
					setState(206);
					simpleExpression();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
	 
		public SimpleExpressionContext() { }
		public void copyFrom(SimpleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleExpressionASTContext extends SimpleExpressionContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AdditiveOpContext> additiveOp() {
			return getRuleContexts(AdditiveOpContext.class);
		}
		public AdditiveOpContext additiveOp(int i) {
			return getRuleContext(AdditiveOpContext.class,i);
		}
		public SimpleExpressionASTContext(SimpleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterSimpleExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitSimpleExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitSimpleExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_simpleExpression);
		try {
			int _alt;
			_localctx = new SimpleExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			term();
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					additiveOp();
					setState(215);
					term();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermASTContext extends TermContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MultiplicativeOpContext> multiplicativeOp() {
			return getRuleContexts(MultiplicativeOpContext.class);
		}
		public MultiplicativeOpContext multiplicativeOp(int i) {
			return getRuleContext(MultiplicativeOpContext.class,i);
		}
		public TermASTContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterTermAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitTermAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitTermAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		try {
			int _alt;
			_localctx = new TermASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			factor();
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(223);
					multiplicativeOp();
					setState(224);
					factor();
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactorLiteralASTContext extends FactorContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FactorLiteralASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFactorLiteralAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFactorLiteralAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFactorLiteralAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorfuntionCallASTContext extends FactorContext {
		public FuntionCallContext funtionCall() {
			return getRuleContext(FuntionCallContext.class,0);
		}
		public FactorfuntionCallASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFactorfuntionCallAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFactorfuntionCallAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFactorfuntionCallAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorArrayLengthASTContext extends FactorContext {
		public ArrayLengthContext arrayLength() {
			return getRuleContext(ArrayLengthContext.class,0);
		}
		public FactorArrayLengthASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFactorArrayLengthAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFactorArrayLengthAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFactorArrayLengthAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorSubExpressionASTContext extends FactorContext {
		public SubExpressionContext subExpression() {
			return getRuleContext(SubExpressionContext.class,0);
		}
		public FactorSubExpressionASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFactorSubExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFactorSubExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFactorSubExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorAllocationASTContext extends FactorContext {
		public AllocationExpressionContext allocationExpression() {
			return getRuleContext(AllocationExpressionContext.class,0);
		}
		public FactorAllocationASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFactorAllocationAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFactorAllocationAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFactorAllocationAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorArrayLookUpASTContext extends FactorContext {
		public ArrayLookUpContext arrayLookUp() {
			return getRuleContext(ArrayLookUpContext.class,0);
		}
		public FactorArrayLookUpASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFactorArrayLookUpAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFactorArrayLookUpAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFactorArrayLookUpAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorIDASTContext extends FactorContext {
		public List<TerminalNode> ID() { return getTokens(ParserMain.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParserMain.ID, i);
		}
		public TerminalNode POINT() { return getToken(ParserMain.POINT, 0); }
		public FactorIDASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFactorIDAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFactorIDAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFactorIDAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorArrayAlocationASTContext extends FactorContext {
		public ArrayAlocationExpressionContext arrayAlocationExpression() {
			return getRuleContext(ArrayAlocationExpressionContext.class,0);
		}
		public FactorArrayAlocationASTContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFactorArrayAlocationAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFactorArrayAlocationAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFactorArrayAlocationAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorUnaryContext extends FactorContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public FactorUnaryContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFactorUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFactorUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFactorUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new FactorLiteralASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				literal();
				}
				break;
			case 2:
				_localctx = new FactorIDASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(ID);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POINT) {
					{
					setState(233);
					match(POINT);
					setState(234);
					match(ID);
					}
				}

				}
				break;
			case 3:
				_localctx = new FactorfuntionCallASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				funtionCall();
				}
				break;
			case 4:
				_localctx = new FactorArrayLookUpASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				arrayLookUp();
				}
				break;
			case 5:
				_localctx = new FactorArrayLengthASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
				arrayLength();
				}
				break;
			case 6:
				_localctx = new FactorSubExpressionASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(240);
				subExpression();
				}
				break;
			case 7:
				_localctx = new FactorArrayAlocationASTContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(241);
				arrayAlocationExpression();
				}
				break;
			case 8:
				_localctx = new FactorAllocationASTContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(242);
				allocationExpression();
				}
				break;
			case 9:
				_localctx = new FactorUnaryContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(243);
				unary();
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

	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
	 
		public UnaryContext() { }
		public void copyFrom(UnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryASTContext extends UnaryContext {
		public TerminalNode SUM() { return getToken(ParserMain.SUM, 0); }
		public TerminalNode SUBTRACT() { return getToken(ParserMain.SUBTRACT, 0); }
		public TerminalNode ALERT() { return getToken(ParserMain.ALERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public UnaryASTContext(UnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterUnaryAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitUnaryAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitUnaryAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unary);
		int _la;
		try {
			int _alt;
			_localctx = new UnaryASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALERT) | (1L << SUM) | (1L << SUBTRACT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(247);
					expression();
					}
					} 
				}
				setState(252);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class AllocationExpressionContext extends ParserRuleContext {
		public AllocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocationExpression; }
	 
		public AllocationExpressionContext() { }
		public void copyFrom(AllocationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AllocationExpressionASTContext extends AllocationExpressionContext {
		public TerminalNode NEW() { return getToken(ParserMain.NEW, 0); }
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode LEFTP() { return getToken(ParserMain.LEFTP, 0); }
		public TerminalNode RIGTHP() { return getToken(ParserMain.RIGTHP, 0); }
		public AllocationExpressionASTContext(AllocationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterAllocationExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitAllocationExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitAllocationExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllocationExpressionContext allocationExpression() throws RecognitionException {
		AllocationExpressionContext _localctx = new AllocationExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_allocationExpression);
		try {
			_localctx = new AllocationExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(NEW);
			setState(254);
			match(ID);
			setState(255);
			match(LEFTP);
			setState(256);
			match(RIGTHP);
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

	public static class ArrayAlocationExpressionContext extends ParserRuleContext {
		public ArrayAlocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAlocationExpression; }
	 
		public ArrayAlocationExpressionContext() { }
		public void copyFrom(ArrayAlocationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayAlocationExpressionASTContext extends ArrayAlocationExpressionContext {
		public TerminalNode NEW() { return getToken(ParserMain.NEW, 0); }
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public TerminalNode LEFTPC() { return getToken(ParserMain.LEFTPC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGTHPC() { return getToken(ParserMain.RIGTHPC, 0); }
		public ArrayAlocationExpressionASTContext(ArrayAlocationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterArrayAlocationExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitArrayAlocationExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitArrayAlocationExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAlocationExpressionContext arrayAlocationExpression() throws RecognitionException {
		ArrayAlocationExpressionContext _localctx = new ArrayAlocationExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arrayAlocationExpression);
		try {
			_localctx = new ArrayAlocationExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(NEW);
			setState(259);
			simpleType();
			setState(260);
			match(LEFTPC);
			setState(261);
			expression();
			setState(262);
			match(RIGTHPC);
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

	public static class SubExpressionContext extends ParserRuleContext {
		public SubExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subExpression; }
	 
		public SubExpressionContext() { }
		public void copyFrom(SubExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubExpressionASTContext extends SubExpressionContext {
		public TerminalNode LEFTP() { return getToken(ParserMain.LEFTP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGTHP() { return getToken(ParserMain.RIGTHP, 0); }
		public SubExpressionASTContext(SubExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterSubExpressionAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitSubExpressionAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitSubExpressionAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubExpressionContext subExpression() throws RecognitionException {
		SubExpressionContext _localctx = new SubExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_subExpression);
		try {
			_localctx = new SubExpressionASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(LEFTP);
			setState(265);
			expression();
			setState(266);
			match(RIGTHP);
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

	public static class FuntionCallContext extends ParserRuleContext {
		public FuntionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funtionCall; }
	 
		public FuntionCallContext() { }
		public void copyFrom(FuntionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuntionCallASTContext extends FuntionCallContext {
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode LEFTP() { return getToken(ParserMain.LEFTP, 0); }
		public TerminalNode RIGTHP() { return getToken(ParserMain.RIGTHP, 0); }
		public ActualParamsContext actualParams() {
			return getRuleContext(ActualParamsContext.class,0);
		}
		public FuntionCallASTContext(FuntionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFuntionCallAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFuntionCallAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFuntionCallAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuntionCallContext funtionCall() throws RecognitionException {
		FuntionCallContext _localctx = new FuntionCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funtionCall);
		int _la;
		try {
			_localctx = new FuntionCallASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(ID);
			setState(269);
			match(LEFTP);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << LEFTP) | (1L << ALERT) | (1L << SUM) | (1L << SUBTRACT) | (1L << INTLITERAL) | (1L << STRINGLITERAL) | (1L << REALLITERAL) | (1L << ID))) != 0)) {
				{
				setState(270);
				actualParams();
				}
			}

			setState(273);
			match(RIGTHP);
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

	public static class ActualParamsContext extends ParserRuleContext {
		public ActualParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParams; }
	 
		public ActualParamsContext() { }
		public void copyFrom(ActualParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActualParamsASTContext extends ActualParamsContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ParserMain.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ParserMain.COMA, i);
		}
		public ActualParamsASTContext(ActualParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterActualParamsAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitActualParamsAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitActualParamsAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParamsContext actualParams() throws RecognitionException {
		ActualParamsContext _localctx = new ActualParamsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_actualParams);
		int _la;
		try {
			_localctx = new ActualParamsASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			expression();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(276);
				match(COMA);
				setState(277);
				expression();
				}
				}
				setState(282);
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

	public static class ArrayLookUpContext extends ParserRuleContext {
		public ArrayLookUpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLookUp; }
	 
		public ArrayLookUpContext() { }
		public void copyFrom(ArrayLookUpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayLookUpASTContext extends ArrayLookUpContext {
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode LEFTPC() { return getToken(ParserMain.LEFTPC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGTHPC() { return getToken(ParserMain.RIGTHPC, 0); }
		public ArrayLookUpASTContext(ArrayLookUpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterArrayLookUpAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitArrayLookUpAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitArrayLookUpAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLookUpContext arrayLookUp() throws RecognitionException {
		ArrayLookUpContext _localctx = new ArrayLookUpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayLookUp);
		try {
			_localctx = new ArrayLookUpASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(ID);
			setState(284);
			match(LEFTPC);
			setState(285);
			expression();
			setState(286);
			match(RIGTHPC);
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

	public static class ArrayLengthContext extends ParserRuleContext {
		public ArrayLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLength; }
	 
		public ArrayLengthContext() { }
		public void copyFrom(ArrayLengthContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayLengthASTContext extends ArrayLengthContext {
		public TerminalNode ID() { return getToken(ParserMain.ID, 0); }
		public TerminalNode POINT() { return getToken(ParserMain.POINT, 0); }
		public TerminalNode LENGTH() { return getToken(ParserMain.LENGTH, 0); }
		public ArrayLengthASTContext(ArrayLengthContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterArrayLengthAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitArrayLengthAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitArrayLengthAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLengthContext arrayLength() throws RecognitionException {
		ArrayLengthContext _localctx = new ArrayLengthContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arrayLength);
		try {
			_localctx = new ArrayLengthASTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(ID);
			setState(289);
			match(POINT);
			setState(290);
			match(LENGTH);
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

	public static class RelationalOpContext extends ParserRuleContext {
		public RelationalOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOp; }
	 
		public RelationalOpContext() { }
		public void copyFrom(RelationalOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DifOPASTContext extends RelationalOpContext {
		public TerminalNode DIF() { return getToken(ParserMain.DIF, 0); }
		public DifOPASTContext(RelationalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterDifOPAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitDifOPAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitDifOPAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaxSequalASTContext extends RelationalOpContext {
		public TerminalNode MAXEQUAL() { return getToken(ParserMain.MAXEQUAL, 0); }
		public MaxSequalASTContext(RelationalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterMaxSequalAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitMaxSequalAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitMaxSequalAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdenticalOPASTContext extends RelationalOpContext {
		public TerminalNode IDENTICAL() { return getToken(ParserMain.IDENTICAL, 0); }
		public IdenticalOPASTContext(RelationalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterIdenticalOPAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitIdenticalOPAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitIdenticalOPAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinSequalOPASTContext extends RelationalOpContext {
		public TerminalNode MINUSEQUAL() { return getToken(ParserMain.MINUSEQUAL, 0); }
		public MinSequalOPASTContext(RelationalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterMinSequalOPAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitMinSequalOPAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitMinSequalOPAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusOPASTContext extends RelationalOpContext {
		public TerminalNode MINUS() { return getToken(ParserMain.MINUS, 0); }
		public MinusOPASTContext(RelationalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterMinusOPAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitMinusOPAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitMinusOPAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaxOPASTContext extends RelationalOpContext {
		public TerminalNode MAX() { return getToken(ParserMain.MAX, 0); }
		public MaxOPASTContext(RelationalOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterMaxOPAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitMaxOPAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitMaxOPAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOpContext relationalOp() throws RecognitionException {
		RelationalOpContext _localctx = new RelationalOpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relationalOp);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new MinusOPASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(MINUS);
				}
				break;
			case MAX:
				_localctx = new MaxOPASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(MAX);
				}
				break;
			case IDENTICAL:
				_localctx = new IdenticalOPASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(IDENTICAL);
				}
				break;
			case DIF:
				_localctx = new DifOPASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				match(DIF);
				}
				break;
			case MINUSEQUAL:
				_localctx = new MinSequalOPASTContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				match(MINUSEQUAL);
				}
				break;
			case MAXEQUAL:
				_localctx = new MaxSequalASTContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(297);
				match(MAXEQUAL);
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

	public static class AdditiveOpContext extends ParserRuleContext {
		public AdditiveOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOp; }
	 
		public AdditiveOpContext() { }
		public void copyFrom(AdditiveOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrOPASTContext extends AdditiveOpContext {
		public TerminalNode OR() { return getToken(ParserMain.OR, 0); }
		public OrOPASTContext(AdditiveOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterOrOPAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitOrOPAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitOrOPAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractOPASTContext extends AdditiveOpContext {
		public TerminalNode SUBTRACT() { return getToken(ParserMain.SUBTRACT, 0); }
		public SubtractOPASTContext(AdditiveOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterSubtractOPAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitSubtractOPAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitSubtractOPAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumOPASTContext extends AdditiveOpContext {
		public TerminalNode SUM() { return getToken(ParserMain.SUM, 0); }
		public SumOPASTContext(AdditiveOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterSumOPAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitSumOPAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitSumOPAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOpContext additiveOp() throws RecognitionException {
		AdditiveOpContext _localctx = new AdditiveOpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_additiveOp);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
				_localctx = new SumOPASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(SUM);
				}
				break;
			case SUBTRACT:
				_localctx = new SubtractOPASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(SUBTRACT);
				}
				break;
			case OR:
				_localctx = new OrOPASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(OR);
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

	public static class MultiplicativeOpContext extends ParserRuleContext {
		public MultiplicativeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOp; }
	 
		public MultiplicativeOpContext() { }
		public void copyFrom(MultiplicativeOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndOPASTContext extends MultiplicativeOpContext {
		public TerminalNode AND() { return getToken(ParserMain.AND, 0); }
		public AndOPASTContext(MultiplicativeOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterAndOPAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitAndOPAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitAndOPAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivOPASTContext extends MultiplicativeOpContext {
		public TerminalNode DIV() { return getToken(ParserMain.DIV, 0); }
		public DivOPASTContext(MultiplicativeOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterDivOPAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitDivOPAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitDivOPAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultOPASTContext extends MultiplicativeOpContext {
		public TerminalNode MULT() { return getToken(ParserMain.MULT, 0); }
		public MultOPASTContext(MultiplicativeOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterMultOPAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitMultOPAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitMultOPAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOpContext multiplicativeOp() throws RecognitionException {
		MultiplicativeOpContext _localctx = new MultiplicativeOpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiplicativeOp);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				_localctx = new MultOPASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(MULT);
				}
				break;
			case DIV:
				_localctx = new DivOPASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(DIV);
				}
				break;
			case AND:
				_localctx = new AndOPASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(AND);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntLiteralASTContext extends LiteralContext {
		public TerminalNode INTLITERAL() { return getToken(ParserMain.INTLITERAL, 0); }
		public IntLiteralASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterIntLiteralAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitIntLiteralAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitIntLiteralAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralASTContext extends LiteralContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BooleanLiteralASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterBooleanLiteralAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitBooleanLiteralAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitBooleanLiteralAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealLiteralASTContext extends LiteralContext {
		public TerminalNode REALLITERAL() { return getToken(ParserMain.REALLITERAL, 0); }
		public RealLiteralASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterRealLiteralAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitRealLiteralAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitRealLiteralAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralASTContext extends LiteralContext {
		public TerminalNode STRINGLITERAL() { return getToken(ParserMain.STRINGLITERAL, 0); }
		public StringLiteralASTContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterStringLiteralAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitStringLiteralAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitStringLiteralAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literal);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLITERAL:
				_localctx = new IntLiteralASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(INTLITERAL);
				}
				break;
			case REALLITERAL:
				_localctx = new RealLiteralASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(REALLITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanLiteralASTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				booleanLiteral();
				}
				break;
			case STRINGLITERAL:
				_localctx = new StringLiteralASTContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(STRINGLITERAL);
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	 
		public BooleanLiteralContext() { }
		public void copyFrom(BooleanLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FalseASTContext extends BooleanLiteralContext {
		public TerminalNode FALSE() { return getToken(ParserMain.FALSE, 0); }
		public FalseASTContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterFalseAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitFalseAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitFalseAST(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueASTContext extends BooleanLiteralContext {
		public TerminalNode TRUE() { return getToken(ParserMain.TRUE, 0); }
		public TrueASTContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).enterTrueAST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserMainListener ) ((ParserMainListener)listener).exitTrueAST(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserMainVisitor ) return ((ParserMainVisitor<? extends T>)visitor).visitTrueAST(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_booleanLiteral);
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueASTContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseASTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(FALSE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0143\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\7\2J\n\2\f\2\16\2M\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3e\n\3\3\4\3\4\7\4i\n\4\f\4\16\4l\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5"+
		"t\n\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6|\n\6\f\6\16\6\177\13\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0092\n\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f\u009e\n\f\f\f\16\f\u00a1"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00a9\n\r\3\16\3\16\3\16\3\16\5\16\u00af"+
		"\n\16\3\17\3\17\3\17\5\17\u00b4\n\17\3\20\3\20\3\20\3\20\5\20\u00ba\n"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00c3\n\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00d3\n\24"+
		"\f\24\16\24\u00d6\13\24\3\25\3\25\3\25\3\25\7\25\u00dc\n\25\f\25\16\25"+
		"\u00df\13\25\3\26\3\26\3\26\3\26\7\26\u00e5\n\26\f\26\16\26\u00e8\13\26"+
		"\3\27\3\27\3\27\3\27\5\27\u00ee\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00f7\n\27\3\30\3\30\7\30\u00fb\n\30\f\30\16\30\u00fe\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\5\34\u0112\n\34\3\34\3\34\3\35\3\35\3\35\7\35\u0119\n"+
		"\35\f\35\16\35\u011c\13\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \5 \u012d\n \3!\3!\3!\5!\u0132\n!\3\"\3\"\3\"\5\"\u0137"+
		"\n\"\3#\3#\3#\3#\5#\u013d\n#\3$\3$\5$\u0141\n$\3$\2\2%\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\3\4\2\34\34&\'"+
		"\2\u0152\2K\3\2\2\2\4d\3\2\2\2\6f\3\2\2\2\bo\3\2\2\2\nx\3\2\2\2\f\u0080"+
		"\3\2\2\2\16\u0084\3\2\2\2\20\u008a\3\2\2\2\22\u0093\3\2\2\2\24\u0096\3"+
		"\2\2\2\26\u0099\3\2\2\2\30\u00a4\3\2\2\2\32\u00aa\3\2\2\2\34\u00b3\3\2"+
		"\2\2\36\u00b9\3\2\2\2 \u00bb\3\2\2\2\"\u00bf\3\2\2\2$\u00c7\3\2\2\2&\u00ce"+
		"\3\2\2\2(\u00d7\3\2\2\2*\u00e0\3\2\2\2,\u00f6\3\2\2\2.\u00f8\3\2\2\2\60"+
		"\u00ff\3\2\2\2\62\u0104\3\2\2\2\64\u010a\3\2\2\2\66\u010e\3\2\2\28\u0115"+
		"\3\2\2\2:\u011d\3\2\2\2<\u0122\3\2\2\2>\u012c\3\2\2\2@\u0131\3\2\2\2B"+
		"\u0136\3\2\2\2D\u013c\3\2\2\2F\u0140\3\2\2\2HJ\5\4\3\2IH\3\2\2\2JM\3\2"+
		"\2\2KI\3\2\2\2KL\3\2\2\2L\3\3\2\2\2MK\3\2\2\2NO\5\32\16\2OP\7\32\2\2P"+
		"e\3\2\2\2QR\5\26\f\2RS\7\32\2\2Se\3\2\2\2TU\5\"\22\2UV\7\32\2\2Ve\3\2"+
		"\2\2WX\5$\23\2XY\7\32\2\2Ye\3\2\2\2Z[\5\24\13\2[\\\7\32\2\2\\e\3\2\2\2"+
		"]e\5\20\t\2^e\5\16\b\2_`\5\22\n\2`a\7\32\2\2ae\3\2\2\2be\5\b\5\2ce\5\6"+
		"\4\2dN\3\2\2\2dQ\3\2\2\2dT\3\2\2\2dW\3\2\2\2dZ\3\2\2\2d]\3\2\2\2d^\3\2"+
		"\2\2d_\3\2\2\2db\3\2\2\2dc\3\2\2\2e\5\3\2\2\2fj\7\26\2\2gi\5\4\3\2hg\3"+
		"\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\27\2\2n\7"+
		"\3\2\2\2op\5\34\17\2pq\7/\2\2qs\7\24\2\2rt\5\n\6\2sr\3\2\2\2st\3\2\2\2"+
		"tu\3\2\2\2uv\7\25\2\2vw\5\6\4\2w\t\3\2\2\2x}\5\f\7\2yz\7\36\2\2z|\5\f"+
		"\7\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\13\3\2\2\2\177}\3\2\2"+
		"\2\u0080\u0081\5\34\17\2\u0081\u0082\7/\2\2\u0082\u0083\7\32\2\2\u0083"+
		"\r\3\2\2\2\u0084\u0085\7\f\2\2\u0085\u0086\7\24\2\2\u0086\u0087\5&\24"+
		"\2\u0087\u0088\7\25\2\2\u0088\u0089\5\6\4\2\u0089\17\3\2\2\2\u008a\u008b"+
		"\7\3\2\2\u008b\u008c\7\24\2\2\u008c\u008d\5&\24\2\u008d\u008e\7\25\2\2"+
		"\u008e\u0091\5\6\4\2\u008f\u0090\7\4\2\2\u0090\u0092\5\6\4\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\21\3\2\2\2\u0093\u0094\7\5\2\2\u0094"+
		"\u0095\5&\24\2\u0095\23\3\2\2\2\u0096\u0097\7\20\2\2\u0097\u0098\5&\24"+
		"\2\u0098\25\3\2\2\2\u0099\u009a\7\6\2\2\u009a\u009b\7/\2\2\u009b\u009f"+
		"\7\26\2\2\u009c\u009e\5\30\r\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a3\7\27\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\5\36\20\2\u00a5"+
		"\u00a8\7/\2\2\u00a6\u00a7\7\23\2\2\u00a7\u00a9\5&\24\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\31\3\2\2\2\u00aa\u00ab\5\34\17\2\u00ab"+
		"\u00ae\7/\2\2\u00ac\u00ad\7\23\2\2\u00ad\u00af\5&\24\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\33\3\2\2\2\u00b0\u00b4\5\36\20\2\u00b1"+
		"\u00b4\5 \21\2\u00b2\u00b4\7/\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00ba\7\n\2\2\u00b6\u00ba"+
		"\7\22\2\2\u00b7\u00ba\7\t\2\2\u00b8\u00ba\7\b\2\2\u00b9\u00b5\3\2\2\2"+
		"\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\37"+
		"\3\2\2\2\u00bb\u00bc\5\36\20\2\u00bc\u00bd\7\30\2\2\u00bd\u00be\7\31\2"+
		"\2\u00be!\3\2\2\2\u00bf\u00c2\7/\2\2\u00c0\u00c1\7\33\2\2\u00c1\u00c3"+
		"\7/\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\7\23\2\2\u00c5\u00c6\5&\24\2\u00c6#\3\2\2\2\u00c7\u00c8\7/\2\2"+
		"\u00c8\u00c9\7\30\2\2\u00c9\u00ca\5&\24\2\u00ca\u00cb\7\31\2\2\u00cb\u00cc"+
		"\7\23\2\2\u00cc\u00cd\5&\24\2\u00cd%\3\2\2\2\u00ce\u00d4\5(\25\2\u00cf"+
		"\u00d0\5> \2\u00d0\u00d1\5(\25\2\u00d1\u00d3\3\2\2\2\u00d2\u00cf\3\2\2"+
		"\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\'"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dd\5*\26\2\u00d8\u00d9\5@!\2\u00d9"+
		"\u00da\5*\26\2\u00da\u00dc\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\u00df\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de)\3\2\2\2\u00df\u00dd"+
		"\3\2\2\2\u00e0\u00e6\5,\27\2\u00e1\u00e2\5B\"\2\u00e2\u00e3\5,\27\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7+\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00f7"+
		"\5D#\2\u00ea\u00ed\7/\2\2\u00eb\u00ec\7\33\2\2\u00ec\u00ee\7/\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f7\3\2\2\2\u00ef\u00f7\5\66"+
		"\34\2\u00f0\u00f7\5:\36\2\u00f1\u00f7\5<\37\2\u00f2\u00f7\5\64\33\2\u00f3"+
		"\u00f7\5\62\32\2\u00f4\u00f7\5\60\31\2\u00f5\u00f7\5.\30\2\u00f6\u00e9"+
		"\3\2\2\2\u00f6\u00ea\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6"+
		"\u00f1\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2"+
		"\2\2\u00f6\u00f5\3\2\2\2\u00f7-\3\2\2\2\u00f8\u00fc\t\2\2\2\u00f9\u00fb"+
		"\5&\24\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd/\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\7\2\2"+
		"\u0100\u0101\7/\2\2\u0101\u0102\7\24\2\2\u0102\u0103\7\25\2\2\u0103\61"+
		"\3\2\2\2\u0104\u0105\7\7\2\2\u0105\u0106\5\36\20\2\u0106\u0107\7\30\2"+
		"\2\u0107\u0108\5&\24\2\u0108\u0109\7\31\2\2\u0109\63\3\2\2\2\u010a\u010b"+
		"\7\24\2\2\u010b\u010c\5&\24\2\u010c\u010d\7\25\2\2\u010d\65\3\2\2\2\u010e"+
		"\u010f\7/\2\2\u010f\u0111\7\24\2\2\u0110\u0112\58\35\2\u0111\u0110\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\25\2\2\u0114"+
		"\67\3\2\2\2\u0115\u011a\5&\24\2\u0116\u0117\7\36\2\2\u0117\u0119\5&\24"+
		"\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b9\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\7/\2\2\u011e\u011f"+
		"\7\30\2\2\u011f\u0120\5&\24\2\u0120\u0121\7\31\2\2\u0121;\3\2\2\2\u0122"+
		"\u0123\7/\2\2\u0123\u0124\7\33\2\2\u0124\u0125\7\13\2\2\u0125=\3\2\2\2"+
		"\u0126\u012d\7\37\2\2\u0127\u012d\7 \2\2\u0128\u012d\7\35\2\2\u0129\u012d"+
		"\7!\2\2\u012a\u012d\7\"\2\2\u012b\u012d\7#\2\2\u012c\u0126\3\2\2\2\u012c"+
		"\u0127\3\2\2\2\u012c\u0128\3\2\2\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012c\u012b\3\2\2\2\u012d?\3\2\2\2\u012e\u0132\7&\2\2\u012f\u0132"+
		"\7\'\2\2\u0130\u0132\7\17\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2"+
		"\u0131\u0130\3\2\2\2\u0132A\3\2\2\2\u0133\u0137\7(\2\2\u0134\u0137\7)"+
		"\2\2\u0135\u0137\7\21\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0135\3\2\2\2\u0137C\3\2\2\2\u0138\u013d\7,\2\2\u0139\u013d\7.\2\2\u013a"+
		"\u013d\5F$\2\u013b\u013d\7-\2\2\u013c\u0138\3\2\2\2\u013c\u0139\3\2\2"+
		"\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013dE\3\2\2\2\u013e\u0141"+
		"\7\r\2\2\u013f\u0141\7\16\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2"+
		"\u0141G\3\2\2\2\33Kdjs}\u0091\u009f\u00a8\u00ae\u00b3\u00b9\u00c2\u00d4"+
		"\u00dd\u00e6\u00ed\u00f6\u00fc\u0111\u011a\u012c\u0131\u0136\u013c\u0140";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
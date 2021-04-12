// Generated from C:/Users/M-ROD/OneDrive/Documents/TEC-I2021/Compi/backendJava/backendJava/src/main/java/confG4\ParserMain.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserMain}.
 */
public interface ParserMainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserMain#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserMain.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserMain.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ParserMain.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ParserMain.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ParserMain.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ParserMain.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#funtionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuntionDecl(ParserMain.FuntionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#funtionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuntionDecl(ParserMain.FuntionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#formalParams}.
	 * @param ctx the parse tree
	 */
	void enterFormalParams(ParserMain.FormalParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#formalParams}.
	 * @param ctx the parse tree
	 */
	void exitFormalParams(ParserMain.FormalParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParam(ParserMain.FormalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParam(ParserMain.FormalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ParserMain.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ParserMain.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ParserMain.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ParserMain.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ParserMain.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ParserMain.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(ParserMain.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(ParserMain.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(ParserMain.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(ParserMain.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#classVariableDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassVariableDecl(ParserMain.ClassVariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#classVariableDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassVariableDecl(ParserMain.ClassVariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(ParserMain.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(ParserMain.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ParserMain.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ParserMain.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(ParserMain.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(ParserMain.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(ParserMain.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(ParserMain.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ParserMain.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ParserMain.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#arrayAssignament}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignament(ParserMain.ArrayAssignamentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#arrayAssignament}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignament(ParserMain.ArrayAssignamentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ParserMain.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ParserMain.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(ParserMain.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(ParserMain.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ParserMain.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ParserMain.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ParserMain.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ParserMain.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(ParserMain.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(ParserMain.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterAllocationExpression(ParserMain.AllocationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitAllocationExpression(ParserMain.AllocationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#arrayAlocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAlocationExpression(ParserMain.ArrayAlocationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#arrayAlocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAlocationExpression(ParserMain.ArrayAlocationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpression(ParserMain.SubExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpression(ParserMain.SubExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#funtionCall}.
	 * @param ctx the parse tree
	 */
	void enterFuntionCall(ParserMain.FuntionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#funtionCall}.
	 * @param ctx the parse tree
	 */
	void exitFuntionCall(ParserMain.FuntionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#actualParams}.
	 * @param ctx the parse tree
	 */
	void enterActualParams(ParserMain.ActualParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#actualParams}.
	 * @param ctx the parse tree
	 */
	void exitActualParams(ParserMain.ActualParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#arrayLookUp}.
	 * @param ctx the parse tree
	 */
	void enterArrayLookUp(ParserMain.ArrayLookUpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#arrayLookUp}.
	 * @param ctx the parse tree
	 */
	void exitArrayLookUp(ParserMain.ArrayLookUpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLength(ParserMain.ArrayLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLength(ParserMain.ArrayLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(ParserMain.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(ParserMain.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveOp(ParserMain.AdditiveOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveOp(ParserMain.AdditiveOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeOp(ParserMain.MultiplicativeOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeOp(ParserMain.MultiplicativeOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ParserMain.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ParserMain.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(ParserMain.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(ParserMain.BooleanLiteralContext ctx);
}
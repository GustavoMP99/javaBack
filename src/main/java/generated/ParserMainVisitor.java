// Generated from C:/Users/M-ROD/OneDrive/Documents/TEC-I2021/Compi/backendJava/backendJava/src/main/java/confG4\ParserMain.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserMain}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserMainVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserMain#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ParserMain.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ParserMain.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ParserMain.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#funtionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuntionDecl(ParserMain.FuntionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#formalParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParams(ParserMain.FormalParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#formalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParam(ParserMain.FormalParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(ParserMain.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ParserMain.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(ParserMain.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(ParserMain.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(ParserMain.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#classVariableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVariableDecl(ParserMain.ClassVariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(ParserMain.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ParserMain.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleType(ParserMain.SimpleTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(ParserMain.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ParserMain.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#arrayAssignament}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignament(ParserMain.ArrayAssignamentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ParserMain.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(ParserMain.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ParserMain.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ParserMain.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ParserMain.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#allocationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocationExpression(ParserMain.AllocationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#arrayAlocationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAlocationExpression(ParserMain.ArrayAlocationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpression(ParserMain.SubExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#funtionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuntionCall(ParserMain.FuntionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#actualParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParams(ParserMain.ActualParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#arrayLookUp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLookUp(ParserMain.ArrayLookUpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLength(ParserMain.ArrayLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(ParserMain.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#additiveOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOp(ParserMain.AdditiveOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#multiplicativeOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOp(ParserMain.MultiplicativeOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ParserMain.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(ParserMain.BooleanLiteralContext ctx);
}
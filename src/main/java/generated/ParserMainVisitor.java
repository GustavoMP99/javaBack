// Generated from C:/Users/M-ROD/OneDrive/Documents/TEC - I Semestre 2021/Compi/backendJava/backendJava/src/main/java/confG4\ParserMain.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link ParserMain#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramAST(ParserMain.ProgramASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callvariableDeclAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallvariableDeclAST(ParserMain.CallvariableDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callClassDeclAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallClassDeclAST(ParserMain.CallClassDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callAssignamentAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallAssignamentAST(ParserMain.CallAssignamentASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callArrayAssignamentAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArrayAssignamentAST(ParserMain.CallArrayAssignamentASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callPrintStatementAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallPrintStatementAST(ParserMain.CallPrintStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callIfStatementAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallIfStatementAST(ParserMain.CallIfStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callWhileStatementAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallWhileStatementAST(ParserMain.CallWhileStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callReturnStatementAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallReturnStatementAST(ParserMain.CallReturnStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callFuntionDeclAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFuntionDeclAST(ParserMain.CallFuntionDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callBlockAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallBlockAST(ParserMain.CallBlockASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link ParserMain#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockAST(ParserMain.BlockASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funtionDeclAST}
	 * labeled alternative in {@link ParserMain#funtionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuntionDeclAST(ParserMain.FuntionDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParamsAST}
	 * labeled alternative in {@link ParserMain#formalParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParamsAST(ParserMain.FormalParamsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParamAST}
	 * labeled alternative in {@link ParserMain#formalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParamAST(ParserMain.FormalParamASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatementAST}
	 * labeled alternative in {@link ParserMain#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementAST(ParserMain.WhileStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementAST}
	 * labeled alternative in {@link ParserMain#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementAST(ParserMain.IfStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatementAST}
	 * labeled alternative in {@link ParserMain#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatementAST(ParserMain.ReturnStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatementAST}
	 * labeled alternative in {@link ParserMain#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatementAST(ParserMain.PrintStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclAST}
	 * labeled alternative in {@link ParserMain#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclAST(ParserMain.ClassDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classVariableDeclAST}
	 * labeled alternative in {@link ParserMain#classVariableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVariableDeclAST(ParserMain.ClassVariableDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclAST}
	 * labeled alternative in {@link ParserMain#variableDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclAST(ParserMain.VariableDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleTypeTAST}
	 * labeled alternative in {@link ParserMain#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeTAST(ParserMain.SimpleTypeTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTypeTAST}
	 * labeled alternative in {@link ParserMain#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeTAST(ParserMain.ArrayTypeTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idTAST}
	 * labeled alternative in {@link ParserMain#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdTAST(ParserMain.IdTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boleanSTAST}
	 * labeled alternative in {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoleanSTAST(ParserMain.BoleanSTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charSTAST}
	 * labeled alternative in {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharSTAST(ParserMain.CharSTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intSTAST}
	 * labeled alternative in {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntSTAST(ParserMain.IntSTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringSTAST}
	 * labeled alternative in {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringSTAST(ParserMain.StringSTASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTypeAST}
	 * labeled alternative in {@link ParserMain#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeAST(ParserMain.ArrayTypeASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentAST}
	 * labeled alternative in {@link ParserMain#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentAST(ParserMain.AssignmentASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssignamentAST}
	 * labeled alternative in {@link ParserMain#arrayAssignament}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignamentAST(ParserMain.ArrayAssignamentASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link ParserMain#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAST(ParserMain.ExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleExpressionAST}
	 * labeled alternative in {@link ParserMain#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpressionAST(ParserMain.SimpleExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAST}
	 * labeled alternative in {@link ParserMain#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAST(ParserMain.TermASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorLiteralAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorLiteralAST(ParserMain.FactorLiteralASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorIDAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorIDAST(ParserMain.FactorIDASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorfuntionCallAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorfuntionCallAST(ParserMain.FactorfuntionCallASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorArrayLookUpAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorArrayLookUpAST(ParserMain.FactorArrayLookUpASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorArrayLengthAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorArrayLengthAST(ParserMain.FactorArrayLengthASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorSubExpressionAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorSubExpressionAST(ParserMain.FactorSubExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorArrayAlocationAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorArrayAlocationAST(ParserMain.FactorArrayAlocationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorAllocationAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorAllocationAST(ParserMain.FactorAllocationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorUnary}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorUnary(ParserMain.FactorUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryAST}
	 * labeled alternative in {@link ParserMain#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryAST(ParserMain.UnaryASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allocationExpressionAST}
	 * labeled alternative in {@link ParserMain#allocationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocationExpressionAST(ParserMain.AllocationExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAlocationExpressionAST}
	 * labeled alternative in {@link ParserMain#arrayAlocationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAlocationExpressionAST(ParserMain.ArrayAlocationExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpressionAST}
	 * labeled alternative in {@link ParserMain#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpressionAST(ParserMain.SubExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funtionCallAST}
	 * labeled alternative in {@link ParserMain#funtionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuntionCallAST(ParserMain.FuntionCallASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actualParamsAST}
	 * labeled alternative in {@link ParserMain#actualParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParamsAST(ParserMain.ActualParamsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLookUpAST}
	 * labeled alternative in {@link ParserMain#arrayLookUp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLookUpAST(ParserMain.ArrayLookUpASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLengthAST}
	 * labeled alternative in {@link ParserMain#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLengthAST(ParserMain.ArrayLengthASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusOPAST(ParserMain.MinusOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code maxOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxOPAST(ParserMain.MaxOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identicalOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdenticalOPAST(ParserMain.IdenticalOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code difOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifOPAST(ParserMain.DifOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minSequalOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinSequalOPAST(ParserMain.MinSequalOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code maxSequalAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxSequalAST(ParserMain.MaxSequalASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumOPAST}
	 * labeled alternative in {@link ParserMain#additiveOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumOPAST(ParserMain.SumOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtractOPAST}
	 * labeled alternative in {@link ParserMain#additiveOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractOPAST(ParserMain.SubtractOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orOPAST}
	 * labeled alternative in {@link ParserMain#additiveOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOPAST(ParserMain.OrOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multOPAST}
	 * labeled alternative in {@link ParserMain#multiplicativeOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOPAST(ParserMain.MultOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divOPAST}
	 * labeled alternative in {@link ParserMain#multiplicativeOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivOPAST(ParserMain.DivOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOPAST}
	 * labeled alternative in {@link ParserMain#multiplicativeOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOPAST(ParserMain.AndOPASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteralAST}
	 * labeled alternative in {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteralAST(ParserMain.IntLiteralASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realLiteralAST}
	 * labeled alternative in {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealLiteralAST(ParserMain.RealLiteralASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteralAST}
	 * labeled alternative in {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteralAST(ParserMain.BooleanLiteralASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteralAST}
	 * labeled alternative in {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralAST(ParserMain.StringLiteralASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueAST}
	 * labeled alternative in {@link ParserMain#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAST(ParserMain.TrueASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseAST}
	 * labeled alternative in {@link ParserMain#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAST(ParserMain.FalseASTContext ctx);
}
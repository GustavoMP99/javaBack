// Generated from C:/Users/M-ROD/OneDrive/Documents/TEC - I Semestre 2021/Compi/backendJava/backendJava/src/main/java/confG4\ParserMain.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserMain}.
 */
public interface ParserMainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link ParserMain#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramAST(ParserMain.ProgramASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link ParserMain#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramAST(ParserMain.ProgramASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callvariableDeclAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallvariableDeclAST(ParserMain.CallvariableDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callvariableDeclAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallvariableDeclAST(ParserMain.CallvariableDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callClassDeclAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallClassDeclAST(ParserMain.CallClassDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callClassDeclAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallClassDeclAST(ParserMain.CallClassDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callAssignamentAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallAssignamentAST(ParserMain.CallAssignamentASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callAssignamentAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallAssignamentAST(ParserMain.CallAssignamentASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callArrayAssignamentAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallArrayAssignamentAST(ParserMain.CallArrayAssignamentASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callArrayAssignamentAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallArrayAssignamentAST(ParserMain.CallArrayAssignamentASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callPrintStatementAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallPrintStatementAST(ParserMain.CallPrintStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callPrintStatementAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallPrintStatementAST(ParserMain.CallPrintStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callIfStatementAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallIfStatementAST(ParserMain.CallIfStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callIfStatementAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallIfStatementAST(ParserMain.CallIfStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callWhileStatementAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallWhileStatementAST(ParserMain.CallWhileStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callWhileStatementAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallWhileStatementAST(ParserMain.CallWhileStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callReturnStatementAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallReturnStatementAST(ParserMain.CallReturnStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callReturnStatementAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallReturnStatementAST(ParserMain.CallReturnStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callFuntionDeclAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallFuntionDeclAST(ParserMain.CallFuntionDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callFuntionDeclAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallFuntionDeclAST(ParserMain.CallFuntionDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callBlockAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void enterCallBlockAST(ParserMain.CallBlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callBlockAST}
	 * labeled alternative in {@link ParserMain#statement}.
	 * @param ctx the parse tree
	 */
	void exitCallBlockAST(ParserMain.CallBlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link ParserMain#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockAST(ParserMain.BlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link ParserMain#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockAST(ParserMain.BlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funtionDeclAST}
	 * labeled alternative in {@link ParserMain#funtionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuntionDeclAST(ParserMain.FuntionDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funtionDeclAST}
	 * labeled alternative in {@link ParserMain#funtionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuntionDeclAST(ParserMain.FuntionDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formalParamsAST}
	 * labeled alternative in {@link ParserMain#formalParams}.
	 * @param ctx the parse tree
	 */
	void enterFormalParamsAST(ParserMain.FormalParamsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formalParamsAST}
	 * labeled alternative in {@link ParserMain#formalParams}.
	 * @param ctx the parse tree
	 */
	void exitFormalParamsAST(ParserMain.FormalParamsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formalParamAST}
	 * labeled alternative in {@link ParserMain#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParamAST(ParserMain.FormalParamASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formalParamAST}
	 * labeled alternative in {@link ParserMain#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParamAST(ParserMain.FormalParamASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatementAST}
	 * labeled alternative in {@link ParserMain#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementAST(ParserMain.WhileStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatementAST}
	 * labeled alternative in {@link ParserMain#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementAST(ParserMain.WhileStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementAST}
	 * labeled alternative in {@link ParserMain#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementAST(ParserMain.IfStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementAST}
	 * labeled alternative in {@link ParserMain#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementAST(ParserMain.IfStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatementAST}
	 * labeled alternative in {@link ParserMain#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementAST(ParserMain.ReturnStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatementAST}
	 * labeled alternative in {@link ParserMain#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementAST(ParserMain.ReturnStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatementAST}
	 * labeled alternative in {@link ParserMain#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatementAST(ParserMain.PrintStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatementAST}
	 * labeled alternative in {@link ParserMain#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatementAST(ParserMain.PrintStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclAST}
	 * labeled alternative in {@link ParserMain#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclAST(ParserMain.ClassDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclAST}
	 * labeled alternative in {@link ParserMain#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclAST(ParserMain.ClassDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classVariableDeclAST}
	 * labeled alternative in {@link ParserMain#classVariableDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassVariableDeclAST(ParserMain.ClassVariableDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classVariableDeclAST}
	 * labeled alternative in {@link ParserMain#classVariableDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassVariableDeclAST(ParserMain.ClassVariableDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclAST}
	 * labeled alternative in {@link ParserMain#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclAST(ParserMain.VariableDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclAST}
	 * labeled alternative in {@link ParserMain#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclAST(ParserMain.VariableDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleTypeTAST}
	 * labeled alternative in {@link ParserMain#type}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeTAST(ParserMain.SimpleTypeTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleTypeTAST}
	 * labeled alternative in {@link ParserMain#type}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeTAST(ParserMain.SimpleTypeTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTypeTAST}
	 * labeled alternative in {@link ParserMain#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeTAST(ParserMain.ArrayTypeTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTypeTAST}
	 * labeled alternative in {@link ParserMain#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeTAST(ParserMain.ArrayTypeTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idTAST}
	 * labeled alternative in {@link ParserMain#type}.
	 * @param ctx the parse tree
	 */
	void enterIdTAST(ParserMain.IdTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idTAST}
	 * labeled alternative in {@link ParserMain#type}.
	 * @param ctx the parse tree
	 */
	void exitIdTAST(ParserMain.IdTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boleanSTAST}
	 * labeled alternative in {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterBoleanSTAST(ParserMain.BoleanSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boleanSTAST}
	 * labeled alternative in {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitBoleanSTAST(ParserMain.BoleanSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charSTAST}
	 * labeled alternative in {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterCharSTAST(ParserMain.CharSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charSTAST}
	 * labeled alternative in {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitCharSTAST(ParserMain.CharSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intSTAST}
	 * labeled alternative in {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterIntSTAST(ParserMain.IntSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intSTAST}
	 * labeled alternative in {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitIntSTAST(ParserMain.IntSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringSTAST}
	 * labeled alternative in {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterStringSTAST(ParserMain.StringSTASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringSTAST}
	 * labeled alternative in {@link ParserMain#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitStringSTAST(ParserMain.StringSTASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTypeAST}
	 * labeled alternative in {@link ParserMain#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeAST(ParserMain.ArrayTypeASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTypeAST}
	 * labeled alternative in {@link ParserMain#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeAST(ParserMain.ArrayTypeASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentAST}
	 * labeled alternative in {@link ParserMain#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentAST(ParserMain.AssignmentASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentAST}
	 * labeled alternative in {@link ParserMain#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentAST(ParserMain.AssignmentASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssignamentAST}
	 * labeled alternative in {@link ParserMain#arrayAssignament}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignamentAST(ParserMain.ArrayAssignamentASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssignamentAST}
	 * labeled alternative in {@link ParserMain#arrayAssignament}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignamentAST(ParserMain.ArrayAssignamentASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link ParserMain#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAST(ParserMain.ExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link ParserMain#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAST(ParserMain.ExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExpressionAST}
	 * labeled alternative in {@link ParserMain#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpressionAST(ParserMain.SimpleExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExpressionAST}
	 * labeled alternative in {@link ParserMain#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpressionAST(ParserMain.SimpleExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAST}
	 * labeled alternative in {@link ParserMain#term}.
	 * @param ctx the parse tree
	 */
	void enterTermAST(ParserMain.TermASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAST}
	 * labeled alternative in {@link ParserMain#term}.
	 * @param ctx the parse tree
	 */
	void exitTermAST(ParserMain.TermASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorLiteralAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorLiteralAST(ParserMain.FactorLiteralASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorLiteralAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorLiteralAST(ParserMain.FactorLiteralASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorIDAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorIDAST(ParserMain.FactorIDASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorIDAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorIDAST(ParserMain.FactorIDASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorfuntionCallAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorfuntionCallAST(ParserMain.FactorfuntionCallASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorfuntionCallAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorfuntionCallAST(ParserMain.FactorfuntionCallASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorArrayLookUpAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorArrayLookUpAST(ParserMain.FactorArrayLookUpASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorArrayLookUpAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorArrayLookUpAST(ParserMain.FactorArrayLookUpASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorArrayLengthAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorArrayLengthAST(ParserMain.FactorArrayLengthASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorArrayLengthAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorArrayLengthAST(ParserMain.FactorArrayLengthASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorSubExpressionAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorSubExpressionAST(ParserMain.FactorSubExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorSubExpressionAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorSubExpressionAST(ParserMain.FactorSubExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorArrayAlocationAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorArrayAlocationAST(ParserMain.FactorArrayAlocationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorArrayAlocationAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorArrayAlocationAST(ParserMain.FactorArrayAlocationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorAllocationAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorAllocationAST(ParserMain.FactorAllocationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorAllocationAST}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorAllocationAST(ParserMain.FactorAllocationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorUnary}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorUnary(ParserMain.FactorUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorUnary}
	 * labeled alternative in {@link ParserMain#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorUnary(ParserMain.FactorUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryAST}
	 * labeled alternative in {@link ParserMain#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnaryAST(ParserMain.UnaryASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryAST}
	 * labeled alternative in {@link ParserMain#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnaryAST(ParserMain.UnaryASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allocationExpressionAST}
	 * labeled alternative in {@link ParserMain#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterAllocationExpressionAST(ParserMain.AllocationExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allocationExpressionAST}
	 * labeled alternative in {@link ParserMain#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitAllocationExpressionAST(ParserMain.AllocationExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAlocationExpressionAST}
	 * labeled alternative in {@link ParserMain#arrayAlocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAlocationExpressionAST(ParserMain.ArrayAlocationExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAlocationExpressionAST}
	 * labeled alternative in {@link ParserMain#arrayAlocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAlocationExpressionAST(ParserMain.ArrayAlocationExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpressionAST}
	 * labeled alternative in {@link ParserMain#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpressionAST(ParserMain.SubExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpressionAST}
	 * labeled alternative in {@link ParserMain#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpressionAST(ParserMain.SubExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funtionCallAST}
	 * labeled alternative in {@link ParserMain#funtionCall}.
	 * @param ctx the parse tree
	 */
	void enterFuntionCallAST(ParserMain.FuntionCallASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funtionCallAST}
	 * labeled alternative in {@link ParserMain#funtionCall}.
	 * @param ctx the parse tree
	 */
	void exitFuntionCallAST(ParserMain.FuntionCallASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actualParamsAST}
	 * labeled alternative in {@link ParserMain#actualParams}.
	 * @param ctx the parse tree
	 */
	void enterActualParamsAST(ParserMain.ActualParamsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actualParamsAST}
	 * labeled alternative in {@link ParserMain#actualParams}.
	 * @param ctx the parse tree
	 */
	void exitActualParamsAST(ParserMain.ActualParamsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLookUpAST}
	 * labeled alternative in {@link ParserMain#arrayLookUp}.
	 * @param ctx the parse tree
	 */
	void enterArrayLookUpAST(ParserMain.ArrayLookUpASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLookUpAST}
	 * labeled alternative in {@link ParserMain#arrayLookUp}.
	 * @param ctx the parse tree
	 */
	void exitArrayLookUpAST(ParserMain.ArrayLookUpASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLengthAST}
	 * labeled alternative in {@link ParserMain#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthAST(ParserMain.ArrayLengthASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLengthAST}
	 * labeled alternative in {@link ParserMain#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthAST(ParserMain.ArrayLengthASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterMinusOPAST(ParserMain.MinusOPASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitMinusOPAST(ParserMain.MinusOPASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code maxOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterMaxOPAST(ParserMain.MaxOPASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code maxOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitMaxOPAST(ParserMain.MaxOPASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identicalOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterIdenticalOPAST(ParserMain.IdenticalOPASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identicalOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitIdenticalOPAST(ParserMain.IdenticalOPASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code difOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterDifOPAST(ParserMain.DifOPASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code difOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitDifOPAST(ParserMain.DifOPASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minSequalOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterMinSequalOPAST(ParserMain.MinSequalOPASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minSequalOPAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitMinSequalOPAST(ParserMain.MinSequalOPASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code maxSequalAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterMaxSequalAST(ParserMain.MaxSequalASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code maxSequalAST}
	 * labeled alternative in {@link ParserMain#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitMaxSequalAST(ParserMain.MaxSequalASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumOPAST}
	 * labeled alternative in {@link ParserMain#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterSumOPAST(ParserMain.SumOPASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumOPAST}
	 * labeled alternative in {@link ParserMain#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitSumOPAST(ParserMain.SumOPASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractOPAST}
	 * labeled alternative in {@link ParserMain#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterSubtractOPAST(ParserMain.SubtractOPASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractOPAST}
	 * labeled alternative in {@link ParserMain#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitSubtractOPAST(ParserMain.SubtractOPASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orOPAST}
	 * labeled alternative in {@link ParserMain#additiveOp}.
	 * @param ctx the parse tree
	 */
	void enterOrOPAST(ParserMain.OrOPASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orOPAST}
	 * labeled alternative in {@link ParserMain#additiveOp}.
	 * @param ctx the parse tree
	 */
	void exitOrOPAST(ParserMain.OrOPASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multOPAST}
	 * labeled alternative in {@link ParserMain#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOPAST(ParserMain.MultOPASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multOPAST}
	 * labeled alternative in {@link ParserMain#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOPAST(ParserMain.MultOPASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divOPAST}
	 * labeled alternative in {@link ParserMain#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterDivOPAST(ParserMain.DivOPASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divOPAST}
	 * labeled alternative in {@link ParserMain#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitDivOPAST(ParserMain.DivOPASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOPAST}
	 * labeled alternative in {@link ParserMain#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void enterAndOPAST(ParserMain.AndOPASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOPAST}
	 * labeled alternative in {@link ParserMain#multiplicativeOp}.
	 * @param ctx the parse tree
	 */
	void exitAndOPAST(ParserMain.AndOPASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteralAST}
	 * labeled alternative in {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteralAST(ParserMain.IntLiteralASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteralAST}
	 * labeled alternative in {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteralAST(ParserMain.IntLiteralASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realLiteralAST}
	 * labeled alternative in {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 */
	void enterRealLiteralAST(ParserMain.RealLiteralASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realLiteralAST}
	 * labeled alternative in {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 */
	void exitRealLiteralAST(ParserMain.RealLiteralASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteralAST}
	 * labeled alternative in {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteralAST(ParserMain.BooleanLiteralASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteralAST}
	 * labeled alternative in {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteralAST(ParserMain.BooleanLiteralASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteralAST}
	 * labeled alternative in {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralAST(ParserMain.StringLiteralASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteralAST}
	 * labeled alternative in {@link ParserMain#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralAST(ParserMain.StringLiteralASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueAST}
	 * labeled alternative in {@link ParserMain#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTrueAST(ParserMain.TrueASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueAST}
	 * labeled alternative in {@link ParserMain#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTrueAST(ParserMain.TrueASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseAST}
	 * labeled alternative in {@link ParserMain#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFalseAST(ParserMain.FalseASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseAST}
	 * labeled alternative in {@link ParserMain#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFalseAST(ParserMain.FalseASTContext ctx);
}
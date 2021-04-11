// Generated from C:/Users/M-ROD/OneDrive/Documents/TEC-I2021/Compi/backendJava/backendJava/src/main/java/confG4\ParserMain.g4 by ANTLR 4.9.1
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
	 * Enter a parse tree produced by the {@code commandAST}
	 * labeled alternative in {@link ParserMain#command}.
	 * @param ctx the parse tree
	 */
	void enterCommandAST(ParserMain.CommandASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commandAST}
	 * labeled alternative in {@link ParserMain#command}.
	 * @param ctx the parse tree
	 */
	void exitCommandAST(ParserMain.CommandASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assingSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterAssingSCAST(ParserMain.AssingSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assingSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitAssingSCAST(ParserMain.AssingSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterCallSCAST(ParserMain.CallSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitCallSCAST(ParserMain.CallSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterIfSCAST(ParserMain.IfSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitIfSCAST(ParserMain.IfSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterWhileSCAST(ParserMain.WhileSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitWhileSCAST(ParserMain.WhileSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterLetSCAST(ParserMain.LetSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitLetSCAST(ParserMain.LetSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 */
	void enterBlockSCAST(ParserMain.BlockSCASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 */
	void exitBlockSCAST(ParserMain.BlockSCASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarationAST}
	 * labeled alternative in {@link ParserMain#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationAST(ParserMain.DeclarationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarationAST}
	 * labeled alternative in {@link ParserMain#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationAST(ParserMain.DeclarationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constDeclAST}
	 * labeled alternative in {@link ParserMain#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclAST(ParserMain.ConstDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constDeclAST}
	 * labeled alternative in {@link ParserMain#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclAST(ParserMain.ConstDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclAST}
	 * labeled alternative in {@link ParserMain#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclAST(ParserMain.VarDeclASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclAST}
	 * labeled alternative in {@link ParserMain#singleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclAST(ParserMain.VarDeclASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDenoterAST}
	 * labeled alternative in {@link ParserMain#typeDenoter}.
	 * @param ctx the parse tree
	 */
	void enterTypeDenoterAST(ParserMain.TypeDenoterASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDenoterAST}
	 * labeled alternative in {@link ParserMain#typeDenoter}.
	 * @param ctx the parse tree
	 */
	void exitTypeDenoterAST(ParserMain.TypeDenoterASTContext ctx);
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
	 * Enter a parse tree produced by the {@code numPEAST}
	 * labeled alternative in {@link ParserMain#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterNumPEAST(ParserMain.NumPEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numPEAST}
	 * labeled alternative in {@link ParserMain#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitNumPEAST(ParserMain.NumPEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idPEAST}
	 * labeled alternative in {@link ParserMain#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterIdPEAST(ParserMain.IdPEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idPEAST}
	 * labeled alternative in {@link ParserMain#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitIdPEAST(ParserMain.IdPEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code groupPEAST}
	 * labeled alternative in {@link ParserMain#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterGroupPEAST(ParserMain.GroupPEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupPEAST}
	 * labeled alternative in {@link ParserMain#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitGroupPEAST(ParserMain.GroupPEASTContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserMain#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(ParserMain.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserMain#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(ParserMain.OperadorContext ctx);
}
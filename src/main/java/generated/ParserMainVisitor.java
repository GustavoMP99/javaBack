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
	 * Visit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link ParserMain#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramAST(ParserMain.ProgramASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commandAST}
	 * labeled alternative in {@link ParserMain#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandAST(ParserMain.CommandASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assingSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingSCAST(ParserMain.AssingSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSCAST(ParserMain.CallSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSCAST(ParserMain.IfSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileSCAST(ParserMain.WhileSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetSCAST(ParserMain.LetSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockSCAST}
	 * labeled alternative in {@link ParserMain#singleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSCAST(ParserMain.BlockSCASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationAST}
	 * labeled alternative in {@link ParserMain#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationAST(ParserMain.DeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constDeclAST}
	 * labeled alternative in {@link ParserMain#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclAST(ParserMain.ConstDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclAST}
	 * labeled alternative in {@link ParserMain#singleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclAST(ParserMain.VarDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDenoterAST}
	 * labeled alternative in {@link ParserMain#typeDenoter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDenoterAST(ParserMain.TypeDenoterASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link ParserMain#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAST(ParserMain.ExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numPEAST}
	 * labeled alternative in {@link ParserMain#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumPEAST(ParserMain.NumPEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idPEAST}
	 * labeled alternative in {@link ParserMain#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPEAST(ParserMain.IdPEASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupPEAST}
	 * labeled alternative in {@link ParserMain#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupPEAST(ParserMain.GroupPEASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserMain#operador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador(ParserMain.OperadorContext ctx);
}
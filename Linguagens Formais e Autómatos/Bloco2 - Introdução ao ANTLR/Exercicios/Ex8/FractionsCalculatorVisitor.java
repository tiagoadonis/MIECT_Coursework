// Generated from FractionsCalculator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FractionsCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FractionsCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FractionsCalculatorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FractionsCalculatorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link FractionsCalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatExpr(FractionsCalculatorParser.StatExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link FractionsCalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatAssignment(FractionsCalculatorParser.StatAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractionsCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FractionsCalculatorParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAddSub(FractionsCalculatorParser.ExprAddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprPot}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPot(FractionsCalculatorParser.ExprPotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParent(FractionsCalculatorParser.ExprParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMultDiv(FractionsCalculatorParser.ExprMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInteger(FractionsCalculatorParser.ExprIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprReduce(FractionsCalculatorParser.ExprReduceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(FractionsCalculatorParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFraction(FractionsCalculatorParser.ExprFractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FractionsCalculatorParser#fraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFraction(FractionsCalculatorParser.FractionContext ctx);
}
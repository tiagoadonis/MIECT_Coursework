// Generated from FractionsCalculator.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FractionsCalculatorParser}.
 */
public interface FractionsCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FractionsCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FractionsCalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractionsCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FractionsCalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link FractionsCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatExpr(FractionsCalculatorParser.StatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatExpr}
	 * labeled alternative in {@link FractionsCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatExpr(FractionsCalculatorParser.StatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link FractionsCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssignment(FractionsCalculatorParser.StatAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StatAssignment}
	 * labeled alternative in {@link FractionsCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssignment(FractionsCalculatorParser.StatAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractionsCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FractionsCalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractionsCalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FractionsCalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(FractionsCalculatorParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(FractionsCalculatorParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprPot}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPot(FractionsCalculatorParser.ExprPotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprPot}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPot(FractionsCalculatorParser.ExprPotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(FractionsCalculatorParser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(FractionsCalculatorParser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDiv(FractionsCalculatorParser.ExprMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDiv}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDiv(FractionsCalculatorParser.ExprMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(FractionsCalculatorParser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(FractionsCalculatorParser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprReduce(FractionsCalculatorParser.ExprReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprReduce}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprReduce(FractionsCalculatorParser.ExprReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(FractionsCalculatorParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(FractionsCalculatorParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFraction(FractionsCalculatorParser.ExprFractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFraction}
	 * labeled alternative in {@link FractionsCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFraction(FractionsCalculatorParser.ExprFractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FractionsCalculatorParser#fraction}.
	 * @param ctx the parse tree
	 */
	void enterFraction(FractionsCalculatorParser.FractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FractionsCalculatorParser#fraction}.
	 * @param ctx the parse tree
	 */
	void exitFraction(FractionsCalculatorParser.FractionContext ctx);
}
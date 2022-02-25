// Generated from Quiz.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuizParser}.
 */
public interface QuizListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QuizParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(QuizParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuizParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(QuizParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuizParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(QuizParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuizParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(QuizParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuizParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(QuizParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuizParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(QuizParser.AnswerContext ctx);
}
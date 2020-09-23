// Generated from C:/Users/sofia/OneDrive/Documents/Systemutveckling och projekt/Projekt/GitHub/CSLang/src/grammar\CSLang.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSLangParser}.
 */
public interface CSLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSLangParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CSLangParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CSLangParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSLangParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(CSLangParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(CSLangParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CSLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CSLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CSLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CSLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CSLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CSLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CSLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CSLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSLangParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(CSLangParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#addExpression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(CSLangParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSLangParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CSLangParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CSLangParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(CSLangParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(CSLangParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSLangParser#startLoop}.
	 * @param ctx the parse tree
	 */
	void enterStartLoop(CSLangParser.StartLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#startLoop}.
	 * @param ctx the parse tree
	 */
	void exitStartLoop(CSLangParser.StartLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSLangParser#stopLoop}.
	 * @param ctx the parse tree
	 */
	void enterStopLoop(CSLangParser.StopLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#stopLoop}.
	 * @param ctx the parse tree
	 */
	void exitStopLoop(CSLangParser.StopLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CSLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CSLangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(CSLangParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(CSLangParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSLangParser#printOut}.
	 * @param ctx the parse tree
	 */
	void enterPrintOut(CSLangParser.PrintOutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#printOut}.
	 * @param ctx the parse tree
	 */
	void exitPrintOut(CSLangParser.PrintOutContext ctx);
}
// Generated from /Users/Chanon/Documents/GitHub/CSLang/src/grammar/CSLang.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link CSLangParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(CSLangParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(CSLangParser.SumContext ctx);
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
	 * Enter a parse tree produced by {@link CSLangParser#printout}.
	 * @param ctx the parse tree
	 */
	void enterPrintout(CSLangParser.PrintoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSLangParser#printout}.
	 * @param ctx the parse tree
	 */
	void exitPrintout(CSLangParser.PrintoutContext ctx);
}
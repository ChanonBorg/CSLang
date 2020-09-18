// Generated from C:/Users/sofia/OneDrive/Documents/Systemutveckling och projekt/Projekt/GitHub/CSLang/src/grammar\CSLang.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSLangParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CSLangParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSLangParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(CSLangParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CSLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(CSLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CSLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSLangParser#addExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpression(CSLangParser.AddExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSLangParser#printout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintout(CSLangParser.PrintoutContext ctx);
}
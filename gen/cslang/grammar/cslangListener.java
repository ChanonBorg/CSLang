// Generated from /Users/Chanon/Documents/GitHub/CSLang/src/cslang/grammar/cslang.g4 by ANTLR 4.8
package cslang.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cslangParser}.
 */
public interface cslangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cslangParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(cslangParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link cslangParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(cslangParser.PruleContext ctx);
}
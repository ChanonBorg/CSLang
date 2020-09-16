// Generated from /Users/Chanon/Documents/GitHub/CSLang/src/cslang/grammar/cslang.g4 by ANTLR 4.8
package cslang.grammar;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link cslangVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class cslangBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements cslangVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitPrule(cslangParser.PruleContext ctx) { return visitChildren(ctx); }
}
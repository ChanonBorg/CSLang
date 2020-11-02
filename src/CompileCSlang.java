import grammar.CSLangBaseListener;
import grammar.CSLangParser;

import java.util.HashMap;

/**
 * @author Chanon Borgström
 * @created 17/09/2020
 * @project CSLang
 */
public class CompileCSLang extends CSLangBaseListener {

    StringBuilder builder = new StringBuilder();

    HashMap<String, String> variableMap = new HashMap();

    public String getCompiledCode() {
        return builder.toString();
    }

    @Override
    public void enterStatement(CSLangParser.StatementContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStatement(CSLangParser.StatementContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDeclaration(CSLangParser.DeclarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDeclaration(CSLangParser.DeclarationContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterAssignment(CSLangParser.AssignmentContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAssignment(CSLangParser.AssignmentContext ctx) {
        String value = "pop " + ctx.ID().getText();

        builder.append(value + "\n");
        System.out.println(value);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterExpression(CSLangParser.ExpressionContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitExpression(CSLangParser.ExpressionContext ctx) {
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitAddExpression(CSLangParser.AddExpressionContext ctx) {
        System.out.println("add");
        builder.append("add\n");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitUnaryExpression(CSLangParser.UnaryExpressionContext ctx) {
        String value = "";

        if (ctx.ID() == null) {
            value = ctx.INT().getText();
        } else {
            value = ctx.ID().getText();
        }

        builder.append("push " + value + "\n");
        System.out.println("push " + value);
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitPrintOut(CSLangParser.PrintOutContext ctx) {
        String value = "";

        if (ctx.ID() == null) {
            value = ctx.INT().getText();
        } else {
            value = ctx.ID().getText();
        }

        builder.append("print " + value + "\n");
        System.out.println("print " + value);
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStartLoop(CSLangParser.StartLoopContext ctx) {

        System.out.println("label " + ctx.getChild(0).getText());
        builder.append("label " + ctx.getChild(0).getText() + "\n");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStartLoop(CSLangParser.StartLoopContext ctx) {
        String value = "if-goto " + ctx.getParent().children.get(2).getText();

        System.out.println(value);
        builder.append(value + "\n");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStopLoop(CSLangParser.StopLoopContext ctx) {
        String startLoopName = ctx.getParent().children.get(0).getChild(0).getText();

        System.out.println("goto " + startLoopName);
        builder.append("goto " + startLoopName + "\n");

        String stopLoopName = ctx.getText();

        System.out.println("label " + stopLoopName);
        builder.append("label " + stopLoopName + "\n");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStopLoop(CSLangParser.StopLoopContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterComparison(CSLangParser.ComparisonContext ctx) {
        System.out.println(ctx.getText());
        builder.append(ctx.getText() + "\n");
    }
}

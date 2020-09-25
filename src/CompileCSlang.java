import grammar.CSLangBaseListener;
import grammar.CSLangParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @author Chanon Borgström
 * @created 17/09/2020
 * @project CSLang
 */
public class CompileCSLang extends CSLangBaseListener {

    StringBuilder builder = new StringBuilder();

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

        if (ctx.unaryExpression().ID() == null) {
            value = ctx.unaryExpression().INT().getText();
        } else {
            value = ctx.unaryExpression().ID().getText();
        }

        builder.append("print " + value + "\n");
        System.out.println("print " + value);
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStartLoop(CSLangParser.StartLoopContext ctx) {
            System.out.println("label startloop");
            builder.append("label startloop"+"\n");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStartLoop(CSLangParser.StartLoopContext ctx) {
        String value="";
        value = "if-goto stoploop";

        System.out.println(value);
        builder.append(value+"\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStopLoop(CSLangParser.StopLoopContext ctx) {
        String value="";
        value=ctx.getText();

        System.out.println("goto-startloop");
        builder.append("goto startloop"+"\n");
        System.out.println("label "+value);
        builder.append("label "+value+"\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStopLoop(CSLangParser.StopLoopContext ctx) { }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterComparison(CSLangParser.ComparisonContext ctx) {
        System.out.println(ctx.getText());
        builder.append(ctx.getText()+"\n");
    }
}

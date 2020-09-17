import grammar.CSLangLexer;
import grammar.CSLangParser;


import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Scanner;

/**
 * @author Chanon Borgström
 * @created 17/09/2020
 * @project CSLang
 */
public class RunCompiler {

    public static void main(String[] args) {
        String infile;
        String outfile;

        System.out.println("vilket program vill du köra?");
        Scanner scan = new Scanner(System.in);
        infile= scan.nextLine();


        try {
            ANTLRInputStream inputStream = new ANTLRInputStream(new FileInputStream(infile));
            CSLangLexer lexer = new CSLangLexer( inputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CSLangParser parser = new CSLangParser(tokens);
            ParseTree tree = parser.file();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new CompileCSlang(),tree);



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

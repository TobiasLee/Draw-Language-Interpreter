
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.InputStream;


/**
 * @author LiLei 16130188007 tobiaslee@ralee.cc
 **/
public class DrawFrontEnd {
    private String fileName;
    private ParseTree tree = null;
    private UIBase ui = null;
    public DrawFrontEnd(String fileName) {
        this.fileName = fileName;
    }

    public ParseTree getTree() {
        return tree;
    }
    public void setUI(UIBase ui) {
        this.ui = ui;
    }
    public int doParse() throws Exception{
        InputStream is = System.in;
        if (fileName != null) is = new FileInputStream(fileName);
        ANTLRInputStream input = new ANTLRInputStream(is);
        DrawMLexer lexer = new DrawMLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DrawMParser parser = new DrawMParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new DrawLangErrorReporter(ui));
        tree = parser.prog();
        return parser.getNumberOfSyntaxErrors();
    }

}

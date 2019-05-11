import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author LiLei 16130188007 tobiaslee@ralee.cc
 **/
public class DrawBackEnd {
    ParseTree tree;
    UIBase ui;
    public DrawBackEnd(ParseTree tree, UIBase ui) {
        this.tree = tree;
        this.ui = ui;
    }

    public void run() {
        // here we first implements semantic computing, after that, format checker is welcomed to have
        DrawMVisitorGUI visitor = new DrawMVisitorGUI(ui);
        visitor.visit(tree);
    }
}

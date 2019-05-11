/**
 * @author LiLei 16130188007 tobiaslee@ralee.cc
 **/
public class DrawLangMain {
    public static void main(String[] args) {
        UIBase ui = new DrawUI(600, 600);

        String fileName = ui.showInputDialog("Input file name to parse:");
        DrawFrontEnd fe = new DrawFrontEnd(fileName);
        try {
            fe.setUI(ui);
            int errN = fe.doParse();
            if ( errN > 0) {
                // show message of error
                System.exit(1);
            }  else {
                ui.showMessage("Draw finished, no error found~");
                DrawBackEnd be = new DrawBackEnd(fe.getTree(), ui);
                be.run();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

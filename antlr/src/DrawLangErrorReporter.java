import org.antlr.v4.runtime.*;


/**
 * @author LiLei 16130188007 tobiaslee@ralee.cc
 **/
public class DrawLangErrorReporter extends BaseErrorListener {
    private UIBase ui;
    public DrawLangErrorReporter(UIBase ui) {
        this.ui = ui;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
        StringBuilder msgBuilder = new StringBuilder();

        if( recognizer instanceof Lexer) {
            msgBuilder.append("Lexical Error at: ");
        } else if(recognizer instanceof  Parser) {
            msgBuilder.append("Syntax Error at: " );
        }
        msgBuilder.append("line "+ (line )+ " : "+ charPositionInLine + " " + msg);
//        System.err.println("line "+ (line + 1)+ " : "+ charPositionInLine + " " + msg);
        if(ui != null) {
            ui.showError(msgBuilder.toString());
        } else {
            System.out.println(msgBuilder.toString());
        }
    }
}

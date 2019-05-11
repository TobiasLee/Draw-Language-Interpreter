/**
 * @author LiLei 16130188007 tobiaslee@ralee.cc
 **/
public interface UIBase {
    void drawPixel(double x, double y, UIPixelProperty p );
    void showError(String error);
    void showMessage(String msg);
    String showInputDialog(String msg);
}

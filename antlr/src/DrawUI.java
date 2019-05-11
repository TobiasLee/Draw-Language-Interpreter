import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author LiLei 16130188007 tobiaslee@ralee.cc
 **/
public class DrawUI implements  UIBase {
    JFrame frame;
    BufferedImage image;
    JPanel canvas;
    private void init(int width, int height) {

        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0,0 , this);
            }

        };

        frame  = new JFrame("Draw Language Parser / Antlr4 - AuthorL: Lei Li");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());   // <== make panel fill frame
        frame.add(canvas, BorderLayout.CENTER);
        frame.setSize(width , height + 25);
        frame.setVisible(true);
        frame.setBackground(Color.WHITE);
        Graphics g = image.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);
        g.dispose();
        canvas.repaint();
    }
    public DrawUI(int width, int height) {
        this.init(width, height);
    }


    @Override
    public void drawPixel(double x, double y, UIPixelProperty p) {
        Graphics g = image.getGraphics();
        g.setColor(p.c);
        g.drawOval((int)x, (int)y, p.width, p.height);
        g.fillOval((int)x, (int)y, p.width, p.height);
        g.dispose();
        canvas.repaint();

    }

    @Override
    public void showError(String error) {
        JOptionPane.showMessageDialog(frame, error);
    }

    @Override
    public void showMessage(String msg) {
        JOptionPane.showMessageDialog(frame, msg);
    }

    @Override
    public String showInputDialog(String msg) {
        return JOptionPane.showInputDialog(frame, msg);
    }
}

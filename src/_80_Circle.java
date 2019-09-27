import javax.swing.*;
import java.awt.*;

public class _80_Circle extends Canvas{

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(10, 10, 180, 180);
        g.setColor(Color.yellow);
        g.drawOval(80, 80, 20, 10);
        g.drawOval(120, 80, 20, 10);
        g.setColor(Color.red);
        g.drawOval(100, 100, 15, 15);
        g.setColor(Color.white);
        g.drawOval(100, 130, 40, 10);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("=-_-=");
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _80_Circle canvas = new _80_Circle();
        frame.add(canvas);
        frame.setVisible(true);
    }
}

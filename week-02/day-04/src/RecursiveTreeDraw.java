import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursiveTreeDraw {
    public static void mainDraw(Graphics graphics) {
        int angle = 270;
        int level = 6;
        treeDrawer(graphics, 160, 300, angle, 40, level);
    }

    public static void treeDrawer(Graphics graphics, int x, int y, int angle, int spread, int repetitions) {
        int x2 = x + (int)(Math.cos(Math.toRadians(angle) * spread));
        int y2 = y + (int)(Math.cos(Math.toRadians(angle) * spread));
        graphics.drawLine(x, y, x2, y2);
        if (repetitions > 0) {
            treeDrawer(graphics, x2, y2, angle - 3, spread - 2, repetitions - 1);
            treeDrawer(graphics, x2, y2, angle + 3, spread - 2, repetitions - 1);
            treeDrawer(graphics, x2, y2, angle, spread, repetitions - 1);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

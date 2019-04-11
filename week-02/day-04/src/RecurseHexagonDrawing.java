import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecurseHexagonDrawing {
    public static void mainDraw(Graphics graphics) {
        int repetition = 5;
        drawHexagon(graphics, repetition);
    }

    public static void drawHexagon(Graphics graphics, int count) {
        int y = 93;
        int x = 185;
        int z = 160;
        graphics.drawLine(93, 0, 93 + 185, 0);
        graphics.drawLine(93 + 185, 0, 320, z);
        graphics.drawLine(320, z, 93 + 185, 320);
        graphics.drawLine(93 + 185, 320, y, 320);
        graphics.drawLine(y, 320, 0, z);
        graphics.drawLine(0, z, 93, 0);
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

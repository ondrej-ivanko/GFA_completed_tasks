import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class RecursedSquaresDrawing {
        public static void mainDraw(Graphics graphics) {
            int repetition = 5;
            int times = 4;
            drawCross(graphics, repetition, times);
    }


        public static void drawCross(Graphics graphics, int count, int origin) {
            if (count <= 0) return;
            graphics.drawRect(0, HEIGHT / 3, HEIGHT / 3, WIDTH / 3);
            graphics.drawRect(WIDTH / 3, 0, HEIGHT / 3, WIDTH / 3);
            graphics.drawRect((WIDTH / 3) * 2, HEIGHT / 3, HEIGHT / 3, WIDTH / 3);
            graphics.drawRect(HEIGHT / 3, (HEIGHT / 3) * 2, HEIGHT / 3, WIDTH / 3);
            drawCross(graphics, count - 1, 0);
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


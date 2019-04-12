import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class RecursedSquaresDrawing {
        public static void mainDraw(Graphics graphics) {
            int rectHeight = HEIGHT;
            int rectWidth = WIDTH;
            int x = 0;
            int y = 0;
            int repetition = 5;
            graphics.setColor(Color.YELLOW);
            graphics.fillRect(x, y, rectWidth, rectHeight);
            drawSquares(graphics, x, y, rectWidth, rectHeight, repetition);

    }


        /*public static void drawCross(Graphics graphics, int xCoord, int yCoord, int width, int height, int count) {
            if (count <= 0) return;
            graphics.drawRect(xCoord, height / 3, width, height / 3);
            graphics.drawRect(width / 3, yCoord, width / 3, height);

            drawCross(graphics, xCoord, yCoord  + ((width / 3) / 3), width / 3, height / 3, count - 1);
            drawCross(graphics, xCoord + ((width / 3) / 3), yCoord, width / 3, height / 3, count - 1);
        }*/

        public static void drawSquares(Graphics graphics, int xCoord, int yCoord, int width, int height, int count) {
            if (count > 0) { graphics.setColor(Color.BLACK);
            graphics.drawRect(xCoord, yCoord, width, height);

            drawSquares(graphics, xCoord + width / 3, yCoord, width / 3, width / 3, count - 1);
            drawSquares(graphics, xCoord, yCoord + width / 3, width / 3, width / 3, count - 1);
            drawSquares(graphics, xCoord + width / 3, yCoord + 2 * width / 3, width / 3, width / 3, count - 1);
            drawSquares(graphics, xCoord + 2 * width / 3, yCoord + width / 3, width / 3, width / 3, count - 1);
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


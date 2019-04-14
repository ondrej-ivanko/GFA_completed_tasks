import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int linesDistance = 16;
        int incrementOfCoordinates = HEIGHT / linesDistance;
        int x = 0;
        int y = 0;
        // Loop works to print lines and adjust to new coordinates.
        for (int i = 0; i < 4 * incrementOfCoordinates - 1; i++) {
            writeLine(x, y, graphics);
            if (i < incrementOfCoordinates) {
                y += incrementOfCoordinates;
            } else if (i < incrementOfCoordinates * 2) {
                x += incrementOfCoordinates;
            } else if (i < incrementOfCoordinates * 3) {
                y -= incrementOfCoordinates;
            } else if (i < incrementOfCoordinates * 4) {
                x -= incrementOfCoordinates;
            }

        }
    }

    public static void writeLine(int xCoord, int yCoord, Graphics graphics) {
        graphics.drawLine(xCoord, yCoord, HEIGHT / 2, WIDTH / 2);
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

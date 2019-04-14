import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] newArray = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] secondArray = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        connectDots(newArray, graphics);
        connectDots(secondArray, graphics);


    }
    public static void connectDots(int[][] xArray, Graphics graphics) {
        ArrayList<Integer> coordArray = new ArrayList<>();
        for (int[] array : xArray) {
            for (int element : array
                 ) {
                coordArray.add(element);
                }
            }
        int idx = 0;
        int idx2 = idx + 1;
        for (int i = 0; i < coordArray.size() / 2; i++) {
            if (i == coordArray.size() / 2 - 1) {
                graphics.drawLine(coordArray.get(idx), coordArray.get(idx2), coordArray.get(0), coordArray.get(1));
            } else {
                graphics.drawLine(coordArray.get(idx), coordArray.get(idx2), coordArray.get(idx + 2), coordArray.get(idx2 + 2));
                if (i < coordArray.size() / 2 - 1) {
                    idx = idx + 2; idx2 = idx2 + 2;
                }
            }
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
import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecurseHexagonDrawing {
    public static void mainDraw(Graphics graphics) {
        int x = 40;
        int y = 80;
        int x2 = 120;
        int y2 = 160;
        int [] xArrayCoordinates = {80, 0, 80, 240, 320, 240};
        int [] yArrayCoordinates = {320, 160, 0, 0, 160, 320};
        int repetition = 6;
        hexagon(graphics, xArrayCoordinates, yArrayCoordinates, repetition, x, y, x2, y2);
    }
    public static void hexagon(Graphics graphics, int[] hexagonCoordinatesX, int[] hexagonCoordinatesY, int count, int a, int b, int c, int d) {
        if (count > 0) {
        graphics.drawPolygon(hexagonCoordinatesX, hexagonCoordinatesY, 6);
        // All the loops below are adjusting coordinates for upcoming recursive hexagons.
            int[] hexagonOneX = Arrays.copyOf(hexagonCoordinatesX, hexagonCoordinatesX.length);
            for (int i = 0; i < hexagonOneX.length; i++) {
                if (i == 1) {
                    hexagonOneX[i] += a;
                } if (i == 4){
                    hexagonOneX[i] -= c;
                } if (i == 3 || i == 5) {
                    hexagonOneX[i] -= b;
                }
            }
            int[] hexagonOneY = Arrays.copyOf(hexagonCoordinatesY, hexagonCoordinatesY.length);
            for (int y = 0; y < hexagonOneY.length; y++) {
                if (y == 1 || y == 4) {
                    hexagonOneY[y] += b;
                } if (y == 2 || y == 3) {
                    hexagonOneY[y] += d;
                }
            }
            int[] hexagonTwoX = Arrays.copyOf(hexagonCoordinatesX, hexagonCoordinatesX.length);
            for (int j = 0; j < hexagonTwoX.length; j++) {
                if (j == 1) {
                    hexagonTwoX[j] += a;
                } if (j == 3 || j == 5) {
                    hexagonTwoX[j] -= b;
                } if (j == 4){
                    hexagonTwoX[j] -= c;
                }
            }
            int[] hexagonTwoY = Arrays.copyOf(hexagonCoordinatesY, hexagonCoordinatesY.length);
            for (int n = 0; n < hexagonTwoY.length; n++) {
                if (n == 0 || n == 5) {
                    hexagonTwoY[n] -= d;
                } if (n == 1 || n == 4) {
                    hexagonTwoY[n] -= b;
                }
            }
            int[] hexagonThreeX = Arrays.copyOf(hexagonCoordinatesX, hexagonCoordinatesX.length);
            for (int z = 0; z < hexagonThreeX.length; z++) {
                if (z == 0 || z == 2) {
                    hexagonThreeX[z] += c;
                } if (z == 1) {
                    hexagonThreeX[z] += d;
                } if (z == 3 || z == 5) {
                    hexagonThreeX[z] += a;
                }
            }
            int[] hexagonThreeY = Arrays.copyOf(hexagonCoordinatesY, hexagonCoordinatesY.length);
            for (int h = 0; h < hexagonThreeY.length; h++) {
                if (h == 0 || h == 5) {
                    hexagonThreeY[h] -= b;
                } if (h == 2 || h == 3) {
                    hexagonThreeY[h] += b;
                }
            }
            hexagon(graphics, hexagonOneX, hexagonOneY, count - 1,  a / 2, b/ 2, c / 2,d / 2);
            hexagon(graphics, hexagonTwoX, hexagonTwoY, count - 1, a / 2, b/ 2, c / 2,d / 2);
            hexagon(graphics, hexagonThreeX, hexagonThreeY, count - 1, a / 2, b/ 2, c / 2,d / 2);
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

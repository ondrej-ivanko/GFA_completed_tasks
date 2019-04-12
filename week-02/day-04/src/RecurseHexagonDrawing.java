import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecurseHexagonDrawing {
    public static void mainDraw(Graphics graphics) {
        int x = 0;
        int y = 0;
        int x2 = 0;
        int y2 = 0;
        int [] xArrayCoordinates = { 80, 0, 80, 240, 320, 240, 80};
        int [] yArrayCoordinates = {320, 160, 0, 0, 160, 320, 320};
        int repetition = 5;
        //drawHexagon(graphics, x, y, x2, y2, repetition);
        hexagon(graphics, xArrayCoordinates, yArrayCoordinates, repetition);
    }

    /*public static void drawHexagon(Graphics graphics, int xCoord, int yCoord, int x2Coord, int y2Coord, int count) {
        graphics.drawLine(93, 0, 93 + 185, 0);
        graphics.drawLine(93 + 185, 0, 320, z);
        graphics.drawLine(320, z, 93 + 185, 320);
        graphics.drawLine(93 + 185, 320, y, 320);
        graphics.drawLine(y, 320, 0, z);
        graphics.drawLine(0, z, 93, 0);
    }*/
/*  hexagon(graphics, new int[] {80, 0 + 40, 80, 240 - 80, 200, 240 - 80, 80}, new int[] {320, 160 + 80, 0 + 160, 0 + 160, 160 + 80, 320, 320}, count - 1);
    hexagon(graphics, new int[] {80, 0 + 40, 80, 240 - 80, 200, 240 - 80, 80}, new int[] {320 - 160, 160 - 80, 0, 0, 160 - 80, 320 - 160, 320 - 160}, count - 1);
    hexagon(graphics, new int[] {200, 160, 200, 280, 320, 280, 200}, new int[] {320 - 80, 160, 0 + 80, 0 + 80, 160, 320 - 80, 320 - 80}, count - 1);*/

    public static void hexagon(Graphics graphics, int[] hexagonCoordinatesX, int[] hexagonCoordinatesY, int count) {
        if (count > 0) {
        graphics.drawPolygon(hexagonCoordinatesX, hexagonCoordinatesY, 6);
            int[] hexagonOneX = Arrays.copyOf(hexagonCoordinatesX, hexagonCoordinatesX.length);
            for (int i = 0; i < hexagonOneX.length; i++) {
                if (i == 1) {
                    hexagonOneX[i] += 40;
                } if (i == 3 || i == 5) {
                    hexagonOneX[i] -= 80;
                }
            }
            int[] hexagonOneY = Arrays.copyOf(hexagonCoordinatesX, hexagonCoordinatesX.length);
            for (int y = 0; y < hexagonOneY.length; y++) {
                if (y == 1 || y == 4) {
                    hexagonOneY[y] += 80;
                } if (y == 2 || y== 3) {
                    hexagonOneY[y] += 160;
                }
            }
            hexagon(graphics, hexagonOneX, hexagonOneY, count - 1);
            int[] hexagonTwoX = Arrays.copyOf(hexagonCoordinatesX, hexagonCoordinatesX.length);
            for (int j = 0; j < hexagonTwoX.length; j++) {
                if (j == 1) {
                    hexagonTwoX[j] += 40;
                } if (j == 3 || j == 5) {
                    hexagonTwoX[j] -= 80;
                }
            }
            int[] hexagonTwoY = Arrays.copyOf(hexagonCoordinatesX, hexagonCoordinatesX.length);
            for (int n = 0; n < hexagonTwoY.length; n++) {
                if (n == 0 || n == 5 || n == 6) {
                    hexagonTwoY[n] -= 160;
                } if (n == 1 || n == 4) {
                    hexagonTwoY[n] -= 80;
                }
            }
            hexagon(graphics, hexagonTwoX, hexagonTwoY, count - 1);
            int[] hexagonThreeX = Arrays.copyOf(hexagonCoordinatesX, hexagonCoordinatesX.length);
            for (int z = 0; z < hexagonThreeX.length; z++) {
                if (z == 0 || z == 2 || z == 6) {
                    hexagonThreeX[z] += 120;
                } if (z == 1) {
                    hexagonThreeX[z] += 160;
                } if (z == 3 || z == 5) {
                    hexagonThreeX[z] += 40;
                }
            }
            int[] hexagonThreeY = Arrays.copyOf(hexagonCoordinatesX, hexagonCoordinatesX.length);
            for (int h = 0; h < hexagonThreeY.length; h++) {
                if (h == 0 || h == 5 || h == 6) {
                    hexagonThreeY[h] -= 80;
                } if (h == 2 || h == 3) {
                    hexagonThreeY[h] += 80;
                }
            }
            hexagon(graphics, hexagonThreeX, hexagonThreeY, count - 1);

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

import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class RecursiveTriangleDrawing {
        public static void mainDraw(Graphics graphics) {
            int[] triangleXCoordinates = {0, 320, 160};
            int[] triangleYCoordinates = {0, 0, 320};
            int helperVariable = 80;
            int helperTwo = 160;
            int recursion = 4;
            triangleDraw(graphics, recursion, triangleXCoordinates, triangleYCoordinates, helperVariable, helperTwo);
    }

        public static void triangleDraw(Graphics graphics, int level, int[] xpoint, int[] ypoint, int helper, int helper2) {
            if (level > 0) {
                graphics.drawPolygon(xpoint, ypoint, 3);
                int[] triangleOneX = Arrays.copyOf(xpoint, xpoint.length);
                for (int i = 0; i < triangleOneX.length; i++) {
                    if (i == 1 || i == 2) {
                        triangleOneX[i] = triangleOneX[i] /  2;
                    }
                }
                int[] triangleOneY = Arrays.copyOf(ypoint, ypoint.length);
                for (int a = 0; a < triangleOneY.length; a++) {
                    if (a == 2) {
                        triangleOneY[a] = triangleOneY[a] /  2;
                    }
                }
                int[] triangleTwoX = Arrays.copyOf(xpoint, xpoint.length);
                for (int n = 0; n < triangleTwoX.length; n++) {
                    if (n == 0) {
                        triangleTwoX[n] = triangleTwoX[n] + helper2;
                    } if (n == 2) {
                        triangleTwoX[n] = triangleTwoX[n] + helper;
                    }
                }
                int[] triangleTwoY = Arrays.copyOf(ypoint, ypoint.length);
                for (int m = 0; m < triangleTwoY.length; m++) {
                    if (m == 2) {
                        triangleTwoY[m] = triangleTwoY[m] / 2;
                    }
                }
                int[] triangleThreeX = Arrays.copyOf(xpoint, xpoint.length);
                for (int z = 0; z < triangleThreeX.length; z++) {
                    if (z == 0) {
                        triangleThreeX[z] = triangleThreeX[z] + helper;
                    } if (z == 1) {
                        triangleThreeX[z] = triangleThreeX[z] - helper;
                    }
                }
                int[] triangleThreeY = Arrays.copyOf(ypoint, ypoint.length);
                for (int o = 0; o < triangleThreeY.length; o++) {
                    if (o == 0) {
                        triangleThreeY[o] = triangleThreeY[o] + helper2;
                    } if (o == 1) {
                        triangleThreeY[o] = triangleThreeY[o] + helper2;
                    }
                }
                triangleDraw(graphics, level - 1, triangleOneX, triangleOneY, helper / 2, helper2 / 2);
                triangleDraw(graphics, level - 1, triangleTwoX, triangleTwoY, helper / 2, helper2 / 2);
                triangleDraw(graphics, level - 1, triangleThreeX, triangleThreeY, helper / 2, helper2 / 2);
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

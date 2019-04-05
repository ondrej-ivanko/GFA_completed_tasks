public class DrawChessTable {
    public static void main(String[] args) {
        /* String chess = "%";
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                String line = "";
                for (int j = 1; j < 5; j++) {
                    if (j % 2 != 0) {
                        line += chess;
                    }
                    if (j % 2 == 0) {
                        line += " ";
                    }
                    System.out.println(line);
                }
            }
            else {
                String line = "";
                for (int j = 1; j < 5; j++) {
                    if (j % 2 == 0) {
                        line += chess;
                    }
                    if (j % 2 != 0) {
                        line += " ";
                    }
                    System.out.println(line);
                }
            }
        } */
        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0) {
                System.out.println("% % % % ");
            } else {
                System.out.println(" % % % %");
            }
        }
    }
}

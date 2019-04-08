import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        for (int[] smallerArray : array) {
            int idx = 0;
            for (int y = 0; y < smallerArray.length; y++) {
                if (idx == y) smallerArray[y] = 1;
                else smallerArray[y] = 0;
                }
            }
        idx += 1;

            for (int i = 0; i < smallerArray.length; i++) {
                System.out.println(smallerArray[i]);
            }

        }



    }


}
    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output


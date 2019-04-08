import java.util.Arrays;

public class DiagonalMatrix {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        for (int[] smallerArray : array) {
            for (int i = 0; i < smallerArray.length; i++) {
                array [i][i] = 1;
                }
            System.out.println(Arrays.toString(smallerArray));
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


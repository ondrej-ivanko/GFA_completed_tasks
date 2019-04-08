import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }
    public static String unique(int[] array) {
        int[] seen = {array.length-1};

        for (int i = 0; i < array.length; i++) {
            int idx = 0;
            for (int y = 0; y < seen.length; y++) {
                if (array[i] != seen[y]) {
                    seen[idx] += array[i];
                    idx++;
                }
            }
        }
        return Arrays.toString(seen);
    }
}
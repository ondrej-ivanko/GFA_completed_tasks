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
        // Seen array stores numbers that loop went through.
        int[] seen = {};
        for (int i = 0; i < array.length; i++) {
            if (seen.length <= 0) {
                seen = Arrays.copyOf(seen, seen.length + 1);
                seen[seen.length - 1] = array[i];}
            else {
                // Loop goes through seen array to check if same number is already stored there.
                int wasSeen = 0;
                for (int y = 0; y < seen.length; y++) {
                    if (array[i] == seen[y]) {
                        wasSeen += 1;
                    }
                }
                // if number that loops checks is not in seen array, than it is added to seen.
                if (wasSeen == 0) { seen = Arrays.copyOf(seen, seen.length + 1);
                seen[seen.length - 1] = array[i];
                }
            }
        }
        return Arrays.toString(seen);
    }
}
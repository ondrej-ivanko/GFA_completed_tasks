import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
            //  Create a function that takes a list of numbers as parameter
            //  Returns a list where the elements are sorted in ascending numerical order
            //  Make a second boolean parameter, if it's `true` sort that list descending

            //  Example:
            System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
            //  should print [5, 9, 12, 24, 34]
            System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
            //  should print [34, 24, 12, 9, 5]
        }


    public static String bubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int idx = 0; idx < array.length - i - 1; idx++) {
                if (array[idx] > array[idx + 1]) {
                    int tmp = array[idx];
                    array[idx] = array[idx + 1];
                    array[idx + 1] = tmp;
                }
            }
        }
        return Arrays.toString(array);
    }

    public static String advancedBubble(int[] array, boolean shouldBeSorted) {
        if (shouldBeSorted == true) {
            for (int i = 0; i < array.length; i++) {
                for (int idx = 0; idx < array.length - i - 1; idx++) {
                    if (array[idx] < array[idx + 1]) {
                        int tmp = array[idx];
                        array[idx] = array[idx + 1];
                        array[idx + 1] = tmp;
                    }
                }
            }

        }
        return Arrays.toString(array);
    }
}

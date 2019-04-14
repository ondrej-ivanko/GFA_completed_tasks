import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'

        // The best I can do with current options and resources to my disposal.
        // This is not bulletproof solution. Numbers higher than 100+ are not meeting the condition.
    }
    public static String subInt(int num, int[] array) {
        int[] newArray = {};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num || array[i] % 10 == num || array[i] / 10 == num) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = i;
                }
            }
        return Arrays.toString(newArray);
    }
}

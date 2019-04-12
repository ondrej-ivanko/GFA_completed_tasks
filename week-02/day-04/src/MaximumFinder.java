public class MaximumFinder {
    public static void main(String[] args) {
        int[] array = {24, 56, 22051, 989, 61, 99, 1850, 415};
        System.out.println(maxNumber((array), array.length - 1, 0));
    }

    public static int maxNumber(int[] myArray, int count, int max) {
        if (count < 1) return max;
        if (myArray[count] > max) max = myArray[count];
        return maxNumber(myArray, count - 1, max);

    }
}

import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String StringWeLookFor = input.nextLine();
        String SearchedString = input.nextLine();

        int stringIndex = StringWeLookFor.indexOf(SearchedString);
        if (stringIndex > 0) {
            System.out.println(stringIndex);
        } else {
            System.out.println(-1);
        }
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one

        //  Example:

        //  should print: `17`
        //  System.out.println(subStr("this is what I'm searching in", "searching"));

        //  should print: `-1`
        //  System.out.println(subStr("this is what I'm searching in", "not"));
    }
}

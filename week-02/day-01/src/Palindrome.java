import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String word = "Hello";
        String strFnc = palindrome(word);
        System.out.println(strFnc);
    }
    public static String palindrome(String someWord) {
        char[] inputedString = someWord.toCharArray();
        char[] palindromeArray = new char[inputedString.length];
        String finalString = "";
        for (int i = 0; i < palindromeArray.length; i++) {
            finalString += inputedString[i];
        }
        for (int i = 0; i < inputedString.length; i++) {
            finalString += inputedString[inputedString.length - 1 - i];

        }

        return finalString;
    }


}

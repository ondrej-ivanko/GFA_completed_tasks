public class Palindrome {
    public static void main(String[] args) {
        String word = "Hell-o";
        System.out.println(palindrome(word));
    }
    public static String palindrome(String someWord) {
        char[] inputedString = someWord.toCharArray();
        char[] palindromeArray = new char[inputedString.length];
        String palindrome = "";
        for (int i = 0; i < palindromeArray.length; i++) {
            palindrome += inputedString[i];
        }
        for (int i = 0; i < inputedString.length; i++) {
            palindrome += inputedString[inputedString.length - 1 - i];

        }

        return palindrome;
    }


}

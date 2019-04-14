public class StringsAgain {
    public static void main(String[] args) {
        String inputed = "XsXXxxxyyyioklk hlkf hlk!%0 jdlkfjxYYx";
        System.out.println(stringAgain(inputed, inputed.length() - 1));
    }
    // Function removes all small xs from string.
    public static String stringAgain(String sentence, int count) {
        if (count <= 0) return sentence;
        String character = sentence.substring(count, count + 1);
        if ("x".equals(character)) {sentence = sentence.substring(0, count).concat(sentence.substring(count + 1));}
        return stringAgain(sentence, count - 1);
    }
}

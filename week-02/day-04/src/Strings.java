public class Strings {
    public static void main(String[] args) {
        String inputed = "XsXXxxxyyyioklk hlkf hlk!%0 jdlkfjxYYx";
        System.out.println(stringSwap(inputed, inputed.length() - 1));
    }
    // Function replaces xs for ys.
    public static String stringSwap(String sentence, int count) {
        if (count <= 0) return sentence;
        String character = sentence.substring(count, count + 1);
        if ("x".equals(character)) {sentence = sentence.replace(character, "y");}
        return stringSwap(sentence, count - 1);

    }
}

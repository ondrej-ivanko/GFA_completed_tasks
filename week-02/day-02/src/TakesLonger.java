public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        String border = "you";
        String toInsert = "always takes longer than ";
        int idx = quote.indexOf(border);
        quote = quote.substring(0, idx)
                .concat(toInsert)
                .concat(quote.substring(idx));

        System.out.println(quote);
    }
}

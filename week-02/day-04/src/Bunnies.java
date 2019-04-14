public class Bunnies {
    public static void main(String[] args) {
        int bunnyCount = 15;
        int ears = 2;
        System.out.println(earsCount(bunnyCount, ears));
    }
    // How many ears all the bunnies have?
    public static int earsCount(int bunnies, int ear) {
        if ( bunnies <= 1) return ear;
        return ear + earsCount(bunnies - 1, ear);
    }
}

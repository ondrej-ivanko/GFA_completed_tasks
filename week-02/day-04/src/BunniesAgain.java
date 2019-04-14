import java.util.ArrayList;
import java.util.Arrays;

public class BunniesAgain {
    public static void main(String[] args) {
        ArrayList<Integer> bunnyLine = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        int earsTwo = 2;
        int earsThree = 3;
        System.out.println(earsCount(bunnyLine.size() - 1, earsTwo, earsThree));
    }

    public static int earsCount(int bunnies, int earsOdd ,int earsEven) {
        if (bunnies <= 1) {
            return earsOdd + earsEven;
        }
        if (bunnies % 2 == 0) {
            return earsEven + earsCount(bunnies - 1, earsOdd, earsEven);
        } else {
            return earsOdd + earsCount(bunnies - 1, earsOdd, earsEven);
        }
    }
}

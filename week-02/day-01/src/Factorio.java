public class Factorio {
    public static void main(String[] args) {
        System.out.println(factorio(8));
    }

    public static int factorio(int number) {
        int factorial = 1;
        for (int i = 0; i < number; i++) {
            factorial *= (number - i);
        }
        return factorial;
    }

    // - Create a function called `factorio`
    //   that returns it's input's factorial
}

public class Power {
    public static void main(String[] args) {
        System.out.println(powerTo(2, 8));
    }

    public static int powerTo(int num, int power) {
        if (power <= 1) return num;
        return num * powerTo(num, power - 1);
    }
}

public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        double bmiResult = massInKg / Math.pow(heightInM, 2f);
        System.out.println("Body Mass Index is: " + bmiResult);
    }
}
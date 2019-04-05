public class Cuboid {
    public static void main(String[] args) {
        double sideA = 15;
        double sideB = 10;
        double sideC = 55;

        double volume = sideA * sideB * sideC;
        System.out.println("Volume: " + volume);
        double surface = 2 * ((sideA * sideB) + (sideB * sideC) + (sideC * sideA));
        System.out.println("Surface Area: " + surface);
    }
}
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
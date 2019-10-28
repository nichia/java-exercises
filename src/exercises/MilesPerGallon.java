package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get number of miles driven
        System.out.print("Enter the number of miles driven: ");
        Double miles = in.nextDouble();

        // Get amount of gas consumed in gallons
        System.out.print("Enter the amount of gas consumed in gallons: ");
        Double consumed = in.nextDouble();

        // Print miles-per-gallon of gas consumed
        System.out.println("Miles per gallon of gas consumed: " + (miles / consumed));
    }
}

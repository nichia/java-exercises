package exercises;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get base
        System.out.print("Enter the base length of a triangle: ");
        double base = in.nextDouble();

        // Get height
        System.out.print("Enter the height of a triangle: ");
        double height = in.nextDouble();

        // Print area of a triangle
        double area = (base * height) / 2;
        System.out.println("Area of the triangle: " + area);
    }
}

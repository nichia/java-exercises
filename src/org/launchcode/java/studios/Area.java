package org.launchcode.java.studios;
import java.util.ArrayList;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double radius;
        double PI = 3.14;

        // Get radius of a circle
        System.out.println("Enter a positive radius value: ");
        do {
            radius = in.nextDouble();
            if (radius < 0) {
                System.out.println("Please enter a non-negative radius: ");
            }
        } while (radius < 0);

        // Print area of a circle
        double area = PI * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}

/*
Write a program to calculate the area of a circle. Take the radius as input
and use the formula:
Area = π * radius^2.
*/

import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area using the formula: Area = π * radius^2
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.println("Area of the circle: " + area);

        scanner.close();
    }
}

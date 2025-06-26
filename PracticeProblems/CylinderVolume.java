/*
Write a program to calculate the volume of a cylinder. Take the radius and
height as inputs and use the formula:
Volume = π * radius^2 * height.
*/

import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take radius input
        System.out.print("Enter radius of the cylinder: ");
        double radius = scanner.nextDouble();

        // Take height input
        System.out.print("Enter height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate volume using the formula: π * r^2 * h
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Display result
        System.out.println("Volume of the cylinder: " + volume);

        scanner.close();
    }
}

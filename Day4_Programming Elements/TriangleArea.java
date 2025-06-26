/*
Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height and 1 in = 2.54 cm
I/P => base, height
O/P => The Area of the triangle in sq in is ___ and sq cm is ___
*/

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and height in centimeters
        System.out.print("Enter base of the triangle in cm: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of the triangle in cm: ");
        double height = scanner.nextDouble();

        // Calculate area in square centimeters
        double areaInSqCm = 0.5 * base * height;

        // Convert to square inches (1 inch = 2.54 cm → 1 sq in = 6.4516 sq cm)
        double areaInSqIn = areaInSqCm / 6.4516;

        // Output the results
        System.out.println("The Area of the triangle in sq in is " + areaInSqIn + " and sq cm is " + areaInSqCm);

        scanner.close();
    }
}

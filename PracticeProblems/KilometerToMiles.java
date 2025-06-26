/*
Write a program that takes the distance in kilometers as input from the user
and converts it into miles using the formula:
Miles = Kilometers * 0.621371.
*/

import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert kilometers to miles
        double miles = kilometers * 0.621371;

        // Display the result
        System.out.println("Distance in miles: " + miles);

        scanner.close();
    }
}

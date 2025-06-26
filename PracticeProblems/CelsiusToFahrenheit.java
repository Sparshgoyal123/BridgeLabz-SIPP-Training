/*
Write a program that takes the temperature in Celsius as input and converts
it to Fahrenheit using the formula:
Fahrenheit = (Celsius * 9/5) + 32.
*/

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}

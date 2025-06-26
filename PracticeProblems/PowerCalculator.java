/*
Write a program that takes two numbers as input: a base and an exponent,
and prints the result of base raised to the exponent (without using loops or
conditionals).
*/

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();

        // Input exponent
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate power using Math.pow()
        double result = Math.pow(base, exponent);

        // Print result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }
}

/*
Write a program that takes three numbers as input from the user and prints
their average.
*/

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        // Calculate average
        double average = (num1 + num2 + num3) / 3;

        // Print result
        System.out.println("Average: " + average);

        scanner.close();
    }
}

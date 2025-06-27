/*
Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___
*/

import java.util.Scanner;

public class DivisibilityCheckByFive {
    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner inputScanner = new Scanner(System.in);

        // Variable declaration: to store user input number
        int inputNumber;

        // Prompt user to enter a number
        System.out.print("Enter a number to check if it is divisible by 5: ");
        inputNumber = inputScanner.nextInt();

        // Check if the number is divisible by 5
        boolean isDivisibleByFive = (inputNumber % 5 == 0);

        // Display result with context
        System.out.println("Is the number " + inputNumber + " divisible by 5? " + isDivisibleByFive);

        // Close the scanner to avoid resource leaks
        inputScanner.close();
    }
}

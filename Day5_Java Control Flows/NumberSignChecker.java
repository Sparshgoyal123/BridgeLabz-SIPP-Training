/*
Write a program to check whether a number is positive, negative, or zero.
Hint => 
a. Get integer input from the user and store it in the number variable.
b. If the number is positive, print positive.
c. If the number is negative, print negative.
d. If the number is zero, print zero. 
*/


import java.util.Scanner;

// Program to check whether a number is positive, negative, or zero
public class NumberSignChecker {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner inputScanner = new Scanner(System.in);

        // Variable declaration: to store the user input number
        int number;

        // Prompt user to enter an integer number
        System.out.print("Enter an integer number: ");
        number = inputScanner.nextInt();

        // Check if the number is positive
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        }
        // Check if the number is negative
        else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        }
        // Check if the number is zero
        else {
            System.out.println("The number is zero.");
        }

        // Close the scanner
        inputScanner.close();
    }
}

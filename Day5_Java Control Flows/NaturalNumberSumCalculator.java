/*
Write a program to check for the natural number and write the sum of n natural numbers 
Hint => 
A Natural Number is a positive integer (1,2,3, etc) sometimes with the inclusion of 0
A sum of n natural numbers is n * (n+1) / 2 
I/P => number
O/P => If the number is a positive integer then the output is
The sum of ___ natural numbers is ___
Otherwise 
The number ___ is not a natural number
*/


import java.util.Scanner;

public class NaturalNumberSumCalculator {

    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Variable declaration for user input and result
        int inputNumber;
        int sumOfNaturalNumbers;

        // Prompt user to enter a number
        System.out.print("Enter a number to check if it's a natural number and calculate the sum: ");
        inputNumber = scanner.nextInt();

        // Check if the number is a natural number (positive integer)
        if (inputNumber > 0) {
            // Calculate the sum using the formula: n * (n + 1) / 2
            sumOfNaturalNumbers = inputNumber * (inputNumber + 1) / 2;

            // Output the result
            System.out.println("The sum of " + inputNumber + " natural numbers is " + sumOfNaturalNumbers);
        } else {
            // If input is not a natural number
            System.out.println("The number " + inputNumber + " is not a natural number.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}



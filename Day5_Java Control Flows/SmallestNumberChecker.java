/*
Write a program to check if the first is the smallest of the 3 numbers.
I/P => number1, number2, number3
O/P => Is the first number the smallest? ____
*/


import java.util.Scanner;

public class SmallestNumberChecker {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Step 1: Declare variables to store user inputs
        int number1;
        int number2;
        int number3;

        // Step 2: Take input for all three numbers
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        System.out.print("Enter the third number: ");
        number3 = input.nextInt();

        // Step 3: Check if the first number is the smallest
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Step 4: Display the result with context
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        // Close the input stream
        input.close();
    }
}

/*
Write a program to check if the first, second, or third number is the largest of the three.
I/P => number1, number2, number3
O/P => 
Is the first number the largest? ____
Is the second number the largest? ___
Is the third number the largest? ___
*/


import java.util.Scanner;

public class LargestNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // --- Input Section ---
        // Take input for three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        // --- Logic Section ---
        // Check if first number is the largest
        boolean isFirstLargest = (number1 > number2) && (number1 > number3);

        // Check if second number is the largest
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);

        // Check if third number is the largest
        boolean isThirdLargest = (number3 > number1) && (number3 > number2);

        // --- Output Section ---
        // Display which number is the largest
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);

        // Close the scanner to avoid memory leak
        scanner.close();
    }
}




/*
Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
a. Define an integer array of 5 elements and get user input to store in the array.
b. Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
c. If the number is negative, print negative. Else if the number is zero, print zero. 
d. Finally compare the first and last element of the array and display if they equal, greater or less
*/


import java.util.*;

public class NumberAnalyzer {
    public static void main(String[] args) {
        final int TOTAL_NUMBERS = 5;

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[TOTAL_NUMBERS];

        System.out.println("Enter " + TOTAL_NUMBERS + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.print("Number " + number + " is ");

            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println("a positive even number.");
                } else {
                    System.out.println("a positive odd number.");
                }
            } else if (number < 0) {
                System.out.println("a negative number.");
            } else {
                System.out.println("zero.");
            }
        }

        System.out.println("\n--- Comparing First and Last Elements ---");
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("The first and last numbers are equal (" + first + ").");
        } else if (first > last) {
            System.out.println("The first number (" + first + ") is greater than the last number (" + last + ").");
        } else {
            System.out.println("The first number (" + first + ") is less than the last number (" + last + ").");
        }

        input.close();
    }
}

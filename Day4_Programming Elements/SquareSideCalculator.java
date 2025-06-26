/*
Write a program to find the side of the square whose parameter you read from the user 
Hint => Perimeter of the Square is 4 times the side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/

import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take perimeter as input from the user
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        // Calculate the side
        double side = perimeter / 4;

        // Print the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        scanner.close();
    }
}

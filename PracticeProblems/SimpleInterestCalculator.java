/*
Write a program to calculate simple interest using the formula:
Simple Interest = (Principal * Rate * Time) / 100.
Take Principal, Rate, and Time as inputs from the user.
*/

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Principal amount
        System.out.print("Enter Principal amount: ");
        double principal = scanner.nextDouble();

        // Input Rate of Interest
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        // Input Time in years
        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display result
        System.out.println("Simple Interest = " + simpleInterest);

        scanner.close();
    }
}

/*
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
a. Define an array of 10 integer elements and take user input for the student's age. 
b. Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote. 
*/


import java.util.Scanner;

public class VotingEligibilityChecker {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        final int TOTAL_STUDENTS = 10;

        // Declare an array to store the age of students
        int[] studentAges = new int[TOTAL_STUDENTS];

        // Take input for each student's age
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = inputScanner.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Status ---");

        // Loop through the array and check voting eligibility
        for (int i = 0; i < studentAges.length; i++) {
            int currentAge = studentAges[i];

            if (currentAge < 0) {
                // Invalid age check
                System.out.println("Student " + (i + 1) + " has an invalid age: " + currentAge);
            } else if (currentAge >= 18) {
                // Eligible to vote
                System.out.println("The student with the age " + currentAge + " can vote.");
            } else {
                // Not eligible to vote
                System.out.println("The student with the age " + currentAge + " cannot vote.");
            }
        }

        // Close the Scanner
        inputScanner.close();
    }
}

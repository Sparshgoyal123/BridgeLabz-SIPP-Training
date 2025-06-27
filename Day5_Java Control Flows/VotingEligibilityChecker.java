/*
Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
Hint => 
Get integer input from the user and store it in the age variable.
If the person is 18 or older, print "The person can vote." Otherwise, print "The person cannot vote." 
I/P => age
O/P => If the person's age is greater or equal to 18 then the output is 
The person's age is ___ and can vote.
Otherwise 
The person's age is ___ and cannot vote.
*/


import java.util.Scanner;

// Proper class name following PascalCase convention
public class VotingEligibilityChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner inputScanner = new Scanner(System.in);

        //  Declare variable to store user's age
        int age;

        // Prompt user to enter age
        System.out.print("Enter the person's age: ");
        age = inputScanner.nextInt(); // Read input from the user

        //Check voting eligibility
        if (age >= 18) {
            // If age is 18 or more, person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // If age is less than 18, person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        //Close the Scanner
        inputScanner.close();
    }
}

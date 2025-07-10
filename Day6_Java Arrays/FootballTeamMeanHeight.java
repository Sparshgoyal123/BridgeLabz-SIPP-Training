/*
Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
a. Create a double array named heights of size 11 and get input values from the user.
b. Find the sum of all the elements present in the array.
c. Divide the sum by 11 to find the mean height and print the mean height of the football team
*/


import java.util.*;

public class FootballTeamMeanHeight {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare and initialize an array to store the heights of 11 players
        double[] playerHeights = new double[11];

        double totalHeight = 0.0;

        System.out.println("Enter the heights (in cm) of 11 football players:");

        for (int i = 0; i < playerHeights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            playerHeights[i] = input.nextDouble(); // Take height input
            totalHeight += playerHeights[i];       // Add to total height
        }

        double meanHeight = totalHeight / playerHeights.length;

        System.out.println("\nThe mean height of the football team is: " + meanHeight + " cm");

        input.close();
    }
}

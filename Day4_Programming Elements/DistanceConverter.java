/*
Write a program to find the distance in yards and miles for the distance provided by the user in feet
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => The distance in yards is ___ while the distance in miles is ___
*/

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // Conversion logic
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Output the results
        System.out.println("The distance in yards is " + distanceInYards + 
                           " while the distance in miles is " + distanceInMiles);

        scanner.close();
    }
}

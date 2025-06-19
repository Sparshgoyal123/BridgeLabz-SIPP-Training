// Write a program to find the distance in yards and miles for the distance provided by the user in feet

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in feet: ");
        double distanceInFeet = sc.nextInt();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.println(
                "The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
        sc.close();
    }
}
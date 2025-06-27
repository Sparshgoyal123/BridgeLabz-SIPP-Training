/*
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => 
Spring Season is from March 20 to June 20
*/


import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Variable declarations for user input
        int month;
        int day;

        // Prompt user to enter the month
        System.out.print("Enter month (1-12): ");
        month = scanner.nextInt();

        // Prompt user to enter the day
        System.out.print("Enter day (1-31): ");
        day = scanner.nextInt();

        // Boolean variable to store if it's spring or not
        boolean isSpringSeason;

        // Logical block to determine if the date falls in Spring Season (March 20 - June 20)
        isSpringSeason = (
            (month == 3 && day >= 20 && day <= 31) ||      // March 20 to March 31
            (month == 4 && day >= 1 && day <= 30)  ||      // All of April
            (month == 5 && day >= 1 && day <= 31)  ||      // All of May
            (month == 6 && day >= 1 && day <= 20)          // June 1 to June 20
        );

        // Output the result
        if (isSpringSeason) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        // Close scanner to avoid memory leaks
        scanner.close();
    }
}

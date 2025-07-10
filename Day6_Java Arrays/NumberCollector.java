/*
Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 
Hint => 
a. Create a variable to store an array of 10 elements of type double as well as a variable to store the total of type double initializes to 0.0. Also, the index variable is initialized to 0 for the array
b. Use infinite while loop as in while (true)
c. Take the user entry and check if the user entered 0 or a negative number to break the loop 
d. Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
e. If the user entered a number other than 0 or a negative number inside the while loop then assign the number to the array element and increment the index value
f. Take another for loop to get the values of each element and add it to the total 
g. Finally display the total value
*/



import java.util.*;

public class NumberCollector {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        double totalSum = 0.0;

        int index = 0;

        while (true) {
            System.out.print("Enter a positive number (0 or negative to stop): ");
            double userNumber = input.nextDouble();

            if (userNumber <= 0) {
                break;
            }

            if (index >= 10) {
                System.out.println("Maximum of 10 numbers reached.");
                break;
            }

            numbers[index] = userNumber;
            index++;
        }

        System.out.print("Numbers entered: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            totalSum += numbers[i];
        }

        System.out.println("\nTotal sum of entered numbers: " + totalSum);

        input.close();
    }
}

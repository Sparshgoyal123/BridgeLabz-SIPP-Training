// Write a program to find the side of the square whose parameter you read from the user

import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perimeter of the square: ");
        int perimeter = sc.nextInt();
        int side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        sc.close();
    }
}

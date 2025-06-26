/*
Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
a. Create variables a, b, and c of int data type.
b. Take user input for a, b, and c.
c. Compute 3 integer operations and assign the result to a variable
d. Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___
*/

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: a, b, c
        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter value of c: ");
        int c = scanner.nextInt();

        // Integer operations with operator precedence
        int result1 = a + b * c;        // Multiplication happens before addition
        int result2 = a * b + c;        // Multiplication happens before addition
        int result3 = c + a / b;        // Division happens before addition
        int result4 = a % b + c;        // Modulo happens before addition

        // Output results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        scanner.close();
    }
}

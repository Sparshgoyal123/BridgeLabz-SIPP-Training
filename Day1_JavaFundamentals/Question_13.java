// Write an IntOperation program by taking a, b, and c as input values and print the results of thefollowing integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand theOperator Precedence.

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        System.out.println(
                "The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        sc.close();
    }
}

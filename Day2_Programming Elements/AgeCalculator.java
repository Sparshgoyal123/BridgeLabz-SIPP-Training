/*
Write a program to find the age of harry if the birth year is 2000. assume the current year is 2024.
I/P => NONE
O/P => Harry's age in 2024 is___
*/



public class AgeCalculator {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;

        System.out.println("Harry's age in 2024 is " + age);
    }
}

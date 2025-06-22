/*
Create a program to convert the distance of 10.8 kilometers to miles
I/P => NONE
O/P => The distance ___ km in miles is ____
*/

public class KilometerToMiles {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double conversionFactor = 1.6;
        double miles = kilometers * conversionFactor;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}

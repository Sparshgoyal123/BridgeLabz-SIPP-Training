/*
Sam's rank in Maths is 94, Physics is 95 and Chemistry is 96 ouyt of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam's average mark in PCM is___
*/

public class AveragePCM {
    public static void main(String[] args) {
        // Marks in individual subjects
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        // Calculate average
        double average = (maths + physics + chemistry) / 3.0;

        // Print result
        System.out.println("Sam's average mark in PCM is " + average);
    }
}

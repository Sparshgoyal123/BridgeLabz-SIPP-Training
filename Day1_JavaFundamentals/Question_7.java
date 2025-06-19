// Suppose you have to divide 14 pens among 3 students equally. Write a program to find how manypens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.

public class Question_7 {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int pensPerStudent = pens / students;
        int remainingPens = pens % students;
        System.out.println("The pen per student is " + pensPerStudent + " and the remaining pen not distributed is "
                + remainingPens);
    }
}

// The University is charging the student a fee of INR 125000 for the course. The University is willing
// to offer a discount of 10%. Write a program to find the discounted amount and discounted price the
// student will pay for the course

public class Question_1 {
    public static void main(String[] args) {
        int fee = 125000;
        double discount = 0.1;
        double discountAmount = fee * discount;
        double discountPrice = fee - discountAmount;
        System.out.println(
                "The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountPrice);
    }
}
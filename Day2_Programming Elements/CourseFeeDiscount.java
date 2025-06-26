public class CourseFeeDiscount {
    public static void main(String[] args) {
        // Step 1: Assign the fee and discount percent
        int fee = 125000;
        int discountPercent = 10;

        // Step 2: Calculate the discount
        int discount = (fee * discountPercent) / 100;

        // Step 3: Calculate the final discounted fee
        int finalFee = fee - discount;

        // Step 4: Print the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}

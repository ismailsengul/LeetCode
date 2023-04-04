import java.util.Arrays;

public class PlusOne {


    /**
     * You are given a large integer represented as an integer array digits,where each digits[i] is the ith digit of the integer.
     * The digits are ordered from most significant to least significant in left-to-right order.
     * The large integer does not contain any leading 0's.
     * Increment the large integer by one and return the resulting array of digits.
     */
    public static void main(String[] args) {

        int[] digits = {9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
//        int[] plusOne = ;
//        for (int i = 0; i < plusOne.length; i++) {
//            System.out.println(plusOne[i]);
//        }

    }

    public static int[] plusOne(int[] digits) {

        digits[digits.length-1]++;
        int carry = 0;
        for (int i = digits.length-1; i >= 0; i--) {
            digits[i] +=carry;
            carry = digits[i]/10;
            digits[i] = digits[i]%10;
        }

        if (carry > 0) {
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = carry;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = digits[i-1];
            }
            digits = newDigits;
        }
        return digits;
    }
}

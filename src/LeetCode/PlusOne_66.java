package LeetCode;

import java.util.Scanner;

public class PlusOne_66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[]{9};
        plusOne(numbers);
    }

    public static int[] plusOne(int[] digits) {
        int count = 1;
        int[] vector = new int[digits.length+1];

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += count;
                count = 0;
                break;
            }
        }

        if (digits[0] == 0 && digits[digits.length - 1] == 0) {
            vector[0] = 1;
            System.arraycopy(digits, 0, vector, 1, digits.length-1);

            return vector;
        }

        return digits;

    }
}

package LeetCode;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x) {
        String numberToString = Integer.toString(x);
        String reversed = new StringBuilder(numberToString).reverse().toString();

        if (reversed.equals(numberToString)) {
            return true;
        } else {
            return false;
        }
    }

 /*
 * class Solution {
public boolean isPalindrome(int x) {
if(Integer.toString(x).compareTo(new StringBuffer(Integer.toString(x)).reverse().toString())==0)
return true;
else
return false;
}
}
 *
 *
 * */


}

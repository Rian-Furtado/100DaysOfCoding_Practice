package LeetCode;

import java.util.Arrays;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("roma","amsor"));
    }

    public static boolean isAnagram(String s, String t){
        char[] sChars = s.toLowerCase().toCharArray();
        char[] tChars = t.toLowerCase().toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(sChars, tChars);
    }
}

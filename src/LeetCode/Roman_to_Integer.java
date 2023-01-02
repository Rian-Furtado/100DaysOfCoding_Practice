package LeetCode;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BiConsumer;

public class Roman_to_Integer {
    public static void main(String[] args) {


        System.out.println(romanToInt("LVIII"));


    }

    public static int romanToInt(String s) {

        Map<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            int value = roman.get(c);

            if (i + 1 < s.length()) {
                char next = s.charAt(i + 1);
                int nextValue = roman.get(next);


                if (nextValue > value) {
                    result += (nextValue - value);
                    i++;
                } else {
                    result += value;
                }

            } else {
                result += value;
            }
        }
        return result;
    }
}


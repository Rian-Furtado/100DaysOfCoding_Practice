package HackerRank;

import java.util.Locale;
import java.util.Scanner;


public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(a.length() + b.length());

        if (a.compareTo(b) == 0) {
            System.out.println("No");
        } else if (a.compareTo(b) < 1) {
            System.out.println("No");
        } else if (a.compareTo(b) >= 1) {
            System.out.println("Yes");
        }

        String result = a.substring(0,1).toUpperCase();
        a = a.replace(a.substring(0,1),result);

        result = b.substring(0,1).toUpperCase();
        b = b.replace(b.substring(0,1),result);

        System.out.println(a + " " + b);
    }
}

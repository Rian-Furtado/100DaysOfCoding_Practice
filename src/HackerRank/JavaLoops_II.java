package HackerRank;

import com.sun.jdi.Value;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JavaLoops_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        int a = 0;
        int b = 0;
        int n = 0;

        do {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();

            int value = a + b;
            int nextValue = 0;

            for (int j = 0; j < n; j++) {
                System.out.print(value + " ");
                nextValue = (int) ( value + Math.pow(2, (j + 1)) * b);
                value = nextValue;
            }

            System.out.println();
            q--;
        } while (q != 0);
    }
}

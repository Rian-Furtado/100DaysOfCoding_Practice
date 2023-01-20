package HackerRank;

import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(vect[i]);
        }

    }
}

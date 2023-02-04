package Beecrowd;

import java.util.Scanner;

public class Substituicao_vetor_I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vect = new int[10];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = scanner.nextInt();
            if (vect[i] < 0 || vect[i] == 0) {
                vect[i] = 1;
            }
        }

        for (int i = 0; i < vect.length; i++) {
            System.out.println("X[" + i + "] = " + vect[i]);
        }
    }
}

package Beecrowd;

import java.util.Scanner;

public class SequenciasCrescentes_1146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        while (number != 0) {

            sequencia(number);
            System.out.println();

            number = sc.nextInt();
        }


    }

    public static void sequencia(int number) {
        for (int i = 1; i < number; i++) {
            System.out.print(i + " ");
        }

        System.out.println(number);
    }
}

package Beecrowd;

import java.util.Scanner;

public class FatorialSimples_1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int fatorial = 0;
        int resultado = 0;
        int atual = 0;

        n = sc.nextInt();

        for (int i = 1; i < n; i++) {

            if (atual == 0) {
                fatorial = n * (n - i);
                resultado = fatorial;
            } else {

                fatorial = resultado * (n - i);
                resultado = fatorial;
            }
            atual++;

        }
        System.out.println(resultado);
    }
}


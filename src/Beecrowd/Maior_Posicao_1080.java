package Beecrowd;

import java.util.Scanner;

public class Maior_Posicao_1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[101];


        for (int i = 1; i < valores.length; i++) {
            valores[i] = sc.nextInt();
        }

        int maior = valores[0];
        int posicao = 0;

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
                posicao = i;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}

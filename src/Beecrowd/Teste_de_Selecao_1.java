package Beecrowd;

import java.util.Scanner;

public class Teste_de_Selecao_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        if(b > c && d > a && (c+d) > (a+b) && c > 0 && d > 0 && a % 2 == 0){
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }

    }
}

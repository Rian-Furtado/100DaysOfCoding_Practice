package Beecrowd;

import java.util.Scanner;

public class Pares_impares_positivos_negativos_1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 0;
        int count_negativos = 0;
        int count_impares = 0;
        int count_positivos = 0;
        int count_pares = 0;

        for (int i = 0; i < 5; i++) {

            number = sc.nextInt();

            if(number < 0){
                count_negativos++;
            }
            if(number > 0){
                count_positivos++;
            }
            if(number % 2 == 0){
                count_pares++;
            }
            if (number % 2 != 0){
                count_impares++;
            }

        }

        System.out.println(count_pares + " valor(es) par(es)");
        System.out.println(count_impares + " valor(es) impar(es)");
        System.out.println(count_positivos + " valor(es) positivo(s)");
        System.out.println(count_negativos + " valor(es) negativo(s)");

    }
}

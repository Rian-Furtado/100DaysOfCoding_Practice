package Beecrowd;

import java.util.Scanner;

public class NumerosPositivos_1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] valores = new double[6];
        int count = 0;

        for (int i = 0; i < 6; i++) {
           valores[i] = sc.nextDouble();
        }

        for (int i = 0; i < valores.length; i++) {
            if(valores[i] > 0){
                count++;
            }
        }
        System.out.println(count + " valores positivos");
    }
}

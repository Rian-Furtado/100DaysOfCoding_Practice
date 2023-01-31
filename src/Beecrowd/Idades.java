package Beecrowd;

import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int idades = 0;
        int count = 0;
        double result = 0.0;

        do{
            idades = sc.nextInt();
            if(idades > 0){
                n += idades;
                count++;
            }
        }while (idades > 0);
        result = (double) n / count;
        System.out.printf("%.2f%n", result);
    }
}

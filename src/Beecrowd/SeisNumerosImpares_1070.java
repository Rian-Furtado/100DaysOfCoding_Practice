package Beecrowd;

import java.util.Scanner;

public class SeisNumerosImpares_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int size = number+6;

        for (int i = number; i < size; i++) {

            if(i % 2 != 0){
                System.out.println(i);
            } else {
                size++;
            }
        }
    }
}

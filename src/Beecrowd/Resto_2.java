package Beecrowd;

import java.util.Scanner;

public class Resto_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 10000; i++) {

            if( i % n == 2){
                System.out.println(i);
            }
        }
    }
}

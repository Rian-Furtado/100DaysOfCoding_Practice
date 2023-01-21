package Beecrowd;

import java.util.Scanner;

public class Intervalo_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int number = 0;
        int count_in = 0;
        int count_out = 0;

        for (int i = 0; i < n ; i++) {
            number = sc.nextInt();

            if(number >= 10 && number <= 20){
                count_in++;
            } else {
                count_out++;
            }
        }

        System.out.println(count_in + " in");
        System.out.println(count_out +" out");


    }
}

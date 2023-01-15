package Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class ParesEntreCincoNumeros_1065 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int number = 0;

        for (int i = 0; i < 5; i++) {
            number = sc.nextInt();
            if(number % 2 == 0){
                count++;
            }
        }

        System.out.println(count + " valores pares");

    }
}

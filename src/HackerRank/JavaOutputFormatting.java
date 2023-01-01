package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 15;
        StringBuilder[] names = new StringBuilder[3];
        int[] vect = new int[3];

        // LEITURA DE DADOS
        for (int i = 0; i < names.length; i++) {
            names[i] = new StringBuilder(sc.next());
            vect[i] = sc.nextInt();

        }


        for (int i = 0; i < names.length; i++) {

            int result = size - names[i].length();

            while (result != 0) {

                names[i].append(" ");

                result--;
            }
        }

        System.out.println("================================");

        for (int i = 0; i < names.length; i++) {
            String aux = Integer.toString(vect[i]);

            if (aux.length() == 1) {

                aux = "0".repeat(2);
                System.out.println(names[i] + "" + aux + vect[i]);

            } else if (aux.length() == 2) {

                aux = "0".repeat(1);
                System.out.println(names[i] + "" + aux + vect[i]);

            } else{
                System.out.println(names[i] + "" + vect[i]);
            }
        }

        System.out.println("================================");
    }


}

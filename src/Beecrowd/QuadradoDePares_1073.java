package Beecrowd;

import java.util.Scanner;

public class QuadradoDePares_1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 1; i <= number ; i++) {

            if(i % 2 == 0){
                System.out.println(i + "^2" + " = " + String.format("%.0f", Math.pow(i,2)));
            }

        }


    }
}

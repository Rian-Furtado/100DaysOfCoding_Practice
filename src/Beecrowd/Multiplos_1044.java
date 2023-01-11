package Beecrowd;

import java.util.Scanner;

public class Multiplos_1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b && (a%b) == 0){
            System.out.println("Sao Multiplos");
        }else if (b > a && (b%a) == 0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

    }
}

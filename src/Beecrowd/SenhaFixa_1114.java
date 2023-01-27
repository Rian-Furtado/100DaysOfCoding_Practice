package Beecrowd;

import java.util.Scanner;

public class SenhaFixa_1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 2002;
        int guess = sc.nextInt();
        while(guess != senha){
            System.out.println("Senha Invalida");
            guess = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

    }
}

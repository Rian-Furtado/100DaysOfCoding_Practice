package Beecrowd;

import java.util.Scanner;

public class Tempo_Jogo_1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour_initial = sc.nextInt();
        int hour_final = sc.nextInt();

        if(hour_initial < hour_final){
            System.out.println("O JOGO DUROU "+ (hour_final - hour_initial ) + " HORA(S)");
        } else {
            System.out.println("O JOGOU DUROU " + (24 - (hour_initial - hour_final) +" HORA(S)"));
        }
    }
}

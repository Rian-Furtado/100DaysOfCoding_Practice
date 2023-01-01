package Beecrowd;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Notas_e_Moedas_1021 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double notasDeCem = a / 100;
        double resto = a % 100;

        double notasDeCiquenta = resto / 50;
        resto = resto % 50;

        double notasDeVinte = resto / 20;
        resto = resto % 20;

        double notasDeDez = resto / 10;
        resto = resto % 10;

        double notasDeCinco = resto / 5;
        resto = resto % 5;

        double notasDeDois = resto / 2;
        resto = resto % 2;

        System.out.println("NOTAS:");

        System.out.println((int)Math.floor(notasDeCem) + " nota(s) de R$ 100.00");
        System.out.println((int)Math.floor(notasDeCiquenta) + " nota(s) de R$ 50.00");
        System.out.println((int)Math.floor(notasDeVinte) + " nota(s) de R$ 20.00");
        System.out.println((int)Math.floor(notasDeDez) + " nota(s) de R$ 10.00");
        System.out.println((int)Math.floor(notasDeCinco) + " nota(s) de R$ 5.00");
        System.out.println((int)Math.floor(notasDeDois) + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");

        double moedasDeUm = resto / 1;
        resto = resto % 1;

        double moedasDeCiquenta = resto / 0.50;
        resto = resto % 0.50;

        double moedasDeVinteCinco = resto / 0.25;
        resto = resto % 0.25;

        double moedasDeDez = resto / 0.10;
        resto = resto % 0.10;

        double moedasDeCinco = resto / 0.05;
        resto = resto % 0.05;

        double moedasDeUmCentavo = resto / 0.01;
        resto = resto % 0.01;

        System.out.println((int)Math.floor(moedasDeUm) + " moeda(s) de R$ 1.00");
        System.out.println((int)Math.floor(moedasDeCiquenta) + " moeda(s) de R$ 0.50");
        System.out.println((int)Math.floor(moedasDeVinteCinco) + " moeda(s) de R$ 0.25");
        System.out.println((int)Math.floor(moedasDeDez) + " moeda(s) de R$ 0.10");
        System.out.println((int)Math.floor(moedasDeCinco) + " moeda(s) de R$ 0.05");
        System.out.printf("%.0f moeda(s) de R$ 0.01\n", moedasDeUmCentavo);




    }

}

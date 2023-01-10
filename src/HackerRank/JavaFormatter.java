package HackerRank;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaFormatter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

       NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
       NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

       NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
       NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

       String us = usFormat.format(payment);
       String india = indiaFormat.format(payment);
       String china = chinaFormat.format(payment);
       String france = franceFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

// VERSÃO JAVA 8 +

/*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* */
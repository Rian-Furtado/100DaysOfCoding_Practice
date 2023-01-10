package Beecrowd;

import java.util.Scanner;

public class Triangulo_1043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double perimetro = 0.0;
        double base = 0.0;

        sc.close();

        if((a+b) > c && (a+c) > b && (c+b) > a){
            perimetro = a+b+c;
            System.out.println("Perimetro = " + String.format("%.1f", perimetro));
        } else {
            base = ((a+b) * c) / 2;
            System.out.println("Area = " + String.format("%.1f", base));
        }
    }
}

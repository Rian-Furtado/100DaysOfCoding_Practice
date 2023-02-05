package Beecrowd;

import java.util.Arrays;
import java.util.Scanner;

public class Tipos_Triangulos_1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[3];
        numbers[0] = sc.nextDouble();
        numbers[1] = sc.nextDouble();
        numbers[2] = sc.nextDouble();

        Arrays.sort(numbers); // 0(n Log(N));

        double v1 = Math.pow(numbers[0], 2) + Math.pow(numbers[1], 2);
        double pow = Math.pow(numbers[numbers.length - 1], 2);
        double a = numbers[numbers.length - 1];
        double b = numbers[0];
        double c = numbers[1];


        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }

        if (pow == v1) {
            System.out.println("TRIANGULO RETANGULO");
        }

        if (pow > v1) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }

        if (pow < v1) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (a == b && c == b && a == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }

        if  ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            System.out.println("TRIANGULO ISOSCELES");
        }



    }
}

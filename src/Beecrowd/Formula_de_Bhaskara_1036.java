package Beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Formula_de_Bhaskara_1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double delta = 0.0;

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        if(delta < 0 || a == 0 || b == 0 || c == 0){
            System.out.println("Impossivel calcular");
        } else {

            double xLinha = (-b + Math.sqrt(delta)) / (2*a);
            double xLinhaII = (-b - Math.sqrt(delta)) / (2*a);

            System.out.printf("R1 = %.5f\n",xLinha);
            System.out.printf("R2 = %.5f\n",xLinhaII);

        }





    }
}

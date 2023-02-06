package Beecrowd;

import java.util.Scanner;

public class Medias_ponderadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double x = 0;
        double y = 0;
        double z = 0;

        for (int i = 0; i < n; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();

            System.out.printf("%.1f\n", ((x*2) + (y*3) + (z*5)) / 10);
        }
    }
}

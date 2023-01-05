package Beecrowd;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Lanche_1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Double> map = new HashMap<>();
        map.put(1, 4.00);
        map.put(2, 4.50);
        map.put(3, 5.00);
        map.put(4, 2.00);
        map.put(5, 1.50);

        int x = sc.nextInt();
        int quantity = sc.nextInt();
        double result = map.get(x) * quantity;
        System.out.println("Total: R$ " + String.format("%.2f", result));
    }
}

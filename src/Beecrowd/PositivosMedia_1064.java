package Beecrowd;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PositivosMedia_1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Double> myList = new ArrayList<>();
        double number = 0.0;
        double sum = 0.0;

        for (int i = 0; i < 6; i++) {
            number = sc.nextDouble();
            if(number > 0){
                myList.add(number);
                sum += number;
            }
        }

        System.out.println(myList.size() + " valores positivos");
        System.out.println(String.format("%.1f",sum / myList.size()));

    }
}

package Beecrowd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mes_1052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer,String> myMap = new HashMap<>();

        myMap.put(1,"January");
        myMap.put(2,"February");
        myMap.put(3,"March");
        myMap.put(4,"April");
        myMap.put(5,"May");
        myMap.put(6,"June");
        myMap.put(7,"July");
        myMap.put(8,"August");
        myMap.put(9,"September");
        myMap.put(10,"October");
        myMap.put(11,"November");
        myMap.put(12,"December");

        int number = sc.nextInt();
        System.out.println(myMap.get(number));


    }
}

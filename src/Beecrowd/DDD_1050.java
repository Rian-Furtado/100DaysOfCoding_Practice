package Beecrowd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DDD_1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer,String> myMap = new HashMap<>();

        myMap.put(61,"Brasilia");
        myMap.put(71,"Salvador");
        myMap.put(11,"Sao Paulo");
        myMap.put(21,"Rio de Janeiro");
        myMap.put(32,"Juiz de Fora");
        myMap.put(19,"Campinas");
        myMap.put(27,"Vitoria");
        myMap.put(31,"Belo Horizonte");


        int yourDDD = sc.nextInt();

        System.out.println(myMap.getOrDefault(yourDDD, "DDD nao cadastrado"));


    }
}

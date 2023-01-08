package Beecrowd;

import java.util.*;

public class SortSimples_1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(sc.nextInt());
        numbers.add(sc.nextInt());
        numbers.add(sc.nextInt());

        Set<Integer> result = new TreeSet<>(numbers);

        for (Integer x :
                result) {
            System.out.println(x);
        }

        System.out.println();

        for (Integer y:
             numbers) {
            System.out.println(y);
        }
    }
}

package HackerRank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        List<Character> myList = Stream.of(a.toLowerCase(), b.toLowerCase())
                .flatMapToInt(String::chars)
                .mapToObj(letra -> (char) letra)
                .collect(Collectors.toList());

        for (Character x :
                myList) {

            int count = Collections.frequency(myList, x);

            if (count % 2 != 0) {
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
}

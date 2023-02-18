package HackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();

        int n = sc.nextInt();
        String name = null;
        String number = null;

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            name = sc.nextLine();
            number = sc.nextLine();
            map.put(name.toLowerCase(), number);
        }

        while(sc.hasNext()){
            String seach = sc.nextLine();

            if(!map.containsKey(seach)){
                System.out.println("Not found");
            } else {
                System.out.println(seach+"="+map.get(seach));
            }
        }
    }
}

package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        print(list);
        list2.add("Hello");
        list2.add("World");
        print(list2);
    }

    public static <T> T print(List<T> list){
        for (T x :
                list) {
            System.out.println(x);
        }
        return  null;
    }
}


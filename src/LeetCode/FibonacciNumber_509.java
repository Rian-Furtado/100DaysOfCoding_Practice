package LeetCode;

import java.util.List;
import java.util.stream.Stream;

public class FibonacciNumber_509 {
    public static void main(String[] args) {

        System.out.println(fib(4));

    }
    public static int fib(int n) {

        Stream<Integer> fibonacciNumbers = Stream.iterate(new Integer[]{0, 1}, p -> new Integer[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        List<Integer> list = fibonacciNumbers.limit(n).toList();

        if ((n - 1) < 0 || (n - 2) < 0) {
            return n;
        } else {
            return list.get(n - 1) + list.get(n - 2);
        }
    }
}

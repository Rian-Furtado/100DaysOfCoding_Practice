package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger resultMultiply = a.multiply(b);
        BigInteger resultSum = a.add(b);

        System.out.println(resultSum);
        System.out.println(resultMultiply);
    }
}

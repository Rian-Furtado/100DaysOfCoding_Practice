package HackerRank;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger num = sc.nextBigInteger();

        boolean isPrime = num.isProbablePrime(1);

        if (isPrime){
            System.out.println("prime.");
        } else {
            System.out.println("not prime.");
        }
    }
}

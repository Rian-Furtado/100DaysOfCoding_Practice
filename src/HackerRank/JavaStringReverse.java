package HackerRank;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        StringBuilder reverseInput = new StringBuilder(input);
        reverseInput.reverse();

        if(reverseInput.toString().equals(input)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }



    }
}

package HackerRank;

import java.util.Scanner;

public class Int_to_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);

        if( s instanceof String){
            System.out.println("Good job");
        } else{
            System.out.println("Wrong answer");
        }

    }
}

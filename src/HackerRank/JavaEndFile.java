package HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaEndFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int line_num = 0;

        while(sc.hasNext()){
            System.out.println((line_num+=1) + " " + sc.nextLine());
        }

    }
}

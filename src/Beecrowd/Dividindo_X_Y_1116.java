package Beecrowd;

import java.util.Scanner;

public class Dividindo_X_Y_1116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double number = 0;
        double number2 = 0;

        for (int i = 0; i < n; i++) {

            number = scanner.nextDouble();
            number2 = scanner.nextDouble();

            if(number2 == 0){
                System.out.println("divisao impossivel");
            }else{
                System.out.println(number/number2);
            }
        }
    }
}


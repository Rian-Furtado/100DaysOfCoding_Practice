package Beecrowd;

import java.util.Scanner;

public class Maior_Posicao_1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[100];


        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int maior = nums[0];
        int position = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] > maior){
                maior = nums[i];
                position = i;
            }
        }

        System.out.println(maior);
        System.out.println(position);
    }
}

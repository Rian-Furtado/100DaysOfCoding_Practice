package Beecrowd;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Media_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double n1 =  sc.nextDouble();
        double n2 =  sc.nextDouble();
        double n3 =  sc.nextDouble();
        double n4 =  sc.nextDouble();

        double media = ((n1*2) + (n2*3) + (n3*4) + (n4*1)) / 10.0;
        String format = new DecimalFormat("#,#0.0").format(media);
        media = Double.parseDouble(format);

        if(media >= 7.0){
            System.out.println("Media: " + media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Media: " + media);
            System.out.println("Aluno reprovado.");
        }

        if(media >= 5.0 && media <= 6.9){
            System.out.println("Media: " + media);
            System.out.println("Aluno em exame.");
            double notaExame = sc.nextDouble();

            System.out.println("Nota do exame: " + String.format("%.1f", notaExame));

            double result =  (media + notaExame) / 2;

            if(result > 5){
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + String.format("%.1f", result));
            }else{
                System.out.println("Aluno reprovado.");
            }
        }

    }
}
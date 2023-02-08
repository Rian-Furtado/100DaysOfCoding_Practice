package Beecrowd;


import java.util.Locale;
import java.util.Scanner;

public class Aumento_Salario_1048 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();

        double novoSalario = (salary + (reajusteSalarial(salary)));
        double percentual = ((novoSalario - salary) / salary * 100);

        System.out.println("Novo salario: " + String.format("%.2f",novoSalario));
        System.out.println("Reajuste ganho: " + String.format("%.2f", reajusteSalarial(salary)));
        System.out.println("Em percentual: " + String.format("%.0f",percentual) + " %");
    }

    public static double reajusteSalarial(double salario) {

        if (salario == 400) {
            return salario * 0.15;
        } else if (salario <= 800) {
            return salario * 0.12;
        } else if (salario <= 1200) {
            return salario * 0.1;
        } else if (salario <= 2000) {
            return salario * 0.07;
        } else if (salario > 2000) {
            return salario * 0.04;
        }
        return 0.0;
    }


}

package LeetCode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle_118 {
    public static void main(String[] args) {

        System.out.println( generate(1));
    }

    public static List<List<Integer>> generate(int numRows) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> numbers = new ArrayList<>();
        int countLinhas = 2;

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            if (i == 0) {
                list.add(1);
                numbers.add(i, list);

            }

            if (i == 1) {
                list.add(1);
                list.add(1);
                numbers.add(i, list);

            }

            if (i > 1) {
                for (int j = 0; j <= countLinhas; j++) {
                    BigInteger result = calculateFactorial(countLinhas).divide(calculateFactorial(j).multiply(calculateFactorial(countLinhas - j)));
                    list.add(result.intValue());
                }
                numbers.add(i, list);
                countLinhas++;
            }
        }
        return numbers;
    }
    public static BigInteger calculateFactorial(int x) {
        BigInteger value = BigInteger.valueOf(x);
        BigInteger nextValue = BigInteger.valueOf(0);

        if (x == 0) {
            value = BigInteger.valueOf(1);
        } else {
            for (int i = 1; i < x; i++) {
                nextValue = value.multiply(BigInteger.valueOf((x - i)));
                value = nextValue;
            }
        }

        return value;
    }
}

/*
* Outra implementação que achei interressante e mais rápida
*
* List<List<Integer>> pascalTriangle = new ArrayList<>();

// adiciona a primeira linha
pascalTriangle.add(Arrays.asList(1));

// adiciona a segunda linha
pascalTriangle.add(Arrays.asList(1, 1));

for (int i = 2; i < numRows; i++) {
  List<Integer> previousRow = pascalTriangle.get(i - 1);
  List<Integer> currentRow = new ArrayList<>();

  currentRow.add(1); // adiciona o primeiro elemento da linha

  // gera os elementos do meio da linha
  for (int j = 1; j < i; j++) {
    int element = previousRow.get(j - 1) + previousRow.get(j);
    currentRow.add(element);
  }

  currentRow.add(1); // adiciona o último elemento da linha

  pascalTriangle.add(currentRow);
}

*
* */

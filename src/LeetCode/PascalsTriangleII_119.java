package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII_119 {
    public static void main(String[] args) {
        System.out.println(getRow(10));
    }
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        pascalTriangle.add(Arrays.asList(1)); // ADICIONA LINHA 0
        pascalTriangle.add(Arrays.asList(1, 1)); // ADICIONA LINHA 1

        for ( int i = 2; i <= rowIndex; i++){
            List<Integer> previousRow = pascalTriangle.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int j = 1; j < i; j++){
                int element = previousRow.get(j-1) + previousRow.get(j);
                currentRow.add(element);
            }
            currentRow.add(1);
            pascalTriangle.add(currentRow);
        }
        return pascalTriangle.get(rowIndex);
    }
}

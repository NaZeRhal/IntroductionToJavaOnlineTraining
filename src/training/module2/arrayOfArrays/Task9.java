package training.module2.arrayOfArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {

    //Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
    //столбец содержит максимальную сумму.

    public static void getMaxSumInColumn(int[][] matrix) {
        int[] sumArr = new int[matrix[0].length];

        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                sumArr[j] += row[j];
            }
        }
        List<Integer> sumList = Arrays.stream(sumArr).boxed().collect(Collectors.toList());
        int max = Collections.max(sumList);
        int column = sumList.indexOf(max);
        System.out.printf("В %d ряду максимальная сумма элементов -> %d", column, max);
    }
}

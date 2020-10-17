package training.module2.arrayOfArrays;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void printColumnsByCondition(int[][] matrix) {
        List<Integer> columnIndexes = new ArrayList<>();
        int rowsCount = matrix.length;
        for (int i = 1; i < matrix[0].length; i += 2) {
            if (matrix[0][i] > matrix[rowsCount - 1][i]) {
                columnIndexes.add(i);
            }
        }

        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                if (columnIndexes.contains(j)) {
                    System.out.print(row[j]);
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

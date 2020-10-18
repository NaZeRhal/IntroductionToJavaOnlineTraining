package training.module2.oneDimensionalArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Task11 {

    //Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    //которых число 5 встречается три и более раз

    public static void solveMatrix() {
        Map<Integer, Integer> map = new HashMap<>();
        int[][] matrix = new int[10][20];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Random random = new Random();
                int nextInt = random.nextInt(16);
                matrix[i][j] = nextInt;
                if (nextInt == 5) {
                    map.merge(i, 1, Integer::sum);
                }
            }
        }
        printMatrix(matrix);
        System.out.println();
        System.out.println("Номера строк, в которых число 5 встречается три и более раз: ");
        map.entrySet().stream()
                .filter(entry -> entry.getValue() >= 3)
                .forEach(entry -> System.out.print(entry.getKey() + " "));
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] rows : matrix) {
            for (int inColumn : rows) {
                System.out.printf("%d ", inColumn);
            }
            System.out.println();
        }
    }

}

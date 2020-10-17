package training.module2.arrayOfArrays;

public class Task3 {

    //Дана матрица. Вывести k-ю строку и p-й столбец матрицы
    public static void printRow(int[][] matrix, int row) {
        if (row < matrix.length) {
            for (int i = 0; i < matrix[row].length; i++) {
                System.out.printf("%d ", matrix[row][i]);
            }
        }
    }

    public static void printColumn(int[][] matrix, int column) {
        if (column < matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.printf("%d ", matrix[i][column]);
            }
            System.out.println();
        }
    }
}

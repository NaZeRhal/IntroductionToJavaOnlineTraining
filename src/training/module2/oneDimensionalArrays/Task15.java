package training.module2.oneDimensionalArrays;

public class Task15 {

    //Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

    public static void changeOddElements(int[][] matrix) {
        int maxElement = getMaxElement(matrix);
        changeOddElementsWithMaxElement(matrix, maxElement);
    }

    private static void changeOddElementsWithMaxElement(int[][] matrix, int maxElement) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    matrix[i][j] = maxElement;
                }
            }
        }
    }

    private static int getMaxElement(int[][] matrix) {
        int maxElement = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                maxElement = Math.max(value, maxElement);
            }
        }
        return maxElement;
    }
}

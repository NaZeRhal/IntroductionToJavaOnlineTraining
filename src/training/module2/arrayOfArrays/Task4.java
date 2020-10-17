package training.module2.arrayOfArrays;

public class Task4 {

    //Сформировать квадратную матрицу порядка n по образцу
    public static int[][] formMatrix(int n) {
        int[] evenRow = new int[n];
        int[] oddRow = new int[n];
        for (int i = 1; i <= n; i++) {
            evenRow[i - 1] = i;
            oddRow[i - 1] = n + 1 - i;
        }
        int [][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
                matrix[i] = i % 2 == 0 ? evenRow : oddRow;
        }
        return matrix;
    }
}

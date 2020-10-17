package training.module2.arrayOfArrays;

public class Task5 {

    //Сформировать квадратную матрицу порядка n по заданному образцу

    public static int[][] formMatrix(int n) {
//        int[] evenRow = new int[n];
//        int[] oddRow = new int[n];
//
//
//        for (int i = 1; i <= n; i++) {
//            evenRow[i - 1] = i;
//            oddRow[i - 1] = n + 1 - i;
//        }
//

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                matrix[i][j] = i + 1;
            }
        }
        return matrix;
    }
}

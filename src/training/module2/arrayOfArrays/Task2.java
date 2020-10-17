package training.module2.arrayOfArrays;

public class Task2 {

    public static void printDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.print(matrix[i][j]);
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

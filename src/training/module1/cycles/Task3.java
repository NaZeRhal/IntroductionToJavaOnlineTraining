package training.module1.cycles;

import java.util.stream.IntStream;

public class Task3 {

    // Найти сумму квадратов первых ста чисел
    public static int sumOfSquares(int x, int y) {
        return IntStream.rangeClosed(x, y).map(num -> num * num).sum();
    }

    public static int sumOfSquaresModified(int x, int y) {
       return  (y * (y + 1) * (2 * y + 1)) / 6 - (x * (x-1) * (2 * x - 1)) / 6;
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares(1, 100));
        System.out.println(sumOfSquaresModified(1, 100));
    }
}

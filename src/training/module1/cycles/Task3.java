package training.module1.cycles;

import java.util.stream.IntStream;

public class Task3 {

    public static int sumOfSquares(int x, int y) {
        return IntStream.rangeClosed(x, y).map(num -> num * num).sum();
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquares(1, 100));
    }
}

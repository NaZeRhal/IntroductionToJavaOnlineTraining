package training.module2.oneDimensionalArrays;

import java.util.stream.IntStream;

public class Task6 {

    public static int getSumByPrimesIndexes(int[] array) {
        return IntStream.range(2, array.length)
                .filter(Task6::isPrime)
                .map(x -> array[x])
                .sum();
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}

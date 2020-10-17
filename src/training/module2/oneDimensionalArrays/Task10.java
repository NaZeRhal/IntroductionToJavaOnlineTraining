package training.module2.oneDimensionalArrays;

import java.util.stream.IntStream;

public class Task10 {

    public static int[] reduceArray(int[] array) {
        IntStream.range(0, array.length)
                .filter(x -> x % 2 != 0)
                .forEach(num -> array[num] = 0);
        return array;
    }
}

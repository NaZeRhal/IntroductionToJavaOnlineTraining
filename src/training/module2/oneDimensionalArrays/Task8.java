package training.module2.oneDimensionalArrays;

import java.util.stream.IntStream;

public class Task8 {

    public static int[] changeArray(int[] array) {
        int min = IntStream.of(array).min().orElse(0);
        return IntStream.of(array).filter(num -> num != min).toArray();
    }
}

package training.module2.oneDimensionalArrays;

import java.util.stream.IntStream;

public class Task5 {

    public static void printNums(int[] array, int i) {
        IntStream.of(array).filter(num -> num > i).forEach(System.out::println);
    }
}

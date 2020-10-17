package training.module2.oneDimensionalArrays;

import java.util.stream.IntStream;

public class Task8 {


    //Дана последовательность целых чисел a1,a2,...,an . Образовать новую последовательность, выбросив из
    //исходной те члены, которые равны min(a1,a2,...,an) .
    public static int[] changeArray(int[] array) {
        int min = IntStream.of(array).min().orElse(0);
        return IntStream.of(array).filter(num -> num != min).toArray();
    }
}

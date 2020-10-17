package training.module2.oneDimensionalArrays;

import java.util.Arrays;

public class Task1 {

    //В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

    public static int getSumOfNumbersByCondition(int[] array, int k) {
        return Arrays.stream(array).filter(x -> x % k == 0).sum();
    }

}

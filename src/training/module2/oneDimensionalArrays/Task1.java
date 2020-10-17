package training.module2.oneDimensionalArrays;

import java.util.Arrays;

public class Task1 {

    public static int getSumOfNumbersByCondition(int[] array, int k) {
        return Arrays.stream(array).filter(x -> x % k == 0).sum();
    }

}

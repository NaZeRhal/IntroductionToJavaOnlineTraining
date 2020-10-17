package training.module2.oneDimensionalArrays;

import java.util.Arrays;

public class Task2 {

    public static void replaceAndCount(int[] array, int z) {
        int count = 0;
        for (int i = 0, arrayLength = array.length; i < arrayLength; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }
        System.out.println("Changed array: " + Arrays.toString(array));
        System.out.println("Number of replacements: " + count);
    }
}

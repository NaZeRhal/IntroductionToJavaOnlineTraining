package training.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static int[] changeMinMax(int[] array) {
        List<Integer> integerList = Arrays.stream(array).boxed().collect(Collectors.toList());
        List<Integer> sortedArrayList = Arrays.stream(array).boxed().sorted().collect(Collectors.toList());
        int min = sortedArrayList.get(0);
        int max = sortedArrayList.get(sortedArrayList.size() - 1);
        int indexMin = integerList.indexOf(min);
        int indexMax = integerList.indexOf(max);
        integerList.set(indexMin, max);
        integerList.set(indexMax, min);
        return integerList.stream().mapToInt(i -> i).toArray();
    }
}

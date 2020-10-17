package training.module2.oneDimensionalArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task9 {

    //В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
    //чисел несколько, то определить наименьшее из них

    public static int getMostCommonNumber(int[] array) {
        if (array.length != 0) {
            Map<Integer, Long> frequencyMap = Arrays.stream(array)
                    .boxed()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            long maxValue = Collections.max(frequencyMap.values());

            return frequencyMap.entrySet().stream()
                    .filter(entry -> entry.getValue() == maxValue)
                    .sorted(Comparator.comparingInt(Map.Entry::getKey))
                    .limit(1)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(-1);
        }
        return -1;
    }
}

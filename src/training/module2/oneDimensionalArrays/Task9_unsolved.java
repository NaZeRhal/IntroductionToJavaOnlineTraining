package training.module2.oneDimensionalArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Task9_unsolved {

    public static int getMostCommonNumber(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        IntStream.of(array).forEach(num -> {
            if (!frequencyMap.containsKey(num)) {
                frequencyMap.put(num, 0);
            } else {
                frequencyMap.replace(num, frequencyMap.get(num) + 1);
            }
        });
        Integer max = frequencyMap.values().stream().max(Integer::compareTo).orElse(0);

        return frequencyMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .findAny()
                .orElse(0);
    }
}

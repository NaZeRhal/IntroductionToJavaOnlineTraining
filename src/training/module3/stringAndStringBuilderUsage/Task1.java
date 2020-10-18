package training.module3.stringAndStringBuilderUsage;

import java.util.Arrays;

public class Task1 {

    //Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем
    public static int maxGapsCounter(String text) {
        return Arrays.stream(text.split("[^\\n&\\s]"))
                .map(String::length)
                .mapToInt(i -> i)
                .max()
                .orElse(0);
    }
}

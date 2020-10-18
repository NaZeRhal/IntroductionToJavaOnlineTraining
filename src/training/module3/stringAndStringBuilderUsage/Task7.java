package training.module3.stringAndStringBuilderUsage;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task7 {

    //Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
    //def", то должно быть выведено "abcdef"
    public static void removeGapsAndDuplicates(String line) {
        String changedLine = Arrays.stream(line.replaceAll("\\s+", "").split(""))
                .distinct()
                .collect(Collectors.joining());
        System.out.println(changedLine);
    }
}

package training.module3.stringAndStringBuilderUsage;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task7 {

    public static void removeGapsAndDuplicates(String line) {
        String changedLine = Arrays.stream(line.replaceAll("\\s+", "").split(""))
                .distinct()
                .collect(Collectors.joining());
        System.out.println(changedLine);
    }
}

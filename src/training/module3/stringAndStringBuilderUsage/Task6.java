package training.module3.stringAndStringBuilderUsage;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task6 {

    public static void changeLine(String line) {
        String changedLine = Arrays.stream(line.split(""))
                .map(s -> s + s)
                .collect(Collectors.joining());
        System.out.println(changedLine);
    }

    public static void changeLineStringBuilder(String line) {
        StringBuilder builder = new StringBuilder();
        for (String s : line.split("")) {
            builder.append(s).append(s);
        }
        System.out.println(builder.toString());
    }
}

package training.module3.stringAndStringBuilderUsage;

import java.util.Arrays;

public class Task5 {

    public static int countA(String line) {
        return (int) Arrays.stream(line.split("")).filter(s -> s.equals("a")).count();
    }
}

package training.module3.stringsAsArray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    public static int numCount(String line) {
        int count = 0;
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
           count++;
        }
        return count;
    }
}

package training.module3.stringsAsArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    //camelCase to snake_case
    public static String[] camelCaseToSnakeCase(String[] fieldNamesArray) {
        List<String> result = new ArrayList<>();
        for (String s : fieldNamesArray) {
           s = s.replaceAll("([A-Z][a-z])", "_$1").toLowerCase();
            result.add(s);
        }
        return result.toArray(new String[0]);
    }

}

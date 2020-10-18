package training.module3.stringAndStringBuilderUsage;

import java.util.HashMap;
import java.util.Map;

public class Task9 {

    //Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
    //буквы
    public static Map<String, Integer> countLowerAndUpperCaseLetters(String text) {
        Map<String, Integer> resultMap = new HashMap<>();
        resultMap.put("lowerCase", 0);
        resultMap.put("upperCase", 0);
        text.chars().forEach(ch -> {
            if (ch >= 97 && ch <= 122) {
                resultMap.replace("lowerCase", resultMap.get("lowerCase") + 1);
            } else if (ch >= 65 && ch <= 90) {
                resultMap.replace("upperCase", resultMap.get("upperCase") + 1);
            }
        });
        return resultMap;
    }
}

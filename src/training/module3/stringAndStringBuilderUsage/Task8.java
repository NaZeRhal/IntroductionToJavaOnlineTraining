package training.module3.stringAndStringBuilderUsage;

import java.util.*;

public class Task8 {

    public static String findLongestWord(String text) {
        int maxLength = 0;
        List<String> words = new ArrayList<>();
        for (String s : text.split(" ")) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                words.add(s);
            }
        }
        return words.size() != 1 ? " " : words.get(0);
    }
}

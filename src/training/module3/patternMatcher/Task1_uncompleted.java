package training.module3.patternMatcher;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1_uncompleted {
    //Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
    //операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
    //отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
    //алфавиту

    public static void solveText(String text) {
        List<String> paragraphs = getParagraphs(text);
        List<String> sortedParagraphs = sortParagraphs(paragraphs);
        System.out.println(String.join("\n", sortedParagraphs));
    }

    private static List<String> getParagraphs(String text) {
        return Arrays.stream(text.split("[\n|\n\r|\r\n]+")).collect(Collectors.toList());
    }

    private static List<String> sortParagraphs(List<String> paragraphs) {
        return paragraphs.stream()
                .sorted(Comparator.comparingInt(value -> value.split("[\\.!?]+").length))
                .collect(Collectors.toList());
    }
}

package training.module3.stringAndStringBuilderUsage;

public class Task3 {

    public static boolean isPalindrom(String word) {
        StringBuilder builder = new StringBuilder(word);
        return word.equals(builder.reverse().toString());
    }
}

package training.module3.stringAndStringBuilderUsage;

public class Task2 {

    //В строке вставить после каждого символа 'a' символ 'b
    public static String putAAfterB(String text) {
        return text.replaceAll("a", "ab");
    }
}

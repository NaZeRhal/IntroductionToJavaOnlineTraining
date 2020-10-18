package training.module3.stringAndStringBuilderUsage;

public class Task3 {


    //Проверить, является ли заданное слово палиндромом
    public static boolean isPalindrom(String word) {
        StringBuilder builder = new StringBuilder(word);
        return word.equals(builder.reverse().toString());
    }
}

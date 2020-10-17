package training.module3.stringsAsArray;

import java.util.Arrays;

public class Task3 {

    public static int numbersCount(String letter) {
        return (int) Arrays.stream(letter.split("")).filter(Task3::isNUmber).count();
    }

    private static boolean isNUmber(String letter) {
        try {
            Integer.parseInt(letter);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

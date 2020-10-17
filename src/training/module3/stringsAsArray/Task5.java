package training.module3.stringsAsArray;

public class Task5 {

    public static String removeExtraGaps(String line) {
        return line.trim().replaceAll("\\s+", " ");
    }
}

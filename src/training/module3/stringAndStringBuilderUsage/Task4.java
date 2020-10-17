package training.module3.stringAndStringBuilderUsage;

public class Task4 {

    private static String info = "информатика";

    public static String getInfo() {
        return info;
    }

    public static void main(String[] args) {
        char[] charArray = getInfo().toCharArray();
        String t = String.copyValueOf(charArray, 7, 1);
        String o = String.copyValueOf(charArray, 3, 1);
        String p = String.copyValueOf(charArray, 4, 1);
        System.out.println(t.concat(o).concat(p).concat(t));
    }
}

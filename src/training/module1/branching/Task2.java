package training.module1.branching;

public class Task2 {

    //Найти max{min(a, b), min(c, d)}

    public static int getMaxFromMin(int a, int b, int c, int d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }
}

package training.module1.branching;

public class Task5 {

    public static double calculateFunction(double x) {
        if (x <= 3) {
            return x * x - 3 * x + 9;
        } else {
            return 1 / (x * x * x + 6);
        }
    }
}

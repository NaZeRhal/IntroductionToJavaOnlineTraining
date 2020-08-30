package training.module1.branching;

public class Task1 {

    public static boolean isRightTriangle(double angleA, double angleB) {
        if (isTriangle(angleA, angleB)) {
            return angleA == 90 || angleB == 90 || (180 - angleA - angleB) == 90;
        }
        return false;
    }

    private static boolean isTriangle(double angleA, double angleB) {
        return (180 - angleA - angleA) > 0;
    }
}

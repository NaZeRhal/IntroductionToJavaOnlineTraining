package training.module1.branching;

public class Task3 {

    public static boolean isLine(int[] pointA, int[] pointB, int[] pointC) {
        return ((pointC[0] - pointA[0]) / (pointB[0] - pointA[0])) ==
                ((pointC[1] - pointA[1]) / (pointB[1] - pointA[1]));
    }
}

package training.module1.branching;

public class Task3 {

    //Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

    public static boolean isLine(int[] pointA, int[] pointB, int[] pointC) {
        return ((pointC[0] - pointA[0]) / (pointB[0] - pointA[0])) ==
                ((pointC[1] - pointA[1]) / (pointB[1] - pointA[1]));
    }
}

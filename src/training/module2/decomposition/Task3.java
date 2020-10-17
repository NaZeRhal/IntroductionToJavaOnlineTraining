package training.module2.decomposition;

public class Task3 {

    public static double hexagonSquare(int side) {
        return equilateralTriangleSquare(side) * 6;
    }

    public static double equilateralTriangleSquare(int side) {
        return side * side * Math.sqrt(3) / 4;
    }
}

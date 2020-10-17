package training.module1.branching;

public class Task4 {

    //Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
    //отверстие.

    public static boolean isBrickFitHole(int[] holeSize, int[] brickSize) {
        if (holeSize.length != 2 || brickSize.length != 3) {
            return false;
        }
        if (holeSize[0] == brickSize[0]) {
            return holeSize[1] == brickSize[1] || holeSize[1] == brickSize[2];
        } else if (holeSize[0] == brickSize[1]) {
            return holeSize[1] == brickSize[0] || holeSize[1] == brickSize[2];
        } else if (holeSize[0] == brickSize[2]) {
            return holeSize[1] == brickSize[0] || holeSize[1] == brickSize[1];
        }
        return false;
    }
}

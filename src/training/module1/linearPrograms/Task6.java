package training.module1.linearPrograms;


public class Task6 {

    public static boolean isDotInside(int x, int y) {
        return (x >= -4 && x <= 4) &&
                (y >= -3 && y <= 4) &&
                (x >= -2 || y <= 0) &&
                (x <= 2 || y <= 0);
    }
}

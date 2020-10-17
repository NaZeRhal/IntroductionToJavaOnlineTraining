package training.module2.oneDimensionalArrays;

public class Task3 {

    public static int[] decomposeAndCount(int[] array) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        for (int i : array) {
            if (i > 0) positives++;
            if (i == 0) zeros++;
            if (i < 0) negatives++;
        }
        return new int[]{negatives, positives, zeros};

    }
}

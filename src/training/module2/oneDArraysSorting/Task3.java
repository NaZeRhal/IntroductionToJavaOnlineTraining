package training.module2.oneDArraysSorting;

public class Task3 {

    public static int[] selectionSort(int[] array) {
        int max = Integer.MIN_VALUE;
        int indexMax = -1;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    indexMax = j;
                }
            }
            int tmp = array[i];
            array[i] = array[indexMax];
            array[indexMax] = tmp;
            max = Integer.MIN_VALUE;
        }
        return array;
    }
}

package training.module2.oneDimensionalArrays;

import java.util.Arrays;

public class Task7 {

    //Даны действительные числа a1,a2,...,an . Найти max( a1 + a2n,a2 + a2n−1,...,an + an+1)

    public static int getMax(int[] arr) {
        int max = -1;

        if (arr.length == 0) {
            return max;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            //d - шаг прогрессии
            int d = arr[1] - arr[0];
            for (int i = 0; i < arr.length; i++) {
                max = Math.max(arr[i] + arr[i] + d * (2 * arr.length - 1) - (i + 1) * d, max);
            }
        }
        return max;
    }
}

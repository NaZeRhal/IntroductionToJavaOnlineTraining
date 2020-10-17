package training.module2.decomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task2 {

    public static int getGreatestCommonDivisor(int x, int y, int k, int m) {
        List<Integer> divisors = getDivisors(x, y, k, m);
        return divisors.isEmpty() ? -1 : divisors.get(divisors.size() - 1);
    }

    private static List<Integer> getDivisors(int x, int y, int k, int m) {
        List<Integer> divisors = new ArrayList<>();
        if (x > 2 && y > 2 && k > 2 && m > 2) {
            int min = IntStream.of(x, y, k, m).min().getAsInt();
            IntStream.range(2, min).forEach(num -> {
                if ((x % num) == 0 && (y % num) == 0 && (k % num) == 0 && (m % num) == 0)
                    divisors.add(num);
            });
        }
        return divisors;
    }
}

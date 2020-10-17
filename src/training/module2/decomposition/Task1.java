package training.module2.decomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Task1 {

    public static int getGreatestCommonDivisor(int m, int n) {
        List<Integer> divisors = getDivisors(m, n);
        return divisors.size() != 0 ? divisors.get(divisors.size() - 1) : Integer.valueOf(-1);
    }

    public static int getLeastCommonMultiple(int m, int n) {
        int gcd = getGreatestCommonDivisor(m, n);
        return gcd != -1 ? m * n / gcd : -1;
    }

    private static List<Integer> getDivisors(int x, int y) {
        List<Integer> divisors = new ArrayList<>();
        if (x > 2 && y > 2) {
            int value = Math.min(x, y);
            IntStream.range(2, value).forEach(num -> {
                if ((x % num) == 0 && (y % num) == 0)
                    divisors.add(num);
            });
        }
        return divisors;
    }

}

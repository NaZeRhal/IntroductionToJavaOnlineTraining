package training.module1.cycles;

import java.util.stream.IntStream;

public class Task5 {

    public static void main(String[] args) {
        double e = 0.000236;
        System.out.println(IntStream.rangeClosed(1, 1024)
                .mapToDouble(val -> 1 / Math.pow(2, val) + 1 / Math.pow(3, val))
                .filter(x -> x >= e)
                .sum());
    }
}

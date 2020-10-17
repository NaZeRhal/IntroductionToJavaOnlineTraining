package training.module1.cycles;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Task4 {

    //Составить программу нахождения произведения квадратов первых двухсот чисел

    public static String productSquares(int x, int y) {
        return LongStream.rangeClosed(x, y)
                .map(num -> num * num)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger::multiply)
                .orElse(BigInteger.ZERO).toString();
    }

    public static void main(String[] args) {
        System.out.println(productSquares(1, 200));
    }
}

package training.module1.cycles;

import java.util.stream.IntStream;

public class Task5 {

    //Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    //заданному е. Общий член ряда имеет вид: (1 / 2^n) + (1 / 3^n)

    public static void getSum(double e) {
        System.out.println(IntStream.rangeClosed(1, 1024)
                .mapToDouble(val -> 1 / Math.pow(2, val) + 1 / Math.pow(3, val))
                .filter(x -> x >= e)
                .sum());
    }

    public static void main(String[] args) {
        getSum(0.123);
    }
}

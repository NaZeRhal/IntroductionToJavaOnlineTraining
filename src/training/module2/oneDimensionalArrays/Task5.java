package training.module2.oneDimensionalArrays;

import java.util.stream.IntStream;

public class Task5 {


    //Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i

    public static void printNums(int[] array, int i) {
        IntStream.of(array).filter(num -> num > i).forEach(System.out::println);
    }
}

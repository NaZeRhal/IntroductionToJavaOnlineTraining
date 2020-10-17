package training.module2.oneDimensionalArrays;

import java.util.stream.IntStream;

public class Task10 {

    //Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
    //элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать

    public static int[] reduceArray(int[] array) {
        IntStream.range(0, array.length)
                .filter(x -> x % 2 != 0)
                .forEach(num -> array[num] = 0);
        return array;
    }
}

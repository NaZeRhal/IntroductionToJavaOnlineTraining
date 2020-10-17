package training.module1.cycles;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task8 {

    //Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

    public static List<String> getEqualNumbersInTwoNumbers(int x, int y) {
        List<String> numbersInX = Arrays.stream(String.valueOf(x).split("")).collect(Collectors.toList());
        List<String> numbersInY = Arrays.stream(String.valueOf(y).split("")).collect(Collectors.toList());
        numbersInX.retainAll(numbersInY);
        return numbersInX;
    }
}

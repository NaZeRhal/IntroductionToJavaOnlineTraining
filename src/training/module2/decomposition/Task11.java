package training.module2.decomposition;

public class Task11 {

    //Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр

    public static int compareNumbersWithDigits(int num1, int num2) {
        return getDigitsCount(num1) - getDigitsCount(num2);
    }

    private static int getDigitsCount(int num) {
       return String.valueOf(num).split("").length;
    }
}

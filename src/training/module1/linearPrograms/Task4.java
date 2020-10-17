package training.module1.linearPrograms;

public class Task4 {

    //Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    //дробную и целую части числа и вывести полученное значение числа.

    public static double changeDouble(double d) {
        if (d < 0) {
            return 0.0;
        }
        String[] numArr = Double.toString(d).split("\\.");
        return Double.parseDouble(numArr[1] + "." + numArr[0]);
    }
}

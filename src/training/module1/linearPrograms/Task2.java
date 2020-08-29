package training.module1.linearPrograms;

public class Task2 {
    //вычислить значение выражения по формуле ((b + sqrt(b^2 + 4*a*c)) / 2*a) - a^3*c + b^-2
    public static double findFunctionValue(double a, double b, double c) {
        return ((b + Math.sqrt((b * b + 4 * a * c))) / 2 * a) - Math.pow(a, 3) + Math.pow(b, -2);
    }
}

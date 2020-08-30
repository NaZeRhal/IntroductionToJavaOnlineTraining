package training.module1.cycles;

public class Task2 {

    public static void calcFunction(int x, int a, int b, int h) {
        for (int i = a; i <= b; i += h) {
            if (a > 2) {
                System.out.println(a);
            } else {
                System.out.println(-a);
            }
        }
    }
}

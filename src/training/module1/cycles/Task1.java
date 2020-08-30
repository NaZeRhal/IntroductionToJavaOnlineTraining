package training.module1.cycles;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Please, enter positive integer:");
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        while (num < 1) {
            String numString = scanner.next();
            try {
                num = Integer.parseInt(numString);
                if (num < 1) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please, enter positive integer:");
            }
        }
        scanner.close();
        System.out.println(IntStream.rangeClosed(1, num).sum());
    }
}

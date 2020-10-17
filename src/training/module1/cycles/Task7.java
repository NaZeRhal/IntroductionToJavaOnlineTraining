package training.module1.cycles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task7 {

    //Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    //m и n вводятся с клавиатуры


    public static void printDividersInInterval(int m, int n) {
        IntStream.rangeClosed(m, n).forEach(num -> {
            if (getDividers(num).size() == 0) {
                System.out.println(num + " is prime number");
            } else {
                System.out.println("Dividers for " + num + ": " +
                        getDividers(num).stream()
                                .map(String::valueOf)
                                .collect(Collectors.joining(", ")));
            }
        });
    }

    private static List<Integer> getDividers(int x) {
        List<Integer> dividers = new ArrayList<>();
        IntStream.range(2, x).forEach(num -> {
            if ((x % num) == 0)
                dividers.add(num);
        });
        return dividers;
    }

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the first positive integer greater than 2:");

        while (num1 < 2) {
            String line = scanner.nextLine();
            try {
                num1 = Integer.parseInt(line);
                if (num1 < 2) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please, enter the first positive integer greater than 2:");
            }
        }

        System.out.println("Please, enter the second positive integer:");

        while (num2 < 2) {
            String line = scanner.nextLine();
            try {
                num2 = Integer.parseInt(line);
                if (num2 < 2) {
                    throw new NumberFormatException();
                }
                if (num2 < num1) {
                    num2 = 0;
                    System.out.println("The second number must be greater than the first.");
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please, enter the second positive integer:");
            }
        }
        scanner.close();

        System.out.println(String.format("Dividers for integers in interval [%d, %d]", num1, num2));
        printDividersInInterval(num1, num2);

    }
}

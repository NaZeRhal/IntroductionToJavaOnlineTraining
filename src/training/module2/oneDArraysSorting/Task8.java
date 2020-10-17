package training.module2.oneDArraysSorting;

import java.util.*;

public class Task8 {

    //Даны дроби. p1 /q1, ...., pn/ qn. p - числитель дроби, q - знаменатель дроби. Составить программу, которая приводит эти дроби к общему
    //знаменателю и упорядочивает их в порядке возрастания

    //предствавим дробь ввиде массива int[]{p, q}, тогда int[][] fractions - это массив дробей
    public static void sortAndPrintFractions(int[][] fractions) {
        System.out.println("Fractions before sorting:");
        printFractions(fractions);
        List<Integer> numerations = leadToCommonDenominator(fractions);
        if (numerations.size() != 0) {
            System.out.println("Fractions after sorting:");
            Collections.sort(numerations);
            for (Integer numeration : numerations) {
                System.out.printf("%d/%d ", numeration, fractions[0][1]);
            }
        } else {
            System.out.println("Error while sorting");
        }
    }

    private static List<Integer> leadToCommonDenominator(int[][] fractions) {
        List<Integer> numerations = new ArrayList<>();
        Set<Integer> primeFactorsSet = getAllPrimeFactorsSet(fractions);
        int lcm = getLeastCommonMultiply(primeFactorsSet);
        if (lcm == 0) {
            return numerations;
        }
        for (int[] fraction : fractions) {
            fraction[0] = fraction[0] * (lcm / fraction[1]);
            fraction[1] = fraction[1] * (lcm / fraction[1]);
            numerations.add(fraction[0]);
        }
        return numerations;
    }

    private static Set<Integer> getAllPrimeFactorsSet(int[][] fractions) {
        Set<Integer> primeFactorsSet = new HashSet<>();
        if (fractions.length != 0) {
            for (int[] fraction : fractions) {
                if (fraction.length == 2) {
                    primeFactorsSet.addAll(getPrimeFactorsForNumber(fraction[1]));
                }
            }
        }
        return primeFactorsSet;
    }

    private static List<Integer> getPrimeFactorsForNumber(int num) {
        List<Integer> primeFactors = new ArrayList<>();
        if (num == 0 || num == 1 || num == 2) {
            return Collections.singletonList(num);
        }
        for (int i = 2; i <= num; i++) {
            if (i == num) {
                return primeFactors.size() == 0 ? Collections.singletonList(num) : primeFactors;
            }
            if (num % i == 0) {
                primeFactors.add(i);
            }
        }
        return primeFactors;
    }

    private static int getLeastCommonMultiply(Set<Integer> primeFactors) {
        return primeFactors.stream().reduce((integer, integer2) -> integer * integer2).orElse(0);
    }

    private static void printFractions(int[][] fractions) {
        if (fractions.length != 0) {
            for (int[] fraction : fractions) {
                if (fraction.length == 2) {
                    System.out.printf("%d/%d ", fraction[0], fraction[1]);
                }
            }
            System.out.println();
        }
    }
}

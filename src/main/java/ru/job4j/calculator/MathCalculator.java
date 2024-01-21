package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);

    }

    public static double differensAndQuotinent(double first, double second) {
        return differense(first, second)
                + quotinent(first, second);
    }

    public static double sumThotal(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                   + differense(first, second)
                      + quotinent(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчёта равен " + sumAndMultiply(10, 20));
        System.out.println("Результат расчёта равен " + differensAndQuotinent(300, 150));
        System.out.println("Результат расчёта равен " + sumThotal(200, 30));
    }
}

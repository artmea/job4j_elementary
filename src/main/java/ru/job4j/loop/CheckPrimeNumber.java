package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean check = number > 1;
        for (int n = 2; n < number; n++) {
            if ((number % n) == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        int i = left[left.length - 1];
        int j = right[right.length - 1];
        return i == j;
    }
}

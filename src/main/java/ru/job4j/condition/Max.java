package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean maxvalue = left > right;
        return maxvalue ? left : right;
    }

    public static void main(String[] args) {
        System.out.println(max(2, 6));
    }
}

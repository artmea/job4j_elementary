package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int y = 0; y < numbers.length; y++) {
            numbers[y] = y * 2 + 3;
        }
        for (int y : numbers) {
            System.out.println(y);
        }
    }
}

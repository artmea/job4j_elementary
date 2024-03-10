package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char[] array = board[row];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}

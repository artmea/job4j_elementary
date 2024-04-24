package ru.job4j.array;

public class SimpleStringEncoder {

    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result = concatenate(result, symbol, counter);
                symbol = input.charAt(i);
                counter = 1;

            }
        }
        result = concatenate(result, symbol, counter);
        return result;
    }

    private static String concatenate(String string, char letter, int count) {
        string += letter;
        if (count != 1) {
            string += count;
        }
        return string;
    }
}
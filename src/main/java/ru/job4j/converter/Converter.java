package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float input1 = 120;
        float expected1 = 2;
        float output1 = Converter.rubleToDollar(input1);
        boolean passed1 = expected1 == output1;
        System.out.println("120 rubles are 2. Test result : " + passed1);
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro ");
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollars ");
    }
}

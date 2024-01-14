package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height1) {
        return (height1 - 110) * 1.15;

    }

    public static void main(String[] args) {
        short height = 173;
        double man = Fit.manWeight(height);
        System.out.println(" Man 173 is " + man);
        short height1 = 164;
        double woman = Fit.womanWeight(height1);
        System.out.println("Woman 164 is " + woman);
    }
}

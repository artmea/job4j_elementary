package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when15To23Then2Dot23() {
        double expected = 2.23;
        int x1 = 1;
        int y1 = 5;
        int x2 = 2;
        int y2 = 3;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus24To35Then10Dot29() {
        double expected = 10.29;
        int x1 = -2;
        int y1 = -4;
        int x2 = 3;
        int y2 = 5;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when91To00Then9Dot05() {
        double expected = 9.05;
        int x1 = 9;
        int y1 = 1;
        int x2 = 0;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
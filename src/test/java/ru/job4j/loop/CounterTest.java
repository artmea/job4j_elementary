package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart10Finish12Sum43() {
        int result = Counter.sum(10, 12);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart2Finish15Sum121() {
        int result = Counter.sum(2, 15);
        int expected = 119;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus2Finish5Sum10() {
        int result = Counter.sum(-2, 5);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart5Finish1Sum5() {
        int result = Counter.sum(5, 1);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom5To15Then50() {
        int start = 5;
        int finish = 15;
        int result = Counter.sumByEven(start, finish);
        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus2To5Then4() {
        int start = -2;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom8To30Then228() {
        int start = 8;
        int finish = 30;
        int result = Counter.sumByEven(start, finish);
        int expected = 228;
        assertThat(result).isEqualTo(expected);
    }
}
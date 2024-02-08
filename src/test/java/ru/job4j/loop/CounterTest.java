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
}
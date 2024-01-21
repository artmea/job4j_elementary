package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void wenConvert140RblThen2Euro() {
        float input = 140;
        float expected = 2;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void wenConvert120RblThen2Dollar() {
        float input1 = 120;
        float expected1 = 2;
        float output1 = Converter.rubleToDollar(input1);
        float value = 0.0001f;
        assertThat(output1).isEqualTo(expected1, withPrecision(value));
    }
}
package ru.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.BDDAssertions.withPrecision;

class ConverterTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140;
        float expected = 1.4f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert140RblThen1Dot55Dollar() {
        float in = 140;
        float expected = 1.55f;
        float out = Math.round(Converter.rubleToDollar(in) * 100) / 100.0f;
        float eps = 0.01f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert200RblThen2Dot22Dollar() {
        float in = 200;
        float expected = 2.22f;
        float out = Math.round(Converter.rubleToDollar(in) * 100) / 100.0f;
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert221RblThen2Dot21Euro() {
        float in = 221;
        float expected = 2.21f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}
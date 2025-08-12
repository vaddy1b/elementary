package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DivideBySixTest {

    @Test
    void whenNumberDivideBy6() {
        int in = 24;
        String str = DivideBySix.checkNumber(in);
        String exp = "The number divides by 6.";
        assertThat(str).isEqualTo(exp);
    }

    @Test
    void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String str = DivideBySix.checkNumber(in);
        String exp = "The number divides by 3, but it isn't the even number.";
        assertThat(str).isEqualTo(exp);
    }

    @Test
    void whenNumberDivideBy2AndEven() {
        int in = 8;
        String str = DivideBySix.checkNumber(in);
        String exp = "The number doesn't divide by 3, but it is the even number.";
        assertThat(str).isEqualTo(exp);
    }

    @Test
    void whenNumberNotDivideBy3AndNotEven() {
        int in = 25;
        String str = DivideBySix.checkNumber(in);
        String exp = "The number doesn't divide by 3 and it isn't the even number.";
        assertThat(str).isEqualTo(exp);
    }
}
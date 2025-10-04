package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqLastTest {

    @Test
    void whenEq() {
        int[] left = {1, 2, 3};
        int[] right = {4, 5, 3};
        boolean result = EqLast.check(left, right);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEq() {
        int[] left = {1, 2, 3};
        int[] right = {4, 5, 6};
        boolean result = EqLast.check(left, right);
        assertThat(result).isFalse();
    }

}
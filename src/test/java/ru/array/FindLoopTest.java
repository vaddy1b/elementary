package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenElementContainedInArray() {
        int el = 2;
        int[] arr = new int[]{1, 2, 3, 4};
        int res = FindLoop.indexOf(arr, el);
        int exp = 1;
        assertThat(res).isEqualTo(exp);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int el = 10;
        int[] arr = new int[]{1, 3, 4};
        int res = FindLoop.indexOf(arr, el);
        int exp = -1;
        assertThat(res).isEqualTo(exp);
    }
}
package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenElementContainedInArray() {
        int el = 2;
        int[] arr = new int[]{1, 2, 3, 4};
        int res = FindLoop.indexOf(arr, el);
        assertThat(res).isEqualTo(el);
    }

    @Test
    void whenElementNotContainedInArray() {
        int el = 2;
        int[] arr = new int[]{1, 3, 4};
        int res = FindLoop.indexOf(arr, el);
        assertThat(res).isNotEqualTo(el);
    }

}
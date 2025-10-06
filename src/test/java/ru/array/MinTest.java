package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinTest {

    @Test
    void whenFirstMin() {
        int[] array = {0, 5, 10};
        int expected = 0;
        int result = Min.findMin(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLastMin() {
        int[] array = {10, 5, 0};
        int expected = 0;
        int result = Min.findMin(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[]{10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

}
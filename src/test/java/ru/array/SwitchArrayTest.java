package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {

    @Test
    void whenSwap0To3() {
        int[] arr = new int[]{1, 2, 3, 4};
        int source = 0;
        int dest = arr.length - 1;
        int[] result = SwitchArray.swap(arr, source, dest);
        int[] expected = new int[]{4, 2, 3, 1};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSwap2To5() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int source = 2;
        int dest = 5;
        int[] result = SwitchArray.swap(arr, source, dest);
        int[] expected = new int[]{1, 2, 6, 4, 5, 3, 7};
        assertThat(result).isEqualTo(expected);
    }
}
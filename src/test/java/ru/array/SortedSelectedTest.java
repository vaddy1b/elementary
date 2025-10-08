package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortedSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort3ElementsInArray() {
        int[] data = new int[]{3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenSort5ElementsInArray() {
        int[] data = new int[]{4, 6, 3, 2, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{2, 3, 4, 6, 7};
        assertThat(result).containsExactly(expected);
    }
}
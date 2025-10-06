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

    @Test
    void whenFind4InArrayThen3() {
        int el = 4;
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int res = FindLoop.indexOf(arr, el);
        int exp = 3;
        assertThat(res).isEqualTo(exp);
    }

    @Test
    void whenHas5Then0() {
        int el = 5;
        int[] arr = new int[]{5, 3, 4};
        int res = FindLoop.indexOf(arr, el);
        int expected = 0;
        assertThat(res).isEqualTo(expected);
    }

    @Test
    void whenDiapasonHas8ThenResultEqualFinish() {
        int el = 8;
        int[] arr = new int[]{5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(arr, el, start, finish);
        assertThat(result).isEqualTo(finish);
    }

    @Test
    void whenDiapasonHasSomeEqualElementThen3() {
        int[] arr = new int[]{5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int el = 4;
        int start = 1;
        int finish = 8;
        int expected = 3;
        int result = FindLoop.indexInRange(arr, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot11ThenMinus1() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 11;
        int start = 1;
        int finish = 3;
        int expected = -1;
        int result = FindLoop.indexInRange(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2ThenStart() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 1;
        int finish = 3;
        int expected = 1;
        int result = FindLoop.indexInRange(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }
}
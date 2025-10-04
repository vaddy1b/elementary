package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ArrayCharTest {
    @Test
    void whenStartsWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotStartsWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isFalse();
    }

}
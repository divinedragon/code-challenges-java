package io.divinedragon.java.codingbat.warmup2;

import static io.divinedragon.java.common.StringConstants.EMPTY;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountXxTest {

    private CountXX fixture;

    @BeforeEach
    void setUp() {
        fixture = new CountXX();
    }

    @Test
    void shouldReturnZero_WhenStringIsNull() {

        final String str = null;

        final int expected = 0;

        final int actual = fixture.countXxValues(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnZero_WhenStringIsEmpty() {

        final String str = EMPTY;

        final int expected = 0;

        final int actual = fixture.countXxValues(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnZero_WhenStringIsNotEmptyAndNoOccurrence() {

        final String str = "abcd";

        final int expected = 0;

        final int actual = fixture.countXxValues(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnCountOne_WhenStringIsNotEmptyAndSingleOccurrence() {

        final String str = "axxd";

        final int expected = 1;

        final int actual = fixture.countXxValues(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnCountOne_WhenStringIsNotEmptyAndMultipleOccurrenceNonOverlapping() {

        final String str = "abxxcdxx";

        final int expected = 2;

        final int actual = fixture.countXxValues(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnCountOne_WhenStringIsNotEmptyAndMultipleOccurrenceOverlapping() {

        final String str = "xxxx";

        final int expected = 3;

        final int actual = fixture.countXxValues(str);

        assertThat(actual).isEqualTo(expected);
    }
}
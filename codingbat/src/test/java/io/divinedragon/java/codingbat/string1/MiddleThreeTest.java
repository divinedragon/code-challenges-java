package io.divinedragon.java.codingbat.string1;

import static io.divinedragon.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MiddleThreeTest {

    private MiddleThree fixture;

    @BeforeEach
    void setUp() {
        fixture = new MiddleThree();
    }

    @Test
    void testcase1() {

        final String input = "Candy";

        final String expected = "and";

        final String actual = fixture.middleThree(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "and";

        final String expected = "and";

        final String actual = fixture.middleThree(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "solving";

        final String expected = "lvi";

        final String actual = fixture.middleThree(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.middleThree(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.middleThree(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEvenLength() {

        final String input = "ab";

        final String expected = EMPTY_STRING;

        final String actual = fixture.middleThree(input);

        assertThat(actual).isEqualTo(expected);
    }
}

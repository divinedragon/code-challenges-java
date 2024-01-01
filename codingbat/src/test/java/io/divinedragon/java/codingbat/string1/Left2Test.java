package io.divinedragon.java.codingbat.string1;

import static io.divinedragon.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Left2Test {

    private Left2 fixture;

    @BeforeEach
    void setUp() {
        fixture = new Left2();
    }

    @Test
    void testcase1() {

        final String input = "Hi";

        final String expected = "Hi";

        final String actual = fixture.left2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase2() {

        final String input = "java";

        final String expected = "vaja";

        final String actual = fixture.left2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testcase3() {

        final String input = "Hello";

        final String expected = "lloHe";

        final String actual = fixture.left2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsNull() {

        final String input = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.left2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmpty_WhenInputIsEmpty() {

        final String input = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.left2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameString_WhenInputIsSingleChar() {

        final String input = "a";

        final String expected = "a";

        final String actual = fixture.left2(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnSameString_WhenInputIsDoubleChar() {

        final String input = "ab";

        final String expected = "ab";

        final String actual = fixture.left2(input);

        assertThat(actual).isEqualTo(expected);
    }
}

package io.divinedragon.java.codingbat.string1;

import static io.divinedragon.java.common.StringConstants.EMPTY_STRING;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MakeAbbaTest {

    private MakeAbba fixture;

    @BeforeEach
    void setUp() {
        fixture = new MakeAbba();
    }

    @Test
    void shouldReturnEmptyString_WhenBothAreNull() {

        final String a = null;
        final String b = null;

        final String expected = EMPTY_STRING;

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnEmptyString_WhenBothAreEmpty() {

        final String a = EMPTY_STRING;
        final String b = EMPTY_STRING;

        final String expected = EMPTY_STRING;

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsNullAndBIsNotNull() {

        final String a = null;
        final String b = "B";

        final String expected = "BB";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsEmptyAndBIsNotNull() {

        final String a = EMPTY_STRING;
        final String b = "B";

        final String expected = "BB";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnAA_WhenAIsNotNullAndBIsNull() {

        final String a = "A";
        final String b = null;

        final String expected = "AA";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsNotNullAndBIsNull() {

        final String a = "A";
        final String b = EMPTY_STRING;

        final String expected = "AA";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsNotNullAndBIsNotNullUpper() {

        final String a = "A";
        final String b = "B";

        final String expected = "ABBA";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsNotNullAndBIsNotNullLower() {

        final String a = "a";
        final String b = "b";

        final String expected = "abba";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsNotNullAndBIsNotNullMixed() {

        final String a = "A";
        final String b = "b";

        final String expected = "AbbA";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldReturnBB_WhenAIsNotNullAndBIsNotNullMultiChar() {

        final String a = "Abc";
        final String b = "Xyz";

        final String expected = "AbcXyzXyzAbc";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}

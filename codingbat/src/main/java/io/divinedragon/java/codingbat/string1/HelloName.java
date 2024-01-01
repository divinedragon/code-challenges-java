package io.divinedragon.java.codingbat.string1;

import static io.divinedragon.java.common.StringConstants.EMPTY_STRING;

import io.divinedragon.java.common.StringConstants;

public class HelloName {

    private static final String HELLO = "Hello";

    public String helloName(final String name) {

        final String greeting = StringConstants.hasLength(name) ? " " + name : EMPTY_STRING;

        return HELLO + greeting + "!";
    }
}

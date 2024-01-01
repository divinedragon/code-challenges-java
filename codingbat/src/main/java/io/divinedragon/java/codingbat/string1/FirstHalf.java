package io.divinedragon.java.codingbat.string1;

import static io.divinedragon.java.common.StringConstants.EMPTY_STRING;

import io.divinedragon.java.common.StringConstants;

public class FirstHalf {

    public String firstHalf(final String input) {

        if (StringConstants.isEmpty(input)) {
            return EMPTY_STRING;
        }

        final int indexMiddle = (int) Math.ceil(input.length() / 2.0);

        return input.substring(0, indexMiddle);
    }
}

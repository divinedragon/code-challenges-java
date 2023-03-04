package io.divinedragon.java.codingbat.string1;

import static io.divinedragon.java.common.NumberConstants.TWO;
import static io.divinedragon.java.common.StringConstants.EMPTY_STRING;

import io.divinedragon.java.common.StringConstants;

public class FirstTwo {

    public String firstTwo(final String input) {

        if (StringConstants.isEmpty(input)) {
            return EMPTY_STRING;
        }

        return input.substring(0, Math.min(input.length(), TWO));
    }
}

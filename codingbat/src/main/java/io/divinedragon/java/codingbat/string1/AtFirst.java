package io.divinedragon.java.codingbat.string1;

import static io.divinedragon.java.common.NumberConstants.ONE;
import static io.divinedragon.java.common.NumberConstants.TWO;

import io.divinedragon.java.common.StringConstants;

public class AtFirst {

    public String atFirst(final String input) {

        if (StringConstants.isEmpty(input)) {
            return "@@";
        }

        if (input.length() == ONE) {
            return input.substring(0, ONE) + "@";
        }

        return input.substring(0, TWO);
    }
}

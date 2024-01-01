package io.divinedragon.java.codingbat.string1;

import static io.divinedragon.java.common.NumberConstants.THREE;
import static io.divinedragon.java.common.NumberConstants.TWO;
import static io.divinedragon.java.common.StringConstants.EMPTY_STRING;

import io.divinedragon.java.common.StringConstants;

public class MiddleThree {

    public String middleThree(final String input) {

        if (StringConstants.isEmpty(input) || input.length() % TWO == 0) {
            return EMPTY_STRING;
        }

        final int index = (input.length() - THREE) / TWO;

        return input.substring(index, index + THREE);
    }
}

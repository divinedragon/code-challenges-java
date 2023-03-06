package io.divinedragon.java.codingbat.string1;

import static io.divinedragon.java.common.NumberConstants.ONE;
import static io.divinedragon.java.common.NumberConstants.TWO;
import static io.divinedragon.java.common.StringConstants.EMPTY_STRING;
import static io.divinedragon.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class WithoutEnd {

    public String withoutEnd(final String input) {

        final String inputNormalized = Optional.ofNullable(input).orElseGet(EMPTY_STRING_SUPPLIER);

        final int inputLength = inputNormalized.length();

        if (inputLength < TWO) {
            return EMPTY_STRING;
        }

        return inputNormalized.substring(ONE, inputLength - ONE);
    }
}

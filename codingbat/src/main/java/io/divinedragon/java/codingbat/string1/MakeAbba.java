package io.divinedragon.java.codingbat.string1;

import static io.divinedragon.java.common.StringConstants.EMPTY_STRING_SUPPLIER;

import java.util.Optional;

public class MakeAbba {

    public String makeAbba(final String a, final String b) {

        final StringBuilder result = new StringBuilder();

        final String aNormalized = Optional.ofNullable(a).orElseGet(EMPTY_STRING_SUPPLIER);
        final String bNormalized = Optional.ofNullable(b).orElseGet(EMPTY_STRING_SUPPLIER);

        return result
                .append(aNormalized)
                .append(bNormalized)
                .append(bNormalized)
                .append(aNormalized)
                .toString();
    }
}

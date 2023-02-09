package io.divinedragon.java.codingbat.warmup2;

import static io.divinedragon.java.common.StringConstants.EMPTY;

import java.util.Optional;

public final class StringSplosion {

    public String stringSplosion(final String str) {

        final String input = Optional.ofNullable(str).orElseGet(() -> EMPTY);

        final StringBuilder result = new StringBuilder();

        for (int index = 0; index <= input.length(); index++) {
            result.append(input.substring(0, index));
        }

        return result.toString();
    }
}

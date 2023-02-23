package io.divinedragon.java.codingbat.warmup2;

import static io.divinedragon.java.common.NumberConstants.THREE;
import static io.divinedragon.java.common.StringConstants.EMPTY;

import java.util.Optional;

public final class StringYak {

    public String stringYak(final String str) {

        final String input = Optional.ofNullable(str).orElseGet(() -> EMPTY);

        String output = input;

        if (input.length() >= THREE) {
            output = input.replaceAll("y[a-zA-Z0-9]k", "");
        }

        return output;
    }
}

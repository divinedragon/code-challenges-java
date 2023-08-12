package io.divinedragon.java.codingbat.warmup2;

import static io.divinedragon.java.common.NumberConstants.THREE;
import static io.divinedragon.java.common.StringConstants.EMPTY;

import java.util.Optional;

public final class FrontTimes {

    public String frontTimes(final String str, final int number) {

        final StringBuilder result = new StringBuilder();

        final String input = Optional.ofNullable(str).orElseGet(() -> EMPTY);

        if (!input.isEmpty()) {

            final String front = input.length() < THREE ? input : input.substring(0, THREE);

            for (int index = 1; index <= number; index++) {
                result.append(front);
            }
        }

        return result.toString();
    }
}

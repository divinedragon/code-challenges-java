package io.divinedragon.java.codingbat.warmup1;

import static io.divinedragon.java.common.NumberConstants.HUNDRED;
import static io.divinedragon.java.common.NumberConstants.TEN;

public class NearHundred {

    static final int TWO_HUNDRED = 2 * HUNDRED;

    public final boolean nearHundred(final int number) {
        return Math.abs(HUNDRED - number) <= TEN || Math.abs(TWO_HUNDRED - number) <= TEN;
    }
}

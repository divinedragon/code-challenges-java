package io.divinedragon.java.codingbat.warmup1;

import static io.divinedragon.java.common.NumberConstants.SEVEN;
import static io.divinedragon.java.common.NumberConstants.TWENTY;

public class ParrotTrouble {

    static final int HOUR_START = SEVEN;

    static final int HOUR_END = TWENTY;

    public final boolean parrotTrouble(final boolean talking, final int hour) {
        return talking && (hour < HOUR_START || hour > HOUR_END);
    }
}

package io.divinedragon.java.codingbat.warmup1;

import static io.divinedragon.java.common.NumberConstants.ONE;
import static io.divinedragon.java.common.NumberConstants.THREE;

public class MixStart {

    static final String CONTAINS_IX = "ix";

    public final boolean mixStart(final String str) {
        return str.length() >= THREE && CONTAINS_IX.equals(str.substring(ONE, THREE));
    }
}

package com.pablo.ecocesta.utils;

import org.greenrobot.greendao.converter.PropertyConverter;

/**
 * Created by irene on 29/10/2017.
 */

public enum Measure {
    UNIT (1), KG(2);

    private final int value;

    Measure(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}

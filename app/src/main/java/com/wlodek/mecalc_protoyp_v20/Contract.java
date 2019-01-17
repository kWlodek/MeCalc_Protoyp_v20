package com.wlodek.mecalc_protoyp_v20;

import android.provider.BaseColumns;

public class Contract {

    private Contract(){};

    public static final class DemoContent implements BaseColumns{
        public static final String TABLE_NAME = "Speisen";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_KCAL = "kalorien";
        public static final String COLUMN_TIMESTAMP = "timestamp";
    }
}

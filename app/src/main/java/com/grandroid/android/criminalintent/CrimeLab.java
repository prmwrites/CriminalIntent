package com.grandroid.android.criminalintent;

import android.content.Context;

/**
 * Created by Patrick on 6/28/2016.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {

    }
}

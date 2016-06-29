package com.grandroid.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Patrick on 6/28/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

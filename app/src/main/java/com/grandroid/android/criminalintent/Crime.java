package com.grandroid.android.criminalintent;

import java.util.UUID;

/**
 * Created by Patrick on 6/28/2016.
 */
public class Crime {
    private UUID mID;
    private String mTitle;

    public Crime() {
        // Generate unique identifier
        mID = UUID.randomUUID();
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}

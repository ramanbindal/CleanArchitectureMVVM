package com.example.data.sharedpreference;

import android.content.Context;

public class SharedPreferenceHelper {

    private SamplePreference samplePreference;

    public SharedPreferenceHelper(Context context) {
        if (samplePreference == null)
            samplePreference = new SamplePreference(context);
    }

    public SamplePreference getSamplePreference() {
        return samplePreference;
    }
}

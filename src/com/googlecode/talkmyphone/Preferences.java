package com.googlecode.talkmyphone;

import com.googlecode.talkmyphone.R;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Preferences extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            getPreferenceManager().setSharedPreferencesName("TalkMyPhone");
            addPreferencesFromResource(R.xml.preferences);
    }

}

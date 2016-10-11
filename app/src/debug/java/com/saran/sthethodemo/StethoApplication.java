package com.saran.sthethodemo;

import android.app.Application;

import com.facebook.stetho.Stetho;


/**
 * Created by Saran on 11/10/16.
 */

public class StethoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}

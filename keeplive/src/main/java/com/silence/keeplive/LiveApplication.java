package com.silence.keeplive;

import android.app.Application;
import android.content.Context;

/**
 * Created by Silence on 2016.12.31
 */

public class LiveApplication extends Application {
    private static Context appContext;

    public static Context getAppContext() {
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
    }
}

package com.silence.keeplive.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.silence.keeplive.foreground.DaemonService;

public class MonitorReceiver extends BroadcastReceiver {
    private static final String TAG = "MonitorReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive(): intent: " + intent.toUri(0));
        Intent target = new Intent(context, DaemonService.class);
        context.startService(target);
    }

//    IntentFilter intentFilter = new IntentFilter();
//    intentFilter.addAction("android.intent.action.USER_PRESENT");
//    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
//    intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
//    intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
//    intentFilter.addAction("android.intent.action.SCREEN_ON");
//    intentFilter.addAction("android.intent.action.SCREEN_OFF");
//    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
//    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
//    intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
//    intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
//    try {
//        context.registerReceiver(this.f2933a, intentFilter);
//    } catch (Exception e) {
//    }

}

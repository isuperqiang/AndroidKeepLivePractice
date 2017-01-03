package com.silence.keeplive.foreground;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;

/**
 * 虚假的渠道服务，用于 api>18 开启前台服务
 */
public class ChannelService extends Service {
    private static final String TAG = "ChannelService";

    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate()");
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand(): intent = [" + intent.toUri(0) + "], flags = [" + flags + "], startId = [" + startId + "]");
        startForeground(DaemonService.SERVICE_ID, new Notification());
        stopForeground(true);
        stopSelf();
        return START_STICKY;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

    public IBinder onBind(Intent intent) {
        return null;
    }
}

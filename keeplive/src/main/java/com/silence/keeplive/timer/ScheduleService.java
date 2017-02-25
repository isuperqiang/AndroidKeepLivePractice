package com.silence.keeplive.timer;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

import com.silence.keeplive.foreground.DaemonService;

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class ScheduleService extends JobService {
    private static final String TAG = "ScheduleService";

    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d(TAG, "onStartJob(): params = [" + params + "]");
        Intent intent = new Intent(getApplicationContext(), DaemonService.class);
        startService(intent);
        jobFinished(params, false);
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        Log.d(TAG, "onStopJob(): params = [" + params + "]");
        return false;
    }
}

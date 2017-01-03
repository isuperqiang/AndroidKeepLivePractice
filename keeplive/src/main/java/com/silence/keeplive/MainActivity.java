package com.silence.keeplive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.silence.keeplive.foreground.DaemonService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startService(new Intent(this, DaemonService.class));
        Log.d("LauncherActivity", "onCreate(): savedInstanceState = [" + savedInstanceState + "]");
        finish();
    }
}
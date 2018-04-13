package com.test.vinove.servicestest;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;



public class MyService extends Service {
    MediaPlayer mplayer;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mplayer=MediaPlayer.create(this,R.raw.srinu);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        mplayer.start();

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mplayer.stop();
    }

}

package com.test.vinove.servicestest;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void start(View v){

        Intent i=new Intent();
        i.setComponent(new ComponentName(this,MyService.class));
        startService(i);

    }

    public void stop(View v){

        Intent i=new Intent();
        i.setComponent(new ComponentName(this,MyService.class));
        stopService(i);


    }

}

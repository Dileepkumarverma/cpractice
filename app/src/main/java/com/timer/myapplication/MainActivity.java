package com.timer.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.TokenWatcher;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountDownTimer countDownTimer = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("Dileep", "I am coder: ");
            }

            @Override
            public void onFinish() {
                Log.d("khatam", "khatam: ");
            }
        }.start();

//        final Handler handler = new Handler();
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                num++;
//                Toast.makeText(MainActivity.this, "This is a toast "+num, Toast.LENGTH_SHORT).show();
//                handler.postDelayed(this, 1000);
//            }
//        };
//        handler.post(run);



    }
}
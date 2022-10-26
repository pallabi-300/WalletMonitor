package com.example.waletmon.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.waletmon.R;

public class MainActivity extends AppCompatActivity {
    public static int SPLASH=3000;
    Animation animation;
    private ImageView imageView;
    private TextView appname;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        animation= AnimationUtils.loadAnimation(this,R.anim.animation);
        imageView=findViewById(R.id.imageView);
        appname=findViewById(R.id.appname);
        imageView.setAnimation(animation);
        appname.setAnimation(animation);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH);
        /*Intent intent=new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();*/
    }
}
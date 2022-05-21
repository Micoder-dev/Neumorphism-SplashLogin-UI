package com.micoder.neumorphismui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class LogInActivity extends AppCompatActivity {

    private LinearLayout layout_main;
    private Animation animation_fadein;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        Utils.blackIconStatusBar(LogInActivity.this,R.color.light_Background);

        layout_main=findViewById(R.id.layout_main);

        animation_fadein= AnimationUtils.loadAnimation(LogInActivity.this,R.anim.fade_in);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                layout_main.setVisibility(View.VISIBLE);
                layout_main.setAnimation(animation_fadein);
            }
        },1000);

    }
}
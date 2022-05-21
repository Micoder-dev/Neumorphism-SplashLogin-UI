package com.micoder.neumorphismui;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View img_logo,img_bottom,tv_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.blackIconStatusBar(MainActivity.this,R.color.light_Background);

        img_logo=findViewById(R.id.img_logo);
        img_bottom=findViewById(R.id.img_bottom);
        tv_name=findViewById(R.id.tv_name);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,LogInActivity.class);
                ActivityOptions options=ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                        Pair.create(img_logo,"logo"),
                        Pair.create(img_bottom,"img_tree"),
                        Pair.create(tv_name,"logo_text"));
                startActivity(intent,options.toBundle());
            }
        }, 3000);
    }
}
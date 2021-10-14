package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView txt1,txt2,txt3;
     private  static final int DURATION = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
      txt1= findViewById(R.id.textView);
      txt2 = findViewById(R.id.textView3);
      txt3 = findViewById(R.id.textView2);
       Animation anim,anim1,anim2;
       anim = AnimationUtils.loadAnimation(MainActivity.this,R.anim.myanim);
       anim1 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.myanim1);
       txt1.setAnimation(anim);
       txt2.setAnimation(anim1);
       anim2 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.hori);
       txt3.setAnimation(anim2);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent in = new Intent(MainActivity.this,MainActivity2.class);
               startActivity(in);
               finish();
           }
       },DURATION);


    }
}
package com.example.rspp;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    AnimationDrawable hand_animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ImageView hand_ani = (ImageView) findViewById(R.id.rsp_ani_image_view);
        hand_ani.setBackgroundResource(R.drawable.hand_ani);
        hand_animation = (AnimationDrawable) hand_ani.getBackground();

        hand_ani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hand_animation.start();
            }
        });









    }
}

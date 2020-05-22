package com.example.rspp;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {


    ImageView hand_ani;
    ImageView hand_com;
    AnimationDrawable hand_animation;

    int i = 3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        hand_ani = findViewById(R.id.rsp_ani_image_view);
        hand_com = findViewById(R.id.hand_computer);


        hand_animation = (AnimationDrawable) hand_ani.getDrawable();
        hand_animation.start();

        Button bt = (Button)findViewById(R.id.bt_r);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hand_ani.setVisibility(View.GONE);
                hand_com.setVisibility(View.VISIBLE);








            }
        }) ;

    }







}


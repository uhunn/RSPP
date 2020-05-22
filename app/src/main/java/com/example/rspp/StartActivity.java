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
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.Random;

public class StartActivity extends AppCompatActivity {


    ImageView hand_ani;
    ImageView hand_com;

    AnimationDrawable hand_animation;

    TextView sv;
    TextView cv;

    int score = 0;
    int cw = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        sv = (TextView)findViewById(R.id.score);
        cv = (TextView)findViewById(R.id.continuous);

        hand_ani = findViewById(R.id.rsp_ani_image_view);
        hand_com = findViewById(R.id.hand_computer);
        hand_animation = (AnimationDrawable) hand_ani.getDrawable();
        hand_animation.start();

        }

    public void btClick(View view){
        switch (view.getId()){
            case R.id.bt_p:
            case R.id.bt_r:
            case R.id.bt_s:
                hand_ani.setVisibility(View.GONE);
                hand_com.setVisibility(View.VISIBLE);
                int comRandom = new Random().nextInt(3) + 1;
                switch (comRandom){
                    case 1:
                        hand_com.setImageResource(R.drawable.rock);
                        if(view.getId() == R.id.bt_r) {
                            Snackbar.make(view, "비겼습니다.", Snackbar.LENGTH_INDEFINITE)
                                    .setAction("OK", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            hand_com.setVisibility(View.GONE);
                                            hand_ani.setVisibility(View.VISIBLE);
                                        }
                                    }).show();
                            if(cw >= 1){
                                cw = 0;
                                cv.setText(String.valueOf("" + cw));
                            }
                        }else if (view.getId()== R.id.bt_s){
                            Snackbar.make(view, "졌습니다.", Snackbar.LENGTH_INDEFINITE)
                                    .setAction("OK", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            hand_com.setVisibility(View.GONE);
                                            hand_ani.setVisibility(View.VISIBLE);
                                        }
                                    }).show();
                            if(cw >= 1){
                                cw = 0;
                                cv.setText(String.valueOf("" + cw));
                            }
                        }else if(view.getId() == R.id.bt_p){
                            Snackbar.make(view, "이겼습니다.", Snackbar.LENGTH_INDEFINITE)
                                    .setAction("OK", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            hand_com.setVisibility(View.GONE);
                                            hand_ani.setVisibility(View.VISIBLE);
                                        }
                                    }).show();
                            if (cw >= 10){
                                Toast.makeText(this,
                                        "10회 연속 승리! 점수 4점씩!",Toast.LENGTH_SHORT).show();
                                score = score + 4;
                                cw = cw + 1;
                                sv.setText(String.valueOf("" + score));
                                cv.setText(String.valueOf("" + cw));

                            }else if (cw >= 1){
                                score = score + 2;
                                cw = cw + 1;
                                sv.setText(String.valueOf("" + score));
                                cv.setText(String.valueOf("" + cw));
                            }else{
                                score = score + 1;
                                cw = cw + 1;
                                sv.setText(String.valueOf("" + score));
                                cv.setText(String.valueOf("" + cw));
                            }
                        }
                        break;

                    case 2:
                        hand_com.setImageResource(R.drawable.scissors);
                        if(view.getId() == R.id.bt_r) {
                            Snackbar.make(view,"이겼습니다.", Snackbar.LENGTH_INDEFINITE)
                                    .setAction("OK", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            hand_com.setVisibility(View.GONE);
                                            hand_ani.setVisibility(View.VISIBLE);
                                        }
                                    }).show();
                            if (cw >= 10){
                                Toast.makeText(this,
                                        "10회 연속 승리! 점수 4점씩!",Toast.LENGTH_SHORT).show();
                                score = score + 4;
                                cw = cw + 1;
                                sv.setText(String.valueOf("" + score));
                                cv.setText(String.valueOf("" + cw));

                            }else if (cw >= 1){
                                score = score + 2;
                                cw = cw + 1;
                                sv.setText(String.valueOf("" + score));
                                cv.setText(String.valueOf("" + cw));
                            }else{
                                score = score + 1;
                                cw = cw + 1;
                                sv.setText(String.valueOf("" + score));
                                cv.setText(String.valueOf("" + cw));
                            }

                        }else if(view.getId() == R.id.bt_s){
                            Snackbar.make(view,"비겼습니다.", Snackbar.LENGTH_INDEFINITE)
                                    .setAction("OK", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            hand_com.setVisibility(View.GONE);
                                            hand_ani.setVisibility(View.VISIBLE);
                                        }
                                    }).show();
                            if(cw >= 1){
                                cw = 0;
                                cv.setText(String.valueOf("" + cw));
                            }
                        }else if(view.getId() == R.id.bt_p){
                            Snackbar.make(view,"졌습니다.", Snackbar.LENGTH_INDEFINITE)
                                    .setAction("OK", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            hand_com.setVisibility(View.GONE);
                                            hand_ani.setVisibility(View.VISIBLE);
                                        }
                                    }).show();
                            if(cw >= 1){
                                cw = 0;
                                cv.setText(String.valueOf("" + cw));
                            }
                        }
                        break;

                    case 3:
                        hand_com.setImageResource(R.drawable.paper);
                        if(view.getId() == R.id.bt_r) {
                            Snackbar.make(view,"졌습니다.", Snackbar.LENGTH_INDEFINITE)
                                    .setAction("OK", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            hand_com.setVisibility(View.GONE);
                                            hand_ani.setVisibility(View.VISIBLE);
                                        }
                                    }).show();
                            if(cw >= 1){
                                cw = 0;
                                cv.setText(String.valueOf("" + cw));
                            }

                        }else if(view.getId() == R.id.bt_s){
                            Snackbar.make(view,"이겼습니다.", Snackbar.LENGTH_INDEFINITE)
                                    .setAction("OK", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            hand_com.setVisibility(View.GONE);
                                            hand_ani.setVisibility(View.VISIBLE);
                                        }
                                    }).show();
                            if (cw >= 10){
                                Toast.makeText(this,
                                        "10회 연속 승리! 점수 4점씩!",Toast.LENGTH_SHORT).show();
                                score = score + 4;
                                cw = cw + 1;
                                sv.setText(String.valueOf("" + score));
                                cv.setText(String.valueOf("" + cw));

                            }else if (cw >= 1){
                                score = score + 2;
                                cw = cw + 1;
                                sv.setText(String.valueOf("" + score));
                                cv.setText(String.valueOf("" + cw));
                            }else{
                                score = score + 1;
                                cw = cw + 1;
                                sv.setText(String.valueOf("" + score));
                                cv.setText(String.valueOf("" + cw));
                            }

                        }else if(view.getId() == R.id.bt_p){
                            Snackbar.make(view,"비겼습니다.", Snackbar.LENGTH_INDEFINITE)
                                    .setAction("OK", new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            hand_com.setVisibility(View.GONE);
                                            hand_ani.setVisibility(View.VISIBLE);
                                        }
                                    }).show();
                            if(cw >= 1){
                                cw = 0;
                                cv.setText(String.valueOf("" + cw));
                            }
                        }
                        break;
                }
                break;

        }


    }

}










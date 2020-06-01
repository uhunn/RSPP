package com.example.rspp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StartPopupActivity extends AppCompatActivity {


    Button okBtn;
    Button backBtn;
    int score = 0;
    int FPC = 0;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_start_popup);


        okBtn = (Button) findViewById(R.id.pop_okbt);
        backBtn = (Button) findViewById(R.id.pop_backbt);
    }


    public void mOK(View v){
        switch (v.getId()){
            case R.id.pop_okbt:
                Intent intent = new Intent(StartPopupActivity.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.pop_backbt:
                finish();
                break;


        }
    }

    public boolean onTouchEvent(MotionEvent event){

        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }

        return true;
    }

    public void onBackPressed(){
        return;
    }
}
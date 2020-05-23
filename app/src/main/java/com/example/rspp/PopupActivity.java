package com.example.rspp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PopupActivity extends AppCompatActivity {


    Button okBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_pop);

        okBtn = (Button) findViewById(R.id.pop_okbt);
    }


    public void mOK(View v){
        Intent intent = new Intent(PopupActivity.this, MainActivity.class);
        startActivity(intent);
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


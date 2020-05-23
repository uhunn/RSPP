package com.example.rspp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static Context mContext;


    TextView textView_start;
    TextView textView_setting;
    public int coin = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView_start = findViewById(R.id.tv_Start);
        textView_setting = findViewById(R.id.tv_setting);
        mContext = this;




            textView_start.setClickable(true);
            textView_start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (coin == 0) {
                        Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(MainActivity.this, StartActivity.class);
                        startActivity(intent);

                    }
                }
            });


        textView_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });
    }


}

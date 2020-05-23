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
    TextView s_c_v;
    public int coin = 0;
    int FPC = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView_start = findViewById(R.id.tv_Start);
        textView_setting = findViewById(R.id.tv_setting);
        s_c_v = findViewById(R.id.Start_Coin);
        mContext = this;

        s_c_v.setText("" + coin);




            textView_start.setClickable(true);
            textView_start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (FPC == 0){
                        FPC = FPC + 1;
                        Intent intent = new Intent(MainActivity.this, FristPlayPopupActivity.class);
                        startActivity(intent);

                    }else{
                        if (coin == 0) {
                            Intent intent = new Intent(MainActivity.this, PopupActivityMain.class);
                            startActivity(intent);
                        } else {
                            Intent intent = new Intent(MainActivity.this, StartActivity.class);
                            startActivity(intent);

                        }
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

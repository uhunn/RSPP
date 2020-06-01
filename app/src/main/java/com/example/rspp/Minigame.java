package com.example.rspp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class Minigame extends AppCompatActivity {


    int i = 0;

    TextView mi_co;

    private Button mini_bt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minigame);

        mi_co = findViewById(R.id.mini_coin);

        mini_bt = findViewById(R.id.mini_but);

        mini_bt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                switch (v.getId()){
                    case R.id.mini_but:
                        i = i + 100;
                        mi_co.setText("" + i);

                        break;

                }




            }
        });




    }

}

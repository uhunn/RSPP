package com.example.rspp;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Minigame extends AppCompatActivity {


    int i = 0;

    TextView mi_co;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        mi_co = findViewById(R.id.mini_coin);
        





    }
}

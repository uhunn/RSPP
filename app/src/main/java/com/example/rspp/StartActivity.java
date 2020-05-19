package com.example.rspp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    Button bt_r;
    Button bt_s;
    Button bt_p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        bt_r = findViewById(R.id.bt_r);
        bt_s = findViewById(R.id.bt_s);
        bt_p = findViewById(R.id.bt_p);





    }
}

package com.example.a08_07_2016;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=new Button(this);
        btn.setText("Pulsante3");
        LinearLayout lt=findViewById(R.id.ll);
        lt.addView(btn);
    }
}

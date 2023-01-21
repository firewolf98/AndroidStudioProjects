package com.example.provamenulayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch(id) {
            case(R.id.menu1): setContentView(R.layout.activity_main); return true;
            case(R.id.menu2): setContentView(R.layout.layout1); return true;
            case(R.id.menu3): setContentView(R.layout.layout2); return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
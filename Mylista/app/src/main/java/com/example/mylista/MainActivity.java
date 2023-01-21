package com.example.mylista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] nomi={"Luca","Matteo","Enrica","Lucia","Carmelo","Javier","Milito"};

        listView=findViewById(R.id.mylistview);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.list_element,R.id.textViewList,nomi);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String  str  = listView.getItemAtPosition(position).toString();
                // Show Toast
                Toast.makeText(getApplicationContext(),
                        "Click su posizione n."+position+": " +str, Toast.LENGTH_LONG)
                        .show();
            }
        });

    }
}
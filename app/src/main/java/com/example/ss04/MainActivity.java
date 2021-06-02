package com.example.ss04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b1: data sourse
        final String[] datas = {"APPLE","SONY","SAMSUNG","LG","HTC","NOKIA","APPLE","SONY","SAMSUNG","LG","HTC","NOKIA"};
        //b2: Adatar
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,datas);
        //b3:listview
        ListView lvContact = findViewById(R.id.lvContact);
        lvContact.setAdapter(arrayAdapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data = datas[position];
                Toast.makeText(MainActivity.this,data,Toast.LENGTH_SHORT).show();
            }
        });

    }
}

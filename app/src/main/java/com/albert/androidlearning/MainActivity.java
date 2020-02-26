package com.albert.androidlearning;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{

    private String[] data = { "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,
                data);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }

}

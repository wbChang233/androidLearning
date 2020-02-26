package com.albert.androidlearning;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

/*    private String[] data = { "Apple","Banana","Watermelon","Pear","Grape","Pineapple","Strawberry",
            "Cherry","Mango","Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry",
            "Cherry","Mango"};*/

    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void initFruits(){
        for (int i = 0;i < 2;i++){
            Fruit apple = new Fruit("Apple",R.drawable.img_1);
            fruitList.add(apple);
            Fruit apple2 = new Fruit("Apple",R.drawable.img_1);
            fruitList.add(apple2);
            Fruit apple3 = new Fruit("Apple",R.drawable.img_1);
            fruitList.add(apple3);
            Fruit apple4 = new Fruit("Apple",R.drawable.img_1);
            fruitList.add(apple4);
            Fruit apple5 = new Fruit("Apple",R.drawable.img_1);
            fruitList.add(apple5);
            Fruit apple6 = new Fruit("Apple",R.drawable.img_1);
            fruitList.add(apple6);
            Fruit apple7 = new Fruit("Apple",R.drawable.img_1);
            fruitList.add(apple7);
            Fruit apple8 = new Fruit("Apple",R.drawable.img_1);
            fruitList.add(apple8);
            Fruit apple9 = new Fruit("Apple",R.drawable.img_1);
            fruitList.add(apple9);

        }
    }

}

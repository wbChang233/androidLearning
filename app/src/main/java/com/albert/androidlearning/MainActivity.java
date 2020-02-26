package com.albert.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
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

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CostumerAdaptorActivity extends AppCompatActivity {

    final List<Animal> animals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_costumer_adaptor);
        animals.add(new Animal("Ant", R.mipmap.travis));
        animals.add(new Animal("Bat", R.mipmap.carti));
        animals.add(new Animal("Bird", R.mipmap.travis));
        animals.add(new Animal("Panda", R.mipmap.carti));

        final ListView listView = (ListView) findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        listView.setAdapter(adapter);

    }
}
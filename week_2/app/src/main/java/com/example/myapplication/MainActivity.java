package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnArrayAdaptor;
    Button btnCostumerAdaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArrayAdaptor = findViewById(R.id.buttonArrayAdaptor);
        btnArrayAdaptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ArrayAdaptorActivity.class);
                startActivity(intent);
            }
        });

        btnCostumerAdaptor = findViewById(R.id.buttonCostumerAdaptor);
        btnCostumerAdaptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CostumerAdaptorActivity.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    Button btnLength, btnWeight, btnArea, btnVolume, btnTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        btnWeight= findViewById(R.id.btnWeight);
        btnArea = findViewById(R.id.btnArea);
        btnVolume = findViewById(R.id.btnVolume);
        btnTemperature = findViewById(R.id.btnTemperature);


        btnLength = findViewById(R.id.btnLength);
        btnLength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, LengthActivity.class);
                startActivity(intent);
            }
        });

        btnWeight = findViewById(R.id.btnWeight);
        btnWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, WeightActivity.class);
                startActivity(intent);
            }
        });

        btnArea = findViewById(R.id.btnArea);
        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, AreaActivity.class);
                startActivity(intent);
            }
        });

        btnVolume = findViewById(R.id.btnVolume);
        btnVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, VolumeActivity.class);
                startActivity(intent);
            }
        });

        btnTemperature = findViewById(R.id.btnTemperature);
        btnTemperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, TemperatureActivity.class);
                startActivity(intent);
            }
        });



    }




}
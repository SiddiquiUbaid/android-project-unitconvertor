package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class VolumeActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        imageView = findViewById(R.id.imageView);

        // find views by id
        editText = findViewById(R.id.etValue);
        textView = findViewById(R.id.txtResult);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //convert value to double
                double gallons = Double.parseDouble( editText.getText().toString() );

                // convert into kilometers
                double litres = gallons * 3.78541;

                // set value on textView
                String result = String.format(" %.4f litres",litres);
                textView.setText(result);

            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence ch = "Click on 'convert' button below";
                Toast.makeText(VolumeActivity.this, ch, Toast.LENGTH_SHORT).show();
            }
        });


    }



}
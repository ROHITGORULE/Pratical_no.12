package com.example.praticalno12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton Radio1,Radio2,Radio3,Radio4;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Radio1 = findViewById(R.id.r1);
        Radio2 = findViewById(R.id.r2);
        Radio3 = findViewById(R.id.r3);
        Radio4 = findViewById(R.id.r4);
        b1 = findViewById(R.id.btnn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result="Select Button:-";

                result+=(Radio1.isChecked())?"Radio Button 1":(Radio2.isChecked())?"Radio Button 2":(Radio3.isChecked())?"Male":(Radio4.isChecked())?"Female":"";

                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
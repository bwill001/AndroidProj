package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddDevice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_device);

        Button addTvButton = (Button)findViewById(R.id.addTvButton);
        Button addLightButton = (Button)findViewById(R.id.addLightButton);
        Button addThermButton = (Button)findViewById(R.id.addThermButton);
        Button addFanButton = (Button)findViewById(R.id.addFanButton);


        addTvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startTv = new Intent(getApplicationContext(), AddTv.class);
                startActivity(startTv);
            }
        });

        addLightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startLights = new Intent(getApplicationContext(), AddLight.class);
                startActivity(startLights);
            }
        });

        addThermButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startTherm = new Intent(getApplicationContext(), AddThermostat.class);
                startActivity(startTherm);
            }
        });

        addFanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startFan = new Intent(getApplicationContext(), AddFan.class);
                startActivity(startFan);
            }
        });


    }
}

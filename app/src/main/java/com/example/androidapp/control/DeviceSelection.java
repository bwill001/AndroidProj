package com.example.androidapp.control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidapp.R;

public class DeviceSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_selection);

        Button lightsButton = (Button)findViewById(R.id.lightsButton);
        Button fansButton = (Button)findViewById(R.id.fansButton);
        Button tvButton = (Button)findViewById(R.id.tvButton);
        Button thermoButton = (Button)findViewById(R.id.thermoButton);

        lightsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startLights = new Intent(getApplicationContext(), Lights.class);
                startActivity(startLights);
            }
        });

        fansButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startFans = new Intent(getApplicationContext(), CeilingFan.class);
                startActivity(startFans);
            }
        });

        tvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startTv = new Intent(getApplicationContext(), Television.class);
                startActivity(startTv);
            }
        });

        thermoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startTherm = new Intent(getApplicationContext(), Thermostat.class);
                startActivity(startTherm);
            }

        });



    }
}

package com.example.androidapp.control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidapp.R;

public class Lights extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights);

        Button lightsBackButton = (Button)findViewById(R.id.lightsBackButton);

        lightsBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToDevices = new Intent(getApplicationContext(), DeviceSelection.class);
                startActivity(backToDevices);
            }
        });
    }
}

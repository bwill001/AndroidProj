package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidapp.control.DeviceSelection;
import com.example.androidapp.create.AddDevice;

public class HubPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub_page);

        Button manageDeviceButton = (Button)findViewById(R.id.manageDeviceButton);
        Button addMenuButton = (Button)findViewById(R.id.addMenuButton);


        manageDeviceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startControls = new Intent(getApplicationContext(), DeviceSelection.class);
                startActivity(startControls);
            }
        });


        addMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startAdding = new Intent(getApplicationContext(), AddDevice.class);
                startActivity(startAdding);
            }
        });
    }
}

package com.example.androidapp.control;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.androidapp.AlertsPage;
import com.example.androidapp.FloorPlan;
import com.example.androidapp.HubPage;
import com.example.androidapp.R;
import com.example.androidapp.SettingsPage;
import com.example.androidapp.create.AddDevice;

public class DeviceSelection extends AppCompatActivity {


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.homeMenu:
                Intent startHome = new Intent(getApplicationContext(), HubPage.class);
                startActivity(startHome);
                return true;

            case R.id.devicesMenu:
                return true;

            case R.id.controlDevice:
                Intent startControls = new Intent(getApplicationContext(), DeviceSelection.class);
                startActivity(startControls);
                return true;

            case R.id.addDeviceMenu:
                Intent startAdding = new Intent(getApplicationContext(), AddDevice.class);
                startActivity(startAdding);
                return true;

            case R.id.alertsMenu:
                Intent startAlerts = new Intent(getApplicationContext(), AlertsPage.class);
                startActivity(startAlerts);
                return true;

            case R.id.floorplanMenu:
                Intent startFloorPlan = new Intent(getApplicationContext(), FloorPlan.class);
                startActivity(startFloorPlan);
                return true;

            case R.id.settingsMenu:
                Intent startSettings = new Intent(getApplicationContext(), SettingsPage.class);
                startActivity(startSettings);
                return true;

            case R.id.logOutMenu:
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_selection);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

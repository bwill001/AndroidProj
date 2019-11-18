package com.example.androidapp.create;

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
import android.widget.EditText;

import com.example.androidapp.AlertsPage;
import com.example.androidapp.FloorPlan;
import com.example.androidapp.HubPage;
import com.example.androidapp.R;
import com.example.androidapp.SettingsPage;
import com.example.androidapp.control.CeilingFan;
import com.example.androidapp.control.DeviceSelection;
import com.example.androidapp.control.Lights;

public class AddLight extends AppCompatActivity {


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
        setContentView(R.layout.activity_add_light);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button createLightButton = (Button)findViewById(R.id.createLightButton);
        final EditText lightName = (EditText)findViewById(R.id.enterLightName);

        createLightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startTv = new Intent(getApplicationContext(), Lights.class);
                startTv.putExtra("lightName", lightName.getText().toString());
                startActivity(startTv);
            }
        });
    }
}

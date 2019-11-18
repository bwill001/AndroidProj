package com.example.androidapp.control;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.androidapp.AlertsPage;
import com.example.androidapp.DeviceAdapter;
import com.example.androidapp.DeviceDatabaseHelper;
import com.example.androidapp.FloorPlan;
import com.example.androidapp.HubPage;
import com.example.androidapp.R;
import com.example.androidapp.SettingsPage;
import com.example.androidapp.create.AddDevice;

import java.io.File;
import java.util.List;
import java.util.Locale;

public class Thermostat extends AppCompatActivity {
    SQLiteDatabase mDatabase;
    DeviceDatabaseHelper deviceDB;
    DeviceAdapter mAdapter;


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
        setContentView(R.layout.activity_thermostat);

        deviceDB = new DeviceDatabaseHelper(this);
        mDatabase = deviceDB.getWritableDatabase();
        RecyclerView thermoRecyclerView = findViewById(R.id.thermoRecyclerView);
        thermoRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new DeviceAdapter(this, getAllItems());
        thermoRecyclerView.setAdapter(mAdapter);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /*  Context context = getApplicationContext();
        String DB_PATH = "/data/data" + context.getPackageName() + "/databases/";

        db = SQLiteDatabase.openDatabase("DB_PATH", null, SQLiteDatabase.OPEN_READONLY);
*/

    }

    private Cursor getAllItems(){
        return mDatabase.query(DeviceDatabaseHelper.TABLE_NAME, null, null, null, null, null, DeviceDatabaseHelper.COL1 + " ASC");

    }

}

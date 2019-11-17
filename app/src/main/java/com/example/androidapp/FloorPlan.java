package com.example.androidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
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
import android.widget.Toast;

import com.example.androidapp.control.DeviceSelection;
import com.example.androidapp.create.AddDevice;

import java.util.ArrayList;
import java.util.List;

public class FloorPlan extends AppCompatActivity {
    DatabaseHelper roomDb;
    EditText roomName;
    Button addRoomButton;
    Button viewRoomButton;
    Button removeRoomButton;


    EditText editRoomNumberField;
    Button updateRoomButton;




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
        setContentView(R.layout.activity_floor_plan);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        roomDb = new DatabaseHelper(this);

        roomName = (EditText)findViewById(R.id.addRoomField);
        addRoomButton = (Button)findViewById(R.id.addRoomButton);
        viewRoomButton = (Button)findViewById(R.id.viewRoomButton);
        updateRoomButton = (Button) findViewById(R.id.updateRoomButton);
        removeRoomButton = (Button)findViewById(R.id.removeRoomButton);
        editRoomNumberField = (EditText)findViewById(R.id.editRoomNumberField);

        AddData();
        getRooms();
        updateNames();
        removeRoom();


        roomName.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            public void onFocusChange(View v, boolean hasFocus){
                if(hasFocus)
                    roomName.setHint("");
                else
                    roomName.setHint("Room Name");
            }
        });


        editRoomNumberField.setOnFocusChangeListener(new View.OnFocusChangeListener(){
            public void onFocusChange(View v, boolean hasFocus){
                if(hasFocus)
                    roomName.setHint("");
                else
                    roomName.setHint("Room Name");
            }
        });
    }



    public void AddData(){
        addRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                roomDb.insertData(roomName.getText().toString());
            }
        });
    }

    public void getRooms(){
        viewRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Cursor res = roomDb.getRooms();
               if(res.getCount() == 0){
                   showMessage("Error", "No rooms saved");
               }else {
                   StringBuffer buff = new StringBuffer();
                   while (res.moveToNext()) {
                       buff.append("Room: " + res.getString(1) + "\n");
                   }

                   showMessage("Rooms", buff.toString());
               }
            }
        });

    }


    public void showMessage(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();

    }



    public void updateNames(){
        updateRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isUpdated = roomDb.updateRoom(editRoomNumberField.getText().toString(), roomName.getText().toString());

               }
        });
    }

    public void removeRoom(){
        removeRoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer deleteRoom = roomDb.deleteRoom(editRoomNumberField.getText().toString());

               }
        });

    }

}

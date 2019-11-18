package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Television extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_television);

        Intent i = this.getIntent();

        String tvName = i.getStringExtra("tv name");
        String tvLocation = i.getStringExtra("tv location");

        final TextView tvTitle = findViewById(R.id.tvTitle);
        tvTitle.setText(tvName + " Settings");


        com.example.androidapp.data.deviceInfo.Television tv =
                new com.example.androidapp.data.deviceInfo.Television(tvName, tvLocation);

        System.out.println("TV volume: " + tv.getVolume());
        System.out.println("TV ID: " + tv.getDeviceID());
        System.out.println("TV name: " + tv.getName());

        /**
        com.example.androidapp.data.deviceInfo.Television tvObj = (com.example.androidapp.data.deviceInfo.Television) i.getSerializableExtra("com.example.androidapp.Tv");

        System.out.println(tvObj.getName());
        System.out.println(tvObj.getLocation());
        System.out.println(tvObj.getType());
        System.out.println(tvObj.getClass().getName());

        if(tvObj.getName() != null) {
            Toast.makeText(getApplicationContext(), tvObj.getName(), Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(), "nothing is there" , Toast.LENGTH_LONG).show();

       } **/


   }
}

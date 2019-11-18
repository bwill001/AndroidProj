package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class AddTv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tv);

        final Button createTvButton = findViewById(R.id.createTvButton);
        final EditText tvName = findViewById(R.id.enterTvName);
        final EditText tvLocation = findViewById(R.id.enterTvLocation);


        createTvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create new TV object
                com.example.androidapp.data.deviceInfo.Television tv =
                        new com.example.androidapp.data.deviceInfo.Television(tvName.getText().toString(), tvLocation.getText().toString());

                //System.out.println(tv.getName());

                //go to TV settings
                Intent tvSettings = new Intent(getApplicationContext(), Television.class);

                //tvSettings.putExtra("com.example.androidapp.Tv", tv);
                tvSettings.putExtra("tv name", tvName.getText().toString());
                tvSettings.putExtra("tv location", tvLocation.getText().toString());

                startActivity(tvSettings);
            }
        });

    }
}

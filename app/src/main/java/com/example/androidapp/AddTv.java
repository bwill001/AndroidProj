package com.example.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddTv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tv);

        Button createTvButton = (Button)findViewById(R.id.createTvButton);
        final EditText tvName = (EditText)findViewById(R.id.enterTvName);
        final EditText tvLocation = (EditText)findViewById(R.id.enterTvLocation);


        createTvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //create new TV object
                com.example.androidapp.data.deviceInfo.Television tv =
                        new com.example.androidapp.data.deviceInfo.Television(tvName.getText().toString(), tvLocation.getText().toString());

                //go to TV settings
                Intent tvSettings = new Intent(getApplicationContext(), Television.class);
                startActivity(tvSettings);
            }
        });

    }
}

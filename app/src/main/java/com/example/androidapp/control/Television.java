package com.example.androidapp.control;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidapp.R;

public class Television extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_television);

        Button tvBackButton = (Button)findViewById(R.id.tvBackButton);

        tvBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToDevices = new Intent(getApplicationContext(), DeviceSelection.class);
                startActivity(backToDevices);
            }
        });
    }
}

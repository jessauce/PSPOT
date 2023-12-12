package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Car_Vehicle_Parked extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_vehicle_parked);

        Intent intent = getIntent();

        String parkspot = getIntent().getStringExtra("parkspot");
        String plot = getIntent().getStringExtra("plot");

        // Parse the price as a string, including the "₱ " prefix
        TextView parkspotview = findViewById(R.id.Parkingtext);
        parkspotview.setText(parkspot);

        TextView plotview = findViewById(R.id.Plottext);
        plotview.setText(plot);
    }

    public void onProfileButtonClick(View view) {
        Intent intent = new Intent(Car_Vehicle_Parked.this, Profile.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void navigateToHome(View view) {
        Intent intent = new Intent(Car_Vehicle_Parked.this, Home.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
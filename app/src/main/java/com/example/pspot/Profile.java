package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void navigateToHome(View view) {
        Intent intent = new Intent(Profile.this, Home.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void navigateToCarVehicleParked(View view) {
        Intent intent = new Intent(Profile.this, Car_Vehicle_Parked.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

    }

    public void navigateToVehicleInfo(View view) {
        Intent intent = new Intent(Profile.this, Vehicle_Info.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void navigateToPersonalData(View view) {
        Intent intent = new Intent(Profile.this, PersonalData.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void navigateToChangePass(View view) {
        Intent intent = new Intent(Profile.this, Change_Pass.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void navigateToAboutUs(View view) {
        Intent intent = new Intent(Profile.this, About_Us.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
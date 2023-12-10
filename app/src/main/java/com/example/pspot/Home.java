package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Home extends AppCompatActivity {

    private Button btn4Wheel;
    private Button btn2Wheel;
    private RelativeLayout mainLayout;
    private RelativeLayout gleLayout;
    private RelativeLayout rtlLayout;
    private RelativeLayout ngeLayout;
    private RelativeLayout alliedLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize buttons
        btn4Wheel = findViewById(R.id.btn4wheel);
        btn2Wheel = findViewById(R.id.btn2wheel);
        // Initialize RelativeLayouts
        mainLayout = findViewById(R.id.main_layout);
        gleLayout = findViewById(R.id.gle_layout);
        rtlLayout = findViewById(R.id.rtl_layout);
        ngeLayout = findViewById(R.id.nge_layout);
        alliedLayout = findViewById(R.id.allied_layout);

        // Set click listeners for buttons
        btn4Wheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeButtonColor(btn4Wheel);
                // Hide layouts as needed
                hideLayouts(false);
                // Add any other functionality you want for btn4Wheel click
            }
        });

        btn2Wheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeButtonColor(btn2Wheel);
                // Hide layouts as needed
                hideLayouts(true);
                // Add any other functionality you want for btn2Wheel click
            }
        });
    }

    private void changeButtonColor(Button button) {
        // Change the background color of the clicked button to the specified color
        button.setBackgroundColor(getResources().getColor(R.color.button_enabled_color));

        // You may want to reset the color of the other button to its default color
        if (button == btn4Wheel) {
            btn2Wheel.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        } else if (button == btn2Wheel) {
            btn4Wheel.setBackgroundColor(getResources().getColor(android.R.color.transparent));
        }
    }

    private void hideLayouts(boolean hideAllExceptAllied) {
        if (hideAllExceptAllied) {
            mainLayout.setVisibility(View.GONE);
            gleLayout.setVisibility(View.GONE);
            rtlLayout.setVisibility(View.GONE);
            ngeLayout.setVisibility(View.GONE);
            alliedLayout.setVisibility(View.VISIBLE); // Show Allied layout
        } else {
            mainLayout.setVisibility(View.VISIBLE);
            gleLayout.setVisibility(View.VISIBLE);
            rtlLayout.setVisibility(View.VISIBLE);
            ngeLayout.setVisibility(View.VISIBLE);
            alliedLayout.setVisibility(View.GONE); // Hide Allied layout
        }
    }

    public void onProfileButtonClick(View view) {
        Intent intent = new Intent(Home.this, Profile.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void navigateToMainMap(View view) {
        Intent intent = new Intent(Home.this, Main_ParkingMap.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void navigateToRTLMap(View view) {
        Intent intent = new Intent(Home.this, RTL_ParkingMap.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void navigateToGLEMap(View view) {
        Intent intent = new Intent(Home.this, GLE_Parking_Map.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
    public void navigateToNGEMap(View view) {
        Intent intent = new Intent(Home.this, NGE_Parking_Map.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void navigateToAlliedMap(View view) {
        Intent intent = new Intent(Home.this, Allied_ParkingMap.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void navigateToCarVehicleParked(View view) {
        Intent intent = new Intent(Home.this, Car_Vehicle_Parked.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

}
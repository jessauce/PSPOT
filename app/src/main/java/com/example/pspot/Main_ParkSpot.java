package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main_ParkSpot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_park_spot);
    }

    public void navigateToVehicleTimer1(View view) {
        // Create an Intent to go to the Car_Vehicle_Limit page
        Intent intent = new Intent(Main_ParkSpot.this, Car_Vehicle_Limit.class);

        // Get the selected parking spot text (without the "Parking Spot Taken" prefix)
        TextView parkspottext = findViewById(R.id.parkspottext);
        String selectedSpotText = parkspottext.getText().toString();
        // Remove the "Parking Spot Taken: " prefix
        selectedSpotText = selectedSpotText.replace("Parking Spot Taken: ", "");

        // Add the selected parking spot text as an extra to the intent
        intent.putExtra("selectedSpotText", selectedSpotText);

        // Start the Car_Vehicle_Limit page
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
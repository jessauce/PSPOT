package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.model.LatLng;


public class GLE_Parking_Map extends AppCompatActivity {

    private MapFragment mapFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gle_parking_map);

        Fragment fragment = new MapFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment).commit();

        Button Confirmbutton = findViewById(R.id.btnConfirm);
        MapFragment mapFragment;

        mapFragment = (MapFragment) fragment;
        mapFragment.setHomeActivity(this);

        fragment = MapFragment.newInstance(10.295396, 123.881127);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment).commit();

        Confirmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GLE_Parking_Map.this, GLE_ParkSpot.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }

    public void onProfileButtonClick(View view) {
        Intent intent = new Intent(GLE_Parking_Map.this, Profile.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void navigateToHome(View view) {
        Intent intent = new Intent(GLE_Parking_Map.this, Home.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

    }
}
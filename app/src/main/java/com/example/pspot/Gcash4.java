package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Gcash4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gcash4);

        String totalPrice = getIntent().getStringExtra("totalPrice");

        // Parse the price as a string, including the "₱ " prefix
        TextView priceAmountTextView = findViewById(R.id.Plottext);
        priceAmountTextView.setText(totalPrice);
    }
    public void navigateToCarVehicleParked(View view) {
        String parkspot = getIntent().getStringExtra("parkspot");
        String plot = getIntent().getStringExtra("plot");

        Intent intent = new Intent(Gcash4.this, Car_Vehicle_Parked.class);
        intent.putExtra("parkspot", parkspot);
        intent.putExtra("plot", plot);

        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Gcash2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gcash2);

        // Update the key to "totalPrice"
        String totalPrice = getIntent().getStringExtra("totalPrice");

        // Parse the price as a string, including the "₱ " prefix
        TextView priceAmountTextView = findViewById(R.id.price);
        priceAmountTextView.setText(totalPrice);

        TextView priceAmountTextView2 = findViewById(R.id.Plottext);
        priceAmountTextView2.setText(totalPrice);
    }

    public void navigateToGcash3Page(View view) {
        String totalPrice = getIntent().getStringExtra("totalPrice");
        String parkspot = getIntent().getStringExtra("parkspot");
        String plot = getIntent().getStringExtra("plot");

        // Pass the numeric part to the Gcash2 activity
        Intent intent = new Intent(Gcash2.this, Gcash3.class);
        intent.putExtra("totalPrice", totalPrice);
        intent.putExtra("parkspot", parkspot);
        intent.putExtra("plot", plot);

        intent.putExtra("ParkingText", getIntent().getStringExtra("ParkingText"));
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
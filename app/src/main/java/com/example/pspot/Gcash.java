package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Gcash extends AppCompatActivity {
    private Button dateButton;
    private String selectedDate = "";
    private ImageView dotPass1, dotPass2, dotPass3, dotPass4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gcash);

        dotPass1 = findViewById(R.id.dotPass1);
        dotPass2 = findViewById(R.id.dotPass2);
        dotPass3 = findViewById(R.id.dotPass3);
        dotPass4 = findViewById(R.id.dotPass4);

        // Set initial visibility of dotPass ImageViews
        dotPass1.setVisibility(View.INVISIBLE);
        dotPass2.setVisibility(View.INVISIBLE);
        dotPass3.setVisibility(View.INVISIBLE);
        dotPass4.setVisibility(View.INVISIBLE);


        selectedDate = getIntent().getStringExtra("selectedDate");

        //int totalPrice = getIntent().getIntExtra("Price", 0);

        Button proceedButton = findViewById(R.id.btnProceedpayment);
        proceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String totalPrice = getIntent().getStringExtra("totalPrice");
                String parkspot = getIntent().getStringExtra("parkspot");
                String plot = getIntent().getStringExtra("plot");

                // Pass the numeric part to the Gcash2 activity
                Intent intent = new Intent(Gcash.this, Gcash2.class);
                intent.putExtra("totalPrice", totalPrice);
                intent.putExtra("parkspot", parkspot);
                intent.putExtra("plot", plot);

                intent.putExtra("ParkingText", getIntent().getStringExtra("ParkingText"));
                startActivity(intent);
            }
        });
    }

    public void navigateToGcash2Page(View view) {
        Intent intent = new Intent(Gcash.this, Gcash3.class);
        intent.putExtra("ParkingText", getIntent().getStringExtra("ParkingText"));
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void onNumericButtonClick(View view) {
        int id = view.getId();
        if (id == R.id.no1) {
            dotPass1.setVisibility(View.VISIBLE);
        } else if (id == R.id.no2) {
            dotPass2.setVisibility(View.VISIBLE);
        } else if (id == R.id.no3) {
            dotPass3.setVisibility(View.VISIBLE);
        } else if (id == R.id.no4) {
            dotPass4.setVisibility(View.VISIBLE);
        } else if (id == R.id.no5) {
            // Implement the other numeric ImageViews as needed
            // dotPass1.setVisibility(View.VISIBLE);
        }
        // ...
    }
}
package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Handler;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.app.TimePickerDialog;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class Car_Vehicle_Limit extends AppCompatActivity {

    private boolean isProgressShowing = false;

    Button timeButton;


    ProgressBar progressBar;
    private Dialog paymentDialog;

    int hour, minute;

    Button bottomsheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_vehicle_limit);

        timeButton = findViewById(R.id.timeButton);
        // Set an initial time, e.g., 12:00
        hour = 12;
        minute = 0;
        updateTimeButtonText();

        bottomsheet = findViewById(R.id.btnProceedpayment);
        progressBar = findViewById(R.id.progressBar); // Initialize progressBar
        bottomsheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    showDialog();
            }
        });

        // Retrieve the selected parking spot text from the Intent
        String selectedSpotText = getIntent().getStringExtra("selectedSpotText");

        // Update the Plottext TextView with the selected parking spot text
        TextView plottext = findViewById(R.id.Plottext);
        plottext.setText(selectedSpotText);
    }

    public void showDialog() {
        paymentDialog = new Dialog(this);
        paymentDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        paymentDialog.setContentView(R.layout.bottom_payment);

        paymentDialog.show();
        paymentDialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        paymentDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        paymentDialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        paymentDialog.getWindow().setGravity(Gravity.BOTTOM);
    }


    public void openTimePicker(View view) {
        // Create a TimePickerDialog and set the initial time
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int selectedHour, int selectedMinute) {
                // Save the selected time
                hour = selectedHour;
                minute = selectedMinute;

                // Update the button text with the selected time
                updateTimeButtonText();
            }
        }, hour, minute, false);

        // Show the TimePickerDialog
        timePickerDialog.show();
    }

    private void updateTimeButtonText() {
        String time = String.format("%02d:%02d ▼", hour, minute);
        timeButton.setText(time);
    }

    public void navigateToBack(View view) {
        Intent intent = new Intent(Car_Vehicle_Limit.this, GLE_ParkSpot.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void navigateToCreditCard(View view) {

        showCreditCardDialog();
    }

    private void showCreditCardDialog() {
        if (paymentDialog != null) {
            paymentDialog.dismiss(); // Dismiss the "bottom_payment" dialog if it's showing.
        }

        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottom_credit_card);

        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);
    }

    public void navigateToGcash(View view) {
        // Create an AlertDialog.Builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirmation");
        builder.setMessage("You are about to be redirected to Gcash. Do you want to proceed?");

        // Set the positive button (proceed)
        builder.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Dismiss the dialog
                dialog.dismiss();

                // Show the progress bar
                progressBar.setVisibility(View.VISIBLE);
                isProgressShowing = true;

                // Post a delayed action to navigate to the Gcash page after a 2-second delay
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // Handle the click event to navigate to the Gcash page
                        Intent intent = new Intent(Car_Vehicle_Limit.this, Gcash.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    }
                }, 2000); // 2000 milliseconds (2 seconds)
            }
        });

        // Set the negative button (cancel)
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss(); // Dismiss the dialog if the user cancels.
            }
        });

        // Create and show the alert dialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    // Override the onBackPressed method to hide the progress bar if the back button is pressed
    @Override
    public void onBackPressed() {
        if (isProgressShowing) {
            progressBar.setVisibility(View.INVISIBLE);
        }
        super.onBackPressed();
    }
}
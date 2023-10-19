package com.example.pspot;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import java.util.HashMap;
import java.util.Map;

import android.app.AlertDialog;


public class Vehicle_Info extends AppCompatActivity {

    private static final String TAG = "Vehicle_Info";

    private EditText carColorEditText;
    private EditText carModelEditText;
    private EditText plateNumEditText;
    private String vehicleType;

    private FirebaseAuth mAuth;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_info);

        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        carColorEditText = findViewById(R.id.CarColor);
        carModelEditText = findViewById(R.id.CarModel);
        plateNumEditText = findViewById(R.id.PlateNum);

        Button twoWheelButton = findViewById(R.id.button);
        Button fourWheelButton = findViewById(R.id.button2);
        Button registerButton = findViewById(R.id.btnRegister);

        twoWheelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vehicleType = "2-Wheel";
            }
        });

        fourWheelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vehicleType = "4-Wheel";
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String carColor = carColorEditText.getText().toString();
                String carModel = carModelEditText.getText().toString();
                String plateNum = plateNumEditText.getText().toString();

                if (carColor.isEmpty() || carModel.isEmpty() || plateNum.isEmpty() || vehicleType == null) {
                    Log.e(TAG, "Some fields are empty or vehicle type not selected.");
                } else {
                    // Save vehicle information to Firestore
                    saveVehicleInfoToFirestore(carColor, carModel, plateNum, vehicleType);
                }
            }
        });
    }

    private void saveVehicleInfoToFirestore(String carColor, String carModel, String plateNum, String vehicleType) {
        String userEmail = mAuth.getCurrentUser().getEmail();

        if (userEmail != null) {
            CollectionReference userDataCollection = db.collection("userData");
            Query query = userDataCollection.whereEqualTo("email", userEmail);

            query.get().addOnCompleteListener(task -> {
                if (task.isSuccessful()) {
                    for (QueryDocumentSnapshot document : task.getResult()) {
                        String userDocumentId = document.getId();
                        CollectionReference vehicleInfoCollection = userDataCollection
                                .document(userDocumentId)
                                .collection("Vehicle Info");

                        // Check if Vehicle 1 exists
                        DocumentReference vehicle1Document = vehicleInfoCollection.document("Vehicle 1");

                        vehicle1Document.get().addOnCompleteListener(vehicle1Task -> {
                            if (vehicle1Task.isSuccessful() && !vehicle1Task.getResult().exists()) {
                                // Vehicle 1 doesn't exist, create it and save the data there
                                Map<String, Object> vehicleData = new HashMap<>();
                                vehicleData.put("Color", carColor);
                                vehicleData.put("Model", carModel);
                                vehicleData.put("Plate Number", plateNum);
                                vehicleData.put("Vehicle Type", vehicleType);

                                vehicle1Document.set(vehicleData)
                                        .addOnSuccessListener(vehicle1DocumentReference -> {
                                            Log.d(TAG, "Vehicle 1 added successfully.");
                                            // Redirect to the Home or another page as needed
                                            Intent intent = new Intent(Vehicle_Info.this, Home.class);
                                            startActivity(intent);
                                            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                                        })
                                        .addOnFailureListener(e -> {
                                            Log.e(TAG, "Error adding Vehicle 1: " + e.getMessage());
                                        });
                            } else {
                                // Vehicle 1 already exists, so check and create Vehicle 2
                                DocumentReference vehicle2Document = vehicleInfoCollection.document("Vehicle 2");

                                vehicle2Document.get().addOnCompleteListener(vehicle2Task -> {
                                    if (vehicle2Task.isSuccessful() && !vehicle2Task.getResult().exists()) {
                                        // Vehicle 2 doesn't exist, create it and save the data there
                                        Map<String, Object> vehicleData = new HashMap<>();
                                        vehicleData.put("Color", carColor);
                                        vehicleData.put("Model", carModel);
                                        vehicleData.put("Plate Number", plateNum);
                                        vehicleData.put("Vehicle Type", vehicleType);

                                        vehicle2Document.set(vehicleData)
                                                .addOnSuccessListener(vehicle2DocumentReference -> {
                                                    Log.d(TAG, "Vehicle 2 added successfully.");
                                                    // Redirect to the Home or another page as needed
                                                    Intent intent = new Intent(Vehicle_Info.this, Home.class);
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                                                })
                                                .addOnFailureListener(e -> {
                                                    Log.e(TAG, "Error adding Vehicle 2: " + e.getMessage());
                                                });
                                    } else {
                                        // Show a message to the user
                                        new AlertDialog.Builder(Vehicle_Info.this)
                                                .setTitle("Maximum Limit Reached")
                                                .setMessage("You have reached the maximum limit of 2 registered vehicles.")
                                                .setPositiveButton("OK", (dialog, which) -> {
                                                    // Redirect to the Home activity
                                                    Intent intent = new Intent(Vehicle_Info.this, Home.class);
                                                    startActivity(intent);
                                                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                                                })
                                                .show();

                                        // You can add any further actions after showing the message here
                                    }
                                });
                            }
                        });
                    }
                }
            });
        } else {
            Log.e(TAG, "User is not logged in.");
        }
    }
}

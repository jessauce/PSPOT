package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.DocumentReference;

import android.widget.Toast;
import android.os.Handler;
import android.util.Log;


import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.Transaction;
public class GLE_ParkSpot extends AppCompatActivity {


    private int totalPrice = 0;
    private boolean a1Selected = false;
    private boolean a2Selected = false;
    private boolean b1Selected = false;
    private boolean b2Selected = false;
    private boolean c1Selected = false;
    private boolean c2Selected = false;
    private boolean d1Selected = false;
    private boolean d2Selected = false;
    private boolean e1Selected = false;
    private boolean e2Selected = false;
    private boolean f1Selected = false;
    private boolean f2Selected = false;
    private boolean g1Selected = false;
    private boolean g2Selected = false;
    private boolean h1Selected = false;
    private boolean h2Selected = false;
    private boolean i1Selected = false;
    private boolean i2Selected = false;
    private boolean j1Selected = false;
    private boolean j2Selected = false;
    private boolean k1Selected = false;
    private boolean k2Selected = false;
    private boolean l1Selected = false;
    private boolean l2Selected = false;
    private boolean m1Selected = false;
    private boolean m2Selected = false;
    private boolean n1Selected = false;
    private boolean n2Selected = false;
    private boolean o1Selected = false;
    private boolean o2Selected = false;
    private boolean p1Selected = false;
    private boolean p2Selected = false;
    private boolean q1Selected = false;
    private boolean q2Selected = false;
    private boolean r1Selected = false;
    private boolean r2Selected = false;

    private FirebaseFirestore db;
    private DocumentReference ngeDocumentRef;

    private boolean navigateToNextPage = false;
    private boolean isCheckoutButtonClicked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gle_park_spot);

        // Initialize Firebase
        FirebaseFirestore db = FirebaseFirestore.getInstance();

// Find the parking spot ImageView elements
        ImageView a1ImageView = findViewById(R.id.A1);
        ImageView a2ImageView = findViewById(R.id.A2);
        ImageView b1ImageView = findViewById(R.id.B1);
        ImageView b2ImageView = findViewById(R.id.B2);
        ImageView c1ImageView = findViewById(R.id.C1);
        ImageView c2ImageView = findViewById(R.id.C2);
        ImageView d1ImageView = findViewById(R.id.D1);
        ImageView d2ImageView = findViewById(R.id.D2);
        ImageView e1ImageView = findViewById(R.id.E1);
        ImageView e2ImageView = findViewById(R.id.E2);
        ImageView f1ImageView = findViewById(R.id.F1);
        ImageView f2ImageView = findViewById(R.id.F2);
        ImageView g1ImageView = findViewById(R.id.G1);
        ImageView g2ImageView = findViewById(R.id.G2);
        ImageView h1ImageView = findViewById(R.id.H1);
        ImageView h2ImageView = findViewById(R.id.H2);



        // Reference to the "parkingSpots" collection and "GLE" document
        DocumentReference parkingSpotRef = db.collection("parkingSpots").document("GLE");

        // Add a listener to the document to listen for changes
        parkingSpotRef.addSnapshotListener(this, (documentSnapshot, e) -> {
            if (e != null) {
                // Handle errors here
                Toast.makeText(GLE_ParkSpot.this, "Error fetching updates", Toast.LENGTH_SHORT).show();
                return;
            }

            if (documentSnapshot != null && documentSnapshot.exists()) {
                // DocumentSnapshot contains the data of the "GLE" document
                // Now, you can retrieve the values of the parking spots and update your UI

                // Example: Update UI for A1 based on its availability
                updateSpotUI(a1ImageView, documentSnapshot.getString("A1"));

                // Repeat the above steps for other parking spots
                updateSpotUI(a2ImageView, documentSnapshot.getString("A2"));
                updateSpotUI(b1ImageView, documentSnapshot.getString("B1"));
                updateSpotUI(b2ImageView, documentSnapshot.getString("B2"));
                updateSpotUI(c1ImageView, documentSnapshot.getString("C1"));
                updateSpotUI(c2ImageView, documentSnapshot.getString("C2"));
                updateSpotUI(d1ImageView, documentSnapshot.getString("D1"));
                updateSpotUI(d2ImageView, documentSnapshot.getString("D2"));
                updateSpotUI(e1ImageView, documentSnapshot.getString("E1"));
                updateSpotUI(e2ImageView, documentSnapshot.getString("E2"));
                updateSpotUI(f1ImageView, documentSnapshot.getString("F1"));
                updateSpotUI(f2ImageView, documentSnapshot.getString("F2"));
                updateSpotUI(g1ImageView, documentSnapshot.getString("G1"));
                updateSpotUI(g2ImageView, documentSnapshot.getString("G2"));
                updateSpotUI(h1ImageView, documentSnapshot.getString("H1"));
                updateSpotUI(h2ImageView, documentSnapshot.getString("H2"));
            } else {
                // Handle the case where the document does not exist
                // You might want to show a message to the user or take appropriate action
                TextView parkspottext = findViewById(R.id.parkspottext);
                parkspottext.setText("Parking spot information not available");
                // You can also display a toast message or any other UI update
            }
        });



        // Set click listeners for the parking spot ImageView elements
        a1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(a1ImageView)) { // Check if spot is available
                    if (a1Selected) {
                        unselectSpot(a1ImageView, a1Selected);
                        a1Selected = !a1Selected;
                    } else {
                        toggleAvailableSpot(a1ImageView, a1Selected);
                        a1Selected = !a1Selected;
                    }
                }
            }
        });

        a2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(a2ImageView)) { // Check if spot is available
                    if (a2Selected) {
                        unselectSpot(a2ImageView, a2Selected);
                        a2Selected = !a2Selected;
                    } else {
                        toggleAvailableSpot(a2ImageView, a2Selected);
                        a2Selected = !a2Selected;
                    }
                }
            }
        });

        b1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(b1ImageView)) { // Check if spot is available
                    if (b1Selected) {
                        unselectSpot(b1ImageView, b1Selected);
                        b1Selected = !b1Selected;
                    } else {
                        toggleAvailableSpot(b1ImageView, b1Selected);
                        b1Selected = !b1Selected;
                    }
                }
            }
        });


        b2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(b2ImageView)) { // Check if spot is available
                    if (b2Selected) {
                        unselectSpot(b2ImageView, b2Selected);
                        b2Selected = !b2Selected;
                    } else {
                        toggleAvailableSpot(b2ImageView, b2Selected);
                        b2Selected = !b2Selected;
                    }
                }
            }
        });

        c1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(c1ImageView)) { // Check if spot is available
                    if (c1Selected) {
                        unselectSpot(c1ImageView, c1Selected);
                        c1Selected = !c1Selected;
                    } else {
                        toggleAvailableSpot(c1ImageView, c1Selected);
                        c1Selected = !c1Selected;
                    }
                }
            }
        });

        c2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(c2ImageView)) { // Check if spot is available
                    if (c2Selected) {
                        unselectSpot(c2ImageView, c2Selected);
                        c2Selected = !c2Selected;
                    } else {
                        toggleAvailableSpot(c2ImageView, c2Selected);
                        c2Selected = !c2Selected;
                    }
                }
            }
        });


        d1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(d1ImageView)) { // Check if spot is available
                    if (d1Selected) {
                        unselectSpot(d1ImageView, d1Selected);
                        d1Selected = !d1Selected;
                    } else {
                        toggleAvailableSpot(d1ImageView, d1Selected);
                        d1Selected = !d1Selected;
                    }
                }
            }
        });

        d2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(d2ImageView)) { // Check if spot is available
                    if (d2Selected) {
                        unselectSpot(d2ImageView, d2Selected);
                        d2Selected = !d2Selected;
                    } else {
                        toggleAvailableSpot(d2ImageView, d2Selected);
                        d2Selected = !d2Selected;
                    }
                }
            }
        });

        e1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(e1ImageView)) { // Check if spot is available
                    if (e1Selected) {
                        unselectSpot(e1ImageView, e1Selected);
                        e1Selected = !e1Selected;
                    } else {
                        toggleAvailableSpot(e1ImageView, e1Selected);
                        e1Selected = !e1Selected;
                    }
                }
            }
        });

        e2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(e2ImageView)) { // Check if spot is available
                    if (e2Selected) {
                        unselectSpot(e2ImageView, e2Selected);
                        e2Selected = !e2Selected;
                    } else {
                        toggleAvailableSpot(e2ImageView, e2Selected);
                        e2Selected = !e2Selected;
                    }
                }
            }
        });

// Repeat the above code for other spots...

// Example for f1ImageView and f2ImageView:

        f1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(f1ImageView)) { // Check if spot is available
                    if (f1Selected) {
                        unselectSpot(f1ImageView, f1Selected);
                        f1Selected = !f1Selected;
                    } else {
                        toggleAvailableSpot(f1ImageView, f1Selected);
                        f1Selected = !f1Selected;
                    }
                }
            }
        });

        f2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(f2ImageView)) { // Check if spot is available
                    if (f2Selected) {
                        unselectSpot(f2ImageView, f2Selected);
                        f2Selected = !f2Selected;
                    } else {
                        toggleAvailableSpot(f2ImageView, f2Selected);
                        f2Selected = !f2Selected;
                    }
                }
            }
        });

// Repeat the pattern for the remaining spots...

// Example for g1ImageView and g2ImageView:

        g1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(g1ImageView)) { // Check if spot is available
                    if (g1Selected) {
                        unselectSpot(g1ImageView, g1Selected);
                        g1Selected = !g1Selected;
                    } else {
                        toggleAvailableSpot(g1ImageView, g1Selected);
                        g1Selected = !g1Selected;
                    }
                }
            }
        });

        g2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(g2ImageView)) { // Check if spot is available
                    if (g2Selected) {
                        unselectSpot(g2ImageView, g2Selected);
                        g2Selected = !g2Selected;
                    } else {
                        toggleAvailableSpot(g2ImageView, g2Selected);
                        g2Selected = !g2Selected;
                    }
                }
            }
        });

// Repeat the pattern for the remaining spots...

// Example for h1ImageView and h2ImageView:

        h1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(h1ImageView)) { // Check if spot is available
                    if (h1Selected) {
                        unselectSpot(h1ImageView, h1Selected);
                        h1Selected = !h1Selected;
                    } else {
                        toggleAvailableSpot(h1ImageView, h1Selected);
                        h1Selected = !h1Selected;
                    }
                }
            }
        });

        h2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(h2ImageView)) { // Check if spot is available
                    if (h2Selected) {
                        unselectSpot(h2ImageView, h2Selected);
                        h2Selected = !h2Selected;
                    } else {
                        toggleAvailableSpot(h2ImageView, h2Selected);
                        h2Selected = !h2Selected;
                    }
                }
            }
        });
    }


    private void revertToZeroIfSelected() {
        if (navigateToNextPage) {
            // Do not revert to zero if navigating to the next page
            navigateToNextPage = false;
            return;
        }

        // Revert to zero logic here
        // ...
    }


    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();

        // If the checkout button was clicked, skip the logic to revert the value back to 0
        if (isCheckoutButtonClicked) {
            return;
        }


        if (!isCheckoutButtonClicked) {
            revertToZeroIfSelected();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        // If the checkout button was clicked, skip the logic to revert the value back to 0
        if (isCheckoutButtonClicked) {
            return;
        }

        if (!isCheckoutButtonClicked) {
            revertToZeroIfSelected();
        }
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        // Handle back button of the page
        revertIfNecessary();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Handle app exit
        revertIfNecessary();
    }


    private void revertIfNecessary() {
        if (!currentlySelectedSpotId.isEmpty()) {
            // Get the ImageView of the currently selected spot
            ImageView currentlySelectedSpot = findViewById(getResources().getIdentifier(currentlySelectedSpotId, "id", getPackageName()));

            // Unselect the spot and update the database
            unselectSpot(currentlySelectedSpot, true);
            currentlySelectedSpotId = "";  // Reset the currentlySelectedSpotId
        }
    }


    public void onCheckoutButtonClick(View view) {
        // Handle checkout button click logic
        // ...

        // Set the flag to true to indicate that checkout button is clicked
        isCheckoutButtonClicked = true;
    }



    private void handleBackPressed() {
        // Check if a spot is currently selected
        if (!currentlySelectedSpotId.isEmpty()) {
            // Get the ImageView of the currently selected spot
            ImageView currentlySelectedSpot = findViewById(getResources().getIdentifier(currentlySelectedSpotId, "id", getPackageName()));

            // Unselect the spot and update the database
            unselectSpot(currentlySelectedSpot, true);
            currentlySelectedSpotId = "";  // Reset the currentlySelectedSpotId
        }

        // Continue with the default back button behavior
        super.onBackPressed();
    }



    private boolean isSpotSelected(ImageView imageView) {
        // Determine the selected status based on the image resource
        int resourceId = (int) imageView.getTag();
        return resourceId == R.drawable.selectedcarspot || resourceId == R.drawable.selectedcarspot2;
    }

    // Fetch parking spot data from Firestore
    private void fetchParkingSpotData() {
        ngeDocumentRef.get().addOnCompleteListener(task -> {
            if (task.isSuccessful() && task.getResult() != null) {
                // Retrieve parking spot data from Firestore and update UI
                // You need to implement this method based on your Firestore schema
                // Example: updateParkingSpotUI(task.getResult().toObject(YourParkingSpotDataClass.class));
            }
        });
    }

    // Update parking spot data in Firestore
    private void updateFirestore(String spotName, boolean isSelected) {
        // Update the corresponding field in the Firestore document
        ngeDocumentRef.update(spotName, isSelected)
                .addOnSuccessListener(aVoid -> {
                    // Handle successful update
                })
                .addOnFailureListener(e -> {
                    // Handle failure
                });
    }

    // Modify your existing updateSpotUI method to handle unavailable spots
    private void updateSpotUI(ImageView spotImageView, String spotValue) {
        boolean isSpotAvailable = spotValue.equals("0");
        int spotImageResource;

        if (isSpotAvailable) {
            // Spot is available, use the available icon/button
            if (spotImageView.getId() == R.id.A2 || spotImageView.getId() == R.id.B2 ||
                    spotImageView.getId() == R.id.C2 || spotImageView.getId() == R.id.D2 ||
                    spotImageView.getId() == R.id.E2 || spotImageView.getId() == R.id.F2 ||
                    spotImageView.getId() == R.id.G2 || spotImageView.getId() == R.id.H2) {
                spotImageResource = R.drawable.availablecarspot2;
            } else {
                spotImageResource = R.drawable.availablecarspot;
            }
        } else {
            // Spot is unavailable, use the unavailable icon/button
            if (spotImageView.getId() == R.id.A2 || spotImageView.getId() == R.id.B2 ||
                    spotImageView.getId() == R.id.C2 || spotImageView.getId() == R.id.D2 ||
                    spotImageView.getId() == R.id.E2 || spotImageView.getId() == R.id.F2 ||
                    spotImageView.getId() == R.id.G2 || spotImageView.getId() == R.id.H2) {
                spotImageResource = R.drawable.unavailablecarspot2;
            } else {
                spotImageResource = R.drawable.unavailablecarspot;
            }
        }

        // Set the image resource for the parking spot ImageView
        spotImageView.setImageResource(spotImageResource);

        // Update the parkspottext TextView
        //TextView parkspottext = findViewById(R.id.parkspottext);
        // Update the text based on the spot name
        //parkspottext.setText("Parking Spot Taken: " + getSpotName(spotImageView));
    }

    private void updateAvailableSpotUI(ImageView spotImageView, boolean isSelected) {
        int spotImageResource;

        // Get the spot name based on the ImageView's ID
        String spotName = getSpotName(spotImageView);

        if (isSelected) {
            // Spot is selected, use the selected icon/button
            if (spotImageView.getId() == R.id.A2 || spotImageView.getId() == R.id.B2 ||
                    spotImageView.getId() == R.id.C2 || spotImageView.getId() == R.id.D2 ||
                    spotImageView.getId() == R.id.E2 || spotImageView.getId() == R.id.F2 ||
                    spotImageView.getId() == R.id.G2 || spotImageView.getId() == R.id.H2) {
                spotImageResource = R.drawable.selectedcarspot2;
            } else {
                spotImageResource = R.drawable.selectedcarspot;
            }

            // Update the parkspottext TextView with the selected spot name
            TextView parkspottext = findViewById(R.id.parkspottext);
            parkspottext.setText("Parking Spot Taken: " + spotName);
        } else {
            // Spot is available, use the available icon/button
            if (spotImageView.getId() == R.id.A2 || spotImageView.getId() == R.id.B2 ||
                    spotImageView.getId() == R.id.C2 || spotImageView.getId() == R.id.D2 ||
                    spotImageView.getId() == R.id.E2 || spotImageView.getId() == R.id.F2 ||
                    spotImageView.getId() == R.id.G2 || spotImageView.getId() == R.id.H2) {
                spotImageResource = R.drawable.availablecarspot2;
            } else {
                spotImageResource = R.drawable.availablecarspot;
            }

            // Update the parkspottext TextView with the available status
            //TextView parkspottext = findViewById(R.id.parkspottext);
            //parkspottext.setText("Parking Spot Taken: Available");
        }

        // Set the image resource for the parking spot ImageView
        spotImageView.setImageResource(spotImageResource);
    }

    private String currentlySelectedSpotId = "";

    // Inside the toggleAvailableSpot method
    private void toggleAvailableSpot(ImageView imageView, boolean isSelected) {
        // Set the flag to true when the checkout button is clicked
        isCheckoutButtonClicked = true;
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        String spotName = getSpotName(imageView);
        DocumentReference spotRef = db.collection("parkingSpots").document("GLE");

        // Check if the spot is available before allowing selection
        if (!isSelected && !isSpotAvailable(imageView)) {
            // Spot is not available, show a message or handle it accordingly
            Toast.makeText(GLE_ParkSpot.this, "This parking spot is not available.", Toast.LENGTH_SHORT).show();
            return;
        }

        // If a spot is currently selected, unselect it
        if (!currentlySelectedSpotId.isEmpty()) {
            ImageView previousSelectedSpot = findViewById(getResources().getIdentifier(currentlySelectedSpotId, "id", getPackageName()));
            unselectSpot(previousSelectedSpot, true);
        }

        // Update the value based on the current selection state
        String updatedValue = isSelected ? "0" : "1";

        // Update the selected spot to the new value with a very short delay
        spotRef.update(spotName, updatedValue)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        // Update UI for the selected/unselected spot with a very short delay
                        Handler handler = new Handler();
                        handler.postDelayed(() -> {
                            runOnUiThread(() -> {
                                if (isSelected) {
                                    unselectSpot(imageView, true);
                                } else {
                                    updateAvailableSpotUI(imageView, true);
                                    currentlySelectedSpotId = getResources().getResourceEntryName(imageView.getId());
                                }
                            });
                        }, 100); // Adjust the delay duration as needed
                    } else {
                        // Handle the failure to update the spot value
                        // You may show a toast message or log the error
                        Toast.makeText(GLE_ParkSpot.this, "Failed to update parking spot information", Toast.LENGTH_SHORT).show();
                    }
                });


        // Reset the flag to false after performing the checkout button logic
        isCheckoutButtonClicked = false;

        // Revert to zero if selected logic
        revertToZeroIfSelected();
    }

    // Inside isSpotAvailable method
    private boolean isSpotAvailable(ImageView imageView) {
        // Logic to check if the spot is available based on the ImageView
        // You may want to compare the ImageView's ID and determine the availability
        // Example logic:
        int viewId = imageView.getId();
        if (viewId == R.id.A1 || viewId == R.id.B1 || viewId == R.id.C1 ||
                viewId == R.id.D1 || viewId == R.id.E1 || viewId == R.id.F1 ||
                viewId == R.id.G1 || viewId == R.id.H1) {
            return imageView.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.availablecarspot).getConstantState());
        } else if (viewId == R.id.A2 || viewId == R.id.B2 || viewId == R.id.C2 ||
                viewId == R.id.D2 || viewId == R.id.E2 || viewId == R.id.F2 ||
                viewId == R.id.G2 || viewId == R.id.H2) {
            return imageView.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.availablecarspot2).getConstantState());
        }
        // Add conditions for other spots as needed
        return false; // Default to false if the spot is not found
    }

    private void unselectSpot(ImageView spotImageView, boolean isSelected) {
        // Get the spot name based on the ImageView's ID
        String spotName = getSpotName(spotImageView);

        // Update the value to 0 (available)
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        DocumentReference spotRef = db.collection("parkingSpots").document("GLE");

        spotRef.update(spotName, "0")
                .addOnSuccessListener(aVoid -> {
                    // Update UI for available spot
                    updateSpotUI(spotImageView, "0");
                })
                .addOnFailureListener(e -> {
                    // Handle the failure to update the spot value
                    // You may show a toast message or log the error
                    Toast.makeText(GLE_ParkSpot.this, "Failed to update parking spot information", Toast.LENGTH_SHORT).show();
                });

        // Update the spot icon to availablecarspot
        int spotImageResource = isSelected ? R.drawable.selectedcarspot : R.drawable.availablecarspot;

        // For spots like A2, B2, C2, etc., use different icons
        if (spotImageView.getId() == R.id.A2 || spotImageView.getId() == R.id.B2 ||
                spotImageView.getId() == R.id.C2 || spotImageView.getId() == R.id.D2 ||
                spotImageView.getId() == R.id.E2 || spotImageView.getId() == R.id.F2 ||
                spotImageView.getId() == R.id.G2 || spotImageView.getId() == R.id.H2) {
            spotImageResource = isSelected ? R.drawable.selectedcarspot2 : R.drawable.availablecarspot2;
        }

        // Set the image resource for the parking spot ImageView
        spotImageView.setImageResource(spotImageResource);

        // Handle any additional UI changes if needed
        // ...

        // Update the parkspottext TextView
        //TextView parkspottext = findViewById(R.id.parkspottext);
        //parkspottext.setText("Parking Spot Taken: Available");
    }

    private void setupSpotClickListener(ImageView spotImageView) {
        spotImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSpotAvailable(spotImageView)) {
                    // Assuming the default state is unselected
                    boolean isSelected = false;
                    handleSpotClick(spotImageView, isSelected);
                }
            }
        });
    }

    private void handleSpotClick(ImageView spotImageView, boolean isSelected) {
        toggleAvailableSpot(spotImageView, isSelected);
    }

    // Helper method to get the parking spot name based on the ImageView's ID
    private String getSpotName(ImageView imageView) {
        String spotName = "";
        int viewId = imageView.getId();

        if (viewId == R.id.A1) {
            spotName = "A1";
        } else if (viewId == R.id.A2) {
            spotName = "A2";
        } else if (viewId == R.id.B1) {
            spotName = "B1";
        } else if (viewId == R.id.B2) {
            spotName = "B2";
        } else if (viewId == R.id.C1) {
            spotName = "C1";
        } else if (viewId == R.id.C2) {
            spotName = "C2";
        } else if (viewId == R.id.D1) {
            spotName = "D1";
        } else if (viewId == R.id.D2) {
            spotName = "D2";
        } else if (viewId == R.id.E1) {
            spotName = "E1";
        } else if (viewId == R.id.E2) {
            spotName = "E2";
        } else if (viewId == R.id.F1) {
            spotName = "F1";
        } else if (viewId == R.id.F2) {
            spotName = "F2";
        } else if (viewId == R.id.G1) {
            spotName = "G1";
        } else if (viewId == R.id.G2) {
            spotName = "G2";
        } else if (viewId == R.id.H1) {
            spotName = "H1";
        } else if (viewId == R.id.H2) {
            spotName = "H2";
        }

        return spotName;
    }

    public void onProfileButtonClick(View view) {
        Intent intent = new Intent(GLE_ParkSpot.this, Profile.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void navigateToGLEMap(View view) {
        Log.d("GLE_ParkSpot", "Navigating to GLE Parking Map");

        // Add a log to check if revertIfNecessary is called
        Log.d("GLE_ParkSpot", "Calling revertIfNecessary");
        revertIfNecessary();
        Intent intent = new Intent(GLE_ParkSpot.this, GLE_Parking_Map.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        // Add a log if revertIfNecessary was not called
        Log.d("GLE_ParkSpot", "revertIfNecessary was not called");
    }

    public void navigateToHome(View view) {
        Intent intent = new Intent(GLE_ParkSpot.this, Home.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void navigateToVehicleTimer1(View view) {
        // Create an Intent to go to the Car_Vehicle_Limit page
        Intent intent = new Intent(GLE_ParkSpot.this, Car_Vehicle_Limit.class);

        // Get the selected parking spot text (without the "Parking Spot Taken" prefix)
        TextView parkspottext = findViewById(R.id.parkspottext);
        String selectedSpotText = parkspottext.getText().toString();
        // Remove the "Parking Spot Taken: " prefix
        selectedSpotText = selectedSpotText.replace("Parking Spot Taken: ", "");

        // Add the selected parking spot text as an extra to the intent
        intent.putExtra("selectedSpotText", selectedSpotText);

        // Add information indicating that the user is coming from NGE_ParkSpot
        intent.putExtra("fromNGEParkSpot", true);

        // Start the Car_Vehicle_Limit page
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

}
package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main_ParkSpot extends AppCompatActivity {

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
    private boolean f3Selected = false;
    private boolean f4Selected = false;
    private boolean g3Selected = false;
    private boolean g4Selected = false;
    private boolean h3Selected = false;
    private boolean h4Selected = false;
    private boolean i3Selected = false;
    private boolean i4Selected = false;
    private boolean j3Selected = false;
    private boolean j4Selected = false;
    private boolean k5Selected = false;
    private boolean k6Selected = false;
    private boolean l5Selected = false;
    private boolean l6Selected = false;
    private boolean m5Selected = false;
    private boolean m6Selected = false;
    private boolean n5Selected = false;
    private boolean n6Selected = false;
    private boolean o5Selected = false;
    private boolean o6Selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_park_spot);

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
        ImageView f3ImageView = findViewById(R.id.F3);
        ImageView f4ImageView = findViewById(R.id.F4);
        ImageView g3ImageView = findViewById(R.id.G3);
        ImageView g4ImageView = findViewById(R.id.G4);
        ImageView h3ImageView = findViewById(R.id.H3);
        ImageView h4ImageView = findViewById(R.id.H4);
        ImageView i3ImageView = findViewById(R.id.I3);
        ImageView i4ImageView = findViewById(R.id.I4);
        ImageView j3ImageView = findViewById(R.id.J3);
        ImageView j4ImageView = findViewById(R.id.J4);
        ImageView k5ImageView = findViewById(R.id.K5);
        ImageView k6ImageView = findViewById(R.id.K6);
        ImageView l5ImageView = findViewById(R.id.L5);
        ImageView l6ImageView = findViewById(R.id.L6);
        ImageView m5ImageView = findViewById(R.id.M5);
        ImageView m6ImageView = findViewById(R.id.M6);
        ImageView n5ImageView = findViewById(R.id.N5);
        ImageView n6ImageView = findViewById(R.id.N6);
        ImageView o5ImageView = findViewById(R.id.O5);
        ImageView o6ImageView = findViewById(R.id.O6);

        // Set click listeners for the parking spot ImageView elements
        a1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(a1ImageView, a1Selected);
                a1Selected = !a1Selected;
            }
        });

        a2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(a2ImageView, a2Selected);
                a2Selected = !a2Selected;
            }
        });

        b1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(b1ImageView, b1Selected);
                b1Selected = !b1Selected;
            }
        });

        b2ImageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                toggleSpot(b2ImageView, b2Selected);
                b2Selected = !b2Selected;
            }
        });
        c1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(c1ImageView, c1Selected);
                c1Selected = !c1Selected;
            }
        });

        c2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(c2ImageView, c2Selected);
                c2Selected = !c2Selected;
            }
        });

        d1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(d1ImageView, d1Selected);
                d1Selected = !d1Selected;
            }
        });

        d2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(d2ImageView, d2Selected);
                d2Selected = !d2Selected;
            }
        });

        e1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(e1ImageView, e1Selected);
                e1Selected = !e1Selected;
            }
        });

        e2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(e2ImageView, e2Selected);
                e2Selected = !e2Selected;
            }
        });

        f3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(f3ImageView, f3Selected);
                f3Selected = !f3Selected;
            }
        });

        f4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(f4ImageView, f4Selected);
                f4Selected = !f4Selected;
            }
        });

        g3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(g3ImageView, g3Selected);
                g3Selected = !g3Selected;
            }
        });

        g4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(g4ImageView, g4Selected);
                g4Selected = !g4Selected;
            }
        });

        h3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(h3ImageView, h3Selected);
                h3Selected = !h3Selected;
            }
        });
        h4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(h4ImageView, h4Selected);
                h4Selected = !h4Selected;
            }
        });

        i3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(i3ImageView, i3Selected);
                i3Selected = !i3Selected;
            }
        });
        i4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(i4ImageView, i4Selected);
                i4Selected = !i4Selected;
            }
        });

        j3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(j3ImageView, j3Selected);
                j3Selected = !j3Selected;
            }
        });
        j4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(j4ImageView, j4Selected);
                j4Selected = !j4Selected;
            }
        });

        k5ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(k5ImageView, k5Selected);
                k5Selected = !k5Selected;
            }
        });
        k6ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(k6ImageView, k6Selected);
                k6Selected = !k6Selected;
            }
        });

        l5ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(l5ImageView, l5Selected);
                l5Selected = !l5Selected;
            }
        });
        l6ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(l6ImageView, l6Selected);
                l6Selected = !l6Selected;
            }
        });

        m5ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(m5ImageView, m5Selected);
                m5Selected = !m5Selected;
            }
        });
        m6ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(m6ImageView, m6Selected);
                m6Selected = !m6Selected;
            }
        });

        n5ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(n5ImageView, n5Selected);
                n5Selected = !n5Selected;
            }
        });
        n6ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(n6ImageView, n6Selected);
                n6Selected = !n6Selected;
            }
        });

        o5ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(o5ImageView, o5Selected);
                o5Selected = !o5Selected;
            }
        });
        o6ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(o6ImageView, o6Selected);
                o6Selected = !o6Selected;
            }
        });
    }

    private void toggleSpot(ImageView imageView, boolean isSelected) {
        String spotName = "";
        int spotImageResource;

        // Determine the image resource and spotName based on the parking spot's availability
        if (imageView.getId() == R.id.A2 || imageView.getId() == R.id.B2 || imageView.getId() == R.id.C2 || imageView.getId() == R.id.D2
                || imageView.getId() == R.id.E2 || imageView.getId() == R.id.F4 || imageView.getId() == R.id.G4 || imageView.getId() == R.id.H4
                || imageView.getId() == R.id.I4 || imageView.getId() == R.id.J4 || imageView.getId() == R.id.K6 || imageView.getId() == R.id.L6
                || imageView.getId() == R.id.M6 || imageView.getId() == R.id.N6 || imageView.getId() == R.id.O6) {
            if (isSelected) {
                // Spot is taken
                spotImageResource = R.drawable.selectedcarspot2;
                spotName = getSpotName(imageView);
            } else {
                // Spot is available
                spotImageResource = R.drawable.availablecarspot2;
                spotName = "-";
            }
        } else {
            if (isSelected) {
                // Spot is taken
                spotImageResource = R.drawable.selectedcarspot;
                spotName = getSpotName(imageView);
            } else {
                // Spot is available
                spotImageResource = R.drawable.availablecarspot;
                spotName = "-";
            }
        }

        // Set the image resource for the parking spot ImageView
        imageView.setImageResource(spotImageResource);

        // Update the parkspottext TextView
        TextView parkspottext = findViewById(R.id.parkspottext);
        parkspottext.setText("Parking Spot Taken: " + spotName);

        // Update the totalstandardtext TextView
        TextView totalStandardText = findViewById(R.id.totalstandardtext);
        if (isSelected) {
            totalStandardText.setText("Total Price: ₱5.00");
        } else {
            totalStandardText.setText("Total Price: ₱00");
        }
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
        } else if (viewId == R.id.F3) {
            spotName = "F3";
        } else if (viewId == R.id.F4) {
            spotName = "F4";
        } else if (viewId == R.id.G3) {
            spotName = "G3";
        } else if (viewId == R.id.G4) {
            spotName = "G4";
        } else if (viewId == R.id.H3) {
            spotName = "H3";
        } else if (viewId == R.id.H4) {
            spotName = "H4";
        } else if (viewId == R.id.I3) {
            spotName = "I3";
        } else if (viewId == R.id.I4) {
            spotName = "I4";
        } else if (viewId == R.id.J3) {
            spotName = "J3";
        } else if (viewId == R.id.J4) {
            spotName = "J4";
        } else if (viewId == R.id.K5) {
            spotName = "K5";
        } else if (viewId == R.id.K6) {
            spotName = "K6";
        } else if (viewId == R.id.L5) {
            spotName = "L5";
        } else if (viewId == R.id.L6) {
            spotName = "L6";
        } else if (viewId == R.id.M5) {
            spotName = "M5";
        } else if (viewId == R.id.M6) {
            spotName = "M6";
        } else if (viewId == R.id.N5) {
            spotName = "N5";
        } else if (viewId == R.id.N6) {
            spotName = "N6";
        } else if (viewId == R.id.O5) {
            spotName = "O5";
        } else if (viewId == R.id.O6) {
            spotName = "O6";
        }

        return spotName;
    }

    public void onProfileButtonClick(View view) {
        Intent intent = new Intent(Main_ParkSpot.this, Profile.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void navigateToGLEMap(View view) {
        Intent intent = new Intent(Main_ParkSpot.this, GLE_Parking_Map.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void navigateToHome(View view) {
        Intent intent = new Intent(Main_ParkSpot.this, Home.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
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
        intent.putExtra("fromMainParkSpot", true);

        // Start the Car_Vehicle_Limit page
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
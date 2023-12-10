package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Allied_ParkSpot extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allied_park_spot);

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
        ImageView i1ImageView = findViewById(R.id.I1);
        ImageView i2ImageView = findViewById(R.id.I2);
        ImageView j1ImageView = findViewById(R.id.J1);
        ImageView j2ImageView = findViewById(R.id.J2);
        ImageView k1ImageView = findViewById(R.id.K1);
        ImageView k2ImageView = findViewById(R.id.K2);
        ImageView l1ImageView = findViewById(R.id.L1);
        ImageView l2ImageView = findViewById(R.id.L2);
        ImageView m1ImageView = findViewById(R.id.M1);
        ImageView m2ImageView = findViewById(R.id.M2);
        ImageView n1ImageView = findViewById(R.id.N1);
        ImageView n2ImageView = findViewById(R.id.N2);
        ImageView o1ImageView = findViewById(R.id.O1);
        ImageView o2ImageView = findViewById(R.id.O2);
        ImageView p1ImageView = findViewById(R.id.P1);
        ImageView p2ImageView = findViewById(R.id.P2);
        ImageView q1ImageView = findViewById(R.id.Q1);
        ImageView q2ImageView = findViewById(R.id.Q2);
        ImageView r1ImageView = findViewById(R.id.R1);
        ImageView r2ImageView = findViewById(R.id.R2);

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

        f1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(f1ImageView, f1Selected);
                f1Selected = !f1Selected;
            }
        });

        f2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(f2ImageView, f2Selected);
                f2Selected = !f2Selected;
            }
        });

        g1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(g1ImageView, g1Selected);
                g1Selected = !g1Selected;
            }
        });

        g2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(g2ImageView, g2Selected);
                g2Selected = !g2Selected;
            }
        });

        h1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(h1ImageView, h1Selected);
                h1Selected = !h1Selected;
            }
        });
        h2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(h2ImageView, h2Selected);
                h2Selected = !h2Selected;
            }
        });
        i1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(i1ImageView, i1Selected);
                i1Selected = !i1Selected;
            }
        });
        i2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(i2ImageView, i2Selected);
                i2Selected = !i2Selected;
            }
        });
        j1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(j1ImageView, j1Selected);
                j1Selected = !j1Selected;
            }
        });
        j2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(j2ImageView, j2Selected);
                j2Selected = !j2Selected;
            }
        });
        k1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(k1ImageView, k1Selected);
                k1Selected = !k1Selected;
            }
        });
        k2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(k2ImageView, k2Selected);
                k2Selected = !k2Selected;
            }
        });
        l1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(l1ImageView, l1Selected);
                l1Selected = !l1Selected;
            }
        });
        l2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(l2ImageView, l2Selected);
                l2Selected = !l2Selected;
            }
        });
        m1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(m1ImageView, m1Selected);
                m1Selected = !m1Selected;
            }
        });
        m2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(m2ImageView, m2Selected);
                m2Selected = !m2Selected;
            }
        });
        n1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(n1ImageView, n1Selected);
                n1Selected = !n1Selected;
            }
        });
        n2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(n2ImageView, n2Selected);
                n2Selected = !n2Selected;
            }
        });

        o1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(o1ImageView, o1Selected);
                o1Selected = !o1Selected;
            }
        });
        o2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(o2ImageView, o2Selected);
                o2Selected = !o2Selected;
            }
        });

        p1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(p1ImageView, p1Selected);
                p1Selected = !p1Selected;
            }
        });
        p2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(p2ImageView, p2Selected);
                p2Selected = !p2Selected;
            }
        });

        q1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(q1ImageView, q1Selected);
                q1Selected = !q1Selected;
            }
        });
        q2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(q2ImageView, q2Selected);
                q2Selected = !q2Selected;
            }
        });
        r1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(r1ImageView, r1Selected);
                r1Selected = !r1Selected;
            }
        });
        r2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(r2ImageView, r2Selected);
                r2Selected = !r2Selected;
            }
        });
    }
    private void toggleSpot(ImageView imageView, boolean isSelected) {
        String spotName = "";
        int spotImageResource;

        // Determine the image resource and spotName based on the parking spot's availability
        if (imageView.getId() == R.id.A2 || imageView.getId() == R.id.B2 || imageView.getId() == R.id.C2 || imageView.getId() == R.id.D2
                || imageView.getId() == R.id.E2 || imageView.getId() == R.id.F2 || imageView.getId() == R.id.G2 || imageView.getId() == R.id.H2
                || imageView.getId() == R.id.I2 || imageView.getId() == R.id.J2 || imageView.getId() == R.id.K2 || imageView.getId() == R.id.L2
                || imageView.getId() == R.id.M2 || imageView.getId() == R.id.N2 || imageView.getId() == R.id.O2 || imageView.getId() == R.id.P2
                || imageView.getId() == R.id.Q2 || imageView.getId() == R.id.R2) {
            if (isSelected) {
                // Spot is taken
                spotImageResource = R.drawable.selectedmotor2;
                spotName = getSpotName(imageView);
            } else {
                // Spot is available
                spotImageResource = R.drawable.availablemotor2;
                spotName = "-";
            }
        } else {
            if (isSelected) {
                // Spot is taken
                spotImageResource = R.drawable.selectedmotor;
                spotName = getSpotName(imageView);
            } else {
                // Spot is available
                spotImageResource = R.drawable.availablemotor;
                spotName = "-";
            }
        }

        // Set the image resource for the parking spot ImageView
        imageView.setImageResource(spotImageResource);

        // Update the parkspottext TextView
        TextView parkspottext = findViewById(R.id.parkspottext);
        parkspottext.setText("Parking Spot Taken: " + spotName);
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
        } else if (viewId == R.id.I1) {
            spotName = "I1";
        } else if (viewId == R.id.I2) {
            spotName = "I2";
        } else if (viewId == R.id.J1) {
            spotName = "J1";
        } else if (viewId == R.id.J2) {
            spotName = "J2";
        } else if (viewId == R.id.K1) {
            spotName = "K1";
        } else if (viewId == R.id.K2) {
            spotName = "K2";
        } else if (viewId == R.id.L1) {
            spotName = "L1";
        } else if (viewId == R.id.L2) {
            spotName = "L2";
        } else if (viewId == R.id.M1) {
            spotName = "M1";
        } else if (viewId == R.id.M2) {
            spotName = "M2";
        } else if (viewId == R.id.N1) {
            spotName = "N1";
        } else if (viewId == R.id.N2) {
            spotName = "N2";
        } else if (viewId == R.id.O1) {
            spotName = "O1";
        } else if (viewId == R.id.O2) {
            spotName = "O2";
        } else if (viewId == R.id.P1) {
            spotName = "P1";
        } else if (viewId == R.id.P2) {
            spotName = "P2";
        } else if (viewId == R.id.Q1) {
            spotName = "Q1";
        } else if (viewId == R.id.Q2) {
            spotName = "Q2";
        } else if (viewId == R.id.R1) {
            spotName = "R1";
        } else if (viewId == R.id.R2) {
            spotName = "R2";
        }

        return spotName;
    }

    public void onProfileButtonClick(View view) {
        Intent intent = new Intent(Allied_ParkSpot.this, Profile.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void navigateToAlliedMap(View view) {
        Intent intent = new Intent(Allied_ParkSpot.this, Allied_ParkingMap.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void navigateToHome(View view) {
        Intent intent = new Intent(Allied_ParkSpot.this, Home.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void navigateToVehicleTimer1(View view) {
        // Create an Intent to go to the Car_Vehicle_Limit page
        Intent intent = new Intent(Allied_ParkSpot.this, Motor_Vehicle_Limit.class);

        // Get the selected parking spot text (without the "Parking Spot Taken" prefix)
        TextView parkspottext = findViewById(R.id.parkspottext);
        String selectedSpotText = parkspottext.getText().toString();
        // Remove the "Parking Spot Taken: " prefix
        selectedSpotText = selectedSpotText.replace("Parking Spot Taken: ", "");

        // Add the selected parking spot text as an extra to the intent
        intent.putExtra("selectedSpotText", selectedSpotText);

        // Add information indicating that the user is coming from NGE_ParkSpot
        intent.putExtra("fromAlliedParkSpot", true);

        // Start the Car_Vehicle_Limit page
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

}
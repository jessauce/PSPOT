package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RTL_ParkSpot extends AppCompatActivity {
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
    private boolean h3Selected = false;
    private boolean h4Selected = false;
    private boolean i3Selected = false;
    private boolean i4Selected = false;
    private boolean j3Selected = false;
    private boolean j4Selected = false;
    private boolean k3Selected = false;
    private boolean k4Selected = false;
    private boolean l3Selected = false;
    private boolean l4Selected = false;
    private boolean m3Selected = false;
    private boolean m4Selected = false;
    private boolean n3Selected = false;
    private boolean n4Selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtl_park_spot);

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
        ImageView h3ImageView = findViewById(R.id.H3);
        ImageView h4ImageView = findViewById(R.id.H4);
        ImageView i3ImageView = findViewById(R.id.I3);
        ImageView i4ImageView = findViewById(R.id.I4);
        ImageView j3ImageView = findViewById(R.id.J3);
        ImageView j4ImageView = findViewById(R.id.J4);
        ImageView k3ImageView = findViewById(R.id.K3);
        ImageView k4ImageView = findViewById(R.id.K4);
        ImageView l3ImageView = findViewById(R.id.L3);
        ImageView l4ImageView = findViewById(R.id.L4);
        ImageView m3ImageView = findViewById(R.id.M3);
        ImageView m4ImageView = findViewById(R.id.M4);
        ImageView n3ImageView = findViewById(R.id.N3);
        ImageView n4ImageView = findViewById(R.id.N4);

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
        k3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(k3ImageView, k3Selected);
                k3Selected = !k3Selected;
            }
        });
        k4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(k4ImageView, k4Selected);
                k4Selected = !k4Selected;
            }
        });

        l3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(l3ImageView, l3Selected);
                l3Selected = !l3Selected;
            }
        });
        l4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(l4ImageView, l4Selected);
                l4Selected = !l4Selected;
            }
        });

        m3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(m3ImageView, m3Selected);
                m3Selected = !m3Selected;
            }
        });
        m4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(m4ImageView, m4Selected);
                m4Selected = !m4Selected;
            }
        });
        n3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(n3ImageView, n3Selected);
                n3Selected = !n3Selected;
            }
        });
        n4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSpot(n4ImageView, n4Selected);
                n4Selected = !n4Selected;
            }
        });
    }

    private void toggleSpot(ImageView imageView, boolean isSelected) {
        String spotName = "";
        int spotImageResource;

        // Determine the image resource and spotName based on the parking spot's availability
        if (imageView.getId() == R.id.A2 || imageView.getId() == R.id.B2 || imageView.getId() == R.id.C2 || imageView.getId() == R.id.D2
                || imageView.getId() == R.id.E2 || imageView.getId() == R.id.F2 || imageView.getId() == R.id.G2 || imageView.getId() == R.id.H4
                || imageView.getId() == R.id.I4 || imageView.getId() == R.id.J4 || imageView.getId() == R.id.K4
                || imageView.getId() == R.id.L4 || imageView.getId() == R.id.M4 || imageView.getId() == R.id.N4) {
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
            totalStandardText.setText("Total Price: ₱10.00");
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
        } else if (viewId == R.id.F1) {
            spotName = "F1";
        } else if (viewId == R.id.F2) {
            spotName = "F2";
        } else if (viewId == R.id.G1) {
            spotName = "G1";
        } else if (viewId == R.id.G2) {
            spotName = "G2";
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
        } else if (viewId == R.id.K3) {
            spotName = "K3";
        } else if (viewId == R.id.K4) {
            spotName = "K4";
        } else if (viewId == R.id.L3) {
            spotName = "L3";
        } else if (viewId == R.id.L4) {
            spotName = "L4";
        } else if (viewId == R.id.M3) {
            spotName = "M3";
        } else if (viewId == R.id.M4) {
            spotName = "M4";
        } else if (viewId == R.id.N3) {
            spotName = "N3";
        } else if (viewId == R.id.N4) {
            spotName = "N4";
        }

        return spotName;
    }

    public void onProfileButtonClick(View view) {
        Intent intent = new Intent(RTL_ParkSpot.this, Profile.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void navigateToRTLMap(View view) {
        Intent intent = new Intent(RTL_ParkSpot.this, RTL_ParkingMap.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void navigateToHome(View view) {
        Intent intent = new Intent(RTL_ParkSpot.this, Home.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    public void navigateToVehicleTimer1(View view) {
        // Create an Intent to go to the Car_Vehicle_Limit page
        Intent intent = new Intent(RTL_ParkSpot.this, Car_Vehicle_Limit.class);

        // Get the selected parking spot text (without the "Parking Spot Taken" prefix)
        TextView parkspottext = findViewById(R.id.parkspottext);
        String selectedSpotText = parkspottext.getText().toString();
        // Remove the "Parking Spot Taken: " prefix
        selectedSpotText = selectedSpotText.replace("Parking Spot Taken: ", "");

        // Add the selected parking spot text as an extra to the intent
        intent.putExtra("selectedSpotText", selectedSpotText);
        intent.putExtra("fromRTLParkSpot", true);

        // Start the Car_Vehicle_Limit page
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
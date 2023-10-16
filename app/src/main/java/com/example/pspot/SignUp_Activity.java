package com.example.pspot;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.regex.Pattern;

import java.util.Map;
import java.util.HashMap;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;

public class SignUp_Activity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseFirestore db;

    private EditText phoneEditText;


    private boolean isHintDisplayed = true;
    private boolean isUpdating = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mAuth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();

        Button SignUpbutton = findViewById(R.id.btnSignUp);
        TextView textView = findViewById(R.id.txtSignIn);
        EditText nameEditText = findViewById(R.id.SignUpName);
        EditText emailEditText = findViewById(R.id.SignUpEmail);
        phoneEditText = findViewById(R.id.SignUpPhone);
        EditText passwordEditText = findViewById(R.id.SignUpPassword);
        EditText confirmPasswordEditText = findViewById(R.id.SignUpConfirmPassword);


        String text = "Already have an account? Sign in here!";
        SpannableString ss = new SpannableString(text);
        UnderlineSpan underlineSpan = new UnderlineSpan();
        ss.setSpan(underlineSpan, 25, 38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);


        // Set "+63" to the phoneEditText when clicked
        phoneEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!phoneEditText.getText().toString().startsWith("+63")) {
                    phoneEditText.setText("+63");
                }
            }
        });

        // Lock "+63" to the left of newly typed numbers
        phoneEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus && !phoneEditText.getText().toString().startsWith("+63")) {
                    phoneEditText.setText("+63" + phoneEditText.getText().toString());
                }
            }
        });

        SignUpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String phone = phoneEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String confirmPassword = confirmPasswordEditText.getText().toString();

                if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    // Display a toast message if any of the fields are empty
                    Toast.makeText(SignUp_Activity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else if (!isValidEmail(email)) {
                    // Display a toast message if the email format is incorrect
                    Toast.makeText(SignUp_Activity.this, "Email is invalid. Use institutional email.", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(confirmPassword)) {
                    // Display a toast message if passwords don't match
                    Toast.makeText(SignUp_Activity.this, "Passwords do not match. Please re-enter them.", Toast.LENGTH_SHORT).show();
                }else {
                    // Check if the user already exists
                    checkUserExists(email, password, name, phone);
                }
            }
        });

        // Set up the initial visibility for the "+63" prefix and hint text
        phoneEditText.setText("");
        phoneEditText.setHint("Phone Number");
        isHintDisplayed = true;


        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUp_Activity.this, Login_Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });
    }

    // Email validation using regular expression
    private boolean isValidEmail(String email) {
        String emailPattern = "^[A-Za-z0-9+_.-]+@cit\\.edu$";
        return Pattern.compile(emailPattern).matcher(email).matches();
    }

    // Check if the user already exists
    private void checkUserExists(String email, String password, String name, String phone) {
        db.collection("userData")
                .whereEqualTo("email", email)
                .get()
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        if (!task.getResult().isEmpty()) {
                            // User with this email already exists
                            Toast.makeText(SignUp_Activity.this, "User with this email already exists. Please use another email.", Toast.LENGTH_SHORT).show();
                        } else {
                            // User doesn't exist, create a new account
                            createNewAccount(email, password, name, phone);
                        }
                    } else {
                        Toast.makeText(SignUp_Activity.this, "Error checking user existence. Try again.", Toast.LENGTH_SHORT).show();
                    }
                });
    }


    // Create a new user account with Firebase Authentication
    private void createNewAccount(String email, String password, String name, String phone) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(SignUp_Activity.this, task -> {
                    if (task.isSuccessful()) {
                        FirebaseUser user = mAuth.getCurrentUser();
                        if (user != null) {
                            // Save user information to Firestore
                            saveUserInfoToFirestore(user.getUid(), name, email, phone, password);
                        }
                    } else {
                        Toast.makeText(SignUp_Activity.this, "Signup failed. Try again.", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void saveUserInfoToFirestore(String userId, String name, String email, String phone, String password) {
        DocumentReference userRef = db.collection("userData").document(userId);

        Map<String, Object> user = new HashMap<>();
        user.put("name", name);
        user.put("email", email);
        user.put("phone", phone);
        user.put("password", password);

        userRef.set(user)
                .addOnSuccessListener(aVoid -> {
                    Toast.makeText(SignUp_Activity.this, "Signup successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(SignUp_Activity.this, Vehicle_Info.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                })
                .addOnFailureListener(e -> {
                    Toast.makeText(SignUp_Activity.this, "Error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                });
    }




}

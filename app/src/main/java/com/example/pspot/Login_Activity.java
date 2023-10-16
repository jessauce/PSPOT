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

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.regex.Pattern;

public class Login_Activity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db = FirebaseFirestore.getInstance();
        mAuth = FirebaseAuth.getInstance();

        Button SignInbutton = findViewById(R.id.btnSignIn);
        TextView textView = findViewById(R.id.txtSignUp);
        EditText emailEditText = findViewById(R.id.edtSignInEmail);
        EditText passwordEditText = findViewById(R.id.edtSignInPassword);

        String text = "Don't have an account? Sign up here!";
        SpannableString ss = new SpannableString(text);
        UnderlineSpan underlineSpan = new UnderlineSpan();
        ss.setSpan(underlineSpan, 23, 36, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);




        SignInbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (email.isEmpty() || password.isEmpty()) {
                    // Display a toast message if either email or password is empty
                    Toast.makeText(Login_Activity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else if (!isValidEmail(email)) {
                    // Display a toast message if the email format is incorrect
                    Toast.makeText(Login_Activity.this, "Email is invalid. Use institutional email.", Toast.LENGTH_SHORT).show();
                } else {
                    // Proceed to sign in if fields are not empty and email format is correct
                    // Implement your sign-in logic here
                    // For example, you can use Firebase authentication to sign in the user
                    // Replace the following lines with your Firebase authentication code
                    mAuth.signInWithEmailAndPassword(email, password)
                            .addOnCompleteListener(Login_Activity.this, task -> {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    Intent intent = new Intent(Login_Activity.this, Home.class);
                                    startActivity(intent);
                                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(Login_Activity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            });

                }
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login_Activity.this, SignUp_Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });
    }

    // Email validation using regular expression
    private boolean isValidEmail(String email) {
        String emailPattern = "^[A-Za-z0-9+_.-]+@cit\\.edu$";
        return Pattern.compile(emailPattern).matcher(email).matches();
    }
}

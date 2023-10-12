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

public class SignUp_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button SignUpbutton = findViewById(R.id.btnSignUp);
        TextView textView = findViewById(R.id.txtSignIn);
        EditText nameEditText = findViewById(R.id.SignUpName);
        EditText emailEditText = findViewById(R.id.SignUpEmail);
        EditText phoneEditText = findViewById(R.id.SignUpPhone);
        EditText passwordEditText = findViewById(R.id.SignUpPassword);
        EditText confirmPasswordEditText = findViewById(R.id.SignUpConfirmPassword);

        String text = "Already have an account? Sign in here!";
        SpannableString ss = new SpannableString(text);
        UnderlineSpan underlineSpan = new UnderlineSpan();
        ss.setSpan(underlineSpan, 25, 38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);

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
                } else {
                    // Proceed to sign up if all fields are not empty and email format is correct
                    Intent intent = new Intent(SignUp_Activity.this, Vehicle_Info.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                }
            }
        });

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
}

package com.example.sturoid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signUpActivity extends AppCompatActivity {
    EditText fistName, lastName, emailR, passwordR, rpasswordR;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        fistName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        emailR = findViewById(R.id.emailU);
        passwordR = findViewById(R.id.passwordU);
        rpasswordR = findViewById(R.id.rpass);
        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(signUpActivity.this, MainActivity.class));
            }
        });
    }
}
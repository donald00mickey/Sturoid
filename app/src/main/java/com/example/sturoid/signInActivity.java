package com.example.sturoid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class signInActivity extends AppCompatActivity {
    ImageView iM1, iM2, iM3, iM4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        iM1 = findViewById(R.id.imageView1);
        iM2 = findViewById(R.id.imageView2);
        iM3 = findViewById(R.id.imageView3);
        iM4 = findViewById(R.id.imageView4);

        iM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(signInActivity.this, "SYLLABUS", Toast.LENGTH_SHORT).show();
            }
        });
        iM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(signInActivity.this, "MCQ", Toast.LENGTH_SHORT).show();
            }
        });
        iM3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(signInActivity.this, "QNA", Toast.LENGTH_SHORT).show();
            }
        });
        iM4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(signInActivity.this, "FIELD", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
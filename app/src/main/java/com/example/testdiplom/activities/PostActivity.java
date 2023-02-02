package com.example.testdiplom.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testdiplom.R;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);
        Button profile = findViewById(R.id.profile);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openProfileActivity();
            }
        });
        }
    public void openProfileActivity() {
        Intent intent = new Intent(this, com.example.testdiplom.profile.class);
        startActivity(intent);
    }
}
package com.example.testdiplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button ButtonVoiti;
    private Button ButtonCreateAcc;
    private Button ButtonVoitiFromAut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonVoiti = (Button) findViewById(R.id.ButtonVoiti);
        ButtonVoiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSingUpActivity();
            }
        });
        }
    public void openSingUpActivity() {
        Intent intent = new Intent(this, SingUpActivity.class);
        startActivity(intent);
    }
}
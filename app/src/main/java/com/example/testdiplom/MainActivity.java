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
        ButtonCreateAcc = (Button) findViewById(R.id.ButtonCreateAcc);
        ButtonVoiti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSingUpActivity();
            }
        });
        ButtonCreateAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSingUpActivity2();
            }
        });
        }
    public void openSingUpActivity2() {
        Intent intent = new Intent(this, activity_create_acc.class);
        startActivity(intent);
    }
    public void openSingUpActivity() {
        Intent intent = new Intent(this, SingUpActivity.class);
        startActivity(intent);
    }
}
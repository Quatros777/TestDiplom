package com.example.testdiplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_create_acc extends AppCompatActivity {
    private Button ButtonBack;
    private Button ButtonVoitiFromAut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acc);
        ButtonBack = (Button) findViewById(R.id.ButtonBack);
        ButtonVoitiFromAut = (Button) findViewById(R.id.ButtonVoitiFromAut);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Обрабатываем нажатие кнопки "Назад"
                onBackPressed();
            }
        });
        ButtonVoitiFromAut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openProfileActivity();
            }
        });
    }
    public void openProfileActivity() {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
}

package com.example.testdiplom.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testdiplom.R;

public class BackButton extends AppCompatActivity {
    private Button ButtonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButtonBack = (Button) findViewById(R.id.ButtonBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Обрабатываем нажатие кнопки "Назад"
                onBackPressed();
            }
        });
    }
}

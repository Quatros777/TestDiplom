package com.example.testdiplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingUpActivity extends AppCompatActivity {
    private Button ButtonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        ButtonBack = (Button) findViewById(R.id.ButtonBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Обрабатываем нажатие кнопки "Назад"
                try {
                    Intent intent = new Intent(SingUpActivity.this, MainActivity.class );
                    startActivity(intent);
                }catch (Exception e){

            }
        }
    });
    }
}
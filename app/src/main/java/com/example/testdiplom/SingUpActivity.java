package com.example.testdiplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.CallableStatement;

public class SingUpActivity extends AppCompatActivity {
    //Конект к бд
    private static connectionDB con=new connectionDB();

    //Назначение кнопок
    Button ButtonVoitiFromAut;
    EditText emailFromVoiti, pswrdFromVoiti;
    private Button ButtonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        //Определение кнопок
        ButtonVoitiFromAut=findViewById(R.id.ButtonVoitiFromAut);
        emailFromVoiti=findViewById(R.id.emailFromVoiti);
        pswrdFromVoiti=findViewById(R.id.pswrdFromVoiti);
        ButtonBack = (Button) findViewById(R.id.ButtonBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Обрабатываем нажатие кнопки "Назад"
                onBackPressed();
        }
    });
    }

    //Создание фунцкий или сессии (не совсем понял :))
    public void Session(String user_email, String user_password){
        try{
            String UserInfoCall="{CALL users(?,?,?,?,?,?,?,?,?)}";
//            CallableStatement cStmt=con.connexion()
        }catch (Exception e){

        }
    }
}
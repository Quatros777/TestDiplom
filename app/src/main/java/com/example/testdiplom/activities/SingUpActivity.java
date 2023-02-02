package com.example.testdiplom.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.testdiplom.R;
import com.example.testdiplom.connectionDB;
import com.example.testdiplom.requests.AuthenticationRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SingUpActivity extends AppCompatActivity {
    //Конект к бд
    private static connectionDB con=new connectionDB();

    //Назначение кнопок
    Button signUpButton;
    EditText emailFromVoiti, pswrdFromVoiti;
    private Button ButtonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Определение кнопок
        signUpButton =findViewById(R.id.signUpButton);
        emailFromVoiti=findViewById(R.id.login_email_editable_text);
        pswrdFromVoiti=findViewById(R.id.login_password_editable_text);
        ButtonBack = (Button) findViewById(R.id.ButtonBack);
        ButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Обрабатываем нажатие кнопки "Назад"
                onBackPressed();
            }
        });
        signUpButton.setOnClickListener(new View.OnClickListener() {

            ObjectMapper objectMapper = new ObjectMapper();

            @Override
            public void onClick(View view) {
                Flowable.just(new AuthenticationRequest(emailFromVoiti.getText().toString(), pswrdFromVoiti.getText().toString()))
                        .subscribeOn(Schedulers.newThread()).subscribe(item ->{
                            try {
                                Request request = new Request.Builder()
                                        .post(RequestBody.create(
                                                        MediaType.parse("application/json"),
                                                        objectMapper.writeValueAsString(item)
                                                )
                                        ).url("http://10.0.2.2:8080/api/auth/login")
                                        .build();
                                Response response = new OkHttpClient().newCall(request).execute();
                                if(response.code() == 401) throw new RuntimeException("Неправильный логин или пароль");
                                String responseString = response.body().string();
                                new AlertDialog.Builder(getApplicationContext()).setTitle("Success").setMessage(responseString);
                            } catch (Exception e) {
                                Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                            }

                        } );
            }
        });

    }

}

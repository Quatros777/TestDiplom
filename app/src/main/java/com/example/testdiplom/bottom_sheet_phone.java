package com.example.testdiplom;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class bottom_sheet_phone extends AppCompatActivity {
    TextView phoneInBottom;
    Button ButtonCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_sheet_phone);

        phoneInBottom = findViewById(R.id.phoneInBottom);
        ButtonCall = findViewById(R.id.ButtonCall);

        ButtonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = phoneInBottom.getText().toString();
//                if (phone.isEmpty()) {
//                    Toast.makeText(getApplicationContext(), "Номер некорректен",
//                    Toast.LENGTH_SHORT).show();
//                } else {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    String call = "tel:" + phone;
                    intent.setData(Uri.parse(call));
                    startActivity(intent);
                }
        });
    }
}
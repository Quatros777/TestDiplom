package com.example.testdiplom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
public class more_post extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_post);
        Button showPhone = findViewById(R.id.showPhone);
        Button exitPost = findViewById(R.id.exitPost);
        showPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog BottomSheetPhone = new BottomSheetDialog(
                        more_post.this, R.style.BottomSheetDialogTheme
                );
                View BottomSheetView2 = LayoutInflater.from(getApplicationContext())
                        .inflate(
                                R.layout.bottom_sheet_phone,
                                (LinearLayout)findViewById(R.id.bottomSheetContainerPhone)
                        );
                BottomSheetPhone.setContentView(BottomSheetView2);
                BottomSheetPhone.show();
            }
        });
        exitPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Открывает прошлую активити
                onBackPressed();
            }
        });
    }
}
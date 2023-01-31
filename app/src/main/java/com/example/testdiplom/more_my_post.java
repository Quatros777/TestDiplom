package com.example.testdiplom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class more_my_post extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_my_post);
        Button editMyPost = findViewById(R.id.editMyPost);
        Button deleteMyPost = findViewById(R.id.deleteMyPost);
        Button exitPost = findViewById(R.id.exitPost);

        exitPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Открывает прошлую активити
                onBackPressed();
            }
        });
        deleteMyPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog BottomSheetDeletePost = new BottomSheetDialog(
                        more_my_post.this, R.style.BottomSheetDialogTheme
                );
                View BottomSheetView3 = LayoutInflater.from(getApplicationContext())
                        .inflate(
                                R.layout.bottom_sheet_delete_post,
                                (LinearLayout)findViewById(R.id.bottomSheetContainerDeletePost)
                        );
                BottomSheetDeletePost.setContentView(BottomSheetView3);
                BottomSheetDeletePost.show();
            }
        });
    }
}
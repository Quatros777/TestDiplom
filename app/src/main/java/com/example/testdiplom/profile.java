package com.example.testdiplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button myObjects = findViewById(R.id.myobjects);
        Button buttonMore = findViewById(R.id.moreinfo);
        Button postPersonal = findViewById(R.id.mypost);
        Button postsBottom = findViewById(R.id.posts);
        Button mapBottom = findViewById(R.id.map);
        buttonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(
                        profile.this, R.style.BottomSheetDialogTheme
                );
                View bottomSheetView = LayoutInflater.from(getApplicationContext())
                                .inflate(
                                        R.layout.bottom_sheet,
                                        (LinearLayout)findViewById(R.id.bottomSheetContainer)
                                );
                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
            }
        });
        postPersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPostPersonalActivity();
            }
        });
        myObjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyPostEditActivity();
            }
        });
        postsBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {openAllPostsActivity();
                }
        });
    }
    public void openPostPersonalActivity() {
        Intent intent = new Intent(this, more_post.class);
        startActivity(intent);
    }
    public void openMyPostEditActivity() {
        Intent intent = new Intent(this, more_my_post.class);
        startActivity(intent);
    }
    public void openAllPostsActivity() {
        Intent intent = new Intent(this, activity_posts.class);
        startActivity(intent);
    }
}

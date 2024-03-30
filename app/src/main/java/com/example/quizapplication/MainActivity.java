package com.example.quizapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlayButtonClick(View view) {
        startActivity(new Intent(MainActivity.this, PlayActivity.class));
    }

    public void onSettingButtonClick(View view) {
        startActivity(new Intent(MainActivity.this, SettingActivity.class));
    }

    public void onExitButtonClick(View view) {
        finishAffinity();
    }
}

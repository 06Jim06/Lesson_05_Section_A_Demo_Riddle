package com.example.demo_riddle;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.demo_riddle.databinding.ActivityAnswer2Binding;

public class AnswerActivity2 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityAnswer2Binding binding;

    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        answer = findViewById(R.id.tvReveal);
        Intent intentReceived = getIntent();
        String Qselected = intentReceived.getStringExtra("Question");
        answer.setText(Qselected+ " answeis: Gone");

    }


}
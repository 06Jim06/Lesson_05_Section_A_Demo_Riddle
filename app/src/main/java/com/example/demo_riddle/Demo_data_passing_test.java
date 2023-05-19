package com.example.demo_riddle;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.demo_riddle.databinding.ActivityDemoDataPassingTestBinding;

public class Demo_data_passing_test extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityDemoDataPassingTestBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_data_passing_test);



    }


}
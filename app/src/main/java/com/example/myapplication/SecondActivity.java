package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        // Retrieve data from the Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra(Constants.USER_NAME_KEY);
        String age = intent.getStringExtra(Constants.USER_AGE_KEY);
        String email = intent.getStringExtra(Constants.USER_EMAIL_KEY);

        // Create a new fragment instance and pass data via Bundle
        FirstFragment fragment = new FirstFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.USER_NAME_KEY, name);
        bundle.putString(Constants.USER_AGE_KEY, age);
        bundle.putString(Constants.USER_EMAIL_KEY, email);
        fragment.setArguments(bundle);

        // Replace the fragment in the FragmentContainerView
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .commit();
    }
}


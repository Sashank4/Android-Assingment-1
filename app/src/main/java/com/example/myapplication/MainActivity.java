package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText enterName;
    private TextInputEditText enterAge;
    private TextInputEditText enterEmail;
    private Button addButton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterName = findViewById(R.id.editName);
        enterAge = findViewById(R.id.editAge);
        enterEmail = findViewById(R.id.editEmail);
        addButton = findViewById(R.id.addButton);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = enterName.getText().toString();
                String age = enterAge.getText().toString();
                String email = enterEmail.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(Constants.USER_NAME_KEY,name);
                intent.putExtra(Constants.USER_AGE_KEY, age);
                intent.putExtra(Constants.USER_EMAIL_KEY,email);
                startActivity(intent);

            }
        });


    }
}
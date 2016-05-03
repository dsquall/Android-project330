package com.example.jon.movieapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
        final EditText etUsername=(EditText) findViewById(R.id.etUsername);
        final TextView welcomeMessage=(TextView) findViewById(R.id.tvWelcomeMsg);

        Intent intent=getIntent();
        String username=intent.getStringExtra("username");

        String message=username+" welcome to your homepage!";
        welcomeMessage.setText(message);
    }
}

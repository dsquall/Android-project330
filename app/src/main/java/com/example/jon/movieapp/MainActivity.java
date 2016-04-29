package com.example.jon.movieapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost hostTab = getTabHost();
        TabHost.TabSpec spec;
        Intent content;

        spec = tabHost.newTabSpec("Showtimes");
        spec.setIndicator("Showtimes");
        content= new Intent(this, MainActivity.class);
        spec.setContent(content);
        tabHost.addTab(spec);


        spec = tabHost.newTabSpec("myMovies");
        spec.setIndicator("myMovies");
        content= new Intent(this, MainActivity.class);
        spec.setContent(content);
        tabHost.addTab(spec);


        spec = tabHost.newTabSpec("Chat");
        spec.setIndicator("Chat");
        content= new Intent(this, MainActivity.class);
        spec.setContent(content);
        tabHost.addTab(spec);

    }
}

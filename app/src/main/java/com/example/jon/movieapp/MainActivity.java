package com.example.jon.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    TabHost tabHost;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        TabHost.TabSpec spec = host.newTabSpec("Showtimes");
        spec.setContent(R.id.Showtime);
        spec.setIndicator("Showtimes");
        host.addTab(spec);

        spec = host.newTabSpec("myMovies");
        spec.setContent(R.id.myMovies);
        spec.setIndicator("myMovies");
        host.addTab(spec);


        spec = host.newTabSpec("Chat");
        spec.setContent(R.id.Chat);
        spec.setIndicator("Chat");
        host.addTab(spec);
    }
}

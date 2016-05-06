package com.example.jon.movieapp;


import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        TabHost host = (TabHost) findViewById(R.id.tabHost);
        assert host != null;
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


        host.setOnTabChangedListener(new TabHost.OnTabChangeListener() {

            @Override
            public void onTabChanged(String tabs) {
                MediaPlayer mp = MediaPlayer.create(UserAreaActivity.this, R.raw.inside);
                mp.start();
            }
            });
}   }
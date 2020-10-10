package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    MediaPlayer splash_music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Initialize the music
        splash_music = new MediaPlayer();
        splash_music = MediaPlayer.create(this,R.raw.sound);
        setContentView(R.layout.activity_splash);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(Splash.this, FoodRecipeListActivity.class));
                splash_music.pause();

            }
        };
        Timer opening = new Timer();
        splash_music.start();
        opening.schedule(task,5000);

    }
}
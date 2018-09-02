package com.example.basedul.webviewshowinclass;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.ImageView;

import java.util.Dictionary;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button buttonPlaySong, buttonWebBrowser, buttonSearchEngine;
    DigitalClock digitalClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        buttonPlaySong = (Button) findViewById(R.id.buttonPlaySong);
        buttonWebBrowser = (Button) findViewById(R.id.buttonWebBrowser);
        buttonSearchEngine = (Button) findViewById(R.id.buttonSearchEngine);
        digitalClock = (DigitalClock) findViewById(R.id.editTextClock);

        final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bede);
        mediaPlayer.start();
        buttonPlaySong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mediaPlayer.isPlaying()==true){
                    mediaPlayer.pause();
                }else{
                    mediaPlayer.start();
                }
            }
        });

        buttonWebBrowser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebViewShow.class);
                startActivity(intent);
            }
        });

        buttonSearchEngine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SearchEngine.class);
                startActivity(intent);
            }
        });
    }
}

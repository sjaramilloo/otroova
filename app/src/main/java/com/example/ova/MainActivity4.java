package com.example.ova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity4 extends AppCompatActivity {
    VideoView videoView;
    Button btnpvs;
    Button btnnxt;
    Button btnmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        videoView = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=3ZUlE_tvfaM&list=PLCTD_CpMeEKRL2-HaZThebGcyyR3_RshO&ab_channel=ProgramadorNovato");
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

        btnpvs = findViewById(R.id.pvs);
        btnpvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnnxt = findViewById(R.id.nxt);
        btnnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
                startActivity(intent);
            }
        });
        btnmenu = findViewById(R.id.menu);
        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
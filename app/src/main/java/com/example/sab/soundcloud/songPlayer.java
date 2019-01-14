package com.example.sab.soundcloud;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class songPlayer extends AppCompatActivity {
    MediaPlayer player;
    Button btn_player;
    Button btn_pauser;
    Button btn_stopper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_player);


        Intent i=getIntent();
//        final String path=i.getStringArrayExtra("src").toString();
        btn_player=findViewById(R.id.btn_play);
        btn_pauser = (Button) findViewById(R.id.btn_pause);
        btn_stopper = (Button) findViewById(R.id.btn_stop);

        btn_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player == null) {
                    player = MediaPlayer.create(getApplicationContext(),R.raw.song);
                    Log.d("play", "player ");
                    player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                            if (player!=null){
                                player.release();
                                player=null;
                            }
                        }
                    });
                    player.start();
                }
                btn_pauser.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (player != null) {
                            player.pause();
                        }
                    }
                });
                btn_stopper.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (player != null) {
                            player.release();
                            player = null;
                        }
                    }
                });
            }
        });

    }
    public void play(){
        if (player==null){
            player=MediaPlayer.create(this,R.raw.song);
            Log.d("play", "playerrr");
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    StopPlayer();
                }
            });
        }
        player.start();
    }
    public void pause(View v){
        if (player!=null){
            player.pause();
        }
    }
    public void stop(View v){
        if (player!=null){
            StopPlayer();
        }
    }
    private void StopPlayer(){
        if (player!=null){
            player.release();
            player=null;
        }
    }
    public void onStop(){
        super.onStop();
        StopPlayer();
    }
}




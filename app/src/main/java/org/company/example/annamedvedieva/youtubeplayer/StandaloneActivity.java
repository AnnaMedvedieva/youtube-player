package org.company.example.annamedvedieva.youtubeplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

import static org.company.example.annamedvedieva.youtubeplayer.ApiKeyUtil.GOOGLE_API_KEY;

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Button btnPlayVideo =  findViewById(R.id.btnPlayVideo);
        Button btnPlayList = findViewById(R.id.btnPlayPlaylist);

        btnPlayList.setOnClickListener(this);
        btnPlayVideo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch(v.getId()){
            case R.id.btnPlayVideo:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID, 0, true, false);
                break;
            case R.id.btnPlayPlaylist:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST, 0, 0,true, false);
                break;

                default:
        }

if (intent != null){
    startActivity(intent);
}


        }
    }


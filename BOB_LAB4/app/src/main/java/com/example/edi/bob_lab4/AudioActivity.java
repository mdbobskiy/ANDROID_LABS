package com.example.edi.bob_lab4;

import android.app.Activity;
import android.content.ContentUris;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;


public class AudioActivity extends Activity implements MediaPlayer.OnPreparedListener,
        MediaPlayer.OnCompletionListener {

    final String LOG_TAG = "myLogs";


    final String DATA_SD = Environment
            .getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC)
            + "/music.mp3";
    final Uri DATA_URI = ContentUris
            .withAppendedId(
                    android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                    13359);

    MediaPlayer mediaPlayer;
    AudioManager am;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.audio_activity);
        am = (AudioManager) getSystemService(AUDIO_SERVICE);
    }

    public void onClickStart(View view) {
                    Log.d(LOG_TAG, "start Raw");
                    mediaPlayer = MediaPlayer.create(this, R.raw.music);
                    mediaPlayer.start();
        if (mediaPlayer == null)
            return;

        mediaPlayer.setOnCompletionListener(this);
    }

    private void releaseMP() {
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
                mediaPlayer = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void onClick(View view) {
        if (mediaPlayer == null)
            return;
        switch (view.getId()) {
            case R.id.PauseB:
                if (mediaPlayer.isPlaying())
                    mediaPlayer.pause();
                break;
            case R.id.ResumeB:
                if (!mediaPlayer.isPlaying())
                    mediaPlayer.start();
                break;
            case R.id.StopB:
                if(mediaPlayer.isPlaying())
                    mediaPlayer.stop();
                break;
        }
    }

    @Override
    public void onPrepared(MediaPlayer mp) {
        Log.d(LOG_TAG, "onPrepared");
        mp.start();
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        Log.d(LOG_TAG, "onCompletion");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        releaseMP();
    }
}

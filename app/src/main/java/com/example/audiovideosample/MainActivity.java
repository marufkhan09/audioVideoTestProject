package com.example.audiovideosample;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Find the VideoView by ID
        VideoView vView = findViewById(R.id.videoView);

        // Correct way to load the video from the raw folder
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
        vView.setVideoPath(videoPath);

        // Set up a media controller to handle play/pause actions
        MediaController mediaController = new MediaController(MainActivity.this);
        mediaController.setAnchorView(vView);

        // Set the media controller to the VideoView
        vView.setMediaController(mediaController);

        // Start playing the video
        vView.start();
    }
}

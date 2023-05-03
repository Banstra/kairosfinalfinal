package com.example.kotocar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class neiro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.neuro);

    }

    public void onClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/18v988yxoXwRTAmi4Gx1I6ZmGP6Vt8lWm?usp=share_link"));
        startActivity(browserIntent);

    }

    public void openeiro1(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/18v988yxoXwRTAmi4Gx1I6ZmGP6Vt8lWm?usp=share_link"));
        startActivity(browserIntent);
    }
}


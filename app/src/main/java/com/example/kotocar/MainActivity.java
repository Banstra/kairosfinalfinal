package com.example.kotocar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Запуск neiron

    }

    public void openInfo(View v) {
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }

    public void openSiz(View v) {
        Intent intent = new Intent(this, siz.class);
        startActivity(intent);
    }

    public void openDangerzone(View v) {
        Intent intent = new Intent(this, dangerzone.class);
        startActivity(intent);
    }

    public void openDetail(View v) {
        Intent intent = new Intent(this, detail.class);
        startActivity(intent);
    }

    public void openSortirovka(View v) {
        Intent intent = new Intent(this, sortirovka.class);
        startActivity(intent);
    }

    public void openFiltr(View v) {
        Intent intent = new Intent(this, filtr.class);
        startActivity(intent);
    }

    public void openKontrol(View v) {
        Intent intent = new Intent(this, kontrol.class);
        startActivity(intent);
    }

    public void openSborka(View v) {
        Intent intent = new Intent(this, sborka.class);
        startActivity(intent);
    }
    public void openneiro1(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/18v988yxoXwRTAmi4Gx1I6ZmGP6Vt8lWm?usp=share_link"));
        startActivity(browserIntent);
    }

}
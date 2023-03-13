package com.example.kotocar;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }

    public void openSiz(View v) {
        Intent intent = new Intent(this, siz.class);
        startActivity(intent);
    }

    public void openTools(View v) {
        Intent intent = new Intent(this, tools.class);
        startActivity(intent);
    }

    public void openDizain(View v) {
        Intent intent = new Intent(this, dizain.class);
        startActivity(intent);
    }

    public void openDead(View v) {
        Intent intent = new Intent(this,dead.class);
        startActivity(intent);
    }

    public void openSort(View v) {
        Intent intent = new Intent(this,sort.class);
        startActivity(intent);
    }

    public void openQR(View v) {
        Intent intent = new Intent(this,qr.class);
        startActivity(intent);
    }


    public void goFlow(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Kulikov205/Glas"));
        startActivity(browserIntent);
    }

}
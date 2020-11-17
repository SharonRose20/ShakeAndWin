package com.app.shakeandwinlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.app.shakelibrary.ShakeThePhone;
import com.bumptech.glide.Glide;

import static com.app.shakelibrary.ShakeThePhone.*;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button playNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        playNow = findViewById(R.id.playNowBtn);
        Glide.with(getApplicationContext()).load("https://i.ytimg.com/vi/NZ_1e3Hbfkg/maxresdefault.jpg").into(imageView);

        playNow.setOnClickListener(view -> {
            openShakeAndWinActivity(getApplicationContext(), "12345", "eng");
        });
    }
}
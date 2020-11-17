package com.app.shakelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class ShakeMainActivity extends AppCompatActivity {

    FrameLayout playNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_shake_layout);

        playNow = findViewById(R.id.playNow);
        playNow.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), ShakeActivity.class)));
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }
}
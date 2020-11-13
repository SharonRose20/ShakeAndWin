package com.app.shakelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.airbnb.lottie.LottieAnimationView;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;
import safety.com.br.android_shake_detector.core.ShakeDetector;
import safety.com.br.android_shake_detector.core.ShakeOptions;

public class ShakeActivity extends AppCompatActivity {

    ShakeDetector shakeDetector;
    ImageView beforeShakeImage;
    LinearLayout winLayout;
    LottieAnimationView animationOne;
    LottieAnimationView animationTwo;
    Button claimPoints;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shake);

        beforeShakeImage = findViewById(R.id.beforeShakeImage);
        winLayout = findViewById(R.id.winLayout);
        animationOne = findViewById(R.id.animationOne);
        animationTwo = findViewById(R.id.animationTwo);
        claimPoints = findViewById(R.id.claimPoints);
        back = findViewById(R.id.back);

        back.setOnClickListener(view -> finish());

        claimPoints.setOnClickListener(view -> finish());

        ShakeOptions options = new ShakeOptions()
                .background(true)
                .interval(1000)
                .shakeCount(2)
                .sensibility(2.0f);

        shakeDetector = new ShakeDetector(options).start(getApplicationContext(), () -> {
            beforeShakeImage.setBackgroundResource(R.drawable.egg_animation_file);
            final AnimationDrawable frameAnimation = (AnimationDrawable) beforeShakeImage.getBackground();
            frameAnimation.start();

            Handler h = new Handler();
            h.postDelayed(() -> {
                winLayout.setVisibility(View.VISIBLE);
                animationOne.setVisibility(View.VISIBLE);
                animationTwo.setVisibility(View.VISIBLE);
                winLayout.setVisibility(View.VISIBLE);
                claimPoints.setVisibility(View.VISIBLE);
                back.setVisibility(View.GONE);
            }, 2000);
        });

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }
}
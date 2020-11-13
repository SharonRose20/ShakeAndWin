package com.app.shakelibrary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class ShakeThePhone extends FrameLayout {

    FrameLayout playNow;

    public ShakeThePhone(@NonNull Context context) {
        super(context);
        init(context);
    }

    public ShakeThePhone(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public void init(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        FrameLayout frameLayout = (FrameLayout) inflater.inflate(R.layout.main_shake_layout, this, false);
        playNow = frameLayout.findViewById(R.id.playNow);
        playNow.setOnClickListener(view -> context.startActivity(new Intent(context, ShakeActivity.class)));
        addView(frameLayout);
    }
}

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

    public ShakeThePhone(@NonNull Context context) {
        super(context);
    }

    public ShakeThePhone(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public static void openShakeAndWinActivity(Context context, String msisdn, String language) {
        context.startActivity(new Intent(context, ShakeMainActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
    }
}

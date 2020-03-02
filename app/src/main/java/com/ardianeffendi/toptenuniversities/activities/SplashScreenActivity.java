package com.ardianeffendi.toptenuniversities.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.ardianeffendi.toptenuniversities.R;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withBackgroundColor(Color.parseColor("#000000"))
                .withLogo(R.drawable.splashscreen)
                .withFooterText("Ardian Maulana Effendi");

        config.getFooterTextView().setTextColor(Color.WHITE);

        View splashscreen = config.create();
        setContentView(splashscreen);
    }
}

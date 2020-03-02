package com.ardianeffendi.toptenuniversities.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;

import com.ardianeffendi.toptenuniversities.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        initialization();
    }

    private void initialization() {
        setTitle("Developer's Profile");

    }

    @Override
    public void onBackPressed() {
        finish();
    }

}

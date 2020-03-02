package com.ardianeffendi.toptenuniversities.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.ardianeffendi.toptenuniversities.R;
import com.ardianeffendi.toptenuniversities.Uni;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle("Detail Page");
        Intent intent = getIntent();
        Uni uniList = intent.getParcelableExtra("Uni Item");

        assert uniList != null;
        String uniName = uniList.getName();
        String uniDetail = uniList.getDetail();
        int imageRes = uniList.getPhoto();

        TextView tv_name = findViewById(R.id.tv_detail_uniName);
        tv_name.setText(uniName);

        TextView tv_detail = findViewById(R.id.rectangle);
        tv_detail.setText(uniDetail);

        ImageView imageView = findViewById(R.id.img_Uni);
        imageView.setImageResource(imageRes);

    }
}

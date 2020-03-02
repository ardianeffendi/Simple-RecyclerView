package com.ardianeffendi.toptenuniversities.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.ardianeffendi.toptenuniversities.R;
import com.ardianeffendi.toptenuniversities.Uni;
import com.ardianeffendi.toptenuniversities.UniData;
import com.ardianeffendi.toptenuniversities.adapter.ListUniAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvUni;
    private ListUniAdapter listUniAdapter;
    private ArrayList<Uni> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Home Page");
        list.addAll(UniData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvUni = findViewById(R.id.rv_uni);
        rvUni.setHasFixedSize(true);
        rvUni.setLayoutManager(new LinearLayoutManager(this));
        listUniAdapter = new ListUniAdapter(list);
        rvUni.setAdapter(listUniAdapter);

        listUniAdapter.setOnImageClickListener(new ListUniAdapter.OnImageListener() {
            @Override
            public void OnImageClick(int position) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Uni Item", list.get(position));

                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_btn, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.to_profile) {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

package com.example.app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RestaurantsActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String r1[], r2[];
    int images[] = {R.drawable.ic_onemore,
            R.drawable.ic_simplydelicious,
            R.drawable.ic_pepperlunch,
            R.drawable.ic_burgerking,
            R.drawable.ic_brown,
            R.drawable.ic_starbucks,
            R.drawable.ic_lucky,
            R.drawable.ic_kobe}

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.acitivity_restaurants);
        super.onCreate(savedInstanceState);

        recyclerView = findViewById(R.id.recyclerview)

        r1 =  getResources().getStringArray(R.array.restaurants);
        r2 =  getResources().getStringArray(R.array.descriptions);

        RecyclerViewAdapt recyclerViewadapt = new RecyclerViewAdapt(this, r1, r2, images,);
        recyclerView.setAdapter(RecyclerViewAdapt);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    // public void onButtonClick(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}

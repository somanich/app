package com.example.app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    private ArrayList<Restaurants> restaurantslist;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = findViewById(R.id.recyclerview);
        restaurantslist = new ArrayList<>();

        setRestaurantsInfo();
        setAdapter();


    }

    private void setAdapter() {
        RecyclerAdapter adapter = new RecyclerAdapter(restaurantslist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setRestaurantsInfo() {
        restaurantslist.add(new Restaurants("Burger Kings"));
        restaurantslist.add(new Restaurants("Lucky Burger"));
        restaurantslist.add(new Restaurants("Brown"));
        restaurantslist.add(new Restaurants("Starbucks"));
        restaurantslist.add(new Restaurants("One More"));

    }

    public void onButtonClick( View view) {
        Intent intent = new Intent(this, DashboardActivity.class);
        startActivity(intent);
    }
}

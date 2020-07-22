package com.example.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.R;
import com.example.app.model.RecentsBooked;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myViewHolder> {
    private ArrayList<Restaurants> restaurantslist;
    public RecyclerAdapter(ArrayList<Restaurants> restaurantslist) {
        this.restaurantslist = restaurantslist;
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        private TextView nameTxt;
        private TextView typeTxt;
        private TextView priceTxt;
        private  ImageView imageView;

        public myViewHolder(final View view) {
            super(view);
            nameTxt = view.findViewById(R.id.textView4);
            imageView = view.findViewById(R.id.imageView);

        }
    }

    @NonNull
    @Override
    public RecyclerAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurants_block, parent, false);
        return new myViewHolder((itemView));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.myViewHolder holder, int position) {
        String rname = restaurantslist.get(position).getName();

       holder.nameTxt.setText(rname);

    }

    @Override
    public int getItemCount() {
        return restaurantslist.size();
    }
}


package com.example.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapt extends RecyclerView.Adapter<RecyclerViewAdapt.ViewHolder> {

    String s1[],  s2[];
    Context context;
    int images[];


    public RecyclerViewAdapt(Context ct, String r1[], String r2[], int img[]) {
        context = ct;
        s1 = r1;
        s2 = r2;
        images = img;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

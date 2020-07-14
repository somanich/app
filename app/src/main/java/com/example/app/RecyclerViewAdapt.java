package com.example.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

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
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.restaurants_block, parent,  false);
        return ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(s1);;
        holder.iconview.setImageResource(images(position));

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView iconview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iconview = itemView.findViewById(R.id.iconview);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}

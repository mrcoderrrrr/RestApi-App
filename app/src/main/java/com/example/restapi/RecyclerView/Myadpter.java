package com.example.restapi.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restapi.R;
import com.example.restapi.Retrofit.Model;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Myadpter extends RecyclerView.Adapter<ViewHolder> {
    List<Model> list;

    public Myadpter(List<Model> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.fname.setText(list.get(position).getMoreData().getFirst_name());
        holder.lname.setText(list.get(position).getMoreData().getLast_name());
        holder.email.setText(list.get(position).getMoreData().getEmail());
        Picasso.get()
                .load(list.get(position).getMoreData().getAvatar())
                .placeholder(R.drawable.ic_launcher_background)
                .fit()
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

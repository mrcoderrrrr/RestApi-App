package com.example.restapi.RecyclerView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restapi.R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

import org.w3c.dom.Text;

public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView fname, lname, email;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        fname = itemView.findViewById(R.id.fname);
        lname = itemView.findViewById(R.id.lname);
        email = itemView.findViewById(R.id.email);
        img = itemView.findViewById(R.id.imageView);
    }
}

package com.example.jevodan.instagramm.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jevodan.instagramm.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PictureViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.picture)
    public ImageView picture;

    @BindView(R.id.desc)
    public TextView desc;

    @BindView(R.id.imageStar)
    public ImageView star;

    public PictureViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

}

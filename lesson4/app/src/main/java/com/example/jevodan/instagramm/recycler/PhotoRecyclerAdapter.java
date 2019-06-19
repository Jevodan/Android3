package com.example.jevodan.instagramm.recycler;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jevodan.instagramm.R;
import com.example.jevodan.instagramm.adapter.PictureViewHolder;
import com.example.jevodan.instagramm.model.Photo;

import com.squareup.picasso.Picasso;

import java.util.List;


public class PhotoRecyclerAdapter extends RecyclerView.Adapter {

    Photo photo;
    Uri otherPath;

    private final List<Photo> photoList;

    public PhotoRecyclerAdapter(List<Photo> photoList) {
        this.photoList = photoList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PictureViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.item_photo, parent, false));
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        photo = photoList.get(position);
        Picasso.get()
                .load(photo.getPicture())
                .into(((PictureViewHolder) holder).picture);
        if (photo.isChosenOne()) {
            ((PictureViewHolder) holder).star.setImageResource(R.drawable.star_24dp);
        }

        ((PictureViewHolder) holder).desc.setText(photo.getDesc());
    }

    @Override
    public int getItemCount() {
        return photoList.size();
    }

}

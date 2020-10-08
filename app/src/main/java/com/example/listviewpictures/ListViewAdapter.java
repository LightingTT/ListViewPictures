package com.example.listviewpictures;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.zip.Inflater;

public class ListViewAdapter extends ArrayAdapter {

    private LayoutInflater inflater;
    private String [] imageUrls;

    public ListViewAdapter(Context context, String[] imageUrls) {
        super(context, R.layout.image_view_tool, imageUrls);

        context = getContext();
        this.imageUrls = imageUrls;

        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = inflater.inflate(R.layout.image_view_tool, parent, false);

        Glide
                .with(getContext())
                .load(imageUrls[position])
                .into((ImageView) convertView);
        return  convertView;
    }
}

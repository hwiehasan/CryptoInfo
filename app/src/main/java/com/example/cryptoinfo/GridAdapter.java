package com.example.cryptoinfo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {

    Context context ;
    Integer[] images ;

    public GridAdapter(Context context , Integer[] images)
    {
        this.context = context ;
        this.images = images ;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            int screenWidth= context.getResources().getDisplayMetrics().widthPixels;
            imageView.setLayoutParams(new GridView.LayoutParams(screenWidth/2, screenWidth/2));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(5, 5, 5, 5);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(images[position]);
        return imageView;

    }
}

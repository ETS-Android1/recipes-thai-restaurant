package com.example.recipesthairestaurant.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recipesthairestaurant.Model.Constant;
import com.example.recipesthairestaurant.R;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<Constant> constantList;

    public CustomAdapter(Context context, List<Constant> constantList) {
        this.context = context;
        this.constantList = constantList;
    }

    @Override
    public int getCount() {
        return constantList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.ImageScr);
        TextView textView = (TextView) convertView.findViewById(R.id.ImageName);
        imageView.setImageResource(constantList.get(position).getImage());
        textView.setText(constantList.get(position).getTitle());
        return convertView;
    }
}

package com.example.recipesthairestaurant.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.recipesthairestaurant.Activites.FullView;
import com.example.recipesthairestaurant.Model.Constant;
import com.example.recipesthairestaurant.R;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<Constant> constantList;
    int condtion;

    public CustomAdapter(Context context, List<Constant> constantList, int condtion) {
        this.context = context;
        this.constantList = constantList;
        this.condtion= condtion;
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

        int image = constantList.get(position).getImage();
        String title = constantList.get(position).getTitle();
        String ingredients = constantList.get(position).getIngredients();
        String instructions = constantList.get(position).getInstructions();

        ImageView imageView = (ImageView) convertView.findViewById(R.id.ImageScr);
        TextView textView = (TextView) convertView.findViewById(R.id.ImageName);
        CardView cardView = (CardView) convertView.findViewById(R.id.cardView);

        imageView.setImageResource(image);
        textView.setText(title);

        cardView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, FullView.class);
                        intent.putExtra("image", image);
                        intent.putExtra("condtion", condtion);
                        intent.putExtra("title", title);
                        intent.putExtra("ingredients", ingredients);
                        intent.putExtra("instructions", instructions);
                         context.startActivity(intent);
                    }
                }
        );
        return convertView;
    }
}

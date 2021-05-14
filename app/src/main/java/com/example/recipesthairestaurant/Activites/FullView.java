package com.example.recipesthairestaurant.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.recipesthairestaurant.R;

public class FullView extends AppCompatActivity {

    Intent intent;
    int image;
    String title;
    String ingredients;
    String instructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);

        intent = getIntent();
        image = intent.getIntExtra("image", 0);
        title = intent.getStringExtra("title");
        ingredients = intent.getStringExtra("ingredients");
        instructions = intent.getStringExtra("instructions");

        Toast.makeText(FullView.this, title,Toast.LENGTH_LONG).show();
    }
}
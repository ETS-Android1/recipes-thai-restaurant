package com.example.recipesthairestaurant.Activites;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recipesthairestaurant.R;

public class FullView extends AppCompatActivity {

    Intent intent;
    int image;
    int condtion;
    String title;
    String ingredients;
    String instructions;

    TextView titleTXT, ingredientsTitle, ingredientsTXT, instructionsTitle, instructionsTXT;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);

        titleTXT = (TextView) findViewById(R.id.titleFullView);
        ingredientsTitle = (TextView) findViewById(R.id.titleIngredients);
        ingredientsTXT = (TextView) findViewById(R.id.ingredients);
        instructionsTitle = (TextView) findViewById(R.id.titleInstructions);
        instructionsTXT = (TextView) findViewById(R.id.instructions);
        imageView = (ImageView) findViewById(R.id.imageFullView);

        intent = getIntent();

        Bundle bundle= getIntent().getExtras();
        if(bundle!=null)
        {
//            titleTXT.setText(bundle.getString("title"));
            imageView.setImageResource(bundle.getInt("image"));
//            ingredientsTitle.setText(bundle.getString("ingredients: "));
//            ingredientsTXT.setText(bundle.getString("ingredients"));
//            instructionsTitle.setText(bundle.getString("instructions: "));
//            ingredientsTXT.setText(bundle.getString("instructions"));

        }
        condtion = intent.getIntExtra("condtion", 0);
//        image = intent.getIntExtra("image", 0);
        title = intent.getStringExtra("title");
        ingredients = intent.getStringExtra("ingredients");
        instructions = intent.getStringExtra("instructions");

//        imageView.setImageResource(image);
        titleTXT.setText(title);
        ingredientsTitle.setText("Ingredients:");
        ingredientsTXT.setText(ingredients);
        instructionsTitle.setText("Instructions:");
        instructionsTXT.setText(instructions);

        Toast.makeText(FullView.this, title, Toast.LENGTH_LONG).show();
    }
}
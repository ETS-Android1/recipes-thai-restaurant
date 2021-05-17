package com.example.recipesthairestaurant.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.recipesthairestaurant.Adapter.CustomAdapter;
import com.example.recipesthairestaurant.Model.Constant;
import com.example.recipesthairestaurant.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    int Condition;
    Intent intent;
    GridView gridView;
    CustomAdapter customAdapter;
    List<Constant> constantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.GridView);
        constantList = new ArrayList<>();
        intent = getIntent();
        Condition = intent.getIntExtra("Condition", 0);
        switch (Condition) {
            case 1:
                Food();
                break;
            case 2:
                Drinks();
                break;
            case 3:
                Desserts();
                break;
        }
        customAdapter = new CustomAdapter(MainActivity.this, constantList, Condition);
        gridView.setAdapter(customAdapter);
    }

    private void Food() {
        constantList.add(new Constant(R.drawable.khao_niew_mamuang__mango_sticky_rice,getResources().getString(R.string.Title_food_1), getResources().getString(R.string.Instructions_food_1), getResources().getString(R.string.Instructions_food_1)));
        constantList.add(new Constant(R.drawable.khao_phat_or_khao_pad__fried_rice, getResources().getString(R.string.Title_food_2), getResources().getString(R.string.Ingredients_food_2), getResources().getString(R.string.Instructions_food_2)));
        constantList.add(new Constant(R.drawable.guay_teow__noodle_soup, getResources().getString(R.string.Title_food_3), getResources().getString(R.string.Ingredients_food_3), getResources().getString(R.string.Instructions_food_3)));
        constantList.add(new Constant(R.drawable.tom_yum_goong__spicy_shrimp_soup, getResources().getString(R.string.Title_food_4), getResources().getString(R.string.Ingredients_food_4), getResources().getString(R.string.Instructions_food_4)));
        constantList.add(new Constant(R.drawable.khao_soi__creamy_coconut_curry_noodle_soup, getResources().getString(R.string.Title_food_5), getResources().getString(R.string.Ingredients_food_5), getResources().getString(R.string.Instructions_food_5)));
        constantList.add(new Constant(R.drawable.tom_kha_gai__chicken_in_coconut_soup, getResources().getString(R.string.Title_food_6), getResources().getString(R.string.Ingredients_food_6), getResources().getString(R.string.Instructions_food_6)));
        constantList.add(new Constant(R.drawable.pad_see_eiw__thick_noodle_dish, getResources().getString(R.string.Title_food_7), getResources().getString(R.string.Ingredients_food_7), getResources().getString(R.string.Instructions_food_7)));
        constantList.add(new Constant(R.drawable.pad_thai__stir_fried_noodles, getResources().getString(R.string.Title_food_8), getResources().getString(R.string.Ingredients_food_8), getResources().getString(R.string.Instructions_food_8)));
        constantList.add(new Constant(R.drawable.pad_kee_mao__drunken_noodles, getResources().getString(R.string.Title_food_9), getResources().getString(R.string.Ingredients_food_9), getResources().getString(R.string.Instructions_food_9)));
        constantList.add(new Constant(R.drawable.laab__spicy_salad, getResources().getString(R.string.Title_food_10), getResources().getString(R.string.Ingredients_food_10), getResources().getString(R.string.Instructions_food_10)));
        constantList.add(new Constant(R.drawable.som_tam__spicy_green_papaya_salad, getResources().getString(R.string.Title_food_11), getResources().getString(R.string.Ingredients_food_11), getResources().getString(R.string.Instructions_food_11)));
        constantList.add(new Constant(R.drawable.yum_pla_duk_foo__crispy_catfish_with_green_mango_salad, getResources().getString(R.string.Title_food_12), getResources().getString(R.string.Ingredients_food_12), getResources().getString(R.string.Instructions_food_12)));

    }

    private void Drinks() {
        constantList.add(new Constant(R.drawable.cha_yen__thai_style_tea,getResources().getString(R.string.Title_drinks_1), getResources().getString(R.string.Ingredients_drinks_1), getResources().getString(R.string.Instructions_drinks_1)));
        constantList.add(new Constant(R.drawable.thai_milk_tea_chayen, getResources().getString(R.string.Title_drinks_2), getResources().getString(R.string.Ingredients_drinks_2), getResources().getString(R.string.Instructions_drinks_2)));
        constantList.add(new Constant(R.drawable.nom_yen__ice_milk_with_syrup, getResources().getString(R.string.Title_drinks_3), getResources().getString(R.string.Ingredients_drinks_3), getResources().getString(R.string.Instructions_drinks_3)));
        constantList.add(new Constant(R.drawable.oliang_thai_style_coffee, getResources().getString(R.string.Title_drinks_4), getResources().getString(R.string.Ingredients_drinks_4), getResources().getString(R.string.Instructions_drinks_4)));

    }

    private void Desserts() {
        constantList.add(new Constant(R.drawable.foi_thong, getResources().getString(R.string.Title_desserts_1), getResources().getString(R.string.Ingredients_desserts_1), getResources().getString(R.string.Instructions_desserts_1)));
        constantList.add(new Constant(R.drawable.mango_sticky, getResources().getString(R.string.Title_desserts_2), getResources().getString(R.string.Ingredients_desserts_2), getResources().getString(R.string.Instructions_desserts_2)));
        constantList.add(new Constant(R.drawable.thong_yip, getResources().getString(R.string.Title_desserts_3), getResources().getString(R.string.Ingredients_desserts_3), getResources().getString(R.string.Instructions_desserts_3)));

    }
}
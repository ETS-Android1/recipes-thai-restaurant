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
        customAdapter = new CustomAdapter(MainActivity.this, constantList);
        gridView.setAdapter(customAdapter);
    }

    private void Food() {
        constantList.add(new Constant(R.drawable.khao_niew_mamuang__mango_sticky_rice, "khao niew mamuang (mango sticky rice)", "", ""));
        constantList.add(new Constant(R.drawable.khao_phat_or_khao_pad__fried_rice, "khao phat or khao pad (fried rice)", "", ""));
        constantList.add(new Constant(R.drawable.guay_teow__noodle_soup, "nom yeguay teow (noodle soup)", "", ""));
        constantList.add(new Constant(R.drawable.tom_yum_goong__spicy_shrimp_soup, "tom yum goong (spicy shrimp soup)", "", ""));
        constantList.add(new Constant(R.drawable.khao_soi__creamy_coconut_curry_noodle_soup, "khao soi (cream ycoconut curry noodle soup)", "", ""));
        constantList.add(new Constant(R.drawable.tom_kha_gai__chicken_in_coconut_soup, "tom kha gai (chicken in coconut soup)", "", ""));
        constantList.add(new Constant(R.drawable.pad_see_eiw__thick_noodle_dish, "pad see eiw (thick noodle dish)", "", ""));
        constantList.add(new Constant(R.drawable.pad_thai__stir_fried_noodles, "pad thai (stir fried noodles)", "", ""));
        constantList.add(new Constant(R.drawable.pad_kee_mao__drunken_noodles, "pad kee mao (drunken noodles)", "", ""));
        constantList.add(new Constant(R.drawable.laab__spicy_salad, "laab (spicy salad)", "", ""));
        constantList.add(new Constant(R.drawable.som_tam__spicy_green_papaya_salad, "som tam (spicy green papaya salad)", "", ""));
        constantList.add(new Constant(R.drawable.yum_pla_duk_foo__crispy_catfish_with_green_mango_salad, "yum pla duk foo (crispy catfish with green mango salad)", "", ""));

    }

    private void Drinks() {
        constantList.add(new Constant(R.drawable.cha_yen__thai_style_tea, "cha yen (thai style tea)", "", ""));
        constantList.add(new Constant(R.drawable.thai_milk_tea_chayen, "thai milk tea chayen", "", ""));
        constantList.add(new Constant(R.drawable.nom_yen__ice_milk_with_syrup, "nom yen (ice milk with syrup)", "", ""));
        constantList.add(new Constant(R.drawable.oliang_thai_style_coffee, "oliang (thai style coffee)", "", ""));

    }

    private void Desserts() {
        constantList.add(new Constant(R.drawable.foi_thong, "foi thong", "", ""));
        constantList.add(new Constant(R.drawable.mango_sticky, "mango sticky", "", ""));
        constantList.add(new Constant(R.drawable.thong_yip, "thong yip", "", ""));

    }
}
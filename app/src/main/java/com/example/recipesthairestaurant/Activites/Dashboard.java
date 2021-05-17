package com.example.recipesthairestaurant.Activites;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.recipesthairestaurant.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity {
    List<SlideModel> slideModelListFood;
    List<SlideModel> slideModelListDrinks;
    List<SlideModel> slideModelListDesserts;
    ImageSlider imageSliderFood, imageSliderDrinks, imageSliderDesserts;
    NavigationView navigationView;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    public void onBackPressed() {
        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                finishAndRemoveTask();
            }
            this.finishAffinity();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        navigationView = (NavigationView) findViewById(R.id.navigationView);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(Dashboard.this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.MoreApp:

                        final String Playstore = "receita zghari apps"; // getPackageName() from Context or Activity object
                        final String Browser = "receita+zghari+apps"; // getPackageName() from Context or Activity object
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(" market://search?q=pub:" + Playstore)));
                        } catch (android.content.ActivityNotFoundException anfe) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=pub:" + Browser)));
                        }

                        break;
                    case R.id.Share:

                        Intent shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                        shareIntent.setType("text/plain");
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Download Recipes Thai Restaurant");
                        String app_url = " https://play.google.com/store/apps/details?id=" + getPackageName();
                        shareIntent.putExtra(android.content.Intent.EXTRA_TEXT, app_url);
                        startActivity(Intent.createChooser(shareIntent, "Share via"));

                        break;
                    case R.id.Privacy:

                        startActivity(new Intent(Dashboard.this, Privacy.class));

                        break;
                    case R.id.Rate:

                        Uri uri = Uri.parse("market://details?id=" + getPackageName());
                        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_NEW_DOCUMENT | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        }
                        try {
                            startActivity(goToMarket);
                        } catch (ActivityNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
                        }

                        break;
                }
                return true;
            }
        });


        imageSliderFood = (ImageSlider) findViewById(R.id.image_slider_Food);
        imageSliderDrinks = (ImageSlider) findViewById(R.id.image_slider_Drinks);
        imageSliderDesserts = (ImageSlider) findViewById(R.id.image_slider_Desserts);

        AddImages();
    }

    public void AddImages() {
        slideModelListFood = new ArrayList<>();
        slideModelListFood.add(new SlideModel(R.drawable.khao_niew_mamuang__mango_sticky_rice, "khao niew mamuang"/*(mango sticky rice)*/, ScaleTypes.CENTER_CROP));
        slideModelListFood.add(new SlideModel(R.drawable.khao_phat_or_khao_pad__fried_rice, "khao phat or khao pad "/*(fried rice)*/, ScaleTypes.CENTER_CROP));
        slideModelListFood.add(new SlideModel(R.drawable.guay_teow__noodle_soup, "nom yeguay teow" /*(noodle soup)*/, ScaleTypes.CENTER_CROP));
        slideModelListFood.add(new SlideModel(R.drawable.tom_yum_goong__spicy_shrimp_soup, "tom yum goong"/*(spicy shrimp soup)*/, ScaleTypes.CENTER_CROP));
        slideModelListFood.add(new SlideModel(R.drawable.khao_soi__creamy_coconut_curry_noodle_soup, "khao soi"/*(cream ycoconut curry noodle soup)*/, ScaleTypes.CENTER_CROP));
        slideModelListFood.add(new SlideModel(R.drawable.tom_kha_gai__chicken_in_coconut_soup, "tom kha gai"/*(chicken in coconut soup)*/, ScaleTypes.CENTER_CROP));
        slideModelListFood.add(new SlideModel(R.drawable.pad_see_eiw__thick_noodle_dish, "pad see eiw"/*(thick noodle dish)*/, ScaleTypes.CENTER_CROP));
        slideModelListFood.add(new SlideModel(R.drawable.pad_thai__stir_fried_noodles, "pad thai"/*(stir fried noodles)*/, ScaleTypes.CENTER_CROP));
        slideModelListFood.add(new SlideModel(R.drawable.pad_kee_mao__drunken_noodles, "pad kee mao"/*(drunken noodles)*/, ScaleTypes.CENTER_CROP));
        slideModelListFood.add(new SlideModel(R.drawable.laab__spicy_salad, "laab"/*(spicy salad)*/, ScaleTypes.CENTER_CROP));
        slideModelListFood.add(new SlideModel(R.drawable.som_tam__spicy_green_papaya_salad, "som tam"/*(spicy green papaya salad)*/, ScaleTypes.CENTER_CROP));
        slideModelListFood.add(new SlideModel(R.drawable.yum_pla_duk_foo__crispy_catfish_with_green_mango_salad, "yum pla duk foo"/*(crispy catfish with green mango salad)*/, ScaleTypes.CENTER_CROP));
        imageSliderFood.setImageList(slideModelListFood, ScaleTypes.FIT);

        slideModelListDrinks = new ArrayList<>();
        slideModelListDrinks.add(new SlideModel(R.drawable.cha_yen__thai_style_tea, "cha yen"/*(thai style tea)*/, ScaleTypes.CENTER_CROP));
        slideModelListDrinks.add(new SlideModel(R.drawable.thai_milk_tea_chayen, "thai milk tea chayen", ScaleTypes.CENTER_CROP));
        slideModelListDrinks.add(new SlideModel(R.drawable.nom_yen__ice_milk_with_syrup, "nom yen"/*(ice milk with syrup)*/, ScaleTypes.CENTER_CROP));
        slideModelListDrinks.add(new SlideModel(R.drawable.oliang_thai_style_coffee, "oliang"/*(thai style coffee)*/, ScaleTypes.CENTER_CROP));
        imageSliderDrinks.setImageList(slideModelListDrinks, ScaleTypes.FIT);

        slideModelListDesserts = new ArrayList<>();
        slideModelListDesserts.add(new SlideModel(R.drawable.foi_thong, "foi thong", ScaleTypes.CENTER_CROP));
        slideModelListDesserts.add(new SlideModel(R.drawable.mango_sticky, "mango sticky", ScaleTypes.CENTER_CROP));
        slideModelListDesserts.add(new SlideModel(R.drawable.thong_yip, "thong yip", ScaleTypes.CENTER_CROP));
        imageSliderDesserts.setImageList(slideModelListDesserts, ScaleTypes.FIT);
    }

    public void ViewAll(View view) {
        Intent intent = new Intent(Dashboard.this, MainActivity.class);
        switch (view.getId()) {
            case R.id.Food_show_all:
                intent.putExtra("Condition", 1);
                break;
            case R.id.Drinks_show_all:
                intent.putExtra("Condition", 2);
                break;
            case R.id.Desserts_show_all:
                intent.putExtra("Condition", 3);
                break;
        }
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return actionBarDrawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }

}
package com.example.recipesthairestaurant.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.recipesthairestaurant.R;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity {
    List<SlideModel> slideModelList1;
    List<SlideModel> slideModelList2;
    List<SlideModel> slideModelList3;
    ImageSlider imageSlider1, imageSlider2, imageSlider3;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask();
        }
        this.finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        imageSlider1 = (ImageSlider) findViewById(R.id.image_slider1);
        imageSlider2 = (ImageSlider) findViewById(R.id.image_slider2);
        imageSlider3 = (ImageSlider) findViewById(R.id.image_slider3);

        AddImages();
    }

    public void AddImages() {

        slideModelList1 = new ArrayList<>();
        slideModelList1.add(new SlideModel(R.drawable.cha_yen__thai_style_tea, "cha yen (thai style tea)", ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.thai_milk_tea_chayen, "thai milk tea chayen", ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.nom_yen__ice_milk_with_syrup, "nom yen (ice milk with syrup)", ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.oliang_thai_style_coffee, "oliang (thai style coffee)", ScaleTypes.CENTER_CROP));
        imageSlider1.setImageList(slideModelList1, ScaleTypes.FIT);

        slideModelList2 = new ArrayList<>();
        slideModelList2.add(new SlideModel(R.drawable.khao_niew_mamuang__mango_sticky_rice, "khao niew mamuang (mango sticky rice)", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.khao_phat_or_khao_pad__fried_rice, "khao phat or khao pad (fried rice)", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.guay_teow__noodle_soup, "nom yeguay teow (noodle soup)", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.tom_yum_goong__spicy_shrimp_soup, "tom yum goong (spicy shrimp soup)", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.khao_soi__creamy_coconut_curry_noodle_soup, "khao soi (cream ycoconut curry noodle soup)", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.tom_kha_gai__chicken_in_coconut_soup, "tom kha gai (chicken in coconut soup)", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.pad_see_eiw__thick_noodle_dish, "pad see eiw (thick noodle dish)", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.pad_thai__stir_fried_noodles, "pad thai (stir fried noodles)", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.pad_kee_mao__drunken_noodles, "pad kee mao (drunken noodles)", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.laab__spicy_salad, "laab (spicy salad)", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.som_tam__spicy_green_papaya_salad, "som tam (spicy green papaya salad)", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.yum_pla_duk_foo__crispy_catfish_with_green_mango_salad, "yum pla duk foo (crispy catfish with green mango salad)", ScaleTypes.CENTER_CROP));
        imageSlider2.setImageList(slideModelList2, ScaleTypes.FIT);

        slideModelList3 = new ArrayList<>();
        slideModelList3.add(new SlideModel(R.drawable.foi_thong, "foi thong", ScaleTypes.CENTER_CROP));
        slideModelList3.add(new SlideModel(R.drawable.mango_sticky, "mango sticky", ScaleTypes.CENTER_CROP));
        slideModelList3.add(new SlideModel(R.drawable.thong_yip, "thong yip", ScaleTypes.CENTER_CROP));
        imageSlider3.setImageList(slideModelList3, ScaleTypes.FIT);
    }
}
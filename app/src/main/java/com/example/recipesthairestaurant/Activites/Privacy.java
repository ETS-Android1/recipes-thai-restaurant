package com.example.recipesthairestaurant.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.recipesthairestaurant.R;

public class Privacy extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);
        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("file:///android_asset/privacy.html");
    }
}
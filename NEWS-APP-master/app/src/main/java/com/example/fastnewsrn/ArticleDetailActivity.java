package com.example.fastnewsrn;

import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class ArticleDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);

        String url = getIntent().getStringExtra("url");

        WebView webView = findViewById(R.id.webView);
        webView.loadUrl(url);
    }
}


package com.example.basedul.webviewshowinclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewShow extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_show);

        webView = (WebView) findViewById(R.id.webViewShow);
        webView.loadUrl("http://www.baust.edu.bd/");

    }
}

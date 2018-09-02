package com.example.basedul.toplevelsoftwarecomapany;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ShowWebsite extends AppCompatActivity {

    WebView webView;//webview varriable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_website);

        webView = (WebView)findViewById(R.id.webView_ShowWebsite);//id for webview
        String websiteLink = getIntent().getStringExtra("Websitename");//get data form intent
        webView.setWebViewClient(new WebViewClient());//no third party app browse
        webView.getSettings().setJavaScriptEnabled(true);//java script enable
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.loadUrl(websiteLink);//load url
        webView.setDownloadListener(new DownloadListener() {//downloader listener
            @Override
            public void onDownloadStart(String s, String s1, String s2, String s3, long l) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {//back button
        if(webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }
}

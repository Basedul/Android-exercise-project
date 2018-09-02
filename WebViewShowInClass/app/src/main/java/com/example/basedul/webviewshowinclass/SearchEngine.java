package com.example.basedul.webviewshowinclass;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class SearchEngine extends Activity {
    Button buttonSearch;
    EditText editTextForTextSearching;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_engine);
        buttonSearch = (Button) findViewById(R.id.buttonSearch);
        editTextForTextSearching = (EditText) findViewById(R.id.editTextSearchText);
        webView = (WebView) findViewById(R.id.webViewInSearchEngine);

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editTextForTextSearching.getText().toString();
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());

                webView.loadUrl("https://www.google.com/search?source=hp&ei=aqhhW4mYKcH5vgS7_JeIBA&q=" + s);
            }
        });


    }

}





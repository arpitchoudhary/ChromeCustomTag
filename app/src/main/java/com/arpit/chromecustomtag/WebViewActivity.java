package com.arpit.chromecustomtag;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    private WebView mWebView = null;
    public static final String EXTRA_URL =
            "CREATEAPPFASTER_EXTRAURL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        String url = getIntent().getStringExtra(EXTRA_URL);
        mWebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl(url);
        setupActionBar(url);
    }

    private void setupActionBar(String url) {
        setTitle(url);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
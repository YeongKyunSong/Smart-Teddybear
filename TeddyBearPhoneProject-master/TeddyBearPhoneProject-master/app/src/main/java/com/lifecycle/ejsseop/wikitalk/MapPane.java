package com.lifecycle.ejsseop.wikitalk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by umjin on 2016-01-30.
 */
public class MapPane extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapview);
        WebView myWebView = (WebView) findViewById(R.id.webView2);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        myWebView.loadUrl("http://map.naver.com/?menu=location&mapMode=0&lat=37.4957538&lng=127.0367516&dlevel=12&enc=b64");
    }
}

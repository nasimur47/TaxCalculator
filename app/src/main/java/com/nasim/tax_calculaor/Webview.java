package com.nasim.tax_calculaor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Webview extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webview=findViewById(R.id.webview);

        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.google.com/search?q=%E0%A6%9F%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%95%E0%A7%8D%E0%A6%B8+%E0%A6%8F%E0%A6%B0+%E0%A6%97%E0%A7%81%E0%A6%B0%E0%A7%81%E0%A6%A4%E0%A7%8D%E0%A6%AC%E0%A6%AA%E0%A7%82%E0%A6%B0%E0%A7%8D%E0%A6%A3+website&rlz=1C1VDKB_enBD976BD976&oq=%E0%A6%9F%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%95%E0%A7%8D%E0%A6%B8+&aqs=chrome.2.69i57j35i19i39j35i39j0i512j0i30l6.67626j0j15&sourceid=chrome&ie=UTF-8");
        WebSettings webSettings=webview.getSettings();




    }
}
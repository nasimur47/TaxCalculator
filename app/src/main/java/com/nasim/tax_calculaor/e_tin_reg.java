package com.nasim.tax_calculaor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class e_tin_reg extends AppCompatActivity {

    WebView e_tin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_etin_reg );

        e_tin=findViewById(R.id.e_tin);


        e_tin.getSettings().setJavaScriptEnabled(true);
        e_tin.loadUrl("https://web.facebook.com/nbretinregistration/?_rdc=1&_rdr");
        WebSettings webSettings=e_tin.getSettings();

    }
}
package com.nasim.tax_calculaor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class e_return extends AppCompatActivity {

    WebView e_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_ereturn );

        e_return=findViewById(R.id.e_return);


        e_return.getSettings().setJavaScriptEnabled(true);
        e_return.loadUrl("https://www.tin-nsdl.com/services/e-return/e-return-index.html");
        WebSettings webSettings=e_return.getSettings();

    }
}
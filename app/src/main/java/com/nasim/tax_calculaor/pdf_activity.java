package com.nasim.tax_calculaor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class pdf_activity extends AppCompatActivity {

    WebView pdf_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_pdf );

        pdf_web=findViewById(R.id.pdf_web);

        pdf_web.setWebViewClient(new WebViewClient());
        pdf_web.getSettings().setJavaScriptEnabled(true);
        pdf_web.loadUrl("https://docs.google.com/document/d/1_B49sougyp2e7U8bW4ORSUd12KSvqsPkfil-dJv787g/edit");
        WebSettings webSettings=pdf_web.getSettings();
    }
}
package com.nasim.tax_calculaor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class tax_paid extends AppCompatActivity {

    WebView tax_paid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_tax_paid );

        tax_paid=findViewById(R.id.tax_paid);

        tax_paid.getSettings().setJavaScriptEnabled(true);
        tax_paid.loadUrl("https://nbr.sblesheba.com/IncomeTax/Payment");
        WebSettings webSettings=tax_paid.getSettings();

    }
}
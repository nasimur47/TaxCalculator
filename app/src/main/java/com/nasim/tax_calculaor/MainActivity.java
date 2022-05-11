package com.nasim.tax_calculaor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout taxcal,goinform,gowebpage,gopaid,goe_return,goe_tin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         taxcal=findViewById(R.id.taxcal);
         gowebpage=findViewById(R.id.gowebpage);
         goinform=findViewById(R.id.goinform);
        gopaid=findViewById(R.id.gopaid);
        goe_tin=findViewById(R.id.goe_tin);
        goe_return=findViewById(R.id.goe_return);


         taxcal.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent myIntent=new Intent(MainActivity.this,MainActivity2cal.class);
                 startActivity(myIntent);
             }
         });

         goinform.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent myIntent=new Intent(MainActivity.this,pdf_activity.class);
                 startActivity(myIntent);
             }
         });

         gowebpage.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent myIntent=new Intent(MainActivity.this,Webview.class);
                 startActivity(myIntent);
             }
         });

        gopaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(MainActivity.this,tax_paid.class);
                startActivity(myIntent);
            }
        });


        goe_tin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(MainActivity.this,e_tin_reg.class);
                startActivity(myIntent);
            }
        });


        goe_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(MainActivity.this,e_return.class);
                startActivity(myIntent);
            }
        });




    }
}
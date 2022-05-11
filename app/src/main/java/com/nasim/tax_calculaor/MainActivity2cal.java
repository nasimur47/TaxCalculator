package com.nasim.tax_calculaor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2cal extends AppCompatActivity {

    EditText salery,farmer,propaty,bussness,others;
    TextView tvdisplay,result;
    RadioButton rbmale,rbfemale,rbotes,rbfreefi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2cal);


        salery=findViewById(R.id.salery);
        farmer=findViewById(R.id.farmer);
        propaty=findViewById(R.id.propaty);
        bussness=findViewById(R.id.bussness);
        others=findViewById(R.id.others);
        result=findViewById(R.id.result);
        tvdisplay=findViewById(R.id.tvdisplay);
        rbmale=findViewById(R.id.rbmale);
        rbfemale=findViewById(R.id.rbfemale);
        rbotes=findViewById(R.id.rbotes);
        rbfreefi=findViewById(R.id.rbfreefi);




        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int edsalery, edfarmer, edpropaty, edbussness, edothers, sum;

                edsalery = Integer.parseInt( salery.getText().toString() );
                edfarmer = Integer.parseInt( farmer.getText().toString() );
                edpropaty = Integer.parseInt( propaty.getText().toString() );
                edbussness = Integer.parseInt( bussness.getText().toString() );
                edothers = Integer.parseInt( others.getText().toString() );

                edsalery = edsalery*12;

                sum = edsalery + edfarmer + edpropaty + edbussness + edothers;


                if (rbmale.isChecked()) {

                    if (sum <= 250000) {
                        tvdisplay.setText( "আপনার ট্যাক্স দেওয়ার প্রয়োজন নেই" );
                    } else if (sum <= 650000) {
                        float tax;
                        tax = (float) ((sum - 250000) * .10);
                        tvdisplay.setText( "আপনার ট্যাক্স দিতে হবে :" + tax +"টাকা");
                    } else if (sum <= 1150000) {
                        float tax2;
                        tax2 = (float) (45000 + (sum - 650000) * 0.15);
                        tvdisplay.setText( "আপনার ট্যাক্স দিতে হবে :" + tax2 +"টাকা" );
                    } else if (sum <= 1750000) {
                        float tax3;
                        tax3 = (float) (75000 + (sum - 1150000) * 0.15);
                        tvdisplay.setText( "আপনার ট্যাক্স দিতে হবে :" + tax3 +"টাকা" );
                    }

                }
                /*  femeal part      */
                else if (rbfemale.isChecked()){

                    if (sum <= 300000) {
                        tvdisplay.setText( "আপনার ট্যাক্স দেওয়ার প্রয়োজন নেই" );
                    } else if (sum <= 650000) {
                        float tax;
                        tax = (float) ((sum - 300000) * .10);
                        tvdisplay.setText( "আপনার ট্যাক্স দিতে হবে :" + tax +"টাকা");
                    } else if (sum <= 1150000) {
                        float tax2;
                        tax2 = (float) (45000 + (sum - 650000) * 0.15);
                        tvdisplay.setText( "আপনার ট্যাক্স দিতে হবে :" + tax2 +"টাকা" );
                    } else if (sum <= 1750000) {
                        float tax3;
                        tax3 = (float) (75000 + (sum - 1150000) * 0.15);
                        tvdisplay.setText( "আপনার ট্যাক্স দিতে হবে :" + tax3 +"টাকা" );
                    }

                }
                /*  rbotes part      */
                else if (rbotes.isChecked()){

                    if (sum <= 375000) {
                        tvdisplay.setText( "আপনার ট্যাক্স দেওয়ার প্রয়োজন নেই" );
                    } else if (sum <= 650000) {
                        float tax;
                        tax = (float) ((sum - 375000) * .10);
                        tvdisplay.setText( "আপনার ট্যাক্স দিতে হবে :" + tax +"টাকা");
                    } else if (sum <= 1150000) {
                        float tax2;
                        tax2 = (float) (45000 + (sum - 650000) * 0.15);
                        tvdisplay.setText( "আপনার ট্যাক্স দিতে হবে :" + tax2 +"টাকা" );
                    } else if (sum <= 1750000) {
                        float tax3;
                        tax3 = (float) (75000 + (sum - 1150000) * 0.15);
                        tvdisplay.setText( "আপনার ট্যাক্স দিতে হবে :" + tax3 +"টাকা" );
                    }

                }
                /*  rbfreefi part      */
                else if (rbfreefi.isChecked()){

                    if (sum <= 425000) {
                        tvdisplay.setText( "আপনার ট্যাক্স দেওয়ার প্রয়োজন নেই" );
                    } else if (sum <= 650000) {
                        float tax;
                        tax = (float) ((sum - 425000) * .10);
                        tvdisplay.setText( "আপনার ট্যাক্স দিতে হবে :" + tax +"টাকা");
                    } else if (sum <= 1150000) {
                        float tax2;
                        tax2 = (float) (45000 + (sum - 650000) * 0.15);
                        tvdisplay.setText( "আপনার ট্যাক্স দিতে হবে :" + tax2 +"টাকা" );
                    } else if (sum <= 1750000) {
                        float tax3;
                        tax3 = (float) (75000 + (sum - 1150000) * 0.15);
                        tvdisplay.setText( "আপনার ট্যাক্স দিতে হবে :" + tax3 +"টাকা" );
                    }

                }











             }
            });
        }
}
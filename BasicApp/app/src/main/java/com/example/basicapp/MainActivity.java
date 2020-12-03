package com.example.basicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    double cups, quarts, liters, teasp, tblespn;

    EditText cupInput;
    EditText quartInput;
    EditText litInput;
    EditText tspnInput;
    EditText tblspInput;


    Button convertButton;
    Button clearButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cupInput = (EditText) findViewById(R.id.cups);
        quartInput = (EditText) findViewById(R.id.quart);
        litInput = (EditText) findViewById(R.id.liter);
        tspnInput = (EditText) findViewById(R.id.tsp);
        tblspInput = (EditText) findViewById(R.id.tbsp);


        convertButton = (Button) findViewById(R.id.buttonConvert);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            cups = Double.valueOf(cupInput.getText().toString());
            quarts = Double.valueOf(quartInput.getText().toString());
            liters = Double.valueOf(litInput.getText().toString());
            tblespn = Double.valueOf(tblspInput.getText().toString());
            teasp = Double.valueOf(tspnInput.getText().toString());


            if(cups > 0) {
                fromCups(cups);
            }else if (quarts > 0) {
                fromQuarts(quarts);
            }else if(liters > 0) {
                fromLiters(liters);
            }else if(tblespn > 0) {
                fromTbsp(tblespn);
            }else if(teasp > 0) {
                fromTsp(teasp);
            }

            cupInput.setText(String.valueOf(cups));
            quartInput.setText(String.valueOf(quarts));
            litInput.setText(String.valueOf(liters));
            tblspInput.setText(String.valueOf(tblespn));
            tspnInput.setText(String.valueOf(teasp));
            }
        });

        clearButton = (Button) findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cupInput.setText("0");
                quartInput.setText("0");
                litInput.setText("0");
                tblspInput.setText("0");
                tspnInput.setText("0");



            }
        });
    }

    private void fromCups(double cps) {
        quarts = cps *.25;
        liters = cps * 0.236588;
        tblespn = cps * 16;
        teasp = cps * 48;
    }

    private void fromQuarts(double qts) {
        cups = qts * 4;
        liters = qts * 0.946353;
        tblespn = qts * 64;
        teasp = qts * 192;
    }

    private void fromLiters(double lts) {
        cups = lts * 4.22675;
        quarts = lts * 1.05669;
        tblespn = lts * 67.628;
        teasp = lts * 202.884;
    }

    private void  fromTbsp(double tbps) {
        cups = tbps * 0.0625;
        quarts = tbps * 0.015625;
        liters = tbps * 0.0147868;
        teasp = tbps * 3;
    }

    private  void fromTsp(double tsps) {
        cups = tsps * 0.0208333;
        quarts = tsps * 0.00520833;
        liters = tsps * 0.00492892;
        tblespn = tsps * 0.333333;
    }
}
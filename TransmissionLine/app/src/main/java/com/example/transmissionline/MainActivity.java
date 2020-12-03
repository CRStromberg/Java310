package com.example.transmissionline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*
    Values needed from User
    Speaker Part Number
    Speaker diameter
    Speaker depth
    Fs(in Hz)
    Sd(in sq in)
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
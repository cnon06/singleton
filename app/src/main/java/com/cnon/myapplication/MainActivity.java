package com.cnon.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // singleton sing = new singleton(); // wrong vay
        singleton sing1 = singleton.getInstance();
        singleton sing2 = singleton.getInstance();// right vay;

        ordinary ordinary1 = new ordinary();
        ordinary ordinary2 = new ordinary();

        Log.e("Output ","whether sing1 equals sing2: "+(sing1==sing2));
        Log.e("Output ","whether ordinary1 equals ordinary2: "+(ordinary1==ordinary2));
      //  System.out.println();


    }
}
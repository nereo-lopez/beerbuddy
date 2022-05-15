package com.hfad.beerbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class BeerActivity extends AppCompatActivity {

    //Spinner button class//
    TextView status;
    Spinner beers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer);

        status=findViewById(R.id.spinnerState);
        beers=findViewById(R.id.beerType);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.array.beerTypes, android.R.layout.simple_spinner_item);

        beers.setAdapter(adapter);
    }
}
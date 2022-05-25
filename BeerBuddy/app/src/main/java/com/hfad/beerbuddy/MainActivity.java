package com.hfad.beerbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //App button objects//
    Button beerListButton, locationListButton, storeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beerListButton=findViewById(R.id.tap4Beer);

        //Beer choice button//
        beerListButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                openBeerActivity(); //Opening the BeerActivity Activity//
            }
        });
    }

    public void openBeerActivity(){

        Intent intent = new Intent(this, BeerActivity.class);
        startActivity(intent);
    }
}
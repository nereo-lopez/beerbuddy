package com.hfad.beerbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BeerActivity extends AppCompatActivity {
    //Button objects//
    Button stoutListButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beer);

        stoutListButton=findViewById(R.id.stoutButton);

        //User selected stout beers//
        stoutListButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                openStoutList(); //Opens the stout host activity//
            }
        });
    }

    public void openStoutList(){

        Intent intent = new Intent(this, stoutListDetailHostActivity.class);
        startActivity(intent);
    }
}
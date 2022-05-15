package com.hfad.beerbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //App button objects//
    Button beerListButton, locationListButton, storeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beerListButton=findViewById(R.id.tap4Beer);

        beerListButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                Toast.makeText(getApplicationContext(),"Probando boton de cheves",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
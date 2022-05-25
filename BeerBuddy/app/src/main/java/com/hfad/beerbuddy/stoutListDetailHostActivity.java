package com.hfad.beerbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.hfad.beerbuddy.databinding.ActivityStoutlistDetailBinding;

import java.net.URL;

public class stoutListDetailHostActivity extends AppCompatActivity {

    Button goToMadueno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        goToMadueno=findViewById(R.id.mdn);

        //User us directed to the company site//
        goToMadueno.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                openMDNlink(); //Opens the Madueno host activity//
            }
        });

        ActivityStoutlistDetailBinding binding = ActivityStoutlistDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment_stoutlist_detail);
        NavController navController = navHostFragment.getNavController();
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.
                Builder(navController.getGraph())
                .build();

        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_stoutlist_detail);
        return navController.navigateUp() || super.onSupportNavigateUp();
    }

    public void openMDNlink(){

        Intent intent = new Intent(this, stoutListDetailHostActivity.class);
        startActivity(intent);
    }

}
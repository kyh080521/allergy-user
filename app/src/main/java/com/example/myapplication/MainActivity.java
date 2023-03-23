package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.journeyapps.barcodescanner.ScanContract;
import com.journeyapps.barcodescanner.ScanOptions;

public class MainActivity<MyActivity> extends AppCompatActivity {
    private CheckBox egg_k, beef_k, pork_k, chicken_k, shrimp_k, crab_k, squid_k, mackerel_k, shellfish_k, milk_k, peach_k, peanut_k, walnut_k, pine_nut_k, tomato_k, soybean_k, wheat_k, buck_wheat_k, sulfurous_acid_k;

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    private final ActivityResultLauncher<ScanOptions> barcodeLauncher = registerForActivityResult(new ScanContract(),
            result -> {
                if(result.getContents() == null) {
                    Toast.makeText(MainActivity.this, "Cancelled", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Scanned: " + result.getContents(), Toast.LENGTH_LONG).show();
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        egg_k = findViewById(R.id.checkBox_egg_k);
        beef_k = findViewById(R.id.checkBox_beef_k);
        pork_k = findViewById(R.id.checkBox_pork_k);
        chicken_k = findViewById(R.id.checkBox_chicken_k);
        shrimp_k = findViewById(R.id.checkBox_shrimp_k);
        crab_k = findViewById(R.id.checkBox_crab_k);
        squid_k = findViewById(R.id.checkBox_squid_k);
        mackerel_k = findViewById(R.id.checkBox_mackerel_k);
        shellfish_k = findViewById(R.id.checkBox_shellfish_k);
        milk_k = findViewById(R.id.checkBox_milk_k);
        peach_k = findViewById(R.id.checkBox_peach_k);
        peanut_k = findViewById(R.id.checkBox_peanut_k);
        walnut_k = findViewById(R.id.checkBox_walnut_k);
        pine_nut_k = findViewById(R.id.checkBox_pine_nut_k);
        tomato_k = findViewById(R.id.checkBox_tomato_k);
        soybean_k = findViewById(R.id.checkBox_soybean_k);
        wheat_k = findViewById(R.id.checkBox_wheat_k);
        buck_wheat_k = findViewById(R.id.checkBox_buck_wheat_k);
        sulfurous_acid_k = findViewById(R.id.checkBox_sulfurous_acid_k);

        egg_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean eggAlK = false;
                if(egg_k.isChecked()){
                    eggAlK = true;
                }
            }
        });
        beef_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean beefAlK = false;
                if(beef_k.isChecked()){
                    beefAlK = true;
                }
            }
        });
        pork_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean porkAlK = false;
                if(pork_k.isChecked()){
                    porkAlK = true;
                }
            }
        });
        chicken_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean chickenAlK = false;
                if(chicken_k.isChecked()){
                    chickenAlK = true;
                }
            }
        });
        shrimp_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean shrimpAlK = false;
                if(shrimp_k.isChecked()){
                    shrimpAlK = true;
                }
            }
        });
       crab_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean crabAlK = false;
                if(crab_k.isChecked()){
                    crabAlK = true;
                }
            }
        });
        squid_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean squidAlK = false;
                if(squid_k.isChecked()){
                    squidAlK = true;
                }
            }
        });
       mackerel_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean mackerelAlK = false;
                if(mackerel_k.isChecked()){
                    mackerelAlK = true;
                }
            }
        });
        shellfish_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean shellfishAlK = false;
                if(shellfish_k.isChecked()){
                    shellfishAlK = true;
                }
            }
        });
        milk_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean shellfishAlK = false;
                if(milk_k.isChecked()){
                    shellfishAlK = true;
                }
            }
        });
        peach_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean peachAlK = false;
                if(peach_k.isChecked()){
                    peachAlK = true;
                }
            }
        });
        peanut_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean peanutAlK = false;
                if(peanut_k.isChecked()){
                    peanutAlK = true;
                }
            }
        });
       walnut_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean walnutAlK = false;
                if(walnut_k.isChecked()){
                    walnutAlK = true;
                }
            }
        });
       pine_nut_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean pineNutAlK = false;
                if(pine_nut_k.isChecked()){
                    pineNutAlK = true;
                }
            }
        });
        tomato_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean tomatoAlK = false;
                if(tomato_k.isChecked()){
                    tomatoAlK = true;
                }
            }
        });
        soybean_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean soybeanAlK = false;
                if(soybean_k.isChecked()){
                    soybeanAlK = true;
                }
            }
        });
       wheat_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean wheatAlK = false;
                if(wheat_k.isChecked()){
                    wheatAlK = true;
                }
            }
        });
        buck_wheat_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean buckWheatAlK = false;
                if(buck_wheat_k.isChecked()){
                    buckWheatAlK = true;
                }
            }
        });
       sulfurous_acid_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean sulfurousAlK = false;
                if(sulfurous_acid_k.isChecked()){
                    sulfurousAlK = true;
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void onButtonClick(View view) {
        barcodeLauncher.launch(new ScanOptions());
    }}
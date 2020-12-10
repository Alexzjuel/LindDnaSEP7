package com.e.linddnasep7.Dispensers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.e.linddnasep7.Battery.BatteryActivity;
import com.e.linddnasep7.Gel.GelActivity;
import com.e.linddnasep7.MainScreen.MainActivity;
import com.e.linddnasep7.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DispenserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispenser);

        //Nav bar
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.dispenser);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuitem) {
                switch (menuitem.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.dispenser:
                        return true;
                    case R.id.battery:
                        startActivity(new Intent(getApplicationContext()
                                , BatteryActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.gel:
                        startActivity(new Intent(getApplicationContext()
                                , GelActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });




    }
}
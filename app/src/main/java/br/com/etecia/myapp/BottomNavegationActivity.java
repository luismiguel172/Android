package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavegationActivity extends AppCompatActivity {

    BottomNavigationView idBottomNavegation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navegation_layout);

        idBottomNavegation = findViewById(R.id.idBottomNavegation);

        idBottomNavegation.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.NavFavorite:
                        startActivity(new Intent(getApplicationContext(),
                                MainActivity.class));
                        break;
                    case R.id.NavMusic:
                        Toast.makeText(getApplicationContext(),
                                "CLiquei na nota musical", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.NavNewsPaper:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no News", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.NavPlaces:
                        Toast.makeText(getApplicationContext(),
                                "Cliqeui no Lugar", Toast.LENGTH_SHORT).show();
                        break;

                }
            }

        });


    }
}
package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {

    MaterialToolbar idToolBar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idToolBar = findViewById(R.id.idToolBar);

        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Cliquei no menu",
                        Toast.LENGTH_SHORT).show();


            }



        });

        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch(item.getItemId()) {

                    case R.id.Favoritos:
                        startActivity(new Intent(getApplicationContext(),
                                BottomNavActivity.class));
                        break;
                    case R.id.Compartilhar:
                        startActivity(new Intent(getApplicationContext(),
                                BottomNavegationActivity.class));
                        break;
                    case R.id.Pesquisar:
                        Toast.makeText(getApplicationContext(), "Cliquei no Pesquisar", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Notificação:
                        Toast.makeText(getApplicationContext(), "Cliquei no Notificação", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Salvar:
                        Toast.makeText(getApplicationContext(), "Cliquei no Salvar", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}
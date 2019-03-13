package com.example.armando.aplicacionvacia;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnvMenuOpciones;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnvMenuOpciones = findViewById(R.id.bnvMenuOpciones);

        bnvMenuOpciones.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.mAcercade:
                        Toast.makeText(getApplicationContext(),"Acerca de",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mAlbum:
                        Toast.makeText(getApplicationContext(),"Música",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}

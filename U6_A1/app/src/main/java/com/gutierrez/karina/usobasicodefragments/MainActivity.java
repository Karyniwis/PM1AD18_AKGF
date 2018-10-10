package com.gutierrez.karina.usobasicodefragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFragmentoA = (Button) findViewById(R.id.btnFragmentoA);
        btnFragmentoA.setOnClickListener(new View.OnClickListener() {
          FragmentA fragmentoA = new FragmentA();

            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragmentoA).commit();
            }
        });

        Button btnFragmentoB = (Button) findViewById(R.id.btnFragmentoB);
        btnFragmentoB.setOnClickListener(new View.OnClickListener() {
            FragmentB fragmentoB = new FragmentB();

            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,fragmentoB).commit();
            }
        });
    }
}

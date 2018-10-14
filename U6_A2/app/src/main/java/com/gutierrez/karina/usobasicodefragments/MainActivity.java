package com.gutierrez.karina.usobasicodefragments;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnFragmentoA = (Button) findViewById(R.id.btnFragmentoA);
        btnFragmentoA.setOnClickListener(new View.OnClickListener() {
          FragmentA fragmentoA = new FragmentA();

            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN) .replace(R.id.contenedor,fragmentoA).addToBackStack(null).commit();
            }
        });

        final Button btnFragmentoB = (Button) findViewById(R.id.btnFragmentoB);
        btnFragmentoB.setOnClickListener(new View.OnClickListener() {
            FragmentB fragmentoB = new FragmentB();

            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.enter_anim,R.anim.exit_anim).replace(R.id.contenedor,fragmentoB).addToBackStack(null).commit();
            }
        });
    }
}

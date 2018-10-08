package com.gutierrez.karina.soportediferentesversiones;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import static android.os.Build.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int versionSDK = VERSION.SDK_INT;
        Toast.makeText(MainActivity.this,"Versión: "+versionSDK, Toast.LENGTH_LONG).show();
        if(VERSION.SDK_INT >= VERSION_CODES.M){
            setContentView(R.layout.activity_main);
        } else{
            setContentView(R.layout.activity_maindos);
        }
    }
}

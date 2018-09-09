package com.gutierrez.karina.loginpasedat.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.gutierrez.karina.loginpasedat.R;
import com.gutierrez.karina.loginpasedat.activities.models.Usuario;

public class MainActivity extends Activity {
public static final int LOGIN_INTENT_CODE=20;
public static final int ALUMNOS_INTENT_CODE=25;
    TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent loginIntent=new Intent(MainActivity.this,Login.class);
        loginIntent.putExtra("titulo","BIENVENIDO AUTENTICATE");
        startActivityForResult(loginIntent,LOGIN_INTENT_CODE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==LOGIN_INTENT_CODE){
            //Usuario
            TextView mTextView= new TextView(this);
            Usuario resultado=(Usuario)data.getSerializableExtra("resultado");
            if(resultado!=null){
                nombre=(TextView)findViewById(R.id.txtNombre);
                nombre.setText((CharSequence) getIntent().getSerializableExtra("resultado"));
                mTextView.setText("TUS DATOS SON:"+"\n"+"\n"+"Nombre: "+resultado.getNombre()+"\n"+"\n"+"Apellido Paterno: "+resultado.getApepa()+"\n"+"\n"+"Apellido Materno: "+resultado.getApema()+"\n"+"\n"+"Usuario: "+resultado.getUsuario()+"\n"+"\n"+"Password: "+resultado.getPassword());

                setContentView(mTextView);
            }
        }
    }
}

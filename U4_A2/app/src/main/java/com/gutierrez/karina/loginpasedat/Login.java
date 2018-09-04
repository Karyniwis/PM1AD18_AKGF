package com.gutierrez.karina.loginpasedat;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity {
    EditText usuario,password;
    Button btnLogin;
    TextView titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario=(EditText) findViewById(R.id.txtUusario);
        password=(EditText)findViewById(R.id.txtpassword);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        titulo=(TextView)findViewById(R.id.txtTitulo);
        titulo.setText(getIntent().getStringExtra("titulo"));
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent respuesta=new Intent();
                respuesta.putExtra("usuario",usuario.getText().toString());
                respuesta.putExtra("password",password.getText().toString());
                setResult(MainActivity.LOGIN_INTENT_CODE,respuesta);
                finish();
            }
        });
    }

}

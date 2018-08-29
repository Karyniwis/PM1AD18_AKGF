package com.gutierrez.karina.ciclodevida;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
TextView txtState;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtState=(TextView) findViewById(R.id.txtState);
        txtState.setMovementMethod(new ScrollingMovementMethod());
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.d("ESTATE", "ON CREATE");
        txtState.setText(txtState.getText()+"\n ON CREATE");
    }
    @Override protected void onStart() {
        super.onStart();
        txtState=(TextView) findViewById(R.id.txtState);
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.d("ESTATE", "ON START");
        txtState.setText(txtState.getText()+"\n ON START");
    }
    @Override protected void onRestart() {
        super.onRestart();
        txtState=(TextView) findViewById(R.id.txtState);
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        Log.d("ESTATE", "ON RESTART");
        txtState.setText(txtState.getText()+"\n ON RESTART");
    }
    @Override protected void onResume() {
        super.onResume();
        txtState=(TextView) findViewById(R.id.txtState);
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.d("ESTATE", "ON RESUME");
        txtState.setText(txtState.getText()+"\n ON RESUME");
    }

    @Override protected void onPause() {
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.d("ESTATE", "ON PAUSE");
        super.onPause();
        txtState=(TextView) findViewById(R.id.txtState);
        txtState.setText(txtState.getText()+"\n ON PAUSE");
    }

    @Override protected void onStop() {
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
        txtState=(TextView) findViewById(R.id.txtState);
        Log.d("ESTATE", "ON STOP");
        txtState.setText(txtState.getText()+"\n ON STOP");
    }

    @Override protected void onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
        txtState=(TextView) findViewById(R.id.txtState);
        Log.d("ESTATE", "ON DESTROY");
        txtState.setText(txtState.getText()+"\n ON DESTROY");
    }
}

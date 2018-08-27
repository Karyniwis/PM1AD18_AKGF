package com.gutierrez.karina.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView txtResultado;
    double n1, n2, resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_alterna);
    }
    public void btnCero(View view){
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(txtResultado.getText()+"0");
    }

    public void btnUno(View view){
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(txtResultado.getText()+"1");
    }
    public void btnDos(View view){
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(txtResultado.getText()+"2");
    }
    public void btnTres(View view){
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(txtResultado.getText()+"3");
    }
    public void btnCuatro(View view){
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(txtResultado.getText()+"4");
    }
    public void btnCinco(View view){
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(txtResultado.getText()+"5");
    }
    public void btnSeis(View view){
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(txtResultado.getText()+"6");
    }
    public void btnSiete(View view){
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(txtResultado.getText()+"7");
    }
    public void btnOcho(View view){
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(txtResultado.getText()+"8");
    }
    public void btnNueve(View view){
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(txtResultado.getText()+"9");
    }
    public void btnPunto(View view){
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(txtResultado.getText()+".");
    }

    public  void onClickNumero1(View view)
    {
        txtResultado=(TextView) findViewById(R.id.txtResultado);
        n1 = Double.parseDouble(txtResultado.getText().toString());
        txtResultado.setText("");
    }
    public void Sumar(View view)
    {
        try{
            operador = "+";
            onClickNumero1(view);
        }
        catch(Exception exception){

        }

    }
    public void Restar(View view)
    {
        try{
            if(txtResultado.getText()==""){
                txtResultado.setText(txtResultado.getText()+"-");
            }else{
                operador = "-";
                onClickNumero1(view);
            }
        }
        catch (Exception exception){

        }
    }
    public void Multiplicar(View view)
    {
        try{
            operador = "*";
            onClickNumero1(view);
        }
        catch (Exception exception){

        }

    }
    public void Dividir(View view)
    {
        try{
            operador = "/";
            onClickNumero1(view);
        }
        catch (Exception exception){

        }
    }
    public void btnIgual(View view){
        n2= Double.parseDouble(txtResultado.getText().toString());

        if(operador.equals("+"))
        {
            resultado= n1 + n2;
        }else if(operador.equals("-"))
        {
            resultado= n1 - n2;
        }else if(operador.equals("*"))
        {
            resultado= n1 * n2;
        }else if(operador.equals("/"))
        {
            resultado= n1 / n2;
        }
        txtResultado.setText(""+resultado);
    }
    public void btnCleaner (View view)
    {
       n1 = 0.0;
       n2 = 0.0;
       txtResultado = (TextView) findViewById(R.id.txtResultado);
       txtResultado.setText("");
    }
}

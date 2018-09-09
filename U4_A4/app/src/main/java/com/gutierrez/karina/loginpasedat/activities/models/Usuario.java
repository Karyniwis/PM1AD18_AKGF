package com.gutierrez.karina.loginpasedat.activities.models;
import java.io.Serializable;

public class Usuario implements Serializable {
    private String usuario;
    private String password;
    private String nombre;
    private String apepa;
    private String apema;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepa() {
        return apepa;
    }

    public void setApepa(String apepa) {
        this.apepa = apepa;
    }

    public String getApema() {
        return apema;
    }

    public void setApema(String apema) {
        this.apema = apema;
    }

    public Usuario(String usuario, String password, String nombre, String apepa, String apema) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.apepa = apepa;
        this.apema = apema;
    }
    //   public Usuario(String usuario, String password) {
  //      this.usuario = usuario;
 //       this.password = password;
  //  }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

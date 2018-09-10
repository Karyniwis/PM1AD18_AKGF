package com.gutierrez.karina.loginpasedat.activities.daos;

import android.content.Intent;

import com.gutierrez.karina.loginpasedat.activities.Login;
import com.gutierrez.karina.loginpasedat.activities.MainActivity;
import com.gutierrez.karina.loginpasedat.activities.models.Usuario;

import java.util.HashSet;
import java.util.Set;

public class UsuariosDao {
    Set<Usuario>listaUsuarioDao;

    public UsuariosDao() {
        listaUsuarioDao=new HashSet<>();
    }

    public Set<Usuario> getUsuarios(){
        listaUsuarioDao.add(new Usuario("kary","123","Karina","Gutierrez","Flores"));
        listaUsuarioDao.add(new Usuario("lala","1234","Juan","Lopez","Sanchez"));
        listaUsuarioDao.add(new Usuario("tata","12345","Ramon","Duran","Tenorio"));

        return listaUsuarioDao;
    }
    public Usuario usuarioExist(final Usuario validar) {
        listaUsuarioDao = getUsuarios();
        for (Usuario usr : listaUsuarioDao)
        {
            if(usr.getUsuario().equals(validar.getUsuario().toString())&&usr.getPassword().equals(validar.getPassword().toString()))

                return new Usuario(usr.getUsuario(),usr.getPassword(),usr.getNombre(),usr.getApepa(),usr.getApema());
        }
        return null;
    }


}


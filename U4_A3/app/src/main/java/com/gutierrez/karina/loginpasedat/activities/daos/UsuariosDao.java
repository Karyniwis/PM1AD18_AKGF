package com.gutierrez.karina.loginpasedat.activities.daos;

import com.gutierrez.karina.loginpasedat.activities.models.Usuario;

import java.util.HashSet;
import java.util.Set;

public class UsuariosDao {
    Set<Usuario>listaUsuarioDao;

    public UsuariosDao() {
        listaUsuarioDao=new HashSet<>();
    }

    public Set<Usuario> getUsuarios(){
        listaUsuarioDao.add(new Usuario("kary","123"));
        listaUsuarioDao.add(new Usuario("lala","1234"));
        listaUsuarioDao.add(new Usuario("tata","12345"));

        return listaUsuarioDao;
    }
    public boolean usuarioExist(final Usuario validar){
        //implementar un compare
        listaUsuarioDao=getUsuarios();
        for (Usuario usr:listaUsuarioDao)
        {
           if(usr.getUsuario().equals(validar.getUsuario().toString())&&usr.getPassword().equals(validar.getPassword().toString()))
                    return true;
        }

       // boolean rex=listaUsuarioDao.contains(validar);
        return false;
    }
}


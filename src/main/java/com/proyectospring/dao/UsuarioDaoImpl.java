package com.proyectospring.dao;

import com.proyectospring.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class UsuarioDaoImpl implements UsuarioDao{

    @Override
    public List<Usuario> getUsuarios() {
        return null;
    }
}

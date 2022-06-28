package com.proyectospring.controllers;


import com.proyectospring.models.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Caleb");
        usuario.setApellido("Loria");
        usuario.setEmail("calebloria@gmail.com");
        usuario.setTelefono("72973331");
        usuario.setPassword("123");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(123L);
        usuario.setNombre("Caleb");
        usuario.setApellido("Loria");
        usuario.setEmail("calebloria@gmail.com");
        usuario.setTelefono("72973331");
        usuario.setPassword("123");

        Usuario usuario2 = new Usuario();
        usuario2.setId(321L);
        usuario2.setNombre("Maria");
        usuario2.setApellido("Fallas");
        usuario2.setEmail("mfallas@gmail.com");
        usuario2.setTelefono("88993331");
        usuario2.setPassword("321");

        Usuario usuario3 = new Usuario();
        usuario3.setId(132L);
        usuario3.setNombre("Lucas");
        usuario3.setApellido("Moy");
        usuario3.setEmail("lmoy@gmail.com");
        usuario3.setTelefono("73979087");
        usuario3.setPassword("132");


        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Caleb");
        usuario.setApellido("Loria");
        usuario.setEmail("calebloria@gmail.com");
        usuario.setTelefono("72973331");
        usuario.setPassword("123");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Caleb");
        usuario.setApellido("Loria");
        usuario.setEmail("calebloria@gmail.com");
        usuario.setTelefono("72973331");
        usuario.setPassword("123");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Caleb");
        usuario.setApellido("Loria");
        usuario.setEmail("calebloria@gmail.com");
        usuario.setTelefono("72973331");
        usuario.setPassword("123");
        return usuario;
    }

}

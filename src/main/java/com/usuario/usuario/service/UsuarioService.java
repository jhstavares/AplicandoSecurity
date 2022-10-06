package com.usuario.usuario.service;

import com.usuario.usuario.model.UsuarioModel;
import com.usuario.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    private BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public List<UsuarioModel> buscarUsuarios() {
        return usuarioRepository.findAll();
    }

    public UsuarioModel castrarUsuario(UsuarioModel usuarioModel) {
        usuarioModel.setSenha(passwordEncoder().encode(usuarioModel.getSenha()));

        return usuarioRepository.save(usuarioModel);
    }
}

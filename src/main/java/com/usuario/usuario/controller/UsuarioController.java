package com.usuario.usuario.controller;

import com.usuario.usuario.model.UsuarioModel;
import com.usuario.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping(path = "/usuarios")
    public ResponseEntity<List<UsuarioModel>> buscar() {
        return ResponseEntity.ok(usuarioService.buscarUsuarios());
    }

    @PostMapping(path = "/usuarios/create")
    public ResponseEntity<UsuarioModel> cadastrar(@RequestBody UsuarioModel usuarioModel) {
        UsuarioModel usuarioNovo = usuarioService.castrarUsuario(usuarioModel);
        return new ResponseEntity<>(usuarioNovo, HttpStatus.CREATED);
    }
}

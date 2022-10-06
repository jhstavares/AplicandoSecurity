package com.usuario.usuario.repository;

import com.usuario.usuario.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <UsuarioModel, Long>{
}

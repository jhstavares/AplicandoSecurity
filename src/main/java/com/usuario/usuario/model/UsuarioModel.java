package com.usuario.usuario.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeUsuario;

    @Column(nullable = false)
    private String idade;

    @Column(nullable = false, unique = true)
    private String telefone;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String senha;
}

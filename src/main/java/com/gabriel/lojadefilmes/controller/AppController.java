package com.gabriel.lojadefilmes.controller;

import com.gabriel.lojadefilmes.repository.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping(value = "/teste")
    public String paginaInicial() {
        return "index";
    }

}

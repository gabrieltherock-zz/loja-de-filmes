package com.gabriel.lojadefilmes.controller;

import com.gabriel.lojadefilmes.model.usuario.Usuario;
import com.gabriel.lojadefilmes.repository.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping( "")
    public String paginaInicial() {
        return "index";
    }

    @GetMapping("/cadastro")
    public String getCadastroForm(Model model) {
        model.addAttribute(new Usuario());
        return "cadastroForm";
    }

    @PostMapping("/cadastro")
    public String cadastraUsuario(Usuario usuario) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(usuario.getSenha());
        usuario.setSenha(encodedPassword);

        usuarioRepository.save(usuario);

        return "cadastroComSucesso";
    }
}

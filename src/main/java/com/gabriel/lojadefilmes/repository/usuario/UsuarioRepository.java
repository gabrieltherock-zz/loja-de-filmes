package com.gabriel.lojadefilmes.repository.usuario;

import com.gabriel.lojadefilmes.model.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}

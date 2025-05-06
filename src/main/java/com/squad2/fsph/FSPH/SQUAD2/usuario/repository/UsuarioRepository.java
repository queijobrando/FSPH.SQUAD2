package com.squad2.fsph.FSPH.SQUAD2.usuario.repository;

import com.squad2.fsph.FSPH.SQUAD2.usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    UserDetails findByLogin(String login); //consulta do ususario no banco de dados
}

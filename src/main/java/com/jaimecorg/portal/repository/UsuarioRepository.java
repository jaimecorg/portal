package com.jaimecorg.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaimecorg.portal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Usuario findByNombre(String nombre);

}
package com.example.aplicacion_prueba.repositories;

import com.example.aplicacion_prueba.models.TipoIdentificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Repositorio conectado por JPA
public interface TipoIdentificacionRepositorio extends JpaRepository<TipoIdentificacion, Integer> {
}

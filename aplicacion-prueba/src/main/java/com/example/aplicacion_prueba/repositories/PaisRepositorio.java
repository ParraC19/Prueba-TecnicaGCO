package com.example.aplicacion_prueba.repositories;

import com.example.aplicacion_prueba.models.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repositorio conectado por JPA
@Repository
public interface PaisRepositorio extends JpaRepository<Pais, Integer> {

}

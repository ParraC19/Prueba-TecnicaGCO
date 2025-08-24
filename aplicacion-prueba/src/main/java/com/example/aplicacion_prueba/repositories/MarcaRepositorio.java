package com.example.aplicacion_prueba.repositories;

import com.example.aplicacion_prueba.models.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepositorio extends JpaRepository<Marca, Integer> {
}

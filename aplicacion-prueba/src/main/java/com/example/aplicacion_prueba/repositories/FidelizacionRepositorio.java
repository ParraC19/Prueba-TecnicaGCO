package com.example.aplicacion_prueba.repositories;

import com.example.aplicacion_prueba.models.Fidelizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FidelizacionRepositorio extends JpaRepository<Fidelizacion, Integer> {
}

package com.example.aplicacion_prueba.repositories;

import com.example.aplicacion_prueba.models.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

//Repositorio conectado por JPA
@Repository
public interface CiudadRepositorio extends JpaRepository<Ciudad, Integer> {
    // Busqueda de ciudades por departamento(ById)
    List<Ciudad> findByDepartamento_IdDepartamento(Integer IdDepartamento);

}

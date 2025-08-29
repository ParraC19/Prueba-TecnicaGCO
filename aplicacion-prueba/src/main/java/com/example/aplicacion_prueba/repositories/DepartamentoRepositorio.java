package com.example.aplicacion_prueba.repositories;

import com.example.aplicacion_prueba.models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Repositorio conectado por JPA
@Repository
public interface DepartamentoRepositorio extends JpaRepository<Departamento, Integer> {

    // Busqueda de departamentos por pais(ById)
    List<Departamento> findByPais_IdPais(Integer IdPais);
}

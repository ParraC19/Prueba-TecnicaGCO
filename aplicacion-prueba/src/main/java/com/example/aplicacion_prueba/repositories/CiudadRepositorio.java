package com.example.aplicacion_prueba.repositories;

import com.example.aplicacion_prueba.models.Ciudad;
import com.example.aplicacion_prueba.models.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CiudadRepositorio extends JpaRepository<Ciudad, Integer> {

    List<Ciudad> findByDepartamento_IdDepartamento(Integer IdDepartamento);

}

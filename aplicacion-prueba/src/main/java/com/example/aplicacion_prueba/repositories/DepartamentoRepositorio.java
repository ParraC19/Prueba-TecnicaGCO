package com.example.aplicacion_prueba.repositories;

import com.example.aplicacion_prueba.models.Departamento;
import com.example.aplicacion_prueba.models.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentoRepositorio extends JpaRepository<Departamento, Integer> {


    List<Departamento> findByPais_IdPais(Integer IdPais);
}

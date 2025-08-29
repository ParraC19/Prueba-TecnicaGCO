package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.Departamento;
import com.example.aplicacion_prueba.repositories.DepartamentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoServicio {

    // Servicio conectado a repositorio
    @Autowired
    DepartamentoRepositorio departamentoRepositorio;

    // Obtener todos los departamentos findAll()
    public List<Departamento> obtenerDepartamentos(){
        return departamentoRepositorio.findAll();
    }

    // Obtener departamentos por id findById()
    public Optional<Departamento> obtenerPorId(Integer idDepartamento) {
        return departamentoRepositorio.findById(idDepartamento);
    }

    // Obtener los departamentos por pais findByPais()
    public List<Departamento> obtenerPorPais (Integer idPais) {
        return departamentoRepositorio.findByPais_IdPais(idPais);
    }



}

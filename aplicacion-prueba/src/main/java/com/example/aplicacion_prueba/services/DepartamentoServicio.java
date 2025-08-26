package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.Departamento;
import com.example.aplicacion_prueba.repositories.DepartamentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoServicio {


    @Autowired
    DepartamentoRepositorio departamentoRepositorio;

    public List<Departamento> obtenerDepartamentos(){
        return departamentoRepositorio.findAll();
    }

    public Optional<Departamento> obtenerPorId(Integer idDepartamento) {
        return departamentoRepositorio.findById(idDepartamento);
    }

    public List<Departamento> obtenerPorPais (Integer idPais) {
        return departamentoRepositorio.findByPais_IdPais(idPais);
    }



}

package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.Departamento;
import com.example.aplicacion_prueba.repositories.DepartamentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartamentoServicio {

    @Autowired
    DepartamentoRepositorio departamentoRepositorio;

    public List<Departamento> obtenerDepartamentos(){
        return departamentoRepositorio.findAll();
    }

    public List<Departamento> obtenerPorPais (Integer idPais) {
        return departamentoRepositorio.findByPais_IdPais(idPais);
    }
}

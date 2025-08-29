package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.Ciudad;
import com.example.aplicacion_prueba.repositories.CiudadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CiudadServicio {

    @Autowired
    CiudadRepositorio ciudadRepositorio;

    public List<Ciudad> obtenerCiudad() {
        return ciudadRepositorio.findAll();
    }

    public List<Ciudad> obtenerPorDepartamento(Integer idDepartamento) {
        return  ciudadRepositorio.findByDepartamento_IdDepartamento(idDepartamento);
    }
}

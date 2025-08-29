package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.Ciudad;
import com.example.aplicacion_prueba.repositories.CiudadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CiudadServicio {

    //Servicio conectado a repositorio(consultas)
    @Autowired
    CiudadRepositorio ciudadRepositorio;

    // Obtener todas las ciudades findAll()
    public List<Ciudad> obtenerCiudad() {
        return ciudadRepositorio.findAll();
    }

    // Obtener las ciudades por id findById()
    public Optional<Ciudad> obtenerPorId(Integer idCiudad) {
        return ciudadRepositorio.findById(idCiudad);
    }

    // Obtener ciudades por departamentos findByDepartamentos()
    public List<Ciudad> obtenerPorDepartamento(Integer idDepartamento) {
        return  ciudadRepositorio.findByDepartamento_IdDepartamento(idDepartamento);
    }



}

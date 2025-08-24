package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.Ciudad;
import com.example.aplicacion_prueba.repositories.CiudadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadServicio {

    @Autowired
    CiudadRepositorio repository;

    public boolean guardarCiudad(Ciudad datosCiudad) throws Exception{
        try {
            repository.save(datosCiudad);
            return true;
        } catch (Exception error){
            throw new Exception(error .getMessage());
        }
    }
}

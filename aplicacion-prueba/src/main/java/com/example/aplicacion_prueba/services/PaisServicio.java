package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.Pais;
import com.example.aplicacion_prueba.repositories.PaisRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PaisServicio {

    // Servicio conectado a repositorio
    @Autowired
    PaisRepositorio paisRepositorio;

    // Obtener todos los paises findAll()
    public List<Pais> obtenerPaises(){
        return paisRepositorio.findAll();
    }

    // Obtener paises por id findById()
    public Optional<Pais> obtenerPorId(Integer idPais){
        return paisRepositorio.findById(idPais);
    }
}

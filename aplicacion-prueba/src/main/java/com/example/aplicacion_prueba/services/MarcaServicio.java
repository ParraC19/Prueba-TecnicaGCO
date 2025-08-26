package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.Marca;
import com.example.aplicacion_prueba.repositories.MarcaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaServicio {

    @Autowired
    MarcaRepositorio marcaRepositorio;

    public List<Marca> obtenerMarca(){
        return marcaRepositorio.findAll();
    }

    public Optional<Marca> obtenerConId(Integer idMarca) {
        return marcaRepositorio.findById(idMarca);
    }

}

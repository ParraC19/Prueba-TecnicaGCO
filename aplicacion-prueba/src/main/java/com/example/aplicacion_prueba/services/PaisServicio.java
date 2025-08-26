package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.Pais;
import com.example.aplicacion_prueba.repositories.DepartamentoRepositorio;
import com.example.aplicacion_prueba.repositories.PaisRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaisServicio {


    @Autowired
    PaisRepositorio paisRepositorio;

    public List<Pais> obtenerPaises(){
        return paisRepositorio.findAll();
    }

    public Optional<Pais> obtenerPorId(Integer idPais){
        return paisRepositorio.findById(idPais);
    }





}

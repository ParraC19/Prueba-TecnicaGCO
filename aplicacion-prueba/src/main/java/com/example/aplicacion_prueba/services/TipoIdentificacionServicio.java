package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.TipoIdentificacion;
import com.example.aplicacion_prueba.repositories.TipoIdentificacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TipoIdentificacionServicio {

    @Autowired
    TipoIdentificacionRepositorio tipoIdentificacionRepositorio;

    public List<TipoIdentificacion> obtenerTipoIdentificacion() {
        return tipoIdentificacionRepositorio.findAll();
    }}

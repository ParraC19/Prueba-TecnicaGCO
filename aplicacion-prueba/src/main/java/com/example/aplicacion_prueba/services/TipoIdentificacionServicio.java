package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.TipoIdentificacion;
import com.example.aplicacion_prueba.repositories.TipoIdentificacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoIdentificacionServicio {

    @Autowired
    TipoIdentificacionRepositorio tipoIdentificacionRepositorio;

    public List<TipoIdentificacion> obtenerTipoIdentificacion() {
        return tipoIdentificacionRepositorio.findAll();
    }

    public Optional<TipoIdentificacion> obtenerPorId(Integer idTipoIdentificacion){
        return tipoIdentificacionRepositorio.findById(idTipoIdentificacion);
    }

    public TipoIdentificacion guardarTipoIdentificacion(TipoIdentificacion tipoIdentificacion){
        return tipoIdentificacionRepositorio.save(tipoIdentificacion);
    }


}

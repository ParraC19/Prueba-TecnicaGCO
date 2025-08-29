package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.TipoIdentificacion;
import com.example.aplicacion_prueba.repositories.TipoIdentificacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TipoIdentificacionServicio {

    // Servicio conectado a repositorio
    @Autowired
    TipoIdentificacionRepositorio tipoIdentificacionRepositorio;

    // Obtener todos los tipos de identificaciones findAll()
    public List<TipoIdentificacion> obtenerTipoIdentificacion() {
        return tipoIdentificacionRepositorio.findAll();
    }

    // Obtener tipos de identificacion por id findById()
    public Optional<TipoIdentificacion> obtenerPorId(Integer idTipoIdentificacion){
        return tipoIdentificacionRepositorio.findById(idTipoIdentificacion);
    }
}

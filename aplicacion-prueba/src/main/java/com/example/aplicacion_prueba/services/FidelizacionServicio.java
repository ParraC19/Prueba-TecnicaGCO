package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.Fidelizacion;
import com.example.aplicacion_prueba.repositories.FidelizacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FidelizacionServicio {

    @Autowired
    FidelizacionRepositorio fidelizacionRepositorio;

    public Fidelizacion guardarFidelizacion(Fidelizacion fidelizacion) {
        return fidelizacionRepositorio.save(fidelizacion);
    }
}

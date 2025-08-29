package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.Fidelizacion;
import com.example.aplicacion_prueba.services.FidelizacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fidelizaciones")
public class FidelizacionControlador {

    @Autowired
    FidelizacionServicio fidelizacionServicio;

    @PostMapping
    public Fidelizacion guardarFidelizacion(@RequestBody Fidelizacion fidelizacion) {
        return fidelizacionServicio.guardarFidelizacion(fidelizacion);
    }

}

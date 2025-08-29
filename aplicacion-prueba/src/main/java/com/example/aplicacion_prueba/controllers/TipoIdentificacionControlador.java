package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.TipoIdentificacion;
import com.example.aplicacion_prueba.services.TipoIdentificacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tipo-identificaciones")
public class TipoIdentificacionControlador {

    @Autowired
    TipoIdentificacionServicio tipoIdentificacionServicio;

    @GetMapping
    public List<TipoIdentificacion> obtenerTipoIdentificacion (){
        return tipoIdentificacionServicio.obtenerTipoIdentificacion();
    }
}

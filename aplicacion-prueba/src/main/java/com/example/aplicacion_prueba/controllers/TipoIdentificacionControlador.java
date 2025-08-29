package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.TipoIdentificacion;
import com.example.aplicacion_prueba.services.TipoIdentificacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Controlador con endpoint(/tipo-identificaciones)
@RestController
@RequestMapping("/tipo-identificaciones")
public class TipoIdentificacionControlador {

    // Controlador conectado a servicio
    @Autowired
    TipoIdentificacionServicio tipoIdentificacionServicio;

    // Mostrar todos los tipos de identificacion
    @GetMapping
    public List<TipoIdentificacion> obtenerTipoIdentificacion (){
        return tipoIdentificacionServicio.obtenerTipoIdentificacion();
    }

    // Mostrar tipos de identificaciones por id
    @GetMapping("/{idTipoIdentificacion}")
    public ResponseEntity<TipoIdentificacion> obtenerPorId (@PathVariable Integer idTipoIdentificacion) {
        return tipoIdentificacionServicio.obtenerPorId(idTipoIdentificacion)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}

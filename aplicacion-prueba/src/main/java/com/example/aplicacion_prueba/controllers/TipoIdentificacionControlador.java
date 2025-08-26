package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.TipoIdentificacion;
import com.example.aplicacion_prueba.services.TipoIdentificacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-identificacion")
public class TipoIdentificacionControlador {

    @Autowired
    TipoIdentificacionServicio tipoIdentificacionServicio;

    @GetMapping
    public List<TipoIdentificacion> obtenerTipoIdentificacion (){
        return tipoIdentificacionServicio.obtenerTipoIdentificacion();
    }

    @GetMapping("/{idTipoIdentificacion}")
    public ResponseEntity<TipoIdentificacion> obtenerPorId (@PathVariable Integer idTipoIdentificacion) {
        return tipoIdentificacionServicio.obtenerPorId(idTipoIdentificacion)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}

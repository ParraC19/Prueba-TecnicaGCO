package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.Pais;
import com.example.aplicacion_prueba.services.PaisServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Controlador con endpoint(/ciudades)
@RestController
@RequestMapping("/paises")
public class PaisControlador {

    // Controlador conectado a servicio
    @Autowired
    PaisServicio paisServicio;

    // Mostrar todos los paises
    @GetMapping
    public List<Pais> obtenerPaises(){
        return paisServicio.obtenerPaises();
    }

    // Mostrar paises por id
    @GetMapping("/{idPais}")
    public ResponseEntity<Pais> obtenerPorId(@PathVariable Integer idPais) {
        return paisServicio.obtenerPorId(idPais)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

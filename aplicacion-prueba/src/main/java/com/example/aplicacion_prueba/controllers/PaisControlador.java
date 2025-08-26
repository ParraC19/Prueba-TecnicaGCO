package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.Pais;
import com.example.aplicacion_prueba.services.PaisServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paises")
public class PaisControlador {

    @Autowired
    PaisServicio paisServicio;

    @GetMapping
    public List<Pais> obtenerPaises(){
        return paisServicio.obtenerPaises();
    }

    @GetMapping("/{idPais}")
    public ResponseEntity<Pais> obtenerPorId(@PathVariable Integer idPais) {
        return paisServicio.obtenerPorId(idPais)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

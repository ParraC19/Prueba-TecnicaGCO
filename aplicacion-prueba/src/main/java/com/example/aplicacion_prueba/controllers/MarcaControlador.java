package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.Marca;
import com.example.aplicacion_prueba.services.MarcaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/marcas")
public class MarcaControlador {

    @Autowired
    MarcaServicio marcaServicio;

    @GetMapping
    public List<Marca> obtenerMarcas(){
        return marcaServicio.obtenerMarca();
    }
}

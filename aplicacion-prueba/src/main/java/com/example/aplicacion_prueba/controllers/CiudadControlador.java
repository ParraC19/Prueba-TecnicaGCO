package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.Ciudad;
import com.example.aplicacion_prueba.services.CiudadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// Controlador con endpoint(/ciudades)
@RestController
@RequestMapping("/ciudades")
public class CiudadControlador {

    // Controlador conectado a servicio
    @Autowired
    CiudadServicio ciudadServicio;

    // Mostrar todas las ciudades
    @GetMapping
    public List<Ciudad> obtenerCiudades(){
        return ciudadServicio.obtenerCiudad();
    }

    // Mostrar todas las ciudades en x departamento
    @GetMapping("/departamentos/{idDepartamento}")
    public List<Ciudad> obtenerPorDepartamento(@PathVariable Integer idDepartamento) {
        return ciudadServicio.obtenerPorDepartamento(idDepartamento);
    }

    // Mostrar ciudades por id
    @GetMapping("/{idCiudad}")
    public ResponseEntity<Ciudad> obtenerPorId (Integer idCiudad) {
        return ciudadServicio.obtenerPorId(idCiudad)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.Ciudad;
import com.example.aplicacion_prueba.services.CiudadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/ciudades")
public class CiudadControlador {

    @Autowired
    CiudadServicio ciudadServicio;

    @GetMapping
    public List<Ciudad> obtenerCiudades(){
        return ciudadServicio.obtenerCiudad();
    }

    @GetMapping("/departamentos/{idDepartamento}")
    public List<Ciudad> obtenerPorDepartamento(@PathVariable Integer idDepartamento) {
        return ciudadServicio.obtenerPorDepartamento(idDepartamento);
    }
}

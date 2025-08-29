package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.Departamento;
import com.example.aplicacion_prueba.services.DepartamentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Controlador con endpoint(/departamentos)
@RestController
@RequestMapping("/departamentos")
public class DepartamentoControlador {

    // Controlador conectado a servicio
    @Autowired
    DepartamentoServicio departamentoServicio;

    // Mostrar todos los departamentos
    @GetMapping
    public List<Departamento> obtenerDepartamentos(){
        return departamentoServicio.obtenerDepartamentos();
    }

    // Mostrar todos los departamentos de x pais
    @GetMapping("/paises/{idPais}")
    public List<Departamento> obtenerPorPais(@PathVariable Integer idPais) {
        return departamentoServicio.obtenerPorPais(idPais);
    }

    // Mostrar departamentos por id
    @GetMapping("/{idDepartamento}")
    public ResponseEntity<Departamento> obtenerPorId(Integer idDepartamento) {
        return departamentoServicio.obtenerPorId(idDepartamento)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}

package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.Departamento;
import com.example.aplicacion_prueba.services.DepartamentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoControlador {

    @Autowired
    DepartamentoServicio departamentoServicio;

    @GetMapping
    public List<Departamento> obtenerDepartamentos(){
        return departamentoServicio.obtenerDepartamentos();
    }

    @GetMapping("/paises/{idPais}")
    public List<Departamento> obtenerPorPais(@PathVariable Integer idPais) {
        return departamentoServicio.obtenerPorPais(idPais);
    }

    @GetMapping("/{idDepartamento}")
    public ResponseEntity<Departamento> obtenerPorId(Integer idDepartamento) {
        return departamentoServicio.obtenerPorId(idDepartamento)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }




}

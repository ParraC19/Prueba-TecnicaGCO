package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.Fidelizacion;
import com.example.aplicacion_prueba.services.FidelizacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Controlador con endpoint(/fidelizaciones)
@RestController
@RequestMapping("/fidelizaciones")
public class FidelizacionControlador {

    // Controlador conectado a servicio
    @Autowired
    FidelizacionServicio fidelizacionServicio;

    // Mostrar todas las fidelizaciones
    @GetMapping
    public List<Fidelizacion> obtenerFidelizacion(){
        return fidelizacionServicio.obtenerFidelizacion();
    }

    // Mostrar fidelizaciones por id
    @GetMapping("/{idFidelizacion}")
    public ResponseEntity<Fidelizacion> obtenerPorId(@PathVariable Integer idFidelizacion){
        return fidelizacionServicio.obtenerPorId(idFidelizacion)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Mostrar fidelizaciones por x cliente
    @GetMapping("/clientes/{idCliente}")
    public List<Fidelizacion> obtenerPorCliente(@PathVariable Integer idCliente) {
        return fidelizacionServicio.obtenerPorCliente(idCliente);
    }

    // Mostrar fidelizaciones por x marca
    @GetMapping("/marcas{idMarca}")
    public List<Fidelizacion> obtenerPorMarca(@PathVariable Integer idMarca) {
        return fidelizacionServicio.obtenerPorMarca(idMarca);
    }

    //Enviar fidelizacion a base de datos
    @PostMapping
    public Fidelizacion guardarFidelizacion(@RequestBody Fidelizacion fidelizacion) {
        return fidelizacionServicio.guardarFidelizacion(fidelizacion);
    }

}

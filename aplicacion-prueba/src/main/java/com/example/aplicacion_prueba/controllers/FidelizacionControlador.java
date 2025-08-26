package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.Cliente;
import com.example.aplicacion_prueba.models.Fidelizacion;
import com.example.aplicacion_prueba.services.FidelizacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fidelizacion")
public class FidelizacionControlador {

    @Autowired
    FidelizacionServicio fidelizacionServicio;

    @GetMapping
    public List<Fidelizacion> obtenerFidelizacion(){
        return fidelizacionServicio.obtenerFidelizacion();
    }

    @GetMapping("/{idFidelizacion}")
    public ResponseEntity<Fidelizacion> obtenerPorId(@PathVariable Integer idFidelizacion){
        return fidelizacionServicio.obtenerPorId(idFidelizacion)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/clientes/{idCliente}")
    public List<Fidelizacion> obtenerPorCliente(@PathVariable Integer idCliente) {
        return fidelizacionServicio.obtenerPorCliente(idCliente);
    }

    @GetMapping("/marcas{idMarca}")
    public List<Fidelizacion> obtenerPorMarca(@PathVariable Integer idMarca) {
        return fidelizacionServicio.obtenerPorMarca(idMarca);
    }

    @PostMapping
    public Fidelizacion guardarFidelizacion(@RequestBody Fidelizacion fidelizacion) {
        return fidelizacionServicio.guardarFidelizacion(fidelizacion);
    }

}

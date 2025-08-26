package com.example.aplicacion_prueba.controllers;


import com.example.aplicacion_prueba.models.Ciudad;
import com.example.aplicacion_prueba.models.Cliente;
import com.example.aplicacion_prueba.services.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteControlador {

    @Autowired
    ClienteServicio clienteServicio;

    @GetMapping
    public List<Cliente> obtenerClientes() {
        return clienteServicio.obtenerCliente();
    }

    @GetMapping("/{idCliente}")
    public ResponseEntity<Cliente> obtenerPorId(@PathVariable Integer idCliente) {
        return clienteServicio.obtenerPorId(idCliente)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Cliente guardarCliente(@RequestBody Cliente cliente) {
        return clienteServicio.guardarCliente(cliente);
    }
}


package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.Cliente;
import com.example.aplicacion_prueba.services.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Controlador con endpoint(/clientes)
@RestController
@RequestMapping("/clientes")
public class ClienteControlador {

    // Controlador conectado a servicio
    @Autowired
    ClienteServicio clienteServicio;

    // Mostrar todos los clientes
    @GetMapping
    public List<Cliente> obtenerClientes() {
        return clienteServicio.obtenerCliente();
    }

    // Mostrar clientes por id
    @GetMapping("/{idCliente}")
    public ResponseEntity<Cliente> obtenerPorId(@PathVariable Integer idCliente) {
        return clienteServicio.obtenerPorId(idCliente)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Envio de cliente a base de datos
    @PostMapping
    public Cliente guardarCliente(@RequestBody Cliente cliente) {
        return clienteServicio.guardarCliente(cliente);
    }
}


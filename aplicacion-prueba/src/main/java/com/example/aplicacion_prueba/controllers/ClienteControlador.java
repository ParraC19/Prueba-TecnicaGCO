package com.example.aplicacion_prueba.controllers;

import com.example.aplicacion_prueba.models.Cliente;
import com.example.aplicacion_prueba.services.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteControlador {

    @Autowired
    ClienteServicio clienteServicio;

    @PostMapping
    public Cliente guardarCliente(@RequestBody Cliente cliente) {
        return clienteServicio.guardarCliente(cliente);
    }
}


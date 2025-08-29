package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.Cliente;
import com.example.aplicacion_prueba.repositories.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio {

    @Autowired
    ClienteRepositorio clienteRepositorio;

    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }


}

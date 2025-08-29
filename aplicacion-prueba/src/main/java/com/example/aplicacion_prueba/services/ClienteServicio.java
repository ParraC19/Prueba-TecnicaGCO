package com.example.aplicacion_prueba.services;

import com.example.aplicacion_prueba.models.Cliente;
import com.example.aplicacion_prueba.repositories.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class ClienteServicio {

    // Servicio conectado a repositorio
    @Autowired
    ClienteRepositorio clienteRepositorio;

    // Obtener todos los clientes findeAll()
    public List<Cliente> obtenerCliente() {
        return clienteRepositorio.findAll();
    }

    // Obtener clientes por id findById()
    public Optional<Cliente> obtenerPorId(Integer idCliente) {
        return clienteRepositorio.findById(idCliente);
    }

    // Guardar cliente en base de datos save()
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }


}

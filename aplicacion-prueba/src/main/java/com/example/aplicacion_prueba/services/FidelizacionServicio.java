package com.example.aplicacion_prueba.services;


import com.example.aplicacion_prueba.models.Fidelizacion;
import com.example.aplicacion_prueba.repositories.FidelizacionRepositorio;
import org.hibernate.persister.entity.SingleTableEntityPersister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FidelizacionServicio {

    @Autowired
    FidelizacionRepositorio fidelizacionRepositorio;


    public List<Fidelizacion> obtenerFidelizacion() {
        return fidelizacionRepositorio.findAll();
    }

    public Optional<Fidelizacion> obtenerPorId(Integer idFidelizacion) {
        return fidelizacionRepositorio.findById(idFidelizacion);
    }

    public List<Fidelizacion> obtenerPorCliente(Integer idCliente) {
        return fidelizacionRepositorio.findByCliente_idCliente(idCliente);
    }

    public List<Fidelizacion> obtenerPorMarca(Integer idMarca) {
        return fidelizacionRepositorio.findByMarca_idMarca(idMarca);
    }

    public Fidelizacion guardarFidelizacion(Fidelizacion fidelizacion) {
        return fidelizacionRepositorio.save(fidelizacion);
    }



}

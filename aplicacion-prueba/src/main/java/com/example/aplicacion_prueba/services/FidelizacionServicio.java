package com.example.aplicacion_prueba.services;


import com.example.aplicacion_prueba.models.Fidelizacion;
import com.example.aplicacion_prueba.repositories.FidelizacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FidelizacionServicio {

    // Servicio conectado a repositorio
    @Autowired
    FidelizacionRepositorio fidelizacionRepositorio;

    // Obtener todas las fidelizaciones findAll()
    public List<Fidelizacion> obtenerFidelizacion() {
        return fidelizacionRepositorio.findAll();
    }

    // Obtener fidelizaciones por id findById()
    public Optional<Fidelizacion> obtenerPorId(Integer idFidelizacion) {
        return fidelizacionRepositorio.findById(idFidelizacion);
    }

    // Obtener fidelizaciones por cliente findByCliente()
    public List<Fidelizacion> obtenerPorCliente(Integer idCliente) {
        return fidelizacionRepositorio.findByCliente_idCliente(idCliente);
    }

    // Obtener fidelizaciones por marca findByMarca()
    public List<Fidelizacion> obtenerPorMarca(Integer idMarca) {
        return fidelizacionRepositorio.findByMarca_idMarca(idMarca);
    }

    // Guardar fidelizacion en la base de datos save()
    public Fidelizacion guardarFidelizacion(Fidelizacion fidelizacion) {
        return fidelizacionRepositorio.save(fidelizacion);
    }



}

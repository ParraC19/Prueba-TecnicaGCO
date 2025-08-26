package com.example.aplicacion_prueba.repositories;

import com.example.aplicacion_prueba.models.Cliente;
import com.example.aplicacion_prueba.models.Fidelizacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FidelizacionRepositorio extends JpaRepository<Fidelizacion, Integer> {

    List<Fidelizacion> findByCliente_idCliente (Integer idCliente);
    List<Fidelizacion> findByMarca_idMarca (Integer IdMarca);

}

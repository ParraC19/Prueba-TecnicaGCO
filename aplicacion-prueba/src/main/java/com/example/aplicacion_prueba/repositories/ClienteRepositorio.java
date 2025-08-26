package com.example.aplicacion_prueba.repositories;

import com.example.aplicacion_prueba.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {

    Optional<Cliente> findByNumeroIdentificacion(String numeroIdentificacion);
    List<Cliente> findByCiudad_IdCiudad(Integer idCiudad);
}

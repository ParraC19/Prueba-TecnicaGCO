package com.example.aplicacion_prueba.repositories;

import com.example.aplicacion_prueba.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {}

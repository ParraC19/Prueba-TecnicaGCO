package com.example.aplicacion_prueba.repositories;

import com.example.aplicacion_prueba.models.Fidelizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

//Repositorio conectado por JPA
@Repository
public interface FidelizacionRepositorio extends JpaRepository<Fidelizacion, Integer> {

    // Busqueda de fidelizacion por cliente y marca(ById)
    List<Fidelizacion> findByCliente_idCliente (Integer idCliente);
    List<Fidelizacion> findByMarca_idMarca (Integer IdMarca);

}

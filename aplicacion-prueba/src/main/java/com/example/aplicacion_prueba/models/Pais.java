package com.example.aplicacion_prueba.models;

import jakarta.persistence.*;

@Entity
@Table(name = "paises")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais", nullable = false)
    private int idPais;

    @Column(name = "nombre_pais", nullable = false, length = 100)
    private String nombrePais;

    public Pais() {
    }

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }


    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
}
package com.example.aplicacion_prueba.models;

import jakarta.persistence.*;

@Entity
@Table(name = "paises")
public class Pais {

    // Variables de Pais(idPais, pais)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais", nullable = false)
    private int idPais;

    @Column(name = "pais", nullable = false, length = 100)
    private String pais;

    // Constructores con getter y setter
    public Pais() {
    }

    public Pais(String pais) {
        this.pais = pais;
    }


    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
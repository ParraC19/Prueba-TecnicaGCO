package com.example.aplicacion_prueba.models;

import jakarta.persistence.*;


@Entity
@Table(name = "departamentos")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento", nullable = false)
    private int idDepartamento;

    @Column(name = "nombre_departamento", nullable = false, length = 100)
    private String nombreDepartamento;

    @ManyToOne
    @JoinColumn(name = "id_pais", nullable = false)
    private Pais pais;

    public Departamento() {
    }

    public Departamento(String nombreDepartamento, Pais pais) {

        this.nombreDepartamento = nombreDepartamento;
        this.pais = pais;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}

package com.example.aplicacion_prueba.models;

import jakarta.persistence.*;


@Entity
@Table(name = "departamentos")
public class Departamento {

    // Variables de departamentos (idDepartamento, departamento, pias FK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento", nullable = false)
    private int idDepartamento;

    @Column(name = "departamento", nullable = false, length = 100)
    private String departamento;

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id_pais", nullable = false)
    private Pais pais;

    // Constructores con getter y setter
    public Departamento() {
    }

    public Departamento(String departamento, Pais pais) {

        this.departamento = departamento;
        this.pais = pais;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}



package com.example.aplicacion_prueba.models;


import jakarta.persistence.*;

@Entity
@Table(name = "ciudades")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad", nullable = false)
    private int idCiudad;

    @Column(name = "nombre_ciudad", nullable = false, length = 100)
    private String nombreCiudad;

    @ManyToOne
    @JoinColumn(name = "departamento", nullable = false)
    private Departamento departamento;

    public Ciudad() {
    }

    public Ciudad(String nombreCiudad, Departamento departamento) {
        this.nombreCiudad = nombreCiudad;
        this.departamento = departamento;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}


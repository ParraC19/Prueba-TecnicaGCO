package com.example.aplicacion_prueba.models;


import jakarta.persistence.*;

@Entity
@Table(name = "ciudades")
public class Ciudad {

    // Variables de ciudad(idCiudad, ciudad, departamento FK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ciudad", nullable = false)
    private int idCiudad;

    @Column(name = "ciudad", nullable = false, length = 100)
    private String ciudad;

    @ManyToOne
    @JoinColumn(name = "departamento", referencedColumnName = "id_departamento", nullable = false)
    private Departamento departamento;

    // Constructores con getter y setter
    public Ciudad() {
    }

    public Ciudad(String ciudad, Departamento departamento) {
        this.ciudad = ciudad;
        this.departamento = departamento;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}


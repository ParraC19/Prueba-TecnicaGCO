package com.example.aplicacion_prueba.models;


import jakarta.persistence.*;

@Entity
@Table(name = "marcas")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca", nullable = false)
    private int idMarca;

    @Column(name = "marca", nullable = false, length = 100)
    private String nombreMarca;

    public Marca() {
    }

    public Marca(String nombreMarca) {

        this.nombreMarca = nombreMarca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }
}

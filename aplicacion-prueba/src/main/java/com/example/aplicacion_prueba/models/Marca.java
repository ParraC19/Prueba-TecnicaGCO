package com.example.aplicacion_prueba.models;


import jakarta.persistence.*;

@Entity
@Table(name = "marcas")
public class Marca {

    // Variables de marca(idMarca, marca)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_marca", nullable = false)
    private int idMarca;

    @Column(name = "marca", nullable = false, length = 100)
    private String marca;

    // Constructores con getter y setter
    public Marca() {
    }

    public Marca(String marca) {
        this.marca = marca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

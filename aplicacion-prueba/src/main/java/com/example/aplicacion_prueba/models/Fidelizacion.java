package com.example.aplicacion_prueba.models;

import jakarta.persistence.*;

@Entity
@Table(name = "fidelizacion")
public class Fidelizacion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fidelizacion")
    private int idFidelizacion;

    @JoinColumn(name = "id_cliente")
    private int idCliente;

    @JoinColumn(name = "id_marca")
    private int idMarca;

    public Fidelizacion() {
    }

    public Fidelizacion(int idFidelizacion, int idCliente, int idMarca) {
        this.idFidelizacion = idFidelizacion;
        this.idCliente = idCliente;
        this.idMarca = idMarca;
    }

    public int getIdFidelizacion() {
        return idFidelizacion;
    }

    public void setIdFidelizacion(int idFidelizacion) {
        this.idFidelizacion = idFidelizacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }
}

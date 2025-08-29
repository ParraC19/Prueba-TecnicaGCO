package com.example.aplicacion_prueba.models;

import jakarta.persistence.*;

@Entity
@Table(name = "fidelizacion")
public class Fidelizacion {

    // Variables de fidelizacion(idFidelizacion, cliente FK, marca FK)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fidelizacion")
    private int idFidelizacion;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_marca", referencedColumnName = "id_marca")
    private Marca marca;

    // Constructores con getter y setter
    public Fidelizacion() {
    }

    public Fidelizacion(Cliente cliente, Marca marca) {
        this.cliente = cliente;
        this.marca = marca;
    }

    public int getIdFidelizacion() {
        return idFidelizacion;
    }

    public void setIdFidelizacion(int idFidelizacion) {
        this.idFidelizacion = idFidelizacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}



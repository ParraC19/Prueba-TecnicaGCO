package com.example.aplicacion_prueba.models;


import jakarta.persistence.*;

@Entity
@Table(name = "tipos_identificacion")
public class TipoIdentificacion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_identificacion", nullable = false)
    private int idTipoIdentificacion;

    @Column(name = "tipo_identificacion", nullable = false, length = 100)
    private String tipoIdentificacion;

    public TipoIdentificacion() {
    }

    public TipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(int idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }
}

package com.example.aplicacion_prueba.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", nullable = false)
    private int idCliente;

    @ManyToOne
    @JoinColumn(name = "id_tipo_identificacion", nullable = false)
    private TipoIdentificacion tipoIdentificacion;

    @Column(name = "numero_identificacion", nullable = false, length = 20)
    private String numeroIdentificacion;

    @Column(name = "nombre_cliente", nullable = false, length = 50)
    private String nombreCliente;

    @Column(name = "apellidos_cliente", nullable = false, length = 50)
    private String apellidosCliente;

    @Column(name = "fecha_nacimiento", nullable = false)
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date fechaNacimiento;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "id-ciudad", nullable = false)
    private Ciudad ciudad;

    public Cliente() {
    }

    public Cliente(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, String nombreCliente, String apellidosCliente, Date fechaNacimiento, String direccion, Ciudad ciudad) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}

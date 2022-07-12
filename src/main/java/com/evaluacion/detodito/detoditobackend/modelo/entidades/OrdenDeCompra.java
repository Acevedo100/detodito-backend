package com.evaluacion.detodito.detoditobackend.modelo.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "ordenDeCompra")
public class OrdenDeCompra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name= "numero_compra", nullable = false)
    private Integer numeroCompra;
    @Column(name= "nombre_comprador", nullable = false, length = 25)
    private String nombreComprador;
    @Column(name= "fecha_boleta", nullable = false)
    private LocalDateTime fechaBoleta;
    @Column(name= "numero_boleta", nullable = false)
    private Integer boleta;


    // Constructors -------
    public OrdenDeCompra() {
    }

    public OrdenDeCompra(Integer id, Integer numeroCompra, String nombreComprador, LocalDateTime fechaBoleta, Integer boleta) {
        this.id = id;
        this.numeroCompra = numeroCompra;
        this.nombreComprador = nombreComprador;
        this.fechaBoleta = fechaBoleta;
        this.boleta = boleta;
    }

// Methods -------


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(Integer numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public LocalDateTime getFechaBoleta() {
        return fechaBoleta;
    }

    public void setFechaBoleta(LocalDateTime fechaBoleta) {
        this.fechaBoleta = fechaBoleta;
    }

    public Integer getBoleta() {
        return boleta;
    }

    public void setBoleta(Integer boleta) {
        this.boleta = boleta;
    }

    @PostPersist
    public void despuesDePersistir(){
        this.fechaBoleta = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "OrdenDeCompra{" +
                "id=" + id +
                ", numeroCompra=" + numeroCompra +
                ", nombreComprador='" + nombreComprador + '\'' +
                ", fechaBoleta=" + fechaBoleta +
                ", boleta=" + boleta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdenDeCompra that = (OrdenDeCompra) o;
        return id == that.id && numeroCompra == that.numeroCompra;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numeroCompra);
    }
}

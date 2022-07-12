package com.evaluacion.detodito.detoditobackend.modelo.entidades;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "detalleOrdenDeCompra")
public class DetalleOrdenDeCompra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name= "precio_producto", nullable = false)
    private Integer precioProducto;
    @Column(name= "codigo_producto", nullable = false, length = 25)
    private String codigoProducto;
    @Column(name= "cantidad_producto", nullable = false)
    private Integer cantidadProducto  ;


    // Constructors -------
    public DetalleOrdenDeCompra() {
    }

    public DetalleOrdenDeCompra(Integer id, Integer precioProducto, String codigoProducto, Integer cantidadProducto) {
        this.id = id;
        this.precioProducto = precioProducto;
        this.codigoProducto = codigoProducto;
        this.cantidadProducto = cantidadProducto;
    }

    // Methods -------


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Integer precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return "DetalleOrdenDeCompra{" +
                "id=" + id +
                ", precioProducto=" + precioProducto +
                ", codigoProducto='" + codigoProducto + '\'' +
                ", cantidadProducto=" + cantidadProducto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetalleOrdenDeCompra that = (DetalleOrdenDeCompra) o;
        return id.equals(that.id) && Objects.equals(precioProducto, that.precioProducto) && Objects.equals(codigoProducto, that.codigoProducto) && Objects.equals(cantidadProducto, that.cantidadProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, precioProducto, codigoProducto, cantidadProducto);
    }
}

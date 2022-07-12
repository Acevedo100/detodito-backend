package com.evaluacion.detodito.detoditobackend.modelo.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name= "cod_producto", nullable = false, length = 10)
    private String código;
    @Column(name= "nombre_producto", nullable = false, length = 25)
    private String nombre;
    @Column(name= "categoria", nullable = false, length = 25)
    private String categoria;
    @Column(name= "imagen", nullable = false, length = 100)
    private String img;
    @Column(name= "precio_producto", nullable = false)
    private int precio;


    // Constructors -------
    public Producto() {
    }

    public Producto(int id, String código, String nombre, String categoria, String img, int precio) {
        this.id = id;
        this.código = código;
        this.nombre = nombre;
        this.categoria = categoria;
        this.img = img;
        this.precio = precio;
    }


    // Methods -------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", código='" + código + '\'' +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", img='" + img + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return id == producto.id && código.equals(producto.código);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, código);
    }
}

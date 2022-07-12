package com.evaluacion.detodito.detoditobackend.modelo.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "Persona")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="rut", nullable = false)
    private Integer rut;
    @Column(name= "nombre_persona", nullable = false, length = 25)
    private String nombre;
    @Column(name= "apellido_persona" , nullable = false, length = 25)
    private String apellido;
    @Column(name= "telefono_persona" , nullable = false)
    private Integer telefono;
    @Column(name= "direccion_persona" , nullable = false, length = 35)
    private String Direccion;


    // Constructors -------
    public Persona() {
    }

    public Persona(Integer id, Integer rut, String nombre, String apellido, Integer telefono, String direccion) {
        this.id = id;
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        Direccion = direccion;
    }

    // Methods -------


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", rut=" + rut +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona cliente = (Persona) o;
        return id.equals(cliente.id) && rut.equals(cliente.rut) && Objects.equals(nombre, cliente.nombre) && Objects.equals(apellido, cliente.apellido) && Objects.equals(telefono, cliente.telefono) && Objects.equals(Direccion, cliente.Direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, rut, nombre, apellido, telefono, Direccion);
    }
}

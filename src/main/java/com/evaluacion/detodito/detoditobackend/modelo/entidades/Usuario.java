package com.evaluacion.detodito.detoditobackend.modelo.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name= "correo_usuario", nullable = false, length = 25)
    private String correo ;
    @Column(name= "password_usuario", nullable = false, length = 25)
    private String passsword;
    @Column(name= "permisos_usuario", nullable = false, length = 25)
    private String permisos;


    // Constructors -------
    public Usuario() {
    }

    public Usuario(Integer id, String correo, String passsword, String permisos) {
        this.id = id;
        this.correo = correo;
        this.passsword = passsword;
        this.permisos = permisos;
    }

    // Methods -------


    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", correo='" + correo + '\'' +
                ", passsword='" + passsword + '\'' +
                ", permisos='" + permisos + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario login = (Usuario) o;
        return id == login.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

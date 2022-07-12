package com.evaluacion.detodito.detoditobackend.modelo.entidades;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "pago")
public class Pago implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="metodo_pago", nullable = false)
    private String metodoDePago;


    // Constructors -------
    public Pago() {
    }

    public Pago(Integer id, String metodoDePago) {
        this.id = id;
        this.metodoDePago = metodoDePago;
    }

    // Methods -------


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", metodoDePago='" + metodoDePago + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pago pago = (Pago) o;
        return id.equals(pago.id) && Objects.equals(metodoDePago, pago.metodoDePago);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, metodoDePago);
    }
}

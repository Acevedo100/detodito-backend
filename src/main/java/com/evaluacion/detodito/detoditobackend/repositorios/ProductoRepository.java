package com.evaluacion.detodito.detoditobackend.repositorios;

import com.evaluacion.detodito.detoditobackend.modelo.entidades.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ProductoRepository extends CrudRepository < Producto, Integer>{

    @Query("Select c From Producto c Where c.categoria = ?1")
    Iterable<Producto> buscarPorCategoria(String categoria);
}

package com.evaluacion.detodito.detoditobackend.servicios.contratos;

import com.evaluacion.detodito.detoditobackend.modelo.entidades.Producto;

public interface ProductoDAO extends GenericoDAO<Producto> {

    Iterable<Producto> buscarPorCategoria(String categoria);
}

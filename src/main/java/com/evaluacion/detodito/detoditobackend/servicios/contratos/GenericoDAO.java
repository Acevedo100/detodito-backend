package com.evaluacion.detodito.detoditobackend.servicios.contratos;

import java.util.Optional;

public interface GenericoDAO<E> {

    Optional<E> findById(Integer id); //encapsulate the null pointer exception. you can know if the db has date or not.
    E save (E entidad); //
    Iterable<E> findAll();
    void deleteById (Integer id);
}

package com.evaluacion.detodito.detoditobackend.servicios.contratos;

import com.evaluacion.detodito.detoditobackend.modelo.entidades.Persona;

public interface PersonaDAO extends GenericoDAO<Persona> {

    Iterable<Persona> buscarPorRut(Integer rut);

}

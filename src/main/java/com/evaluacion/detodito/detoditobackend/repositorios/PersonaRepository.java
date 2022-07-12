package com.evaluacion.detodito.detoditobackend.repositorios;

import com.evaluacion.detodito.detoditobackend.modelo.entidades.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface PersonaRepository extends CrudRepository <Persona,Integer>{

    @Query("Select c From Persona c Where c.rut = ?1")
    Iterable<Persona> buscarPorRut(Integer rut);

}

package com.evaluacion.detodito.detoditobackend.servicios.implementacion;

import com.evaluacion.detodito.detoditobackend.modelo.entidades.Persona;
import com.evaluacion.detodito.detoditobackend.repositorios.PersonaRepository;
import com.evaluacion.detodito.detoditobackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PersonaDAOImpl extends GenericoDAOImpl<Persona, PersonaRepository> implements PersonaDAO {

    @Autowired
    public PersonaDAOImpl(PersonaRepository repository) {
        super(repository);
    }

    @Override
    @Transactional()
    public Iterable<Persona> buscarPorRut(Integer rut) {
        return repository.buscarPorRut(rut);
    }
}

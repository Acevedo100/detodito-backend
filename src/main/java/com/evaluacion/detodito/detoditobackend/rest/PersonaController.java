package com.evaluacion.detodito.detoditobackend.rest;

import com.evaluacion.detodito.detoditobackend.exception.BadRequestException;
import com.evaluacion.detodito.detoditobackend.modelo.entidades.Persona;
import com.evaluacion.detodito.detoditobackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    private final PersonaDAO personaDAO;

    @Autowired
    public PersonaController(PersonaDAO personaDAO) {
        this.personaDAO = personaDAO;
    }

    @GetMapping
    public List<Persona> obtenerTodos() {
        List<Persona> personas = (List<Persona>) personaDAO.findAll();
        if (personas.isEmpty()){
            throw new BadRequestException("No existen Personas");
        }
        return personas;
    }

    @GetMapping("/{codigo}")
    public Persona obtenerPorRut(@PathVariable(value = "codigo", required = false) Integer id){
        Optional<Persona> oPersona =  personaDAO.findById(id);
        if (!oPersona.isPresent()){
            throw new BadRequestException(String.format("La carrera con rut %d no existe",id));
        }
        return oPersona.get();
    }

    @PostMapping
    public Persona altaPersona(@RequestBody Persona persona){
        return personaDAO.save(persona);
    }

    @PutMapping("/{id}")
    public Persona actualizarPersona(@PathVariable Integer id, @RequestBody Persona persona){
        Persona personaUpdate = null;
        Optional<Persona> oPersona =  personaDAO.findById(id);
        if (!oPersona.isPresent()){
            throw new BadRequestException(String.format("La carrera con rut %d no existe",id));
        }
        personaUpdate = oPersona.get();
        personaUpdate.setRut(persona.getRut());
        personaUpdate.setNombre(persona.getNombre());
        personaUpdate.setApellido(persona.getApellido());
        personaUpdate.setTelefono(persona.getTelefono());
        personaUpdate.setDireccion(persona.getDireccion());
        return personaDAO.save(personaUpdate);
    }

    @DeleteMapping("{id}")
    public void eliminarPersona(@PathVariable  Integer id) {
        personaDAO.deleteById(id);
    }
}

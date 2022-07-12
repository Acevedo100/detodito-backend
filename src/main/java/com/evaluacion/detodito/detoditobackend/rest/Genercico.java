package com.evaluacion.detodito.detoditobackend.rest;

import com.evaluacion.detodito.detoditobackend.modelo.entidades.Persona;
import com.evaluacion.detodito.detoditobackend.servicios.contratos.PersonaDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/restapi")
public class Genercico {

    @Autowired
    private PersonaDAO servicio;

    @GetMapping("/hola-mundo")
    public  String holaMundo(){
        return "Hola mundo";
    }

    @GetMapping("/prueba")
    public ResponseEntity<List<Persona>> getPersona (@RequestHeader("rut") Integer rut,
                                                     HttpServletRequest request,
                                                     HttpServletResponse response) throws Exception {
        return ResponseEntity.ok().body((List<Persona>)servicio.buscarPorRut(rut));
    }


}

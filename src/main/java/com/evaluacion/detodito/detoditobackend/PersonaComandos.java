package com.evaluacion.detodito.detoditobackend;

import com.evaluacion.detodito.detoditobackend.modelo.entidades.Persona;
import com.evaluacion.detodito.detoditobackend.servicios.contratos.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonaComandos implements CommandLineRunner
{
    @Autowired
    private PersonaDAO servicio;

    @Override
    public void run(String... args) throws Exception {

        //INSERT into table cliente.
        /*
        Cliente cliente = new Cliente(null,255425722,"Jose","Acevedo",999999,"Santiago");
        servicio.save(cliente);
        */

        //Select for rut in  table Persona

       /* List<Persona> clientes = (List<Persona>)servicio.buscarPorRut(255425722);
        clientes.forEach(System.out::println);
        */



    }

}

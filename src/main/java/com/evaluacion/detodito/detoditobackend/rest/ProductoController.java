package com.evaluacion.detodito.detoditobackend.rest;

import com.evaluacion.detodito.detoditobackend.exception.BadRequestException;
import com.evaluacion.detodito.detoditobackend.modelo.entidades.Persona;
import com.evaluacion.detodito.detoditobackend.modelo.entidades.Producto;
import com.evaluacion.detodito.detoditobackend.servicios.contratos.ProductoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoDAO productoDAO;

    @Autowired
    public ProductoController(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }

    @GetMapping
    public List<Producto> obtenerTodos() {
        List<Producto> productos = (List<Producto>) productoDAO.findAll();
        if (productos.isEmpty()){
            throw new BadRequestException("No existen Produstos");
        }
        return productos;
    }

    @GetMapping("/{codigo}")
    public Producto obtenerPorId(@PathVariable(value = "codigo", required = false) Integer id){
        Optional<Producto> oProducto =  productoDAO.findById(id);
        if (!oProducto.isPresent()){
            throw new BadRequestException(String.format("El Producto con id %d no existe",id));
        }
        return oProducto.get();
    }

    @PostMapping
    public Producto altaProducto(@RequestBody Producto producto){
        return productoDAO.save(producto);
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Integer id, @RequestBody Producto producto){
        Producto productoUpdate = null;
        Optional<Producto> oProducto =  productoDAO.findById(id);
        if (!oProducto.isPresent()){
            throw new BadRequestException(String.format("El Producto con id %d no existe",id));
        }
        productoUpdate = oProducto.get();

        return productoDAO.save(productoUpdate);
    }

    @DeleteMapping("{id}")
    public void eliminarProducto(@PathVariable  Integer id) {
        productoDAO.deleteById(id);
    }
}

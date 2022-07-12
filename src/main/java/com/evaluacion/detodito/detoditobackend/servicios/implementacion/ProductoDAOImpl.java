package com.evaluacion.detodito.detoditobackend.servicios.implementacion;

import com.evaluacion.detodito.detoditobackend.modelo.entidades.Producto;
import com.evaluacion.detodito.detoditobackend.repositorios.ProductoRepository;
import com.evaluacion.detodito.detoditobackend.servicios.contratos.ProductoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProductoDAOImpl extends GenericoDAOImpl<Producto, ProductoRepository> implements ProductoDAO {

    @Autowired
    public ProductoDAOImpl(ProductoRepository repository) {
        super(repository);
    }

    @Override
    @Transactional()
    public Iterable<Producto> buscarPorCategoria(String categoria) {
        return repository.buscarPorCategoria(categoria);
    }
}

package com.example.papeleria.servicios;

import com.example.papeleria.modelos.Producto;
import com.example.papeleria.repositorios.ProductoRepositorio;

import java.util.List;

public class ProductoServicio {
    private final ProductoRepositorio repo;

    public ProductoServicio(ProductoRepositorio repo) {
        this.repo = repo;
    }

    public List<Producto> listar() {
        return repo.findAll();
    }

    public Producto guardar(Producto producto) {
        return repo.save(producto);
    }
}
